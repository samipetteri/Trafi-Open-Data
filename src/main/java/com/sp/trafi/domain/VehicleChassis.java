package com.sp.trafi.domain;

/**
 * Created by sami on 11.3.2017.
 */
public class VehicleChassis extends BaseVehicleInfo {
    private String descriptionFi;
    private String descriptionSv;
    private String descriptionEn;

    public String getDescriptionFi() {
        return descriptionFi;
    }

    public void setDescriptionFi(String descriptionFi) {
        this.descriptionFi = descriptionFi;
    }

    public String getDescriptionSv() {
        return descriptionSv;
    }

    public void setDescriptionSv(String descriptionSv) {
        this.descriptionSv = descriptionSv;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    @Override
    public String toString() {
        return descriptionFi;
    }
}
