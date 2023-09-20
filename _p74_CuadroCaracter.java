// Imprime un cuadro de r x c del caracter deseado, usando una funcion.

import java.util.Scanner;

public class _p74_CuadroCaracter {

    public static void Cuadro(int ren, int col, char car) {
        for(int i=1; i<=ren; i++) {
            for(int j=1; j<=col; j++) {
                System.out.printf("%c ",car);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int ren, col;
        char car;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Dame los renglones: "); ren = obj.nextInt();
        System.out.print("Dame las columnas : "); col = obj.nextInt();
        System.out.print("Del caracter      : "); car = obj.next().charAt(0);

        Cuadro(ren,col,car);


    }
    
}
