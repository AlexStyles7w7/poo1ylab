
// Procesa n calificaciones, calcula la suma y el promedio

import java.util.Scanner;

public class _p41_ProcesaCalificaciones {
    public static void main(String[] args) {
        int n, c;
        float calif, suma, prom;
        Scanner obj = new Scanner(System.in);
        calif = suma = prom = 0;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Procesa n calificaciones, calcula la suma y el promedio");
        System.out.print("Cuantas calificaciones ? ");
        n = obj.nextInt();
        c = 1;
        while (c <= n) {
            System.out.printf("Calificacion %d? ", c++);
            calif = obj.nextFloat();
            suma = suma + calif;
        }
        prom = suma / n;
        System.out.printf("La suma es : %.2f\n", suma);
        System.out.printf("El promedio es : %.2f\n", prom);
    }
}