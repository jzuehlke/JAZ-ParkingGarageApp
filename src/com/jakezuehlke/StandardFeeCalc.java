package com.jakezuehlke;

/**
 * Implements FeeCalculator to modify getFee to set the amountDue in ParkingBill for a standard rate ticket.
 * @author Jake Zuehlke
 */
public class StandardFeeCalc implements FeeCalculator
{
    /**
     * Standard parking fee is calculated as $5.00 for the first 3 hours parked,
     * then $1.00/hour per time parked beyond 3 hours.
     * Standard parking fees do not go higher than $15.
     * @param parkingBill
     */
    @Override
    public void getFee(ParkingBill parkingBill)
    {
        double hoursParked = parkingBill.getHoursParked();

        if(hoursParked <= 3)
        {
            parkingBill.setAmountDue(5.00);
        }
        else if(hoursParked > 3 && hoursParked <= 13)
        {
            parkingBill.setAmountDue(5.00 + (Math.ceil(hoursParked) - 3));
        }
        else
        {
            parkingBill.setAmountDue(15.00);
        }
    }
}