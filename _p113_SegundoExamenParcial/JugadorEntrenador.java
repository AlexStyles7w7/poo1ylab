package _p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador {
    private int Subordinados;
    private int Proyectos;

    //Constructores
    public JugadorEntrenador() {
    }
    public JugadorEntrenador(String string, int subordinados, String string2, int proyectos, int i, int j) {
        Subordinados = subordinados;
        Proyectos = proyectos;
    }

    public JugadorEntrenador(String string, char c, String string2, int i, int j, int k) {
    }
    //Getters y Setters
    public int getSubordinados() {
        return Subordinados;
    }
    public void setSubordinados(int subordinados) {
        Subordinados = subordinados;
    }
    public int getProyectos() {
        return Proyectos;
    }
    public void setProyectos(int proyectos) {
        Proyectos = proyectos;
    }
    
    //Metodos toString
    @Override
    public double getBono(){
        return (Salario * 0.15) + (Proyectos * 100)+ (Subordinados * 10);
    }
    @Override
    public String toString() {
        return "JugadorEntrenador ["+ super.toString() + "Subordinados=" + Subordinados + ", Proyectos=" + Proyectos + "]";
    }
    
}
