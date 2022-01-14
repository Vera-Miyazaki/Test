package oop;

public abstract class CalculationOperation {

    protected String name;

    public CalculationOperation(String name) {
        this.name = name;
    }

    public abstract void doCalculation();

    public abstract void printResult();
}
