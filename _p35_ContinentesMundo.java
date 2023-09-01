// Dado un número entero entre 1 y 6 que corresponde a un continente del mundo, escribir su nombre: 1 Asia, 2 África,
// 3 América del Norte, 4 América del Sur, 5 Antártida, 6 Europa.

import java.util.Scanner;

public class _p35_ContinentesMundo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("\nDado un numero entero entre 1 y 6, imprime el continente pedido.");
        System.out.println("1 - Asia");
        System.out.println("2 - África");
        System.out.println("3 - América del norte");
        System.out.println("4 - América del sur");
        System.out.println("5 - Antártida");
        System.out.println("6 - Europa");
        System.out.print("Dame el número del continente: ");
        int continente = new Scanner(System.in).nextInt();
        // La mejor manera de aplicar este codigo es con el switch.
        switch (continente) {
            case 1:
                System.out.println("Asia");
                break;
            case 2:
                System.out.println("África");
                break;
            case 3:
                System.out.println("América del norte");
                break;
            case 4:
                System.out.println("América del sur");
                break;
            case 5:
                System.out.println("Antártida");
                break;
            case 6:
                System.out.println("Europa");
                break;
            default:
                System.out.println("Número invalido, no existe ningun continente con este número.");
                break;
        }
        System.out.println("\nProceso terminado.");
    }

}
