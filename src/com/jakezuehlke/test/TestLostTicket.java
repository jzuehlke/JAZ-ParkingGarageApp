package com.jakezuehlke.test;

import com.jakezuehlke.LostTicket;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * JUnit test class for LostTicket.  Asserts generateTicket does not return a null value.
 * @author Jake Zuehlke
 */
public class TestLostTicket
{
    @Test
    public void testGenerateTicket()
    {
        LostTicket testTicket = new LostTicket();
        assertNotNull("GenerateTicket should return a Ticket, not null!", testTicket.generateTicket());
    }
}