//Imprimir la secuencia de términos armónicos el número de renglones

import java.util.Scanner;

public class _p64_SumaTerminos2 {
    public static void main(String[] args) {
        int i,n,termino,suma;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("¿Cuántos términos? ");n = obj.nextInt();
        System.out.print("Salida: ");

        suma = 0;
        termino = 0;
        for (i = 1; i <= n; i++) {
            termino = termino * 10 + 1;
            suma += termino;
            System.out.print(termino);
            if (i < n) {
                System.out.print("+");
            }
        }

        System.out.println();
        System.out.print(String.format("Suma: %d", suma));
        obj.close();
    }
}