package com.sp.trafi.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sami on 11.3.2017.
 */
public class Vehicle {
    // 0
    private VehicleClass vehicleClass;

    // 1
    private Date registrationDate;

    // 2
    private VehicleGroup vehicleGroup;

    // 3
    private VehicleUse vehicleUse;

    // 4
    // Käyttöönottopäivä
    // Katsastaja tallentaa tai ajoneuvo saa ensirekisteröinnin yhteydessä uusien ajoneuvojen osalta järjestelmän toimesta.
    private Date inUseDate;

    //6
    private VehicleColor vehicleColor;

    //7
    private int doorCount;

    //8
    private VehicleChassis vehicleChassis;

    // 9
    // Ohjaamotyyppi
    private VehicleCab vehicleCab;

    // 10
    private int seatCount;

    // 11
    private int weight;

    // 12
    private int maxWeightByManufacturer;

    // 13
    private int maxWeightByGoverment;

    // 14
    private int length;

    // 15
    private int width;

    // 16
    private int height;

    // 18
    private VehicleFuel vehicleFuel;

    // 19
    private int engineDisplacement;

    // 20
    // Moottorin suurin nettoteho kilowatteina (kW).
    private int enginePower;

    // 21
    // Sylintereiden lukumäärä.
    private int engineCylinderCount;

    // 22
    // Kyllä/ei  tieto ahtimen olemassaolosta.
    private boolean engineCompresor;

    // 23
    // kertoo onko ajoneuvo sähköhybridi  true/false
    private boolean vehicleHybrid;


    // 24
    // Ajoneuvon merkki selväkielisenä
    private String vehicleMake;

    // 25
    // Tieto kootaan tyyppirekisterin tiedoista kaupallinen nimi + mallin lisätiedot.
    private String vehicleModel;


    // 26
    private String transmission;

    // 27
    // Eteenpäin vievien vaihteiden lukumäärä.
    private int transmissionGearCount;

    // 28
    // Valmistajan ilmoittama ajoneuvon kaupallinen nimi.
    private String vehicleModelName;

    // 29
    // Ajoneuvon jarrujen voimanvälitys  ja tehostamistapa.
    private String vehicleBrakes;

    // 30
    // Ajoneuvon tyypin yksilöivä tunniste.
    private String vehicleTypeCode;

    // 31
    // Ajoneuvon variantin yksilöivä tunniste
    private String vehicleVariant;

    // 32
    // Ajoneuvon version yksilöivä tunniste
    private String vehicleVersion;

    // 33
    //  Ajoneuvolla käyttövoimakohtaiset tiedot kyselylajista 6xx lukien (EURO VI tiedot)
    private String something;

    // 34
    private VehicleTown vehicleTown;

    // 35
    private int vehicleCo2Emissions;

    // 36
    // juokseva luku
    private int id;

    // 37
    // 3 ensimmäistä numeroa postinumerosta
    private String area;

    // 38
    // Viimeisin katsastuksessa todettu matkamittarin lukema
    private int odometerReading;

    // 39
    // 10 ensimmäistä numeroa valmistenumerosta henkilöautoilta.
    private String vehicleIdentificationNumber;

    public VehicleClass getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(VehicleClass vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public int getRegistrationDateYear() {
        if (registrationDate == null)
            return 0;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String regDateString = sdf.format(registrationDate);
        return Integer.parseInt(regDateString);
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public VehicleGroup getVehicleGroup() {
        return vehicleGroup;
    }

    public void setVehicleGroup(VehicleGroup vehicleGroup) {
        this.vehicleGroup = vehicleGroup;
    }

    public VehicleUse getVehicleUse() {
        return vehicleUse;
    }

    public void setVehicleUse(VehicleUse vehicleUse) {
        this.vehicleUse = vehicleUse;
    }

    public Date getInUseDate() {
        return inUseDate;
    }

    public int getInUseDateYear() {
        if (inUseDate == null)
            return 0;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String regDateString = sdf.format(inUseDate);
        return Integer.parseInt(regDateString);
    }

    public void setInUseDate(Date inUseDate) {
        this.inUseDate = inUseDate;
    }

    public VehicleColor getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(VehicleColor vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public VehicleChassis getVehicleChassis() {
        return vehicleChassis;
    }

    public void setVehicleChassis(VehicleChassis vehicleChassis) {
        this.vehicleChassis = vehicleChassis;
    }

    public VehicleCab getVehicleCab() {
        return vehicleCab;
    }

    public void setVehicleCab(VehicleCab vehicleCab) {
        this.vehicleCab = vehicleCab;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxWeightByManufacturer() {
        return maxWeightByManufacturer;
    }

    public void setMaxWeightByManufacturer(int maxWeightByManufacturer) {
        this.maxWeightByManufacturer = maxWeightByManufacturer;
    }

    public int getMaxWeightByGoverment() {
        return maxWeightByGoverment;
    }

    public void setMaxWeightByGoverment(int maxWeightByGoverment) {
        this.maxWeightByGoverment = maxWeightByGoverment;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public VehicleFuel getVehicleFuel() {
        return vehicleFuel;
    }

    public void setVehicleFuel(VehicleFuel vehicleFuel) {
        this.vehicleFuel = vehicleFuel;
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(int engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getEngineCylinderCount() {
        return engineCylinderCount;
    }

    public void setEngineCylinderCount(int engineCylinderCount) {
        this.engineCylinderCount = engineCylinderCount;
    }

    public boolean isEngineCompresor() {
        return engineCompresor;
    }

    public void setEngineCompresor(boolean engineCompresor) {
        this.engineCompresor = engineCompresor;
    }

    public boolean isVehicleHybrid() {
        return vehicleHybrid;
    }

    public void setVehicleHybrid(boolean vehicleHybrid) {
        this.vehicleHybrid = vehicleHybrid;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getTransmissionGearCount() {
        return transmissionGearCount;
    }

    public void setTransmissionGearCount(int transmissionGearCount) {
        this.transmissionGearCount = transmissionGearCount;
    }

    public String getVehicleModelName() {
        return vehicleModelName;
    }

    public void setVehicleModelName(String vehicleModelName) {
        this.vehicleModelName = vehicleModelName;
    }

    public String getVehicleBrakes() {
        return vehicleBrakes;
    }

    public void setVehicleBrakes(String vehicleBrakes) {
        this.vehicleBrakes = vehicleBrakes;
    }

    public String getVehicleTypeCode() {
        return vehicleTypeCode;
    }

    public void setVehicleTypeCode(String vehicleTypeCode) {
        this.vehicleTypeCode = vehicleTypeCode;
    }

    public String getVehicleVariant() {
        return vehicleVariant;
    }

    public void setVehicleVariant(String vehicleVariant) {
        this.vehicleVariant = vehicleVariant;
    }

    public String getVehicleVersion() {
        return vehicleVersion;
    }

    public void setVehicleVersion(String vehicleVersion) {
        this.vehicleVersion = vehicleVersion;
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    public VehicleTown getVehicleTown() {
        return vehicleTown;
    }

    public void setVehicleTown(VehicleTown vehicleTown) {
        this.vehicleTown = vehicleTown;
    }

    public int getVehicleCo2Emissions() {
        return vehicleCo2Emissions;
    }

    public void setVehicleCo2Emissions(int vehicleCo2Emissions) {
        this.vehicleCo2Emissions = vehicleCo2Emissions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public String getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }

    public void setVehicleIdentificationNumber(String vehicleIdentificationNumber) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
    }
}
