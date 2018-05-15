package com.jakezuehlke;

/**
 * Implements Writer's writeLine method to output to the console.
 * @author Jake Zuehlke
 */
public class ConsoleWriter implements Writer
{
    @Override
    public void writeLine(String line)
    {
        System.out.println(line);
    }
}
