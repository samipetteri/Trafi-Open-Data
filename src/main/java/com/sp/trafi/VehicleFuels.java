package com.sp.trafi;

import com.sp.trafi.BaseDataProvider;
import com.sp.trafi.domain.VehicleFuel;

/**
 * Created by sami on 11.3.2017.
 */
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
