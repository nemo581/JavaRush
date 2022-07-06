package com.javarush.task.task15.task1522;

import com.javarush.task.task15.task1529.Plane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 
Закрепляем паттерн Singleton
*/
public class Solution {
    public static void main(String[] args) {
    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // implement step #5 here - реализуйте задание №5 тут

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String spaceObject = reader.readLine();
        if (spaceObject.equals(Sun.SUN)) {
            thePlanet = Sun.getInstance();
        }
        else if (spaceObject.equals(Moon.MOON)) {
            thePlanet = Moon.getInstance();
            }
            else if (spaceObject.equals(Earth.EARTH)) {
                thePlanet = Earth.getInstance();
        } else {
                thePlanet = null;
        }
    }
}
