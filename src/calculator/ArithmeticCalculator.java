package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {
    private AddOperator addOperator = new AddOperator();
    private SubtractOperator subtractOperator = new SubtractOperator();
    private MultiplyOperator multiplyOperator = new MultiplyOperator();
    private DivideOperator divideOperator = new DivideOperator();
    private ModOperator modOperator = new ModOperator();
    private ArrayList<Cooperation> operateList = new ArrayList();

    public ArithmeticCalculator() {
        super();
    }
    public int calculate(int num1, int num2, char operator) {
        String sign = "+-*/%";
        String changeOperator = String.valueOf(operator);
        sign.contains(changeOperator);

        operateList.add(addOperator);
        operateList.add(subtractOperator);
        operateList.add(multiplyOperator);
        operateList.add(divideOperator);
        operateList.add(modOperator);

        if (!sign.contains(changeOperator)) {
            throw new ErrorInputException("Invalid operator: " + operator);
        }
        else {
            int operateResult = 0;
            for (int i = 0; i < num1; i++) {
                operateResult += operateList.get(i).operate(operator, num1, num2);
            }
            return operateResult;
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
