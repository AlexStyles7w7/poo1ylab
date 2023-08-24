//Dada una cantidad en pesos y la cotización del dólar, se desea obtener el equivalente en dólares.

import java.util.Scanner;

public class _p15_ConvertirADolares {
    public static void main(String[] args) {
        double dolar;
//obtencion de la cantidad de pesos a convertir
        System.out.print("Dame la cantidad de Pesos Mexicanos (MXN) a convertir: ");
        double peso=new Scanner(System.in).nextDouble();
//formula principal
        dolar = peso/17;

        System.out.println(String.format("\nLa cantidad de %.2f Pesos Mexicanos es de: %.2f Dolares aproximadamente.",peso,dolar));
    }
    
}
