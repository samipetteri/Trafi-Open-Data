package com.sp.trafi;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sami on 11.3.2017.
 */
public class VehicleCabsTest {
    @Test
    public void testInitalization() {
        VehicleCabs cabs = new VehicleCabs();
        assertEquals(4, cabs.getAll().size());
    }
}