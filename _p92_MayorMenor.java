// Imprimir una serie de numeros que se guarden en un arreglo y mostrar el mayor y el menor.

import java.util.Scanner;

public class _p92_MayorMenor {

    public static float Mayor(float[] a) {
        float m = a[0];
        for( int i=1; i<a.length; i++ )
            if( a[i]>m ) m = a[i];
        return m;
    }

    public static float Menor(float[] a) {
        float m = a[0];
        for( int i=1; i<a.length; i++ )
            if( a[i]<m ) m = a[i];
        return m;
    }

    public static void main(String[] args) {
        int num = 0;
        float nmuestra = 0;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("\n¿Cuantos numeros quieres procesar? "); num = obj.nextInt();

        float[] numeros = new float[num];

        System.out.printf("Introduce los %d numeros: \n",num);
        for(int i=0; i<numeros.length; i++) {
            System.out.printf("Numero %d: ", i+1);
            numeros[i] = obj.nextFloat();
        }

        System.out.println("\nLos numeros son: ");
        for(float numeromuestra : numeros) {
            System.out.printf("%.2f ",numeromuestra);
            nmuestra = nmuestra + numeromuestra;
        }
        
        System.out.println("\nEl elemento mayor es " + Mayor(numeros));
        System.out.println("\nEl elemento menor es " + Menor(numeros));
    }
    
}
