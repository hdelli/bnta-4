package com.bnta.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {



    @Test
    void canAddTwoNumbers() {
        //Given - call the class - similar thing you do in main do here
        Calculator calculator = new Calculator();
        int num1= 10;
        int num2= 10;

        //When- call the method

        int result = calculator.add(num1,num2);

        //Then- assert

        assertThat(result).isEqualTo(20);
    }
}