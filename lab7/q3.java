/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**3.	Postfix notation is an unambiguous way of writing an
 * arithmetic expression without parentheses. It is defined so that 
 * if “(exp1)op(exp2)” is a normal fully parenthesized expression whose
 * operation is op, the postfix version of this is “pexp1 pexp2 op”, where
 * pexp1 is the postfix version of exp1 and pexp2 is the postfix version of exp2. 
 * The postfix version of a single number or variable is just that number or variable.
 * So, for example, the postfix version of “((5 + 2) ∗ (8 − 3))/4” is “5 2 + 8 3 − ∗ 4 /”.
 * Describe a nonrecursive way of evaluating an expression in postfix notation.
 *
 * @author KH
 */
public class q3 {
     public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
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
