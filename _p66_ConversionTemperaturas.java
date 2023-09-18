// Conversion de temperaturas usando funciones.

import java.util.Scanner;

public class _p66_ConversionTemperaturas {

    public static float Farenheit(float t) {
        float r;
        r = (t * 9/5 ) + 32;
        return r;
    }

    public static float Celcius(float t) {
        float r;
        r = ( t -32 ) * 5/9;
        return r;
    }

    public static void main(String[] args) {
        int op;
        float temp=0, res=0;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("[1] Farenheit\n[2] Celcius\nElige:"); op = obj.nextInt();

        switch(op) {
            case 1:
                System.out.print("Convertir a Farenheit\nDame la temperatura: "); temp = obj.nextFloat();
                res = Farenheit(temp);
                System.out.printf("La temperatura %.2f en grados Celcius equivale a %.2f grados Farenheit.",temp,res);
                break;
            case 2:
                System.out.print("Convertir a Celcius\nDame la temperatura: "); temp = obj.nextFloat();
                res = Celcius(temp);
                System.out.printf("La temperatura %.2f en grados Farenheit equivale a %.2f grados Celcius.",temp,res);
                break;
            default: System.out.println("\nOpcion invalida..."); break;
        }
    }
}