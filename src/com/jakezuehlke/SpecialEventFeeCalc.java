package com.jakezuehlke;

/**
 * Implements FeeCalculator to modify getFee to set the amountDue in ParkingBill for a special event ticket.
 * @author Jake Zuehlke
 */
public class SpecialEventFeeCalc implements FeeCalculator
{
    /**
     * Special event fee is $20.00 regardless of hours parked
     * @param parkingBill
     */
    @Override
    public void getFee(ParkingBill parkingBill)
    {
        parkingBill.setAmountDue(20.00);
    }
}