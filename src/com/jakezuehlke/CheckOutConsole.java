package com.jakezuehlke;

/**
 * Enum Singleton for the user's input for the check-out console.
 * @author Jake Zuehlke
 */
public enum CheckOutConsole
{
    INSTANCE;

    private static String input = "";

    /**
     * Display the check out console prompts. Re-prompt on bad user input, then set desirable user input to input String.
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
                + "\n======== Goodbye ========"
                + "\n1 - Check/Out"
                + "\n2 - Lost Ticket");

            //get user input
            String userInput = keyboardReader.readLine();

            if (userInput.equals("1") || userInput.equals("2"))
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