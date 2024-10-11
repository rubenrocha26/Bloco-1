package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicios_3_6Test {

    @ParameterizedTest
    @CsvSource({
            "1, 1",        // cateto 1, cateto 2
            "10.5, 10.5",
            "0.5, 0.5"
    })
    void should_return_a_valid_double_if_c1_and_c2_are_positive(double c1, double c2) {
    //Arrange
    double hypotenuseCheck = Math.hypot(c1, c2);
    //Act
    double result = Exercicios_3_6.exercicio_3_6(c1, c2);
    //Assert
    assertEquals(hypotenuseCheck, result);
    }
    @ParameterizedTest
    @CsvSource({
            "-1, -1",          // cateto 1, cateto 2
            "-5, -5",
            "0, 0",
            "2, -2",
            "-2, 2"
            })
    void should_return_nan_if_c1_or_c2_are_negative_or_0(double c1, double c2) {
        //Act
        double result = Exercicios_3_6.exercicio_3_6(c1, c2);
        //Assert
        assertEquals(Double.NaN, result);
    }
}