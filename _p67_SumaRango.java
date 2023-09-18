// Suma de un rango de numeros con funcion.

import java.util.Scanner;

public class _p67_SumaRango {

    public static int SumaRango(int ini, int fin) {
        int sum=0;
        for (int i=ini; i<=fin; i++)
            sum += i ;
        return sum;
    }
    public static void main(String[] args) {
        int ini, fin;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        do {
            System.out.print("Dame el inicio: "); ini = obj.nextInt();
            System.out.print("Dame el final: "); fin = obj.nextInt();
        } while( ini>fin );

        System.out.printf("La suma de %d a %d es %d",ini,fin, SumaRango(ini,fin) );
        
    }
    
}
