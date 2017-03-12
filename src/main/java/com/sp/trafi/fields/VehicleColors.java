package com.sp.trafi.fields;

import com.sp.trafi.domain.VehicleColor;

/**
 * Created by sami on 11.3.2017.
 */
public class VehicleColors extends BaseDataProvider<VehicleColor> {
    @Override
    protected VehicleColor createRow(String[] parts) {
        VehicleColor color = new VehicleColor();
        color.setDescriptionFi(part(parts, 1));
        color.setDescriptionSv(part(parts, 2));
        color.setDescriptionEn(part(parts, 3));

        return color;
    }

    @Override
    protected String getFile() {
        return "colors.csv";
    }
}
