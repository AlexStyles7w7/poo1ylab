// Calcular el area de un Circulo

import java.util.Scanner;

public class _p02_AreaCalculo {
    public static void main(String[] args) {
        double radio, area;
        Scanner lradio = new Scanner(System.in);

        System.out.println("\nCalculando el area de un circulo\n");
        System.out.println("Dame el radio: ");
        radio = lradio.nextFloat();

        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El circulo de radio " + radio + " tiene un area de " + area);
        
    }
    
}
