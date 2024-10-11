package org.example;

public class Exercicios_3_9 {
    public static int exercicio_3_9(int x) {
        if (x >=0 ) {
            int fatorial = 1;
            int n = 1;
            while (n <= x) {
                fatorial = fatorial * n;
                n = n + 1;
            }
            return fatorial;
        }
        return 0;
    }
}
