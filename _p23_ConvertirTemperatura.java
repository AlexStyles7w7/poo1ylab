// Dada una temperatura, convertirla en grados Farenheit o grados centigrados segun lo que elija el usuario.

import java.util.Scanner;

public class _p23_ConvertirTemperatura {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        char op;
        float temp, res;
        Scanner obj = new Scanner(System.in);

        System.out.println("Convierte de Centigrados a Farenheit o viceversa.\n");
        System.out.println("[F] Farenheit a Centigrados ");
        System.out.println("[C] Centigrados a Farenheit ");
        System.out.print("Elige una opción: ");
        op = Character.toUpperCase(obj.next().charAt(0));

        if (op == 'F') {
            System.out.println("Dame la temperatura en Farenheit:");
            temp = obj.nextFloat();
            res = (temp - 32) * (5 / 9);
            System.out.printf("\nLa temperatura en grados %f Farenheit equivale a %f grados Centigrados", temp, res);
        } else if (op == 'C') {
            System.out.println("Dame la temperatura en centigrados: ");
            temp = obj.nextFloat();
            res = (temp * 9 / 5) + 32;
            System.out.printf("\nLa temperatura en grados %f Farenheit equivale a %f grados Centigrados", temp, res);
        } else
            System.out.println("Opción invalida.");

        System.out.println("Gracias por utilizar este programa.");

    }

}
