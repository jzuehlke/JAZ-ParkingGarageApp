package com.jakezuehlke;

/**
 * Interface for classes which calculate the fee based on ticket type and hours parked.
 * @author Jake Zuehlke
 */
public interface FeeCalculator
{
    void getFee(ParkingBill parkingBill);
}