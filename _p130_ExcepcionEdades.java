import java.util.InputMismatchException;
import java.util.Scanner;

public class _p130_ExcepcionEdades {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner obj = new Scanner(System.in);
        int[] edades = new int[5];

        System.out.println("Captura las edades de 5 personas:");

        for (int i = 0; i < 5; i++) {
            try {
                System.out.print("Edad persona " + (i + 1) + ": ");
                edades[i] = obj.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número entero");
                obj.next(); // Limpia el buffer de entrada
                i--; // Permite volver a capturar la edad
            }
        }

        System.out.println("Captura terminada las edades son: ");
        for (int edad : edades) {
            System.out.print(edad + " ");
        }
        obj.close();
    }
}