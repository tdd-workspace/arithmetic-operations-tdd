package com.arithmetic;

public class ArithmeticOperation {
    public int add(int valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

    public int multiply(int valueOne, int valueTwo) {
        return valueOne * valueTwo;
    }

    public int subraction(int valueOne, int valueTwo) {
        return valueOne - valueTwo;
    }

    public int division(int valueOne, int valueTwo) throws ZeroDivisionException {
        if(valueTwo == 0){
            throw new ZeroDivisionException("Zero Division Error");
        }
        return valueOne / valueTwo;
    }
}
