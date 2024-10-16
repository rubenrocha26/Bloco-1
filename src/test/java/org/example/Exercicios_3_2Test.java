package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicios_3_2Test {

    @Test
    public void test_constructor() {
        new Exercicios_3_2();
    }

    @Test
    void should_return_PI_for_r_equal_1_and_h_equal_1() {
        double r;
        r = Exercicios_3_2.exercicio_3_2(1, 1);
        assertEquals(Math.PI, r);
    }

    @Test
    void should_return_4PI_for_r_equal_2_and_h_equal_2() {
        double r;
        r = Exercicios_3_2.exercicio_3_2(2, 2);
        assertEquals(8 * Math.PI, r);
    }

    @Test
    void should_return_nan_for_r_equal_minus_1_and_h_equal_1() {
        double r;
        r = Exercicios_3_2.exercicio_3_2(-1, 1);
        assertEquals(Double.NaN, r);
    }

    @Test
    void should_return_nan_for_r_equal_1_and_h_minus_equal_1() {
        double r;
        r = Exercicios_3_2.exercicio_3_2(1, -1);
        assertEquals(Double.NaN, r);
    }

    @Test
    void should_return_nan_for_r_equal_0_and_h_minus_equal_() {
        double r;
        r = Exercicios_3_2.exercicio_3_2(0, 0);
        assertEquals(Double.NaN, r);
    }

    //Para números decimais
    @ParameterizedTest
    @CsvSource({
            "4.0, 5.0, 251.32741228718345907701147066236  ",
            "0, 5, NaN ",
            "5, 0, NaN"
    })
    void mutation_test_coverage(double r, double h, double volume_esperado) {
        double result = Exercicios_3_2.exercicio_3_2(r, h);
        assertEquals(volume_esperado, result);
    }
}