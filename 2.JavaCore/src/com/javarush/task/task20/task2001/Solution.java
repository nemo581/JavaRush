package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Читаем и пишем в файл: Human
*/
public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            System.out.println(ivanov.equals(somePerson));
            System.out.println(somePerson.name);
            for (Asset a : somePerson.assets) {
                System.out.println(a.getName() + " " + a.getPrice());
            }
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer = new PrintWriter(outputStream);
            writer.println(this.name);
            if (this.assets.size() > 0) {
                for (Asset a : assets) {
                    writer.println(a.getName());
                    writer.println(a.getPrice());
                }
            }
            writer.close();
//            String isName = this.name != null ? "yes" : "no";
//            outputStream.write(isName.getBytes());
//            outputStream.write(10);
//            outputStream.flush();
//            if (this.name != null) {
//                outputStream.write(this.name.getBytes());
//                outputStream.write(10);
//            }
//            String isAssets = this.assets != null ? "yes" : "no";
//            outputStream.write(isAssets.getBytes());
//            outputStream.write(10);
//            if (this.assets != null) {
//                for (Asset a : this.assets) {
//                    outputStream.write(a.getName().getBytes());
//                    outputStream.write(10);
//                    outputStream.write(String.valueOf(a.getPrice()).getBytes());
//                    outputStream.write(10);
//                }
//            }
//            outputStream.flush();
            //implement this method - реализуйте этот метод
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            this.name = reader.readLine();
            while (reader.ready()) {
                String assetName = reader.readLine();
                double assetPrice = Double.parseDouble(reader.readLine());
                this.assets.add(new Asset(assetName, assetPrice));
            }
            reader.close();
//            String buf = "";
//            while (inputStream.available() > 0) {
//                buf = buf + (char) inputStream.read();
//            }
//            String[] line = buf.split("\n");
//            if (line[0].equals("yes")) {
//                this.name = line[1];
//            }
//            if (line[2].equals("yes")) {
//                for (int i = 3; i < line.length; i++) {
//                    if (i % 2 != 0) {
//                        String name = line[i];
//                        double price = Double.parseDouble(line[i + 1]);
//                        this.assets.add(new Asset(name, price));
//                    }
//                }
//            }
            //implement this method - реализуйте этот метод
        }
    }
}
