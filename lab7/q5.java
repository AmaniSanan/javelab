/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Scanner;

/**
 *5.	Implement a program that can input
 * an expression in postfix notation (see Exercise C-6.19) and output its value
 * @author KH
 */
public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a postfix expression: ");
        String expression = scanner.nextLine();

        int result = evaluatePostfix(expression);
        System.out.println("Result: " + result);
    }

    public static int evaluatePostfix(String expression) {
        Stack<E> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(applyOperator(a, b, token));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return "+-*/".contains(token);
    }

    private static int applyOperator(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
