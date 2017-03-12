package com.sp.trafi;

import com.sp.trafi.domain.VehicleGroup;

/**
 * Created by sami on 11.3.2017.
 */
public class VehicleGroups extends BaseDataProvider<VehicleGroup> {

    @Override
    protected VehicleGroup createRow(String[] parts) {
        VehicleGroup group = new VehicleGroup();
        group.setDescriptionFi(part(parts, 1));
        group.setDescriptionSv(part(parts, 2));
        group.setDescriptionEn(part(parts, 3));
        return group;
    }

    @Override
    protected String getFile() {
        return "groups.csv";
    }
}
