package com.jakezuehlke.test;

import com.jakezuehlke.StandardTicket;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * JUnit test class for StandardTicket.  Asserts generateTicket does not return a null value.
 * @author Jake Zuehlke
 */
public class TestStandardTicket
{
    @Test
    public void testGenerateTicket()
    {
        StandardTicket testStandard = new StandardTicket();
        assertNotNull("generateTicket should return a ParkingBill, not null!", testStandard.generateTicket());
    }
}