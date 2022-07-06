package com.javarush.task.task17.task1711;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
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
        if (args.length == 0) {
            System.out.println("Не корректные данные" + Arrays.toString(args) + "\n" + "Допумтимые команды: \"-c\" \"-u\" \"-d\" \"-i\"");
            return;
        }

        int id;
        int index;

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    index = 1; // int
                    while (true) {
                        if (index < args.length && (args.length - 1) % 3 == 0) {
                            id = allPeople.size();
                            switch (args[index + 1]) {
                                case "м":
                                    if (transferDate(args[index + 2]) == null) {
                                        return;
                                    }
                                    allPeople.add(allPeople.size(), Person.createMale(args[index], transferDate(args[index + 2])));
                                    System.out.println(id);
                                    break;
                                case "ж":
                                    if (transferDate(args[index + 2]) == null) {
                                        return;
                                    }
                                    allPeople.add(allPeople.size(), Person.createFemale(args[index], transferDate(args[index + 2])));
                                    System.out.println(id);
                                    break;
                                default:
                                    System.out.println("Не верное значение: " + args[index + 1] + "\n" + "Допустимые значения: \"м\" \"ж\"");
                                    break;
                            }
                        } else {
                            if ((args.length - 1) % 3 != 0) {
                                System.out.println("Не полный ввод данных");
                                break;
                            }
                            break;
                        }
                        index = index + 3;
                    }
                    break;
                }

            case "-u":
                synchronized (allPeople) {
                    index = 1;
                    while (true) {
                        if (index < args.length && (args.length - 1) % 4 == 0) {
                            try {
                                id = Integer.parseInt(args[index]);
                            } catch (ArrayIndexOutOfBoundsException e) {
                                break;
                            }
                            if (id < 0 || id > (allPeople.size() - 1)) {
                                System.out.println("В списке такого элемента нет");
                                break;
                            }
                            allPeople.get(id).setName(args[index + 1]);
                            switch (args[index + 2]) {
                                case "м":
                                    allPeople.get(id).setSex(Sex.MALE);
                                    break;
                                case "ж":
                                    allPeople.get(id).setSex(Sex.FEMALE);
                                    break;
                                default:
                                    System.out.println("Не верное значение: " + args[index + 2] + "\n" + "Допустимые значения: \"м\" \"ж\"");
                                    break;
                            }
                            allPeople.get(id).setBirthDate(transferDate(args[index + 3]));
                            index = index + 4;
                        } else {
                            if ((args.length - 1) % 4 != 0) {
                                System.out.println("Не полный ввод данных");
                                break;
                            }
                            break;
                        }
                    }
                    break;
                }

            case "-d":
                synchronized (allPeople) {
                    index = 1;
                    while (true) {
                        try {
                            id = Integer.parseInt(args[index]);
                            if (id < 0 || id > (allPeople.size() - 1)) {
                                System.out.println("В списке такого элемента нет");
                                break;
                            }
                        } catch (ArrayIndexOutOfBoundsException a) {
                            break;
                        }
                        allPeople.get(id).setName(null);
                        allPeople.get(id).setSex(null);
                        allPeople.get(id).setBirthDate(null);
                        index++;
                    }
                    break;
                }

            case "-i":
                synchronized (allPeople) {
                    index = 1;
                    while (true) {
                        id = Integer.parseInt(args[index]);
                        if (id < 0 || id > (allPeople.size() - 1)) {
                            System.out.println("В списке такого элемента нет: " + id);
                            break;
                        }
                        String sex = allPeople.get(id).getSex().toString();
                        if (sex.equals("MALE")) {
                            System.out.println(allPeople.get(id).getName() + " " + "м" + " " + transferDate(allPeople.get(id).getBirthDate()));
                        }
                        if (sex.equals("FEMALE")) {
                            System.out.println(allPeople.get(id).getName() + " " + "ж" + " " + transferDate(allPeople.get(id).getBirthDate()));
                        }
                        index++;

                        if (index == args.length) {
                            break;
                        }
                    }
                    break;
                }
//            default:
//                System.out.println("Не корректные данные" + Arrays.toString(args) + "\n" + "Допумтимые команды: \"-c\" \"-u\" \"-d\" \"-i\"");
//                break;

        }
    }
}
