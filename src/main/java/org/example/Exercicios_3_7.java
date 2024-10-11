package org.example;

public class Exercicios_3_7 {
    public static int exercicio_3_7 (int H, int M){
        int hoursToMinutes = H*60;
        int minutesConverter = hoursToMinutes + M;
        if (H<0 || M<0) {
            return 0;
        }
        return minutesConverter;
    }
}
