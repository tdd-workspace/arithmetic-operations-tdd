package com.arithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationTest {
    @Test
    void toReturnSixWhenFourIsAddedWithTwo(){
        //Arrange
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        int expectedSum = 6 , four = 4, two = 2;

        //Act
        int actualSum = arithmeticOperation.add(four,two);

        //Assert
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void toReturnEightWhenFourIsMultipliedByTwo(){
        //Arrange
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        int expectedProduct = 8, four = 4, two = 2;

        //Act
        int actualProduct = arithmeticOperation.multiply(four, two);

        //Assert
        assertEquals(expectedProduct, actualProduct);
    }
}
