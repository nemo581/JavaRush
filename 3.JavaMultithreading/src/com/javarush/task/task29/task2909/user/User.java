package com.javarush.task.task29.task2909.user;

public class User {
    private String name;
    private String surname;
    private int age;
    private Work work;
    private boolean man;

    private Address address;

    public String getBoss() {
        return work.getBoss();
    }

    public String getAddress() {
//        return address.getCountry(), address.setCity(), address.setHouse();
        String result = address.getCountry() + ", " +
                        address.getCity() + ", " +
                        address.getHouse() + ".";


        return result;
    }

    public String getCountry() {
        return this.address.getCountry();
    }

    public void setCountry(String country) {
        this.address.setCountry(country);
    }

    public String getCity() {
        return this.address.getCity();
    }

    public void setCity(String city) {
        this.address.setCity(city);
    }


    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Имя: " +  this.name);
        System.out.println("Фамилия: " + this.surname);
    }

    public void printAdditionalInfo() {
        System.out.println(this.age < 16 ? "Пользователь моложе 16 лет" :
                                            "Пользователь старше 16 лет");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
}