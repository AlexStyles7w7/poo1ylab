//Imprimir la secuencia de números mostrados el número de renglones

import java.util.Scanner;

public class _p61_SecuenciaNumeros1 {
    public static void main(String[] args) {
        int i,n,j;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("¿Cuántos renglones? ");n = obj.nextInt();
        System.out.print("Salida: ");

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        obj.close();
    }
}