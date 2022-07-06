package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach beach) {

        int count = 0;
        if (this.distance > beach.getDistance()) {
            count--;
        }
        if (this.distance < beach.getDistance()) {
            count++;
        }
        if (this.quality > beach.getQuality()) {
            count++;
        }
        if (this.quality < beach.getQuality()) {
            count--;
        }

        return Integer.compare(count, 0);


    }


    public static void main(String[] args) {
        Beach beach_1 = new Beach("Beach_1", 1, 5);
        Beach beach_2 = new Beach("Beach_2", 2, 5);
        beach_1.compareTo(beach_2);


    }


}
