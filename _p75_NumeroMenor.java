// Calcula e imprime el menor de 4 numeros, usando una funcion.

import java.util.Scanner;

public class _p75_NumeroMenor {
    public static int Menor(int n1, int n2, int n3, int n4) {
        int men=0;
        if( n1<n2 && n1<n3 && n1<n4) men = n1;
        else if ( n2<n1 && n2<n3 && n2<n4) men = n2;
        else if ( n3<n1 && n3<n2 && n3<n4) men = n3;
        else if ( n4<n1 && n4<n2 && n4<n3) men = n4;
        return men;
    }

    public static void main(String[] args) {
        int n1,n2,n3,n4;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Dame cuatro numeros separados por espacio.\n");
        n1 = obj.nextInt(); n2 = obj.nextInt(); n3 = obj.nextInt(); n4 = obj.nextInt();

        System.out.printf("\nEl menor de los 4 es %d",Menor(n1,n2,n3,n4));
        
    }
    
}