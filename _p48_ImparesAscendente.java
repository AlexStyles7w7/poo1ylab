// Imprimir los números impares de forma ascendente desde 1 hasta n con suma y promedio.

import java.util.Scanner;

public class _p48_ImparesAscendente {
    public static void main(String[] args) {
        int n, c, s, i, prom;
        char resp;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        do {
            System.out.println("Imprime números impares ascendentes\n");
            System.out.print("Hasta el número: ");
            n = obj.nextInt();
            s = 0;
            c = 1;
            while (c <= n) {
                System.out.printf("%d ", c);
                s = s + c;
                c = c + 2;
            }
            i = n/2;
            prom = s/i;

            System.out.printf("\nLa suma es %d y el promedio es %d", s,prom);
            System.out.print("\nDeseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    
        
    }
    
}
