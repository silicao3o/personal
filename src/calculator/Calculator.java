package calculator;

import java.util.ArrayList;

public abstract class Calculator {
    protected ArrayList<Double> memory;

    public Calculator() {
        this.memory = new ArrayList<Double>();
    }
}
