// Dado un numero entero entre 1 y 7, imprime el dia de la semana con letra.

import java.util.Scanner;

public class _p30_DiaSemana {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("\nDado un numero entero entre 1 y 7, imprime el dia de la semana con letra.");
        System.out.print("Dame el número del día: ");
        int dia = new Scanner(System.in).nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día invalido, en que dia vives!");
                break;
        }
        System.out.println("\nProceso terminado.");
    }

}
