package calculator;

public class DivideOperator implements Cooperation {
    public DivideOperator() {}
    public int operate(char sign, int num1, int num2) {
        if(sign == '/'){
            if (num2 == 0) {
                throw new ErrorInputException("Division by zero");
            }
            return num1 / num2;
        }
        return 0;
    }
}
