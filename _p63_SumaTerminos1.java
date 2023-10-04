//Imprimir la secuencia de términos armónicos el número de renglones.

import java.util.Scanner;

public class _p63_SumaTerminos1 {
    public static void main(String[] args) {
        int i,n;
        double suma;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("¿Cuántos términos? ");n = obj.nextInt();
        System.out.print("Salida: ");
        
        suma = 0.0;
        for (i = 1; i <= n; i++) {
            if (i != 1) {
                System.out.print(" + ");
            }
            System.out.print("1/" + i);
            suma += 1.0 / i; 
        }

        System.out.println();
        System.out.print(String.format("Suma: %d", suma));
        obj.close();
    }
}