package com.sp.trafi.domain;

public class VehicleCab extends BaseVehicleInfo {
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
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "VehicleCab{" +
                "code='" + code + '\'' +
                ", descriptionFi='" + descriptionFi + '\'' +
                '}';
    }
}
