package com.jakezuehlke;

/**
 * Implements FeeCalculator to modify getFee to set the amountDue in ParkingBill for a lost ticket.
 * @author Jake Zuehlke
 */
public class LostTicketFeeCalc implements FeeCalculator
{
    /**
     * Lost ticket fee is $25.00 regardless of hours parked
     * @param parkingBill
     */
    @Override
    public void getFee(ParkingBill parkingBill)
    {
        parkingBill.setAmountDue(25.00);
    }
}