package calculator;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> memory = new ArrayList<Integer>();
    public ArrayList<Integer> resultArray (String[] args) {
        return memory;
    }
    public int calculate(int num1, int num2, char operator) {
        String sign = "+-*/";
        char plus = sign.charAt(0);
        char minus = sign.charAt(1);
        char multi = sign.charAt(2);
        char div = sign.charAt(3);

        if (operator == plus) {
            return num1 + num2;
        } else if (operator == minus) {
            return  num1 - num2;
        } else if (operator == multi) {
            return num1 * num2;
        } else if (operator == div) {
            if (num2 == 0) {
                throw new ErrorInputException("Division by zero");
            }
            return num1 / num2;
        }
        else {
            throw new ErrorInputException("Invalid operator: " + operator);
        }
    }
}
