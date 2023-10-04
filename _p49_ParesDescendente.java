// Imprimir los números pares desde 100 hasta n.
import java.util.Scanner;

public class _p49_ParesDescendente {
    public static void main(String[] args) {
        int num, cuenta, cuenta_2, suma;
        float promedio;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Muestra los números impares de manera descendente desde 100 hasta el número que el usuario elija\n");

            System.out.print("Hasta dónde? > "); num = obj.nextInt();
            cuenta = 100;
            cuenta_2 = 0;
            suma = 0;
            while (cuenta >= num) {
                System.out.printf("%d ", cuenta);
                suma += cuenta;
                cuenta -= 2;
                cuenta_2 ++;
            }
            promedio = (float) suma / cuenta_2;
            System.out.printf("\nLa suma     : %d", suma);
            System.out.printf("\nEl promedio : %.2f", promedio);

            do {
                System.out.printf("\nDeseas continuar? (S/N) > "); resp = Character.toUpperCase((obj.next().charAt(0)));
            } while (!(resp == 'S' || resp == 'N'));
        } while (resp != 'N');
        obj.close();
    }
}