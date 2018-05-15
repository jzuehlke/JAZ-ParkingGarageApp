package com.jakezuehlke;

import java.util.Scanner;

/**
 * Overwrites Reader's readLine method to prompt and return user's input as a String utilizing Scanner.
 * @author Jake Zuehlke
 */
public class KeyboardReader implements Reader
{
    /**
     * @return String value of user's input by using Scanner's nextLine method.
     */
    @Override
    public String readLine()
    {
        System.out.print("=> ");

        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}