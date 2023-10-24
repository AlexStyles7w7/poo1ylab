package _p114_Animal;

// Una clase implementa una interfaz, al hacerlo debe sobrecargar todos sus metodos.
public class Gato implements Animal {
    
    @Override
    public void dormir() {
        System.out.println("El gato duerme en la caja");
    }
    @Override
    public void sonido() {
        System.out.println("El gato hace miau miau...");
    }
    @Override
    public void comer() {
        System.out.println("El gato come Whiskas... Y a veces le toca sobre...");
    }
    
}
