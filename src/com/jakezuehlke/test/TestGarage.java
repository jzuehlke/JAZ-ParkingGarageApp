package com.jakezuehlke.test;

import com.jakezuehlke.Garage;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * JUnit test class for Garage.  Asserts the ArrayList 'parkingBills' is not a null value.
 * @author Jake Zuehlke
 */
public class TestGarage
{
    @Test
    public void testGetParkingBills()
    {
        assertNotNull("Garage's ParkingBill ArrayList should not be null!", Garage.INSTANCE.getParkingBills());
    }
}