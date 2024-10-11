package org.example;

public class Exercicios_2 {
    public static double exercicio2(int qtdRapazes, int qtdTotal){
        double percentRapazes;

        if(qtdRapazes < 0 || qtdTotal <= 0) {
            percentRapazes = Double.NaN; // Should only have 1 return
        }else {
            percentRapazes = (double) qtdRapazes / qtdTotal;
        }
        return percentRapazes;
    }
}
