package calculator;

public class SubtractOperator implements Cooperation{
    public SubtractOperator() {}
    public int operate(char sign, int num1, int num2){
        if(sign == '-'){
            return num1 - num2;
        }
        return 0;
    }
}
