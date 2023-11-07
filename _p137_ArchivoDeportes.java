import java.io.*;

public class _p137_ArchivoDeportes {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        String[] deportes = { "Fútbol", "Béisbol", "Ciclismo", "Atletismo", "Natación", "Motociclismo" };
        File arch = new File("deportes.txt");

        if (arch.exists())
            System.out.println("El archivo ya existe! Sus datos son:\n");
        else {
            System.out.println("El archivo no existe, pero se creara con los siguientes datos:\n");
            try {
                BufferedWriter fdeportes = new BufferedWriter(new FileWriter(arch));
                for (String nombre : deportes)
                    fdeportes.write(nombre + "\n");
                fdeportes.close();
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo..");
                System.out.println(e);
            }
        }

        if (!arch.exists())
            System.out.println("El archivo no existe !");
        else {
            try {
                BufferedReader fdeportes = new BufferedReader(new FileReader(arch));
                String linea;
                while ((linea = fdeportes.readLine()) != null)
                    System.out.println(linea);

                fdeportes.close();
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo..");
                System.out.println(e);
            }
        }
    }
}