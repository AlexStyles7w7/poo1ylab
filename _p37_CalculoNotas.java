// Se desea calcular el promedio de 5 calificaciones introducidas por el usuario, luego evaluar el resultado e imprimir
// un mensaje de acuerdo con el promedio obtenido.

import java.util.Scanner;

public class _p37_CalculoNotas {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner obj = new Scanner(System.in);
        int cal1,cal2,cal3,cal4,cal5,calprom,calfinal;

        System.out.println("\nCalculadora de promedio. ");
        System.out.println("Dame la calificación 1: ");
        cal1 = obj.nextInt();
        System.out.println("Dame la calificación 2: ");
        cal2 = obj.nextInt();
        System.out.println("Dame la calificación 3: ");
        cal3 = obj.nextInt();
        System.out.println("Dame la calificación 4: ");
        cal4 = obj.nextInt();
        System.out.println("Dame la calificación 5: ");
        cal5 = obj.nextInt();
// calprom y calfinal guardaran los datos para trabajar con los if.
        calprom = cal1+cal2+cal3+cal4+cal5;
        calfinal = calprom/5;

        if (calfinal>0 && calfinal<= 6) {
            System.out.println("Quedas reprobado. ");
        } else if (calfinal>6 && calfinal<= 7) {
            System.out.println("Pasaste de panzazo. ");
        } else if (calfinal>7 && calfinal<= 8) {
            System.out.println("Muy bien, puedes mejorar.");
        } else if (calfinal>8 && calfinal<= 9) {
            System.out.println("Excelente, sigue así.");
        } else if (calfinal>9 && calfinal<= 10) {
            System.out.println("¡Perfecto!, tu esfuerzo valió la pena.");
        }

    }
    
}
