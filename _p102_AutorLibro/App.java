package _p102_AutorLibro;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Libro libro1 = new Libro();
        Autor autor = new Autor();

        autor.setNombre("Baldor");
        autor.setCorreo("baldor@msn.com");
        libro1.setIsbn("100010145");
        libro1.setNombre("Algebra para principiantes");
        libro1.setPrecio(1500);
        libro1.setCantidad(30);
        libro1.setAutor(autor);
        System.out.println(libro1);

        Libro libro2 = new Libro("10232320", "Ecuaciones Diferenciales", new Autor("Hijo de Baldor", "baldorson@gmail.com"), 2300, 10);
        System.out.println(libro2);
        System.out.println("Nombre del libro: " + libro2.getNombre());
        System.out.println("Nombre del autor: " + libro2.getAutor().getNombre());
    }
    
}
