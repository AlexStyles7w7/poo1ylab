import java.util.Scanner;

public class _p128_ExcepcionRaiz {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        try {
            Scanner obj = new Scanner(System.in);
            System.out.print("Dame un número : ");
            double num = obj.nextInt();

            num = Math.sqrt(num);

            System.out.println("El resultado es: " + num);
            obj.close();
        } catch (Exception e) {
            System.out.println("Error no puedo calcular la raíz cuadrada");
        }
    }
}