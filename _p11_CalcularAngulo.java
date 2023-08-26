//Se desea calcular un tercer angulo una vez dados los primeros 2.

import java.util.Scanner;

public class _p11_CalcularAngulo {
    public static void main(String[] args) {
// Aqui es donde se piden los datos principales.
        System.out.print("Dame el primer angulo: ");
        double angulo1=new Scanner(System.in).nextDouble();
        System.out.print("Dame el segundo angulo: ");
        double angulo2=new Scanner(System.in).nextDouble();
// La formula principal dada por el profesor.
        double angulo3 = 180 - (angulo1 + angulo2);

        System.out.println(String.format("\nEl tercer angulo resultante del angulo %.2f y el angulo %.2f es: %.2f.",angulo1,angulo2,angulo3));

    }
    
}
