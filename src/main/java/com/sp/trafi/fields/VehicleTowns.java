package com.sp.trafi.fields;

import com.sp.trafi.domain.VehicleTown;

/**
 * Created by sami on 11.3.2017.
 */
public class VehicleTowns extends BaseDataProvider<VehicleTown> {
    @Override
    protected VehicleTown createRow(String[] parts) {
        VehicleTown vehicleTown = new VehicleTown();
        vehicleTown.setDescriptionFi(part(parts, 1));
        vehicleTown.setDescriptionSv(part(parts, 2));
        vehicleTown.setDescriptionEn(part(parts, 3));
        return vehicleTown;
    }

    @Override
    protected String getFile() {
        return "towns.csv";
    }
}
