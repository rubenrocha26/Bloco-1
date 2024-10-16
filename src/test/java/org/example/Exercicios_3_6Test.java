package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicios_3_6Test {

    @Test
    public void test_constructor() {
        new Exercicios_3_6();
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",        // cateto 1, cateto 2
            "10.5, 10.5",
            "0.5, 0.5",
            "5, 6",
            "6, 5"
    })
    void should_return_a_valid_double_if_c1_and_c2_are_positive(double c1, double c2) {
    //Arrange
    double hypotenuseCheck = Math.sqrt(c1*c1 + c2*c2);
    //Act
    double result = Exercicios_3_6.exercicio_3_6(c1, c2);
    //Assert
    assertEquals(hypotenuseCheck, result);
    }

    @ParameterizedTest
    @CsvSource({
            "-1, -1, NaN",          // cateto 1, cateto 2
            "-5.0, -5.0, NaN",
            "0, 0, NaN",
            "2.0, -2.0, NaN",
            "-2.0, 2.0, NaN",
            "-0.0, -0.0, NaN",
            "-1.0, 5.0, NaN",
            "5.0, -1.0, NaN",
            "0.0, 5.0, NaN",
            "5.0, 0.0, NaN"
            })
    void should_return_nan_if_c1_or_c2_are_negative_or_0(double c1, double c2, double hypotenuse_expected) {
        //Act
        double result = Exercicios_3_6.exercicio_3_6(c1, c2);
        //Assert
        assertEquals(hypotenuse_expected, result);
    }

    @Test
    public void mutation_test_coverage() {
        double result = Exercicios_3_6.exercicio_3_6(2, 3);
        double epsilon = 1e-9;  // Margem de erro para a comparação de doubles
        assertEquals(3.6055512754639892931192212674705, result,epsilon);
    }
}