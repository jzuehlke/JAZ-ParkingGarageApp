package com.jakezuehlke;

/**
 * Interface which will be used by TicketFactory to generate an appropriate ticket
 * @author Jake Zuehlke
 */
public interface Ticket
{
    ParkingBill generateTicket();
}