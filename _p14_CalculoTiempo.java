//Dada una cantidad en horas, calcular su equivalente en días, minutos y segundos.

import java.util.Scanner;

public class _p14_CalculoTiempo {
    public static void main(String[] args) {
        double dia,min,seg;
//El registro de las horas a convertir.
        System.out.print("Dame las horas a convertir: ");
        double hora=new Scanner(System.in).nextDouble();
//Formula principal.
        dia = hora/24;
        min = hora*60;
        seg = min*60;

        System.out.println(String.format("\n%.2f horas equivalen a: ",hora));
        System.out.println(dia + " dias.");
        System.out.println(min + " minutos.");
        System.out.println(seg + " segundos.");
    }
    
}
