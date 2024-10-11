package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicios_3_5Test {

    @Test
    void should_return_minus_1_for_x_equal_1() {
        double r;
        r = Exercicios_3_5.exercicio_3_5(1);
        assertEquals(-1, r);
    }
}