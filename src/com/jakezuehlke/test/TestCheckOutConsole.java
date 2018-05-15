package com.jakezuehlke.test;

import com.jakezuehlke.CheckOutConsole;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * JUnit test class for CheckOutConsole.  Asserts the field 'input' is not a null value.
 * @author Jake Zuehlke
 */
public class TestCheckOutConsole
{
    @Test
    public void testGetInput()
    {
        assertNotNull("CheckOutConsole's String input should not be null!", CheckOutConsole.INSTANCE.getInput());
    }
}