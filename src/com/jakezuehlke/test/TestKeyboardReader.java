package com.jakezuehlke.test;

import com.jakezuehlke.KeyboardReader;
import com.jakezuehlke.Reader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static junit.framework.TestCase.assertEquals;

/**
 * JUnit test class for KeyboardReader.  Asserts readLine does not return a null value.
 * Sets the 'in' from System.in as dummy input for testing, then resets it.
 * @author Jake Zuehlke
 */
public class TestKeyboardReader
{
    //new ByteArrayInputStream for System.in to use in Scanner test
    ByteArrayInputStream in = new ByteArrayInputStream("My string".getBytes());

    @Before
    public void setIn()
    {
        //set System.in
        System.setIn(in);
    }

    @Test
    public void testReadLine()
    {
        Reader testKeyboard = new KeyboardReader();

        assertEquals("My string", testKeyboard.readLine());
    }

    @After
    public void resetIn()
    {
        //reset System.in
        System.setIn(System.in);
    }
}