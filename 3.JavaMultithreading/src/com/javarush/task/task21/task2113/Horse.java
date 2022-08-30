package com.javarush.task.task21.task2113;

public class Horse {
    private String name;
    private double speed;
    private double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void move() {
        distance += Math.random() * speed;
    }

    public void print() {
        StringBuilder track = new StringBuilder();
        for (int i = 0; i < (int) distance; i++) {
            track.append(".");
        }
        System.out.println(track + getName());

//        ##########################################
//        ##########################################
//        ###  Don't Working With COUNT == 0!!!  ###
//        ##########################################
//        ##########################################
//        int count = Integer.parseInt(String.valueOf(distance).replaceAll("\\..*", ""));
//        try {
//            System.out.println(String.format("%" + count + "s", ' ').replaceAll("\\ ", "\\" + ".") + getName());
//        } catch (FormatFlagsConversionMismatchException c) {
//            System.out.println("F-A-L-S-E   S-T-A-R-T\n" + ">>>" + getName() + "<<<\n" + "#####################\n");
//        }
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
