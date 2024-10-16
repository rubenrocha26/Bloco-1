package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicios_3_1Test {

    @Test
    public void test_constructor() {
        new Exercicios_3_1();
    }

    @Test
    void should_return_4_for_L_equal_1_and_C_equal_2() {
        double r;
        r =Exercicios_3_1.exercicio_3_1(1,1);
        assertEquals(4,r);
    }
    @Test
    void should_return_8_for_L_equal_2_and_C_equal_2(){
        double r;
        r =Exercicios_3_1.exercicio_3_1(2,2);
        assertEquals(8,r);
    }
    @Test
    void should_return_nan_for_L_equal_0_and_C_equal_2(){
        double r;
        r =Exercicios_3_1.exercicio_3_1(0,2);
        assertEquals(Double.NaN,r);
    }
    @Test
    void should_return_nan_for_L_equal_2_and_C_equal_0(){
        double r;
        r =Exercicios_3_1.exercicio_3_1(2,0);
        assertEquals(Double.NaN,r);
    }
    @Test
    void should_return_nan_for_L_equal_minus_1_and_C_equal_0(){
        double r;
        r =Exercicios_3_1.exercicio_3_1(-1,0);
        assertEquals(Double.NaN,r);
    }
    @Test
    void should_return_nan_for_L_equal_0_and_C_equal_minus_1(){
        double r;
        r =Exercicios_3_1.exercicio_3_1(0,-1);
        assertEquals(Double.NaN,r);
    }
    //Para números decimais
    @ParameterizedTest
    @CsvSource({
            "1.0, 1.0, 4.0",
            "3.5, 2.5, 12",
            "0, 5, NaN ",
            "5, 0, NaN",
    })
    void mutation_test_coverage (double L, double C, double resultado_esperado){
        double result= Exercicios_3_1.exercicio_3_1(L,C);
        assertEquals(resultado_esperado,result);
    }
}