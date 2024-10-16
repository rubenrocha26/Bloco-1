package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
class Exercicios_2Test {

    @Test
    public void test_constructor() {
        new Exercicios_2();
    }

    @org.junit.jupiter.api.Test
    void percentRapazes_A() {
        double r;
        r= Exercicios_2.exercicio2(0,1);
        assertEquals(0,r);
    }
    @Test
    void percentRapazes_B() {
        double r;
        r= Exercicios_2.exercicio2(1,1);
        assertEquals(1,r);
    }
    @Test
    void percentRapazes_C() {
        double r;
        r= Exercicios_2.exercicio2(1,2);
        assertEquals(0.5,r);
    }
    @Test
    void percentRapazes_D() {
        double r;
        r= Exercicios_2.exercicio2(1,3);
        assertEquals(0.3333333333333333,r);
    }
    @Test
    void percentRapazes_E() {
        double r;
        r= Exercicios_2.exercicio2(-1,1);
        assertEquals(Double.NaN,r);
    }
    @Test
    void percentRapazes_F() {
        double r;
        r= Exercicios_2.exercicio2(1,-1);
        assertEquals(Double.NaN,r);
    }
    @Test
    void percentRapazes_G() {
        double r;
        r= Exercicios_2.exercicio2(-1,-1);
        assertEquals(Double.NaN,r);
    }
    @Test
    void percentRapazes_H() {
        double r;
        r= Exercicios_2.exercicio2(0,0);
        assertEquals(Double.NaN,r);
    }
    @Test
    void percentRapazes_I() {
        double r;
        r= Exercicios_2.exercicio2(1,0);
        assertEquals(Double.NaN,r);
    }
    @Test
    void percentRapazes_J() {
        double r;
        r= Exercicios_2.exercicio2(-1,0);
        assertEquals(Double.NaN,r);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1, 0",       // qtdRapazes: 0, qtdTotal: 1, percentagemRapazesEsperada: 0
            "1, 1, 1",
            "1, 2, 0.5",
            "1, 3, 0.3333333333333333"
    })      //arrange
    void should_return_a_valid_double_if_qtdRapazes_is_positive_and_less_or_equal_than_qtdTotal_and_qtdTotal_greater_than_zero(int qtdRapazes, int qtdTotal, double percentagemRapazesEsperada) {
        //act SUT
        double percentagemRapazes = (double) qtdRapazes / qtdTotal;
        //assert
        assertEquals(percentagemRapazesEsperada, percentagemRapazes);
    }
}
