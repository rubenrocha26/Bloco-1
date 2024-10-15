package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicios_3_4Test {

    @Test
    void should_return_2_for_x_equal_1() {
        double r;
        r= Exercicios_3_4.exercicio_3_4(1);
        assertEquals(2, r);
    }
    @Test
    void should_return_5_for_x_equal_2() {
        double r;
        r= Exercicios_3_4.exercicio_3_4(2);
        assertEquals(5, r);
    }
    @Test
    void should_return_2_for_x_equal_minus_1(){
        double r;
        r= Exercicios_3_4.exercicio_3_4(-1);
        assertEquals(2, r);
    }
    @Test
    void should_return_5_for_x_equal_minus_2(){
        double r;
        r= Exercicios_3_4.exercicio_3_4(-2);
        assertEquals(5, r);
    }
    @Test
    void should_return_1_for_x_equal_0(){
        double r;
        r= Exercicios_3_4.exercicio_3_4(0);
        assertEquals(1, r);
    }
    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 2",
            "-1, 2",
            "2, 5",
            "-2, 5",
            "2.5, 7.25"
    })  //arrange
    void should_return_a_valid_double_for_x(double x, double functionResultExpected) {
        //act
        double result = Exercicios_3_4.exercicio_3_4(x);
        //assert
        assertEquals(functionResultExpected, result);
    }
}