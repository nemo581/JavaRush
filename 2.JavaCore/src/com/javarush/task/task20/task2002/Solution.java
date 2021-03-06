package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user1 = new User();
            user1.setFirstName("firstName1");
            user1.setLastName("lastName1");
            user1.setBirthDate(new Date());
            user1.setMale(true);
            user1.setCountry(User.Country.RUSSIA);
            User user2 = new User();
            user2.setFirstName("firstName2");
            user2.setLastName("lastName2");
            user2.setBirthDate(new Date());
            user2.setMale(true);
            user2.setCountry(User.Country.UKRAINE);
            User user3 = new User();
            user3.setFirstName("firstName3");
            user3.setLastName("lastName3");
            user3.setBirthDate(new Date());
            user3.setMale(true);
            user3.setCountry(User.Country.OTHER);
            javaRush.users.add(user1);
            javaRush.users.add(user2);
            javaRush.users.add(user3);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            for (User u : loadedObject.users) {
                System.out.println(">>> " + u.getFirstName() + " " + u.getLastName() + " " + u.getBirthDate() + " " + u.isMale() + " " + u.getCountry().getDisplayName());
            }
            System.out.println(">>> " + javaRush.equals(loadedObject));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);
            if (users.size() > 0) {
                for (User u : users) {
                    writer.println(u.getFirstName());
                    writer.println(u.getLastName());
                    writer.println(u.getBirthDate().getTime());
                    writer.println(u.isMale());
                    writer.println(u.getCountry());
                }
                writer.flush();
            }
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (reader.ready()) {
                String firstName = reader.readLine();
                String lastName = reader.readLine();
                long birthday = Long.parseLong(reader.readLine());
                boolean isMale = Boolean.parseBoolean(reader.readLine());
                String tmpCountry = reader.readLine();
                User.Country country;
                switch (tmpCountry.toUpperCase()) {
                    case "RUSSIA":
                        country = User.Country.RUSSIA;
                        break;
                    case "UKRAINE":
                        country = User.Country.UKRAINE;
                        break;
                    default:
                        country = User.Country.OTHER;
                        break;
                }
                User user = new User();
                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setBirthDate(new Date(birthday));
                user.setMale(isMale);
                user.setCountry(country);
                users.add(user);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;
        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
