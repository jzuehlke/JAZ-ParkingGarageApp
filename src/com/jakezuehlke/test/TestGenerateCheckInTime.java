package com.jakezuehlke.test;

import com.jakezuehlke.GenerateCheckInTime;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * JUnit test class for GenerateCheckInTime.  Asserts getCheckInTime does not return a null value.
 * @author Jake Zuehlke
 */
public class TestGenerateCheckInTime
{
    @Test
    public void testGetCheckInTime()
    {
        GenerateCheckInTime testCheckIn = new GenerateCheckInTime();
        assertNotNull("getCheckInTime should return a Calendar, not null!", testCheckIn.getCheckInTime());
    }
}