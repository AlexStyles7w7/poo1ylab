import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _p126_Excepcion6 {
    public static void main(String[] args) {
        File nombres = new File("nombres.txt");
        try {
            Scanner obj = new Scanner(nombres);
            while (obj.hasNextLine())
                System.out.println(obj.nextLine());
        } catch (FileNotFoundException e) {

            System.out.println("Problemas al procesar el archivo... El archivo que intentas leer no existe!");

        }
    }
}