package com.sp.trafi.parser;

import com.sp.trafi.domain.Vehicle;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class VehicleParser implements Closeable, AutoCloseable {
    private final Scanner scanner;

    private VehicleFactory vehicleFactory = new VehicleFactory();

    public VehicleParser(File dataFile) throws FileNotFoundException {
        scanner = new Scanner(new FileInputStream(dataFile));
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
        Vehicle v = vehicleFactory.createVehicle(r);
        return v;
    }

    @Override
    public void close() {
        scanner.close();
    }


}
