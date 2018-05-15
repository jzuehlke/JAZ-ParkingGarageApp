package com.jakezuehlke.test;

import com.jakezuehlke.GenerateCheckOutTime;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * JUnit test class for GenerateCheckOutTime.  Asserts getCheckOutTime does not return a null value.
 * @author Jake Zuehlke
 */
public class TestGenerateCheckOutTime
{
    @Test
    public void testGetCheckOutTime()
    {
        GenerateCheckOutTime testCheckIn = new GenerateCheckOutTime();
        assertNotNull("getCheckOutTime should return a Calendar, not null!", testCheckIn.getCheckOutTime());
    }
}