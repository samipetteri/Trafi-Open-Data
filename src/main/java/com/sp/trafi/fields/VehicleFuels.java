package com.sp.trafi.fields;

import com.sp.trafi.domain.VehicleFuel;

public class VehicleFuels extends BaseDataProvider<VehicleFuel> {
    @Override
    protected VehicleFuel createRow(String[] parts) {
        VehicleFuel fuel = new VehicleFuel();
        fuel.setDescriptionFi(part(parts, 1));
        fuel.setDescriptionSv(part(parts, 2));
        fuel.setDescriptionEn(part(parts, 3));
        return fuel;
    }

    @Override
    public VehicleFuel get(String code) {
        return super.get(code);
    }

    @Override
    protected String getFile() {
        return "fuels.csv";
    }
}
