// Imprime un numero del 1 al 7 y dependiendo el numero te dara un dia de la semana, todo en funcion.

import java.util.Scanner;

public class _p76_DiaSemana {

    public static int DiaSemana(int dia) {
        if (dia==1) {System.out.print("El dia 1 equivale a Lunes");}
        else if (dia==2) {System.out.print("El dia 2 equivale a Martes");}
        else if (dia==3) {System.out.print("El dia 3 equivale a Miercoles");}
        else if (dia==4) {System.out.print("El dia 4 equivale a Jueves");}
        else if (dia==5) {System.out.print("El dia 5 equivale a Viernes");}
        else if (dia==6) {System.out.print("El dia 6 equivale a Sabado");}
        else if (dia==7) {System.out.print("El dia 7 equivale a Domingo");}
        return dia;

    }
    public static void main(String[] args) {
        int dia, ds;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        do{
        System.out.print("Dame un numero del 1 al 7 "); dia = obj.nextInt();
        }while(dia>=7);

        DiaSemana(dia);
        
    }
}
