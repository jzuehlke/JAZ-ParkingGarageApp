package com.jakezuehlke;

/**
 * Enum Singleton for the user's input for the check-in console.
 * @author Jake Zuehlke
 */
public enum  CheckInConsole
{
    INSTANCE;

    private static String input = "";

    /**
     * Display the check in console prompts. Re-prompt on bad user input, then set desirable user input to input String.
     */
    public void displayConsole()
    {
        Writer consoleWriter = new ConsoleWriter();
        Reader keyboardReader = new KeyboardReader();
        boolean invalid = true;

        do
        {
            //menu
            consoleWriter.writeLine("\nBest Value Parking Garage"
                + "\n======== Welcome ========"
                + "\n1 - Check/In"
                + "\n2 - Special Event"
                + "\n3 - Close Garage");

            //get user input
            String userInput = keyboardReader.readLine();

            if (userInput.equals("1") || userInput.equals("2") || userInput.equals("3"))
            {
                input = userInput;
                invalid = false;
            }
        } while(invalid);
    }

    /**
     * Getter for input String field
     * @return input String
     */
    public String getInput()
    {
        return input;
    }
}