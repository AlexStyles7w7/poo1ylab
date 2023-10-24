package _p114_Animal;

public class App {
    public static void main(String[] args) {
        // Animal mianimal = new Animal(); - No se puede instanciar una interfaz.
        Gato miGato = new Gato();
        miGato.dormir();
        miGato.sonido();
        miGato.comer();

        Perro miPerro = new Perro();
        miPerro.dormir();
        miPerro.sonido();
        miPerro.comer();
    }
    
}
