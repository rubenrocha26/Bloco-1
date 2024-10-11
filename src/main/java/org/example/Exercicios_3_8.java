package org.example;

public class Exercicios_3_8 {
    public static double exercicio_3_8 ( double intervaloTempoSegundos){
        if (intervaloTempoSegundos <0){
            return Double.NaN;}
        else
        {
        double velSomKmHora = 1224;
        double velSomMetroSegungo =(velSomKmHora *1000) / 3600;
        double disTrovoadaMetros = intervaloTempoSegundos * velSomMetroSegungo;
        return disTrovoadaMetros;
        }
    }
}
