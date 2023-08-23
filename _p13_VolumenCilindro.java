//Se desea calcular el volumen de un cilindro dado su radio y altura.

import java.util.Scanner;

public class _p13_VolumenCilindro {
    public static void main(String[] args) {
        double volumen,pi;
//Obtencion de radio y altura
        System.out.print("Dame el radio: ");
        double radio=new Scanner(System.in).nextDouble();
        System.out.print("Dame la altura: ");
        double altura=new Scanner(System.in).nextDouble();
//Radio al cuadrado
        double radioc = radio*radio;
//Formula principal
        pi = Math.PI;
        volumen = pi * radioc * altura;

        System.out.println(String.format("\nDatos de cilindro:"));
        System.out.println(String.format("\nRadio: %.2f",radio));
        System.out.println(String.format("\nAltura: %.2f",altura));
        System.out.println(String.format("\nEl volumen del cilindro es: %.2f",volumen));

    }
    
}
