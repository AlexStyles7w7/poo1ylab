// En una serie de 100 numeros aleatorios entre 0 y 20, sumar pares e impares.

import java.util.Random;

public class _p93_ParesImpares {
    public static void main(String[] args) {
        final int MAX = 100;
        int[] a = new int[MAX];
        Random random = new Random();

        for (int i = 0; i < MAX; i++) {
            a[i] = random.nextInt(21);
        }

        System.out.println("Elementos del arreglo 'a':");
        for (int i = 0; i < MAX; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int par = 0;
        System.out.println("Elementos pares del arreglo 'a':");
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                par++;
            }
        }
        System.out.println("\nSuma de pares: " + par);

        int impar = 0;
        System.out.println("Elementos impares del arreglo 'a':");
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
                impar++;
            }
        }
        System.out.println("\nSuma de impares: " + impar);
    }
}
