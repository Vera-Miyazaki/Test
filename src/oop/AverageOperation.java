package oop;

import java.util.ArrayList;

public class AverageOperation extends CalculationOperation{

   private ArrayList<Integer> listOfValues;
    private double result;

    public AverageOperation(String name, ArrayList<Integer> listOfValues) {
        super(name);
        this.listOfValues = listOfValues;
    }

    public void add(int value){
        listOfValues.add(value);
    }
    @Override
    public void doCalculation() {
        int i = 0;
        int result1= listOfValues.indexOf(i) + listOfValues.indexOf(i+1);

            while (listOfValues.get(i) < listOfValues.lastIndexOf(listOfValues)) {

              i++;
            }
        result = result1/listOfValues.size();

    }


        @Override
        public void printResult () {
            System.out.println("„Der Durchschnitt beträgt "+ result);

        }
    }