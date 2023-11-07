import java.io.File;

public class _p132_Archivos1 {
    public static void main(String[] args) {
        File arch = new File("datos.txt");
        System.out.println("Nombre archivo : " + arch.getName());
        System.out.println("Es directorio : " + arch.isDirectory());
        System.out.println("Ruta relativa : " + arch.getPath());
        System.out.println("Ruta absoluta : " + arch.getAbsolutePath());
        if (arch.exists()) {
            System.out.println("El archivo existe !!");
            System.out.println("Se puede leer : " + arch.canRead());
            System.out.println("Se puede escribir : " + arch.canWrite());
            System.out.println("Longitud archivo : " + arch.length());
            System.out.println("Longitud archivo : " + arch.lastModified());
        } else

            System.out.println("El archivo no existe !!");

    }
}