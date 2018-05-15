package com.jakezuehlke;

import java.io.*;

/**
 * Write a String to a new line in a file.
 * @author Jake Zuehlke
 */
public class GarageFileWriter implements Writer
{
    /**
     * Uses File, PrintWriter, BufferedWriter, and FileWriter to stream output to a file.
     * Uses try/catch for IOExceptions.
     * @param line
     */
    @Override
    public void writeLine(String line)
    {
        boolean append = true;
        File data = new File("data.txt");
        PrintWriter out = null;

        // This is where we setup our streams (append = false means overwrite)
        // new java.io.FileWriter() creates the file if doesn't exit
        try
        {
            // make sure we differentiate between java.io.FileWriter
            // class and this custom FileWriter class
            out = new PrintWriter(new BufferedWriter(new java.io.FileWriter(data, append)));
            out.println(line);
            out.close();
        }
        catch (IOException ioe)
        {
            if(out != null)
            {
                out.close();
            }
            System.out.println(ioe.getMessage());
            System.exit(1);  // 1 = signals program end with error
        }
    }
}