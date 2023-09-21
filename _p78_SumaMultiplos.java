// Suma de multiplos de 3 o multiplos de 4 en un rango, con funcion.

import java.util.Scanner;

public class _p78_SumaMultiplos {
     public static int SumaMultiplos(int ini, int fin,int op) {
        int suma=0;
         for(int i=ini; i<=fin; i++) {
            if( i % 3 == 0 && op == 1 ) {
                System.out.printf("%d ",i);
                suma += i;
            }
            else if( i%4==0 && op == 2 ) {
                System.out.printf("%d ",i);
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int ini,fin, suma=0, op;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();

        do {
            System.out.print("Dame inicio: "); ini = obj.nextInt();
            System.out.print("Dame fin   : "); fin = obj.nextInt();
        }while(ini>fin);

        do {
        System.out.print("[1]multiplos de 3 o [2]Multiplos de 4: "); op = obj.nextInt();
        }while(op!=1 && op!=2);

        suma = SumaMultiplos(ini, fin, op);
        System.out.printf("\nLa suma es %d", suma);

        
    }
}
