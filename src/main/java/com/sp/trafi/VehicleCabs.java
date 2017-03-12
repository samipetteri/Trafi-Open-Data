package com.sp.trafi;

import com.sp.trafi.domain.VehicleCab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by sami on 11.3.2017.
 */
public class VehicleCabs extends BaseDataProvider<VehicleCab> {

    @Override
    protected VehicleCab createRow(String[] parts) {
        VehicleCab cab = new VehicleCab();
        cab.setDescriptionFi(part(parts, 1));
        cab.setDescriptionSv(part(parts, 2));
        cab.setDescriptionEn(part(parts, 3));
        return cab;
    }

    @Override
    protected String getFile() {
        return "cabs.csv";
    }
}
