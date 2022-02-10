package se.yrgo.classes;

import java.util.Scanner;

public class EnterExpressionUI {


    public String enterExpression(Scanner scanner) {
        System.out.println("Enter expression to look up: ");
        String expression = scanner.nextLine();

        return expression;
    }
}
