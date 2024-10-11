package org.example;

public class Exercicios_3_6 {
    public static double exercicio_3_6 ( double c1, double c2){
        double hipotenusa;
        if (c1<=0||c2<=0){
            return Double.NaN;
        }
        hipotenusa = Math.sqrt(c1*c1 + c2*c2);
        return hipotenusa;
    }
}
