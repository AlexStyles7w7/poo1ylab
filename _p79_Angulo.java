// Imprimir un angulo valido entre 0 y 360 grados e indicar que tipo de angulo es, usando funciones.

import java.util.Scanner;

public class _p79_Angulo {
    public static int Angulo(int ang) {
        if (ang<90) {System.out.print("Angulo agudo");}
        else if (ang==90) {System.out.print("Angulo recto");}
        else if (ang>90 && ang<180) {System.out.print("Angulo obtuso");}
        else if (ang==180) {System.out.print("Angulo llano");}
        else if (ang>180 && ang<360) {System.out.print("Angulo concavo");}
        return ang;

    }
    public static void main(String[] args) {
        int ang;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        do{
        System.out.print("Dame un angulo entre 0 y 360 grados (en caso de colocar uno mayor, se volvera a llamar) "); ang = obj.nextInt();
        }while(ang>=360);

        Angulo(ang);
        
    }
    
}
