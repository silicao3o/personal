package calculator;

import java.util.ArrayList;

public class CircleCalculator extends Calculator {
    public CircleCalculator() {
        super();
    }
    static final double PI = 3.141592;
    public double calculateCircleArea(int radius){
        return radius * PI * radius;
    }

    public ArrayList<Double> getWidthCircle() {
        return this.memory;
    }
    public void setWidthCircle(ArrayList<Double> widthCircle) {
        this.memory = widthCircle;
    }
    public void inquiryCircle(){
        for(Double number : this.memory) {
            System.out.println(number);
        }
    }
}
