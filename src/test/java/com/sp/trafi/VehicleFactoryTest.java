package com.sp.trafi;

import com.sp.trafi.domain.Vehicle;
import com.sp.trafi.parser.Row;
import com.sp.trafi.parser.VehicleFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleFactoryTest {
    @Test
    public void fieldsAreCorrect() {
        String csvRow = "M1;1997-01-10;101;01;variant;version;19970110;5;6;AC;1;8;1320;1780;1781;4600;1720;1111;02;1782;66;4;false;true;Volkswagen;5D PASSAT VARIANT 1.8 CL-351-C/263;trans;91;PASSAT;05;typecode;03;286;100;355890;469;WVWZZZ3AZT;2";
        Row row = new Row(csvRow.split(";"));
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle v = vehicleFactory.createVehicle(row);

        assertEquals("M1", v.getVehicleClass().getCode());
        assertEquals(1997, v.getRegistrationDateYear());
        assertEquals("101", v.getVehicleGroup().getCode());
        assertEquals("01", v.getVehicleUse().getCode());
        assertEquals("variant", v.getVehicleVariant());
        assertEquals("version", v.getVehicleVersion());

        assertEquals(1997, v.getInUseDateYear());
        assertEquals("5", v.getVehicleColor().getCode());
        assertEquals(6, v.getDoorCount());
        assertEquals("AC", v.getVehicleChassis().getCode());
        assertEquals("1", v.getVehicleCab().getCode());
        assertEquals(8, v.getSeatCount());
        assertEquals(1320, v.getWeight());
        assertEquals(1780, v.getMaxWeightByManufacturer());
        assertEquals(1781, v.getMaxWeightByGoverment());
        assertEquals(4600, v.getLength());
        assertEquals(1720, v.getWidth());
        assertEquals(1111, v.getHeight());
        assertEquals("02", v.getVehicleFuel().getCode());
        assertEquals(1782, v.getEngineDisplacement());
        assertEquals(66, v.getEnginePower());
        assertEquals(4, v.getEngineCylinderCount());
        assertEquals(false, v.isEngineCompresor());
        assertEquals(true, v.isVehicleHybrid());
        assertEquals("Volkswagen", v.getVehicleMake());
        assertEquals("5D PASSAT VARIANT 1.8 CL-351-C/263", v.getVehicleModel());
        assertEquals("trans", v.getTransmission());
        assertEquals(91, v.getTransmissionGearCount());
        assertEquals("PASSAT", v.getVehicleModelName());
        assertEquals("05", v.getVehicleBrakes());
        assertEquals("typecode", v.getVehicleTypeCode());
        assertEquals("03", v.getSomething());
        assertEquals("286", v.getVehicleTown().getCode());
        assertEquals(100, v.getVehicleCo2Emissions());
        assertEquals(355890, v.getOdometerReading());
        assertEquals("469", v.getArea());
        assertEquals("WVWZZZ3AZT", v.getVehicleIdentificationNumber());
        assertEquals(2, v.getId());
    }
}