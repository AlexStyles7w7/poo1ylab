// Calcula e imprime la medida segun se pida en pulgadas o centimetros, usando una funcion.

import java.util.Scanner;

public class _p77_MedidasLongitud {
    public static float PulgadaCentimetro(float p) {
        float r;
        r = (float) (p *2.54);
        return r;
    }

    public static float PieMetro(float m) {
        float r;
        r = (float) ( m * 3.281);
        return r;
    }

    public static void main(String[] args) {
        int op;
        float pul,pie,res;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("[1] Pulgadas a Centimetros\n[2] Pies a Metros\nElige:"); op = obj.nextInt();

        switch(op) {
            case 1:
                System.out.print("Convertir Pulgadas a centimetros\nDame la medida(Pulgadas): "); pul = obj.nextFloat();
                res = PulgadaCentimetro(pul);
                System.out.printf("%.2f Pulgadas equivale a %.2f Centimetros.",pul,res);
                break;
            case 2:
                System.out.print("Convertir Pies a Metros\nDame la medida(Pies): "); pie = obj.nextFloat();
                res = PieMetro(pie);
                System.out.printf("%.2f pies equivalen a %.2f metros.",pie,res);
                break;
            default: System.out.println("\nOpcion invalida..."); break;
        }
    
    }
    
}
