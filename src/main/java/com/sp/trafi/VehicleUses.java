package com.sp.trafi;

import com.sp.trafi.domain.VehicleUse;

/**
 * Created by sami on 11.3.2017.
 */
public class VehicleUses extends BaseDataProvider<VehicleUse> {

    @Override
    protected VehicleUse createRow(String[] parts) {
        VehicleUse vehicleUse = new VehicleUse();
        vehicleUse.setShortDescriptionFi(part(parts, 1));
        vehicleUse.setLongDescriptionFi(part(parts, 2));
        vehicleUse.setShortDescriptionSv(part(parts, 3));
        vehicleUse.setLongDescriptionSv(part(parts, 4));
        vehicleUse.setShortDescriptionEn(part(parts, 5));
        vehicleUse.setLongDescriptionEn(part(parts, 6));
        return vehicleUse;
    }

    @Override
    protected String getFile() {
        return "uses.csv";
    }
}
