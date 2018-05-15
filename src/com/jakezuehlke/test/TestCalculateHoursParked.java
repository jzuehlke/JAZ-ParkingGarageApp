package com.jakezuehlke.test;

import com.jakezuehlke.CalculateHoursParked;
import java.util.Calendar;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * JUnit test class for CalculateHoursParked.  Asserts getHoursParked does not return a null value.
 * @author Jake Zuehlke
 */
public class TestCalculateHoursParked
{
    @Test
    public void testGetHoursParked()
    {
        CalculateHoursParked testCalc = new CalculateHoursParked();
        Calendar cal1 = Calendar.getInstance(), cal2 = Calendar.getInstance();

        assertNotNull("getHoursParked should return a double, not null!", testCalc.getHoursParked(cal1, cal2));
    }
}