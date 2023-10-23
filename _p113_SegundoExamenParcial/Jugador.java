package _p113_SegundoExamenParcial;

public abstract class Jugador {
    private String Nombre;
    char Sexo;
    private String Descripcion;
    public double Salario;
    public double Total;
    
    //Constructores
    public Jugador() {
    }
    public Jugador(String nombre, char sexo, String descripcion, double salario) {
        Nombre = nombre;
        Sexo = sexo;
        Descripcion = descripcion;
        Salario = salario;
    }

    //Metodo abstracto
    public abstract double getBono();

    //metodo toString
    @Override
    public String toString() {
        return "Jugador [Nombre=" + Nombre + ", Sexo=" + Sexo + ", Descripcion=" + Descripcion + ", Salario=" + Salario
                + "]";
    }
   
}
