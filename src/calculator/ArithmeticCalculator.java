package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {
    AddOperator addOperator = new AddOperator();
    SubtractOperator subtractOperator = new SubtractOperator();
    MultiplyOperator multiplyOperator = new MultiplyOperator();
    DivideOperator divideOperator = new DivideOperator();
    public ArithmeticCalculator() {
        super();
    }
    public int calculate(int num1, int num2, char operator) {
        String sign = "+-*/";
        char plus = sign.charAt(0);
        char minus = sign.charAt(1);
        char multi = sign.charAt(2);
        char div = sign.charAt(3);

        if (operator == plus) {
            return addOperator.operate(num1, num2);
        } else if (operator == minus) {
            return subtractOperator.operate(num1, num2);
        } else if (operator == multi) {
            return multiplyOperator.operate(num1, num2);
        } else if (operator == div) {
            if (num2 == 0) {
                throw new ErrorInputException("Division by zero");
            }
            return divideOperator.operate(num1, num2);
        }
        else {
            throw new ErrorInputException("Invalid operator: " + operator);
        }
    }

    public ArrayList<Double> getMemory () {
        return this.memory;
    }
    public void setMemory (ArrayList<Double> memory) {
        this.memory = memory;
    }

    public void removeResult () {
        this.memory.remove(0);
    }
    public void inquiryResults(){
        for(Double number : this.memory) {
            System.out.println(number);
        }
    }
}
