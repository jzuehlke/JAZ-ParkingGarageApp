package com.jakezuehlke;

/**
 * Factory Strategy class to find the corresponding FeeCalculator class depending on the ticket type.
 * @author Jake Zuehlke
 */
public class FeeFactory
{
    /**
     * Switch based on STANDARD, SPECIAL, or LOST ticket types.
     * @param ticketType
     * @return Corresponding FeeCalculator class.
     */
    public FeeCalculator findFee(TicketType ticketType)
    {
        switch (ticketType)
        {
            case STANDARD: return new StandardFeeCalc();
            case SPECIAL: return new SpecialEventFeeCalc();
            case LOST: return new LostTicketFeeCalc();
            //new FeeCalculators here
            default: return null;
        }
    }
}