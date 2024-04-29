package calculator;

public class DivideOperator {
    public DivideOperator() {}
    public int operate(int num1, int num2) {
        if (num2 == 0) {
            throw new ErrorInputException("Division by zero");
        }
        return num1 / num2;
    }
}
