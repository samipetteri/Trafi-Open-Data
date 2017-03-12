package com.sp.trafi.parser;

import com.sp.trafi.fields.*;
import com.sp.trafi.domain.Vehicle;

public class VehicleFactory {
    private VehicleClasses classes = new VehicleClasses();
    private VehicleGroups groups = new VehicleGroups();
    private VehicleUses uses = new VehicleUses();
    private VehicleColors colors = new VehicleColors();
    private VehicleFuels fuels = new VehicleFuels();
    private VehicleChassises chassis = new VehicleChassises();
    private VehicleCabs cabs = new VehicleCabs();
    private VehicleTowns towns = new VehicleTowns();

    public Vehicle createVehicle(Row row) {
        Vehicle vehicle = new Vehicle();
        String classCode = row.getString(I.VEHICLE_CLASS);

        if (isEmpty(classCode))
            return null;

        vehicle.setVehicleClass(classes.get(classCode));
        if (vehicle.getVehicleClass() == null) {
            return null;
        }

        vehicle.setRegistrationDate(row.getDate(I.FIRST_REGISTRATION_DATE, "yyyy-MM-DD"));

        String groupCode = row.getString(I.VEHICLE_GROUP);
        vehicle.setVehicleGroup(groups.get(groupCode));

        vehicle.setVehicleUse(uses.get(row.getString(I.VEHICLE_USE)));

        vehicle.setVehicleColor(colors.get(row.getString(I.VEHICLE_COLOR)));
        vehicle.setDoorCount(row.getInt(I.DOOR_COUNT));

        vehicle.setVehicleFuel(fuels.get(row.getString(I.FUEL)));
        vehicle.setVehicleVariant(row.getString(I.VEHICLE_VARIANT_ID));
        vehicle.setVehicleVersion(row.getString(I.VEHICLE_VERSION_ID));
        vehicle.setInUseDate(row.getDate(I.USE_REGISTRATION_DATE, "yyyyMMDD"));
        vehicle.setVehicleChassis(chassis.get(row.getString(I.VEHICLE_CHASSIS)));
        vehicle.setVehicleCab(cabs.get(row.getString(I.VEHICLE_CAB)));
        vehicle.setSeatCount(row.getInt(I.SEAT_COUNT));
        vehicle.setWeight(row.getInt(I.WEIGHT));
        vehicle.setMaxWeightByManufacturer(row.getInt(I.MAX_WEIGHT_BY_MANUFACTURER));
        vehicle.setMaxWeightByGoverment(row.getInt(I.MAX_WEIGHT_BY_GOVERNMENT));
        vehicle.setLength(row.getInt(I.LENGTH));
        vehicle.setWidth(row.getInt(I.WIDTH));
        vehicle.setHeight(row.getInt(I.HEIGHT));
        vehicle.setEngineDisplacement(row.getInt(I.ENGINE_SIZE));
        vehicle.setEnginePower(row.getInt(I.ENGINE_POWER));
        vehicle.setEngineCylinderCount(row.getInt(I.ENGINE_CYLINDER_COUNT));
        vehicle.setEngineCompresor(row.getBoolean(I.ENGINE_COMPRESSOR));
        vehicle.setVehicleHybrid(row.getBoolean(I.HYBRID));
        vehicle.setVehicleMake(row.getString(I.MAKE));
        vehicle.setVehicleModel(row.getString(I.MODEL));
        vehicle.setTransmission(row.getString(I.TRANSMISSION));
        vehicle.setTransmissionGearCount(row.getInt(I.TRANSMISSION_GEAR_COUNT));
        vehicle.setVehicleModelName(row.getString(I.COMMERCIAL_NAME));
        vehicle.setVehicleBrakes(row.getString(I.BRAKES));
        vehicle.setVehicleTypeCode(row.getString(I.VEHICLE_TYPE_CODE));
        vehicle.setSomething(row.getString(I.UNKNOWN1));
        vehicle.setVehicleTown(towns.get(row.getString(I.VEHICLE_CITY)));
        vehicle.setVehicleCo2Emissions(row.getInt(I.CO2_EMISSIONS));
        vehicle.setOdometerReading(row.getInt(I.ODOMETER_READING));
        vehicle.setArea(row.getString(I.AREA));
        vehicle.setVehicleIdentificationNumber(row.getString(I.VEHICLE_IDENTIFICATION_NUMBER));
        vehicle.setId(row.getInt(I.VEHICLE_ID));

        return vehicle;
    }

    public static boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }
}
