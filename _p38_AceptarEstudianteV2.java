// Dado el nombre del estudiante, sexo (h/m), su edad y tres calificaciones, decidir si el estudiante es aceptado.

import java.util.Scanner;

public class _p38_AceptarEstudianteV2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        String nombre;
        int edad,sexo;
        float c1,c2,c3;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nLa Universidad Kitty Kat SA es solo para mujeres mayores de 21 años con un promedio de entre 8 y 9.5.");
// El proceso de clasificacion de estudiantes aptos comienza desde aqui.
        System.out.println("Acepta a un estudiante en base a su edad, sexo y sus calificaciones.\n");
        System.out.print("Dame tu nombre: ");
        nombre = obj.nextLine();
        System.out.println("Este proceso solo admite 2 generos: ");
        System.out.println("[1] Masculino");
        System.out.println("[2] Femenino");
        System.out.println("Dime tu genero:");
        sexo = obj.nextInt();
        System.out.print("Dame la edad ? ");
        edad = obj.nextInt();

        if (edad >= 21 && sexo==2) {
            System.out.println("Eres mayor de edad y eres mujer, continuamos ");
            System.out.println("Dame tres calificaciones:");
            c1 = obj.nextFloat();
            c2 = obj.nextFloat();
            c3 = obj.nextFloat();
            if (c1 >= 8 && c1 <=9.5 && c2 >= 8 && c1 <=9.5 && c3 >=8 && c3 <=9.5)
                System.out.printf("\nBIENVENIDA %s, tienes %d y calificaciones %.2f,%.2f,%.2f ... ACEPTADA\n", nombre, edad,
                        c1, c2,c3);
            else
                System.out.println("\nSolo aceptamos estudiantes con calificaciones de entre 8 y 9.5");

        } else if (sexo==1) {

            System.out.println("Solo aceptamos estudiantes mujeres");

        } else if (edad < 21 && sexo==2) {

            System.out.println("Solo aceptamos estudiantes mayores de edad");

        }   

        System.out.println("\nProceso terminado.");
    }
    
}
