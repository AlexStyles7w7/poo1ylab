<<<<<<< HEAD
// Calcular el area de un triangulo

import java.util.Scanner;

public class _p03_AreaTriangulo {
    public static void main(String[] args) {
        int base, altura;
        double area;
        Scanner obj = new Scanner(System.in);

        System.out.print("Dame la base: ");
        base = obj.nextInt();
        System.out.print("Dame la altura: ");
        altura = obj.nextInt();

        area = base * altura / 2;

        System.out.println( String.format("El triangulo de base %d y altura %d tiene un area de %.2f",base, altura,area));
    }
}
=======
// Calcular el area de un triangulo

import java.util.Scanner;

public class _p03_AreaTriangulo {
    public static void main(String[] args) {
        int base, altura;
        double area;
        Scanner obj = new Scanner(System.in);

        System.out.print("Dame la base: ");
        base = obj.nextInt();
        System.out.print("Dame la altura: ");
        altura = obj.nextInt();

        area = base * altura / 2;

        System.out.println( String.format("El triangulo de base %d y altura %d tiene un area de %.2f",base, altura,area));
    }
}
>>>>>>> 89a9dccabc8d93930c92cb391395cb18f12a25ad
