package com.sp.trafi.fields;

import com.sp.trafi.domain.VehicleGroup;

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
