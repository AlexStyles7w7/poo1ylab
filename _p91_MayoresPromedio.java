// Elaborar un programa que permita calcular calificaciones y solo muestre las mayores al promedio.

import java.util.Scanner;

public class _p91_MayoresPromedio {

    public static void main(String[] args) {
        int n = 0;
        float suma=0,promedio=0;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("\n¿Cuantas calificaciones quieres procesar? "); n = obj.nextInt();

        float[] califs = new float[n];

        System.out.printf("Introduce las %d calificaciones: \n",n);
        for(int i=0; i<califs.length; i++) {
            System.out.printf("Calicifacion %d: ", i+1);
            califs[i] = obj.nextFloat();
        }

        System.out.println("\nLas calificaciones capturadas son: ");
        for(float cal : califs) {
            System.out.printf("%.2f ",cal);
            suma = suma + cal;
        }

        promedio = suma/califs.length;
        System.out.printf("\nLa suma es %.2f", suma);
        System.out.printf("\nEl promedio es %.2f", promedio);

        suma = 0;
        for( float f : califs ){
            if( f > promedio )
                System.out.print(f + " ");
                suma ++;
        }

        System.out.printf("\nTotal de califiaciones mayores al promedio: %.0f\n",suma);
    }
    
}
