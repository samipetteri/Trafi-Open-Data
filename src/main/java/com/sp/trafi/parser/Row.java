package com.sp.trafi.parser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Row {
    private String[] elements;
    public Row(String[] elements) {
        this.elements = elements;
    }

    public String getString(int index) {
        return elements[index];
    }

    public int getInt(int index) {
        try {
            return Integer.parseInt(elements[index]);
        } catch (Exception e) {
            return -1;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    public boolean getBoolean(int index) {
        return "true".equals(elements[index]);
    }

    public Date getDate(int index, String dateFormat) {
        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        try {
            String dateString = elements[index];
            if (dateString.equals(""))
                return null;

            return format.parse(dateString);
        } catch (ParseException e) {
            return null;
        }
    }
}
