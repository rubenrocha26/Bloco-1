package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
class Exercicios_1Test {

    @Test
    public void should_return_1_for_x_equal_0 () {
        //arrange

        //act
        int result = Exercicios_1.exercicio_1(0);

        //assert
        assertEquals(1,result);
    }
    @Test
    public void should_return_3_for_x_equal_1 () {
        int result= Exercicios_1.exercicio_1(1);
        assertEquals(3,result);
    }
    @Test
    public void should_return_minus1_for_x_equal_minus1 () {
        int result = Exercicios_1.exercicio_1(-1);
        assertEquals(-1,result);
    }
    @Test
    public void should_return_5_for_x_equal_2 () {
        int result = Exercicios_1.exercicio_1(2);
        assertEquals(5,result);
    }
    @Test
    public void should_return_minus3_for_x_equal_minus2 () {
        int result = Exercicios_1.exercicio_1(-2);
        assertEquals(-3,result);
    }
    @Test
    public void should_return_7_for_x_equal_3 () {
        int result = Exercicios_1.exercicio_1(3);
        assertEquals(7,result);
    }
    @Test
    public void should_return_minus5_for_x_equal_minus3 () {
        int result= Exercicios_1.exercicio_1(-3);
        assertEquals(-5,result);
    }

    @ParameterizedTest
    @CsvSource({
            "0,1",       // x:0, resultadoEsperado:1
            "1,3",       // x:1, resultadoEsperado:3
            "-1,-1",     // x:-1, resultadoEsperado:-1
            "2, 5",
            "-2,-3",
            "3, 7",
            "-3, -5"
    }) //Arrange
    void should_return_a_valid_int (int x, int resultadoEsperado) {

        //Act, System Under Test, função a testar
        int result = Exercicios_1.exercicio_1(x);
        //Assert
        assertEquals(result, resultadoEsperado);
    }
}