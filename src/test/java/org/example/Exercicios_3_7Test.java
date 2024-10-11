package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicios_3_7Test {

    @ParameterizedTest
    @CsvSource({
            "10, 10",         // H e M
            "20, 2",
            "20, 20"
    })
    void should_return_a_valid_int_if_H_and_M_are_positive (int H, int M){
        //Arrange
        int expected_value = H*60 + M;
        //Act
        int result = Exercicios_3_7.exercicio_3_7(H, M);
        //Assert
        assertEquals (expected_value,result);
    }
    @ParameterizedTest
    @CsvSource({
            "-2, -2",         // H e M
            "0, 0",
            "-20, 20",
            "20, -20"
    })
    void should_return_0_if_H_or_M_are_negative_or_0 (int H, int M) {
        //Arrange
        int expectedValue =0;
        //Act
        int result = Exercicios_3_7.exercicio_3_7(H, M);
        //Assert
        assertEquals(expectedValue, result);
    }
}