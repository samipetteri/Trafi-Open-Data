package com.sp.trafi.domain;

/**
 * Created by sami on 11.3.2017.
 */
public class VehicleUse extends BaseVehicleInfo {
    private String shortDescriptionFi;
    private String longDescriptionFi;

    private String shortDescriptionSv;
    private String longDescriptionSv;
    private String shortDescriptionEn;
    private String longDescriptionEn;

    public String getShortDescriptionFi() {
        return shortDescriptionFi;
    }

    public void setShortDescriptionFi(String shortDescriptionFi) {
        this.shortDescriptionFi = shortDescriptionFi;
    }

    public String getLongDescriptionFi() {
        return longDescriptionFi;
    }

    public void setLongDescriptionFi(String longDescriptionFi) {
        this.longDescriptionFi = longDescriptionFi;
    }

    public String getShortDescriptionSv() {
        return shortDescriptionSv;
    }

    public void setShortDescriptionSv(String shortDescriptionSv) {
        this.shortDescriptionSv = shortDescriptionSv;
    }

    public String getLongDescriptionSv() {
        return longDescriptionSv;
    }

    public void setLongDescriptionSv(String longDescriptionSv) {
        this.longDescriptionSv = longDescriptionSv;
    }

    public String getShortDescriptionEn() {
        return shortDescriptionEn;
    }

    public void setShortDescriptionEn(String shortDescriptionEn) {
        this.shortDescriptionEn = shortDescriptionEn;
    }

    public String getLongDescriptionEn() {
        return longDescriptionEn;
    }

    public void setLongDescriptionEn(String longDescriptionEn) {
        this.longDescriptionEn = longDescriptionEn;
    }
}
