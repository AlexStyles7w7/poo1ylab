import java.util.Scanner;
import java.util.InputMismatchException;

public class _p131_ExcepcionTemperatura {
    public static double convertirACelsius(double temperaturaCelsius) {
        if (temperaturaCelsius >= 100) {
            throw new InputMismatchException("Temperatura demasiado alta, no se puede convertir");
        }
        return (temperaturaCelsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner obj = new Scanner(System.in);

        try {
            System.out.print("Dame una temperatura en centigrados: ");
            double temperaturaCelsius = obj.nextDouble();

            double temperaturaFahrenheit = convertirACelsius(temperaturaCelsius);

            System.out.printf("%.2f grados centigrados, equivale a %.2f grados Fahrenheit\n", temperaturaCelsius,
                    temperaturaFahrenheit);

        } catch (InputMismatchException e) {
            System.out.println("Error: La temperatura a convertir debe ser un valor numérico.");
        }

        obj.close();
    }

}