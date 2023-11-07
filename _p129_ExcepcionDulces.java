import java.util.InputMismatchException;
import java.util.Scanner;

public class _p129_ExcepcionDulces {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        try {
            Scanner obj = new Scanner(System.in);
            System.out.print("Numero de niños en el barrio : ");
            int a = obj.nextInt();
            System.out.print("Cantidad de dulces exitente  : ");
            int b = obj.nextInt();

            int c = a / b;

            System.out.println("A cada niño le tocan " + c + " dulces.");
            obj.close();
        } catch (InputMismatchException e) {
            System.out.println("Los niños y los dulces, deben ser cantidades numéricas");
        } catch (ArithmeticException e) {
            System.out.println("Si no hay dulces, no puedo repartir dulces");
        }
    }
}