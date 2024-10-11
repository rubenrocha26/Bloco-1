package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicios_3_8Test {

    @ParameterizedTest
    @CsvSource({
            "10, 3400",  //intervaloTempoSegundos  / distanciaTrovoadaMetrosEsperada
            "14.7, 4998",
            "0, 0"
    })
    void should_return_a_valid_double_if_intervaloTempoSegundos_is_greater_than_0(double intervaloTempoSegundos, double distanciaTrovoadaMetrosEsperada) {
        //act
        double result= Exercicios_3_8.exercicio_3_8(intervaloTempoSegundos);
        //assert
        assertEquals(distanciaTrovoadaMetrosEsperada, result);
    }

    @ParameterizedTest
    @CsvSource({
            "-1",  //intervaloTempoSegundos
            "-2 "
    })
    void should_return_nan_if_intervaloTempoSegundos_is_less_than_0(double intervaloTempoSegundos) {
        //act
        double result= Exercicios_3_8.exercicio_3_8(intervaloTempoSegundos);
        //assert
        assertEquals (Double.NaN, result);
    }


}