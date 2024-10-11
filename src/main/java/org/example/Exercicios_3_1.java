package org.example;

public class Exercicios_3_1 {
    public static double exercicio_3_1( double L, double C){
        if (L<=0||C<=0){
            return Double.NaN;
        }
        double perimetro = (double) 2*L + 2*C;
        return perimetro;
    }
}
