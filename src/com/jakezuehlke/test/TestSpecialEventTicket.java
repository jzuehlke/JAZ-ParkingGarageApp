package com.jakezuehlke.test;

import com.jakezuehlke.SpecialEventTicket;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * JUnit test class for SpecialEventTicket.  Asserts generateTicket does not return a null value.
 * @author Jake Zuehlke
 */
public class TestSpecialEventTicket
{
    @Test
    public void testGenerateTicket()
    {
        SpecialEventTicket testEvent = new SpecialEventTicket();
        assertNotNull("generateTicket should return a ParkingBill, not null!", testEvent.generateTicket());
    }
}