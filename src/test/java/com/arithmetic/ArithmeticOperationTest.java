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
    void toReturnOneWhenThreeIsSubractedByTwo(){
        //Arrange
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        int expectedValue = 1, three = 3, two = 2;

        //Act
        int actualValue = arithmeticOperation.subraction(three, two);

        //Assert
        assertEquals(expectedValue, actualValue);
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
    @Test
    void toReturnFiveWhenTenIsDividedByTwo(){
        //Arrange
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        int expectedValue = 5, ten = 10, two = 2;

        //Act
        int actualValue = arithmeticOperation.division(ten, two);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

}
