// Calcular la temperatura convertida de grados centígrados a grados farenheit de un rango de valores introducidos por el usuario.

import java.util.Scanner;

public class _p50_ConversionTemperaturas {
    public static void main(String[] args) {
        int celcius1, celcius2;
        float fah;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Imprime las conversiones de grados celsius a fahrenheit en un rango dado por el usuario\n");

            System.out.print("Ingrese la temperatura inicial en celsius: "); celcius1 = obj.nextInt();
            System.out.print("Ingrese la temperatura final en celsius: "); celcius2 = obj.nextInt();

            System.out.println("--------------------");
            System.out.println("Celsius   Fahrenheit");
            System.out.println("--------------------");
            while (celcius1 <= celcius2) {
                fah = (float) celcius1 * 9/5 + 32;
                System.out.printf("%d  \t  %.2f \n",celcius1, fah);
                celcius1 ++;
            }
            System.out.print("--------------------");

            do {
                System.out.printf("\nDeseas continuar? (S/N) > "); resp = Character.toUpperCase((obj.next().charAt(0)));
            } while (!(resp == 'S' || resp == 'N'));

        } while (resp != 'N');
        obj.close();
    }
}