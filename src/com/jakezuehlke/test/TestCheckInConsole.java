package com.jakezuehlke.test;

import com.jakezuehlke.CheckInConsole;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * JUnit test class for CheckInConsole.  Asserts the field 'input' is not a null value.
 * @author Jake Zuehlke
 */
public class TestCheckInConsole
{
    @Test
    public void testGetInput()
    {
        assertNotNull("CheckInConsole's String input should not be null!", CheckInConsole.INSTANCE.getInput());
    }
}