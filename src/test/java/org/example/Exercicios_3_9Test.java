package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicios_3_9Test {

    @Test
    public void test_constructor() {
        new Exercicios_3_9();
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",         // x, resultadoEsperado
            "2, 2",
            "3, 6",
            "4, 24",
            "5, 120"
    })  //arrange
    void should_return_a_valid_int_if_x_is_0_or_greater_than_0(int x, int fatorialEsperado){
        //act
        int result= Exercicios_3_9.exercicio_3_9_while_loop(x);

        //assert
        assertEquals(fatorialEsperado,result);
    }
    @ParameterizedTest
    @CsvSource({
            "-1, 0",         // x, resultadoEsperado
            "-2, 0",
            "-3, 0",
            "-4, 0",
            "-5, 0"
    })  //arrange
    void should_return_a_0_if_x_is_less_than_0(int x, int fatorialEsperado) {
        //act
        int result = Exercicios_3_9.exercicio_3_9_while_loop(x);

        //assert
        assertEquals(fatorialEsperado, result);
    }
    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",         // x, resultadoEsperado
            "2, 2",
            "3, 6",
            "4, 24",
            "5, 120"
    })  //arrange
    void should_return_a_valid_int_if_x_is_0_or_greater_than_0_2(int x, int fatorialEsperado){
        //act
        int result= Exercicios_3_9.exercicio_3_9_for_loop(x);

        //assert
        assertEquals(fatorialEsperado,result);
    }
}