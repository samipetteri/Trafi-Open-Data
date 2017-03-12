package com.sp.trafi;

import java.util.Arrays;

/**
 * Created by sami on 11.3.2017.
 */
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
}
