package com.jakezuehlke;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Read a line of input from a file
 * @author Jake Zuehlke
 */
public class GarageFileReader implements Reader
{
    private boolean lineReadFlag = false;

    /**
     * Use File and BufferedReader to read from a file.
     * Use try/catch for IOExceptions.
     * @return String of a line read from a file.
     */
    @Override
    public String readLine()
    {
        File data = new File("data.txt");

        BufferedReader in = null;
        String line = null;

        try
        {
            if (data.exists())
            {
                // make sure we differentiate between java.io.FileReader
                // class and this custom FileReader class
                in = new BufferedReader(new java.io.FileReader(data));
                line = in.readLine();
                in.close();
            }
            else
            {
                System.out.println("File not found - data.txt");
                line = null;
            }
        }
        catch (IOException ioe)
        {
            try
            {
                if( in != null )
                {
                    in.close();
                }
            }
            catch(IOException ioe2)
            {
                System.out.println(ioe2.getMessage());
            }
            System.out.println( ioe.getMessage() );
            System.exit(1);  // 1 = signals program end with error
        }

        // ugly hack so we can end the program after reading a line
        if(lineReadFlag)
        {
            return null;
        }
        else
        {
            lineReadFlag = true;
            return line;
        }
    }
}
