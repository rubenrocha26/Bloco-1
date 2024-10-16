package org.example;

public class Exercicios_3_2 {
    public static double exercicio_3_2(double r, double h) {
    if (r<=0 || h<=0) {
        return Double.NaN;
    }
        double volume= Math.PI * r*r * h;
        return volume;
    }
}
