/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;


import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {

    /*
    Method uses gates.js file to check for errors.
    Prints error message to console window
     */
    public static void main(String[] args) {

        App application = new App();

        Path filePath = Paths.get("resources/gates.js");

        String errorMessages = application.javascriptLinter(filePath);
        System.out.println(errorMessages);
    }

    /*
    Method takes in a Path and scans that files for missing semi-colons.
    Returns error message with line number for lines with errors.
     */
    public String javascriptLinter(Path pathName) {

        String errorMessages = "";

        try {

            // tracks file line number
            int currentLine = 1;

            Scanner scLinter = new Scanner(new File(pathName.toUri()));

            while (scLinter.hasNext()) {

                // get next line to process
                String nextLine = scLinter.nextLine();

                // determine if line has error message
                if (hasError(nextLine)) {
                    errorMessages += String.format("Line %d: Missing semicolon.\n", currentLine);
                }

                // increase line number
                currentLine++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return errorMessages;

    }

    /*
    Method takes in a line of code and checks if it doesn't contain an error.
     */
    public boolean hasError(String lineOfCode) {

        boolean errorFlag = true;

        // no error if line is empty
        if (lineOfCode.isEmpty()) {
            errorFlag = false;
        }

        // if line isn't empty, check for other no error cases
        if (!lineOfCode.isEmpty()) {

            // no error if line ends with semi-colon
            if (lineOfCode.endsWith(";")) {
                errorFlag = false;
            }

            // no error if line ends with semi-colon
            if (lineOfCode.startsWith("//")) {
                errorFlag = false;
            }

            // no error if line ends with opening curly brace
            if (lineOfCode.endsWith("{")) {
                errorFlag = false;
            }

            // no error if line ends with closing curly brace
            if (lineOfCode.endsWith("}")) {
                errorFlag = false;
            }

            // no error if line contains if
            if (lineOfCode.contains("if")) {
                errorFlag = false;
            }

            // no error if line contains else
            if (lineOfCode.contains("else")) {
                errorFlag = false;
            }
        }

        return errorFlag;
    }
}