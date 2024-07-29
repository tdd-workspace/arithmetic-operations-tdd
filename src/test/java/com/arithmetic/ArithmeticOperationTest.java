package com.arithmetic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ArithmeticOperationTest {
    private static ArithmeticOperation arithmeticOperation;
    @BeforeAll
    static void beforeAll(){
        arithmeticOperation = new ArithmeticOperation();
    }
    @Test
    void toReturnSixWhenFourIsAddedWithTwo(){
        int two = 2, four = 4, six = 6;

        assertThat(arithmeticOperation.add(four, two), is(equalTo(six)));
    }

    @Test
    void toReturnOneWhenThreeIsSubractedByTwo(){
        int two = 2, three = 3, one = 1;

        assertThat(arithmeticOperation.subraction(three, two), is(equalTo(one)));
    }
    @Test
    void toReturnEightWhenFourIsMultipliedByTwo(){
        int two = 2, four = 4, eight = 8;

        assertThat(arithmeticOperation.multiply(four, two), is(equalTo(eight)));
    }
    @Test
    void toReturnFiveWhenTenIsDividedByTwo(){
        int two = 2, ten = 10, five = 5;

        assertThat(arithmeticOperation.division(ten, two), is(equalTo(five)));
    }

}
