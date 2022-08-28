package com.javarush.task.task37.task3702;

import com.javarush.task.task37.task3702.female.FemaleFactory;
import com.javarush.task.task37.task3702.male.MaleFactory;

public class FactoryProducer {
    enum HumanFactoryType { MALE, FEMALE };
    public static AbstractFactory getFactory(HumanFactoryType factoryType) {
        switch (factoryType) {
            case FEMALE: return new FemaleFactory();
            case MALE: return new MaleFactory();
            default: return null;
        }

//        if (factoryType == HumanFactoryType.MALE) {
//            return new MaleFactory();
//        } else {
//            return new FemaleFactory();
//        }
    }
}
