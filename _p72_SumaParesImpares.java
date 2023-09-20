// Suma pares o impares en un rango de valores, usando una funcion.

import java.util.Scanner;

public class _p72_SumaParesImpares {
    public static int SumaParesImpares(int ini, int fin,char pi) {
        int suma=0;
         for(int i=ini; i<=fin; i++) {
            if( i % 2 == 0 && pi == 'P' ) {
                System.out.printf("%d ",i);
                suma += i;
            }
            else if( i%2!=0 && pi == 'I' ) {
                System.out.printf("%d ",i);
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int ini,fin, suma=0;
        char pi;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();

        do {
            System.out.print("Dame inicio: "); ini = obj.nextInt();
            System.out.print("Dame fin   : "); fin = obj.nextInt();
        }while(ini>fin);

        do {
        System.out.print("[P]ares o [I]mpares: "); pi = Character.toUpperCase(obj.next().charAt(0));
        }while(pi!='P' && pi!='I');

        suma = SumaParesImpares(ini,fin,pi);
        System.out.printf("\nLa suma es %d", suma);
    }
    
}
