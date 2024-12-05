package com.example.incercaretest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateConverter {
    private static final SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

    public static Date fromString(String dateString) {
        try {
            //parse() -> used to extract a Date object from a String
            return formatter.parse(dateString);
        } catch (ParseException e) {
            return null;
        }
    }

    public static String fromDate(Date value) {
        if(value == null) {
            return null;
        }
        //format() -> used to convert a Date in a String
        return formatter.format(value);
    }
}
