package com.sp.trafi;

import com.sp.trafi.fields.VehicleClasses;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sami on 11.3.2017.
 */
public class VehicleClassesTest {
    @Test
    public void testInit() {
        VehicleClasses classes = new VehicleClasses();
        assertEquals(55, classes.getAll().size());
    }

}