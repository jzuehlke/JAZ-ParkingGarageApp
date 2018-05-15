package com.jakezuehlke.test;

import com.jakezuehlke.CheckOutTicket;
import com.jakezuehlke.ParkingBill;
import com.jakezuehlke.TicketType;
import java.util.Calendar;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * JUnit test class for CheckOutTicket.  Asserts getCheckOutTicket does not return a null value.
 * @author Jake Zuehlke
 */
public class TestCheckOutTicket
{
    @Test
    public void testGetCheckOutTicket()
    {
        CheckOutTicket testCheckOut = new CheckOutTicket();
        ParkingBill testStandardBill = new ParkingBill(TicketType.STANDARD, Calendar.getInstance(), Calendar.getInstance());
        ParkingBill testSpecialBill = new ParkingBill(TicketType.SPECIAL, Calendar.getInstance(), Calendar.getInstance());
        ParkingBill testLostBill = new ParkingBill(TicketType.LOST, Calendar.getInstance(), Calendar.getInstance());

        assertNotNull("getCheckOutTicket should return a ParkingBill, not null!",
                testCheckOut.getCheckOutTicket(testStandardBill));
        assertNotNull("getCheckOutTicket should return a ParkingBill, not null!",
                testCheckOut.getCheckOutTicket(testSpecialBill));
        assertNotNull("getCheckOutTicket should return a ParkingBill, not null!",
                testCheckOut.getCheckOutTicket(testLostBill));
    }
}