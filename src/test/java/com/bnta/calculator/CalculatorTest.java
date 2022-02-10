package com.bnta.calculator;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
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

    @Test
    void divide() {
        //Given
        Calculator calculator = new Calculator();
        int num1 = 4;
        int num2 = 5;

        //When
        int actual = 0;
        try {
            actual = calculator.divide(num1, num2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Then
        int expected = 2;
        assertThat(actual).isEqualTo(expected);

    }



        @Test
        void divideByZero() {
            Calculator calculator = new Calculator();
            int num1 = 4;
            int num2= 0;

            //when

        assertThatThrownBy(() -> { //assertions
            calculator.divide(num1,num2);

        }).hasMessage("cannot divide by 0");



    }
}