package com.twu.calculator;

public class Calculator {

    private double accumulator;

    public double doOperation(String operation, double operand) {
        switch (operation) {
            case "add":
                accumulator += operand;
                break;
            case "subtract":
                accumulator -= operand;
                break;
            case "multiply":
                accumulator *= operand;
                break;
            case "divide":
                accumulator /= operand;
                break;
            case "abs":
                accumulator = Math.abs(accumulator);
                break;
            case "neg":
                accumulator = -accumulator;
                break;
            case "sqrt":
                accumulator = Math.sqrt(accumulator);
                break;
            case "sqr":
                accumulator = Math.pow(accumulator, 2);
                break;
            case "cube":
                accumulator = Math.pow(accumulator, 3);
                break;
            case "cubert":
                accumulator = Math.cbrt(accumulator);
                break;
            case "third":
                accumulator = accumulator / 3;
            case "factorial":
                int a = 3;
                int b = 3;
                accumulator = Math.multiplyExact( a , b);
               break;
            case "cancel":
                accumulator = 0;
                break;
            case "exit":
                System.exit(0);
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
        return accumulator;
    }
}
