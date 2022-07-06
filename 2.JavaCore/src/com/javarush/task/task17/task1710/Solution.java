package com.javarush.task.task17.task1710;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createFemale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static Date transferDate(String dateIN) {
        SimpleDateFormat oldDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        oldDateFormat.setLenient(false);
        try {
            return oldDateFormat.parse(dateIN);
        } catch (ParseException e) {
            System.out.println("Не верный формат даты");
        }
        return null;
    }

    public static String transferDate(Date date) {
        final String DATE_FORMAT = "dd-MMM-yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT, Locale.ENGLISH);
        return dateFormat.format(date);
    }

    public static void main(String[] args) {
        String[] cmd = new String[]{"-c", "-r", "-u", "-d"};
        if (args.length == 0 || !Arrays.asList(cmd).contains(args[0])) {
            System.out.println("Не корректные данные" + Arrays.toString(args) + "\n" + "Допумтимые команды: " + Arrays.toString(cmd));
            return;
        }

        if (args[0].equals(cmd[1]) || args[0].equals(cmd[2]) || args[0].equals(cmd[3])) {
            int index = Integer.parseInt(args[1]);
            if (index < 0 || index > (allPeople.size() - 1)) {
                System.out.println("в списке такого элемента нет " + args[1] + "\n" + "допустимые значения от 0 до " + (allPeople.size() - 1));
                return;
            }
        }

        int id = 0;
        if (args[0].equals("-c")) {
            id = allPeople.size();
            if (args[2].equals("м")) {
                allPeople.add(id, Person.createMale(args[1], transferDate(args[3])));
                System.out.println(id);
            } else if (args[2].equals("ж")) {
                allPeople.add(id, Person.createFemale(args[1], transferDate(args[3])));
                System.out.println(id);
            } else {
                System.out.println("Не верное значение: " + args[2] + "\n" + "Допустимые значения: \"м\" \"ж\"");
                return;
            }
        }

        if (args[0].equals("-r")) {
            id = Integer.parseInt(args[1]);
            String sex = allPeople.get(id).getSex().toString();
            if (sex.equals("MALE")) {
                System.out.println(allPeople.get(id).getName() + " " + "м" + " " + transferDate(allPeople.get(id).getBirthDate()));
            }
            if (sex.equals("FEMALE")) {
                System.out.println(allPeople.get(id).getName() + " " + "ж" + " " + transferDate(allPeople.get(id).getBirthDate()));
            }
        }

        if (args[0].equals("-u")) {
            id = Integer.parseInt(args[1]);
            allPeople.get(id).setName(args[2]);
            if (args[3].equals("м")) {
                allPeople.get(id).setSex(Sex.MALE);
            } else if (args[3].equals("ж")) {
                allPeople.get(id).setSex(Sex.FEMALE);
            } else {
                System.out.println("Не верное значение: " + args[3] + "\n" + "Допустимые значения: \"м\" \"ж\"");
            }
            allPeople.get(id).setBirthDate(transferDate(args[4]));
        }

        if (args[0].equals("-d")) {
            id = Integer.parseInt(args[1]);
            allPeople.get(id).setName(null);
            allPeople.get(id).setSex(null);
            allPeople.get(id).setBirthDate(null);
        }
    }
}
