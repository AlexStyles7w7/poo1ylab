// Calcula la paga de un trabajador, las horas extra se pagan al doble.

import java.util.Scanner;

public class _p24_PagaTrabajadorv2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int horas, extra=0;
        float paga, total;
        Scanner obj = new Scanner(System.in);

        System.out.println("Calcula la paga de un trabajador, las horas extra pagan al doble\n");
        System.out.println("Horas trabajadas:"); horas = obj.nextInt();
        System.out.println("Paga por hora:"); paga = obj.nextFloat();

        if( horas>40 ) {
            extra = horas - 40;
            total = 40 * paga + ( 2 * paga * extra );
        } 
        else {total = horas * paga;
        } 

        System.out.printf("\nHoras extra: %d.", extra);
        System.out.printf("\nEl pago total es de  %f.", total);
    
    }
    
}