package com.sp.trafi;

import com.sp.trafi.InitializationException;
import com.sp.trafi.domain.VehicleChassis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by sami on 11.3.2017.
 */
public class VehicleChassises extends BaseDataProvider<VehicleChassis>{
    @Override
    protected VehicleChassis createRow(String[] parts) {
        VehicleChassis chassis = new VehicleChassis();
        chassis.setDescriptionFi(part(parts, 1));
        chassis.setDescriptionSv(part(parts, 2));
        chassis.setDescriptionEn(part(parts, 3));

        return chassis;
    }

    @Override
    protected String getFile() {
        return "chassis.csv";
    }
}
