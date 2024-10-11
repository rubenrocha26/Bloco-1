package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicios_3_4Test {

    @Test
    void should_return_2_for_x_equal_1() {
        double r;
        r= Exercicios_3_4.exercicio_3_4(1);
        assertEquals(2, r);
    }
    @Test
    void should_return_5_for_x_equal_2() {
        double r;
        r= Exercicios_3_4.exercicio_3_4(2);
        assertEquals(5, r);
    }
    @Test
    void should_return_2_for_x_equal_minus_1(){
        double r;
        r= Exercicios_3_4.exercicio_3_4(-1);
        assertEquals(2, r);
    }
    @Test
    void should_return_5_for_x_equal_minus_2(){
        double r;
        r= Exercicios_3_4.exercicio_3_4(-2);
        assertEquals(5, r);
    }
    @Test
    void should_return_1_for_x_equal_0(){
        double r;
        r= Exercicios_3_4.exercicio_3_4(0);
        assertEquals(1, r);
    }
}