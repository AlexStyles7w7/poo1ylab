// Efectua operaciones sobre un número, usando los operadores de asignación

import java.util.Scanner;

public class _p07_OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.print("Dame un número: ");
        float num=new Scanner(System.in).nextInt();

        System.out.printf("\nEl número es: %.2f\n",num);
        System.out.printf("\nIncrementar: %.2f\n",++num);
        System.out.printf("\nSumar 80: %.2f\n",num+=80);
        System.out.printf("\nRestar 35: %.2f\n",num-=35);
        System.out.printf("\nMultiplicar x 15: %.2f\n",num*=15);
        System.out.printf("\nDividir entre 4: %.2f\n",num/=4);
        System.out.printf("\nDecrementar: %.2f\n",--num);

    }
}
