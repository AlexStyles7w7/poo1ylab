package _p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador {
    private int Partidos;
    private int Goles;

    //Constructores
    public JugadorActivo(){

    }
    public JugadorActivo(int partidos, int goles) {
        Partidos = partidos;
        Goles = goles;
    }
    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidos, int goles) {
        super(nombre, sexo, descripcion, salario);
        Partidos = partidos;
        Goles = goles;
    }

    //Getters y Setters
    public int getPartidos() {
        return Partidos;
    }
    public void setPartidos(int partidos) {
        Partidos = partidos;
    }
    public int getGoles() {
        return Goles;
    }
    public void setGoles(int goles) {
        Goles = goles;
    }
    
    //metodos toString
    @Override
    public double getBono() {
        return (Salario * 0.10) + ( Partidos * 50) + (Goles * 5);
    }
    @Override
    public String toString() {
        return "JugadorActivo [" + super.toString()+ "Partidos=" + Partidos + ", Goles=" + Goles + "]";
    }    
  
}
