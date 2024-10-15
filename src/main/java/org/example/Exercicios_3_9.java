package org.example;

public class Exercicios_3_9 {
    public static int exercicio_3_9_while_loop(int x) {
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
    public static int exercicio_3_9_for_loop(int x) {
        if (x == 0) {
            return 1;  // O fatorial de 0 é 1.
        }
        int fatorial = 1;
        for (int n=1; n<=x; n++){  // O loop começa com n=1 e continua até n ser igual a x.
            fatorial *= n;  // Em cada iteração, multiplica o valor atual de fatorial por n.
        }
        return fatorial;
    }
}
