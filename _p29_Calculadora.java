// Eligiendo dos numeros y un operador matematico, efectuar operación y mostrar resultados.

import java.util.Scanner;

public class _p29_Calculadora {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        double n1, n2;
        char op;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nEfectua la operación matemática elegida entre dos números ");
        System.out.print("Dame el número 1: ");
        n1 = obj.nextDouble();
        System.out.print("Dame el número 2: ");
        n2 = obj.nextDouble();
        System.out.print("Operación: + - * / ^ ?");

        op = obj.next().charAt(0);

        switch (op) {
            case '+':
                System.out.printf("n1 + n2 = %.2f", n1 + n2);
                break;
            case '-':
                System.out.printf("n1 - n2 = %.2f", n1 - n2);
                break;
            case '*':
                System.out.printf("n1 * n2 = %.2f", n1 * n2);
                break;
            case '/':
                System.out.printf("n1 / n2 = %.2f", n1 / n2);
                break;
            case '^':
                System.out.printf("n1 / n2 = %.2f", Math.pow(n1, n2));
                break;
            default:
                System.out.println("Operación Invalida");
                break;
        }
        System.out.println("\nProceso Terminado.");

    }

}
