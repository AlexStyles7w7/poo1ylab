// Dados tres números enteros, verificar cual es el mayor.

import java.util.Scanner;

public class _p34_NumeroMayor {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        // En este apartado se declara el scanner y las variables.
        double num1, num2, num3;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nDados tres números, verificar cual es el mayor. ");
        System.out.print("Dame el número 1: ");
        num1 = obj.nextDouble();
        System.out.print("Dame el número 2: ");
        num2 = obj.nextDouble();
        System.out.print("Dame el número 3: ");
        num3 = obj.nextDouble();
// Basicamente, el if resume el proceso y nos dice el numero mayor.
        if (num1 > num2 && num1 > num3) {
            System.out.printf("El numero mayor es " + num1);
        } else if (num2 < num1 && num2 > num3) {
            System.out.printf("El numero mayor es " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.printf("El numero mayor es " + num3);
        }
    }

}
