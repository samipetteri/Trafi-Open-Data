package com.sp.trafi.fields;

import com.sp.trafi.domain.VehicleCab;

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
