package com.jakezuehlke.test;

import com.jakezuehlke.FeeFactory;
import com.jakezuehlke.TicketType;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * JUnit test class for FeeFactory.  Asserts findFee does not return a null value.
 * @author Jake Zuehlke
 */
public class TestFeeFactory
{
    @Test
    public void testFindFee()
    {
        FeeFactory testFactory = new FeeFactory();

        assertNotNull("Must return a FeeCalculator class, not null!", testFactory.findFee(TicketType.STANDARD));
        assertNotNull("Must return a FeeCalculator class, not null!", testFactory.findFee(TicketType.SPECIAL));
        assertNotNull("Must return a FeeCalculator class, not null!", testFactory.findFee(TicketType.LOST));
    }
}