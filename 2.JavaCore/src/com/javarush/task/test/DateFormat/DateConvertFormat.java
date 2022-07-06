package com.javarush.task.test.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateConvertFormat {
    public static void main(String[] args) {
        String myDate = "11/12/2001";
        System.out.println("Введенное значение: " + myDate);
        final String DATE_FORMAT = "dd-MMM-yyyy";
        SimpleDateFormat oldDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT, Locale.ENGLISH);
        oldDateFormat.setLenient(false);
        Date newDate = null;
        try {
            newDate = oldDateFormat.parse(myDate);
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
        myDate = dateFormat.format(newDate);
        System.out.println("Отформатированное значение: " + myDate);
    }
}
