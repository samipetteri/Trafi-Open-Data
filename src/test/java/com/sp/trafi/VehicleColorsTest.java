package com.sp.trafi;

import com.sp.trafi.fields.VehicleColors;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sami on 11.3.2017.
 */
public class VehicleColorsTest {
    @Test
    public void testInit() {

        VehicleColors colors = new VehicleColors();
        assertEquals(13, colors.getAll().size());
    }

}