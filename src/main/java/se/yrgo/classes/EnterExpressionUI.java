package se.yrgo.classes;

import java.util.Scanner;

public class EnterExpressionUI {

    /**
     * This method handles user input in form of a String. 
     * It returns the user input in form of a String.
     * @param scanner
     * @return
     */

    public String enterExpression(Scanner scanner) {
        System.out.println("Enter expression to look up: ");
        String expression = scanner.nextLine();

        return expression;
    }
}
