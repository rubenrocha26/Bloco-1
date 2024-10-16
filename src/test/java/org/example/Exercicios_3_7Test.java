package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicios_3_7Test {

    @Test
    public void test_constructor() {
        new Exercicios_3_7();
    }

    @ParameterizedTest
    @CsvSource({
            "10, 10, 610",         // H, M, minutesConverterExpected
            "20, 2, 1202",
            "20, 20,1220",
            "1, 1, 61",
            "0, 1, 1",
            "1, 0, 60"
    })   //arrange
    void should_return_a_valid_int_if_H_and_M_are_equal_or_greater_than_0 (int H, int M, int minutesConverterExpected){
        //act
        int result = Exercicios_3_7.exercicio_3_7(H, M);
        //assert
        assertEquals (minutesConverterExpected,result);
    }
    @ParameterizedTest
    @CsvSource({
            "-2, -2, 0",         // H, M, minutesConverterExpected
            "0, 0, 0",
            "-20, 20, 0",
            "20, -20, 0"
    })   //arrange
    void should_return_0_if_H_or_M_are_less_than_0 (int H, int M, int minutesConverterExpected) {
        //Act
        int result = Exercicios_3_7.exercicio_3_7(H, M);
        //Assert
        assertEquals(minutesConverterExpected, result);
    }
}