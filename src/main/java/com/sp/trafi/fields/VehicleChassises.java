package com.sp.trafi.fields;

import com.sp.trafi.domain.VehicleChassis;

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
