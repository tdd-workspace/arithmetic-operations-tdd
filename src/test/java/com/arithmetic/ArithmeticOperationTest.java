package com.arithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationTest {
    @Test
    void toReturnSixWhenFourIsAddedWithTwo(){
    ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
    assertEquals(6, arithmeticOperation.add(4,2));
    }
}
