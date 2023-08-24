// Trabajando con enteros.

public class _p16_TrabajandoEnteros {
    public static void main(String[] args) {
        int num1=150;
        int num2=0x2A;
        int num3=0b00101010;

        byte val1=120, val2=1;
        short horas=24, dias=9099;
        long ganancia=9223372036854733207l;

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("\nUso de String.format para formateo de números enteros:\n");
        System.out.println(String.format("num 1 en base decimal     : %d",num1));
        System.out.println(String.format("num 1 en base octal       : %o",num1));
        System.out.println(String.format("num 1 en base hexadecimal : %x",num1));
        System.out.println(String.format("La ganancia con comas     : %,d",ganancia));

        System.out.println("\nUso de Integer.toString para formateo de números enteros:\n");
        System.out.println(String.format("num 2 en base decimal     : " + Integer.toString(num2)));
        System.out.println(String.format("num 2 en base octal       : " + Integer.toString(num2,8)));
        System.out.println(String.format("num 2 en base hexadecimal : " + Integer.toString(num2,16)));

        System.out.println(String.format("num 3 en base decimal     : " + Integer.toString(num3)));
        System.out.println(String.format("num 3 en base octal       : " + Integer.toString(num3,8)));
        System.out.println(String.format("num 3 en base hexadecimal : " + Integer.toString(num3,16)));

        System.out.println("\nUso del System.out.printf para formateo de números enteros:\n");
        System.out.printf("val1 y val 2 en base decimal     : %d    %d \n",val1,val2);
        System.out.printf("val1 y val 2 en base octal       : %o    %o \n",val1,val2);
        System.out.printf("val1 y val 2 en base hexadecimal : %x    %x \n",val1,val2);

        System.out.println("\nUso de MIN_VALUE y MAX_VALUE para mostrar rangos:\n");
        System.out.println(String.format("\nTipo Byte       :  Min: %d   Max: %d",Byte.MIN_VALUE, Byte.MAX_VALUE));
        System.out.println(String.format("\nTipo Short      :  Min: %d   Max: %d",Short.MIN_VALUE, Short.MAX_VALUE));
        System.out.println(String.format("\nTipo Integer    :  Min: %d   Max: %d",Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.println(String.format("\nTipo Long       :  Min: %d   Max: %d",Long.MIN_VALUE, Long.MAX_VALUE));
    }
}
