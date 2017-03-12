package com.sp.trafi;

import com.sp.trafi.domain.VehicleClass;

/**
 * Created by sami on 11.3.2017.
 */
public class VehicleClasses extends BaseDataProvider<VehicleClass> {
    @Override
    protected VehicleClass createRow(String[] parts) {
        VehicleClass clazz = new VehicleClass();
        clazz.setShortDescriptionFi(part(parts, 1));
        clazz.setLongDescriptionFi(part(parts, 2));
        clazz.setShortDescriptionSv(part(parts, 3));
        clazz.setLongDescriptionSv(part(parts, 4));
        clazz.setShortDescriptionEn(part(parts, 5));
        clazz.setLongDescriptionEn(part(parts, 6));

        return clazz;
    }

    @Override
    protected String getFile() {
        return "classes.csv";
    }
}
