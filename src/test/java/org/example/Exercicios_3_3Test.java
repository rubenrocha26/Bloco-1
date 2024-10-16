package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicios_3_3Test {

    @Test
    public void test_constructor() {
        new Exercicios_3_3();
    }

    @Test
    void should_return_32_for_c_equal_0() {
        double r;
        r = Exercicios_3_3.exercicio_3_3(1);
        assertEquals(33.8, r);
    }

    @Test
    void should_return_86_for_c_equal_30() {
        double r;
        r = Exercicios_3_3.exercicio_3_3(30);
        assertEquals(86, r);
    }
    @Test
    void should_return_minus_27_4_for_c_equal_minus_33(){
        double r;
        r= Exercicios_3_3.exercicio_3_3(-33);
        assertEquals(-27.4, r);
    }
    @Test
    void should_return_104_for_c_equal_40(){
        double r;
        r= Exercicios_3_3.exercicio_3_3(40);
        assertEquals(104.0, r);
    }
}