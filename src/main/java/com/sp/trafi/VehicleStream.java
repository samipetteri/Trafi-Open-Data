package com.sp.trafi;

import com.sp.trafi.domain.*;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Created by sami on 11.3.2017.
 */
public class VehicleStream implements Closeable, AutoCloseable {
    private final Scanner scanner;
    private VehicleClasses classes = new VehicleClasses();
    private VehicleGroups groups = new VehicleGroups();
    private VehicleUses uses = new VehicleUses();
    private VehicleColors colors = new VehicleColors();
    private VehicleFuels fuels = new VehicleFuels();

    private File dataFile;

    public VehicleStream(File dataFile) throws FileNotFoundException {
        this.dataFile = dataFile;

        scanner = new Scanner(new FileInputStream(dataFile));
    }


    private Vehicle createVehicle(Row row) {
        Vehicle vehicle = new Vehicle();
        String classCode = row.getString(0);

        if (isEmpty(classCode))
            return null;

        vehicle.setVehicleClass(classes.get(classCode));
        if (vehicle.getVehicleClass() == null) {
            return null;
        }

        String groupCode = row.getString(TrafiDataIndices.VEHICLE_GROUP);
        vehicle.setVehicleGroup(groups.get(groupCode));

        vehicle.setVehicleUse(uses.get(row.getString(TrafiDataIndices.VEHICLE_USE)));
        //vehicle.setInUseDate();
        vehicle.setVehicleColor(colors.get(row.getString(TrafiDataIndices.VEHICLE_COLOR)));
        vehicle.setDoorCount(row.getInt(TrafiDataIndices.DOOR_COUNT));

        vehicle.setVehicleFuel(fuels.get(row.getString(TrafiDataIndices.FUEL)));

        return vehicle;
    }

    public static boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }

    @Override
    public void close() {
        scanner.close();
    }

    private boolean scannerHasNext() {
        return scanner.hasNextLine();
    }

    public Stream<Vehicle> stream() {
        Iterator<Vehicle> iterator = new Iterator<Vehicle>() {
            @Override
            public boolean hasNext() {
                return scannerHasNext();
            }

            @Override
            public Vehicle next() {
                return nextVehicle();
            }
        };

        Spliterator<Vehicle> spliterator = Spliterators.spliteratorUnknownSize(iterator, 0);

        return StreamSupport.stream(spliterator, false);
    }

    private Vehicle nextVehicle() {
        Vehicle v = null;
        while ( v == null) {
            v = getNext();
        }

        return v;
    }

    private Vehicle getNext() {
        String line = scanner.nextLine();
        String[] parts = line.split(";");
        Row r = new Row(parts);
        Vehicle v = new Vehicle();
        return v;
    }

}
