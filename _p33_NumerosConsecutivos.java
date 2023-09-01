// Dados tres números enteros, verificar si son consecutivos y mandar mensaje confirmándolo, si no lo son, mandar un mensaje de error.

import java.util.Scanner;

public class _p33_NumerosConsecutivos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        // En este apartado se declara el scanner y las variables.
        int num1, num2, num3, formula1, formula2;
        Scanner obj = new Scanner(System.in);

        System.out.println(
                "\nDados tres numeros enteros, verificar si son consecutivos y mandar mensaje confirmandolo, si no lo son, mandar un mensaje de error. ");
        System.out.print("Dame el número 1: ");
        num1 = obj.nextInt();
        System.out.print("Dame el número 2: ");
        num2 = obj.nextInt();
        System.out.print("Dame el número 3: ");
        num3 = obj.nextInt();
        // Estas formulas son quienes haran funcionar la funcion if de manera sencilla.
        formula1 = num1 + 1;
        formula2 = num2 + 1;

        if (num2 == formula1 || num3 == formula2) {
            System.out.printf("Los numeros %d, %d y %d son consecutivos.", num1, num2, num3);
        } else {
            System.out.printf("ERROR: Estos numeros no son consecutivos.");
        }

    }

}