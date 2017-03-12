package com.sp.trafi;

import com.sp.trafi.fields.VehicleFuels;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sami on 11.3.2017.
 */
public class VehicleFuelsTest {
    @Test
    public void testInit() {
        VehicleFuels fuels = new VehicleFuels();
        fuels.getAll().forEach(System.out::println);
        assertNotEquals(0, fuels.getAll().size());
    }

}