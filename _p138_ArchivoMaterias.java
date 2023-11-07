import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class _p138_ArchivoMaterias {
    public static void leerMaterias(ArrayList<String> Materias) {
        String dato = "";
        System.out.println("Introduce un dato presiona <Enter> dato vacio para terminar> ");
        while (true) {
            dato = new Scanner(System.in).nextLine();
            if (!dato.isEmpty())
                Materias.add(dato);
            else
                break;
        }
    }

    public static void grabarArchivo(String archivo, ArrayList<String> Materias) throws IOException {
        BufferedWriter fMateria = new BufferedWriter(new FileWriter(new File(archivo)));
        for (String dato : Materias)

            fMateria.write(dato + "\n");

        fMateria.close();
    }

    public static ArrayList<String> leerArchivo(String archivo) throws IOException {
        ArrayList<String> Materias = new ArrayList<>();
        BufferedReader fMateria = new BufferedReader(new FileReader(new File(archivo)));
        String dato;
        while ((dato = fMateria.readLine()) != null)

            Materias.add(dato);

        fMateria.close();
        return Materias;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        String archivo = "Materias.txt";
        ArrayList<String> materias = new ArrayList<>(), listMaterias = new ArrayList<>();
        leerMaterias(materias);
        try {
            grabarArchivo(archivo, materias);
            listMaterias = leerArchivo(archivo);
            System.out.println("Materias capturadas: ");
            listMaterias.forEach(n -> System.out.println(n));
        } catch (Exception e) {

            System.out.println("Error al procesar el archivo: " + e);

        }
    }
}