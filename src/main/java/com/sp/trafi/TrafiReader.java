package com.sp.trafi;

import com.sp.trafi.domain.Vehicle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Spliterators;
import java.util.stream.StreamSupport;

/**
 * Created by sami on 11.3.2017.
 */
public class TrafiReader {


    public static void main(String[] args) throws FileNotFoundException {
        String file = "c:\\dev\\data\\AvoinData4.8_uusi.csv";

        LinkedList<Vehicle> allVehicles = new LinkedList<>();

        try (VehicleStream vehicleStream = new VehicleStream(new File(file))) {
            
        }


        System.out.println(allVehicles.size());
    }

}
