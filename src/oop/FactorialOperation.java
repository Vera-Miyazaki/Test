package oop;

public class FactorialOperation extends CalculationOperation{

    private int value;
    private int result;

    public FactorialOperation(String name, int value) {
        super(name);
        this.value = value;

    }

    @Override
    public void doCalculation() {
        int i =1;
        while (i < value) {
            i++;
            result=value*i;
            }}


    @Override
    public void printResult() {
        System.out.println("„Die Fakultät für " +  value +" lautet " + result);

    }
}
