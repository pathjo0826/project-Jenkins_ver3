package se.yrgo.classes;

public class ExpressionNotFoundException extends RuntimeException {
    public static final long serialVersionUID = 100;

    public ExpressionNotFoundException(String message){

        System.out.println(message);
    }

}
