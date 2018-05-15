package com.jakezuehlke.test;

import com.jakezuehlke.TicketFactory;
import com.jakezuehlke.TicketType;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * JUnit test class for TicketFactory.  Asserts findTicket does not return a null value.
 * @author Jake Zuehlke
 */
public class TestTicketFactory
{
    @Test
    public void testFindTicket()
    {
        TicketFactory testFactory = new TicketFactory();
        assertNotNull("findTicket should return a class, not null!", testFactory.findTicket(TicketType.STANDARD));
        assertNotNull("findTicket should return a class, not null!", testFactory.findTicket(TicketType.SPECIAL));
        assertNotNull("findTicket should return a class, not null!", testFactory.findTicket(TicketType.LOST));
    }
}