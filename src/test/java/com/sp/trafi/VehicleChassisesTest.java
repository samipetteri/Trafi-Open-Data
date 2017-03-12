package com.sp.trafi;

import com.sp.trafi.fields.VehicleChassises;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sami on 11.3.2017.
 */
public class VehicleChassisesTest {
    @Test
    public void testInit() {
        VehicleChassises chassis = new VehicleChassises();
        assertEquals(58,  chassis.getAll().size());
    }
}