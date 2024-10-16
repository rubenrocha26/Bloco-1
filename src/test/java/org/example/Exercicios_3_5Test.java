package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicios_3_5Test {
    @Test
    public void test_constructor() {
        new Exercicios_3_5();
    }

    @Test
    void should_return_minus_1_for_x_equal_1() {
        double r;
        r = Exercicios_3_5.exercicio_3_5(1);
        assertEquals(-1, r);
    }
    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, -1",
            "-1, 5",
            "2, -1",
            "-2, 11",
            "2.5, -0.25"
    })  //arrange
    void should_return_a_valid_double_for_x(double x, double functionResultExpected) {
        //act
        double result = Exercicios_3_5.exercicio_3_5(x);
        //assert
        assertEquals(functionResultExpected, result);
    }
}