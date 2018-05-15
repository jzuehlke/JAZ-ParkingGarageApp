package com.jakezuehlke;

/**
 * Utilizing the Factory Pattern, generate an appropriate ticket depending on the corresponding TicketType.
 * @author Jake Zuehlke
 */
public class TicketFactory
{
    public Ticket findTicket(TicketType ticketType)
    {
        switch (ticketType)
        {
            case STANDARD: return new StandardTicket();
            case SPECIAL: return new SpecialEventTicket();
            case LOST: return new LostTicket();
            //new Tickets here
            default: return null;
        }
    }
}