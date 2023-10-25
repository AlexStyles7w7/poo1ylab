package _p119_Organismo;

public class Organismos {
    private String Nombre;
    public Organismos(String nombre) {
        Nombre = nombre;
    }
    public String getNombre() {
        return Nombre;
    }
    public void respiracion() {
        System.out.println("Respirando...");
    }
    public void movimiento() {
        System.out.println("Moviendose...");
    }
    public void crecimiento() {
        System.out.println("Creciendo...");
    }
    public void muriendo() {
        System.out.println("Muriendose...");
    }
}
