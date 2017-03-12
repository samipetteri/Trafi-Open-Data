package com.sp.trafi.fields;

import com.sp.trafi.domain.BaseVehicleInfo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class BaseDataProvider<T extends BaseVehicleInfo> {
    private Map<String, T> collection;

    public BaseDataProvider() {
        collection = new HashMap<>();
        init();
    }

    private void init() {
        File file = new File(this.getClass().getClassLoader().getResource(getFile()).getFile());
        try (Scanner scanner = new Scanner(new FileInputStream(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\t");

                if (parts.length < 2)
                    continue;

                T data = createRow(parts);

                if (data != null) {
                    data.setCode(part(parts, 0));
                    collection.put(data.getCode(), data);
                }
            }
        } catch (FileNotFoundException e) {
            throw new InitializationException("Failed to load colors.csv", e);
        }
    }

    protected String part(String[] parts, int i) {
        if (parts.length < i + 1)
            return "";
        else
            return parts[i];
    }



    protected abstract T createRow(String[] parts);

    protected abstract String getFile();

    public Collection<T> getAll() {
        return collection.values();
    }

    public T get(String code) {
        return collection.get(code);
    }
}
