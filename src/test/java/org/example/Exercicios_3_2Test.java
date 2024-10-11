package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicios_3_2Test {

    @Test
    void should_return_PI_for_r_equal_1_and_h_equal_1() {
        double r;
        r=Exercicios_3_2.exercicio_3_2(1,1);
        assertEquals(Math.PI, r);
    }
    @Test
    void should_return_4PI_for_r_equal_2_and_h_equal_2() {
        double r;
        r=Exercicios_3_2.exercicio_3_2(2,2);
        assertEquals(4*Math.PI, r);
    }
    @Test
    void should_return_nan_for_r_equal_minus_1_and_h_equal_1(){
        double r;
        r=Exercicios_3_2.exercicio_3_2(-1,1);
        assertEquals(Double.NaN, r);
    }
    @Test
    void should_return_nan_for_r_equal_1_and_h_minus_equal_1(){
        double r;
        r=Exercicios_3_2.exercicio_3_2(1,-1);
        assertEquals(Double.NaN, r);
    }
    //@Test
    //void should_return_nan_for_r_equal_letter_and_h_equal_1(){
        //double r;
        //r=Exercicios_3_2.exercicio_3_2('a',1);
        //assertEquals(Double.NaN, r);
    //}
}