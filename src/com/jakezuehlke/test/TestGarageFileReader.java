package com.jakezuehlke.test;

import com.jakezuehlke.GarageFileReader;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * JUnit test class for GarageFileReader.  Asserts readLine does not return a null value.
 * @author Jake Zuehlke
 */
public class TestGarageFileReader
{
    @Test
    public void testReadLine()
    {
        GarageFileReader testReader = new GarageFileReader();
        assertNotNull("ReadLine should return a String, not null!", testReader.readLine());
    }
}