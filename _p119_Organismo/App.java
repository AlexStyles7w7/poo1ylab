package _p119_Organismo;

public class App {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Solovino");
        System.out.println("Mi perro se llama " + miPerro.getNombre() + " y hace así: ");

        miPerro.multicelular();
        miPerro.sangreCaliente();
        miPerro.correr();
        miPerro.cuatroPatas();
        miPerro.respiracion();
        miPerro.movimiento();
        miPerro.crecimiento();
        miPerro.muriendo();

        Perico miPerico = new Perico("Filipino");
        System.out.println("Mi perico se llama " + miPerico.getNombre() + " y hace así: ");

        miPerico.multicelular();
        miPerico.sangreCaliente();
        miPerico.volar();
        miPerico.dosPatas();
        miPerico.respiracion();
        miPerico.movimiento();
        miPerico.crecimiento();
        miPerico.muriendo();
    }
    
}
