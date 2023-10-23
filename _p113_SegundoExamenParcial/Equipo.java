package _p113_SegundoExamenParcial;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String Nombre;
    private String Liga;
    private List<Jugador> Jugadores;
    
    //Constructores
    public Equipo() {

    }
    public Equipo(String nombre, String liga) {
        Nombre = nombre;
        Liga = liga;
        Jugadores = new ArrayList<>();
    }

    //Getters y Setters
    public void agregarJugador(Jugador jugador){
        Jugadores.add(jugador);
    }

    public List<Jugador> getJugadores() {
        return Jugadores;
    }

    public double getTotalBono() {
        double TotalBono = 0;
        for (Jugador jugador : Jugadores) {
            TotalBono += jugador.getBono();
        }
        return TotalBono;
    }

    public double getTotal() {
        double Total = 0;
        for (Jugador jugador : Jugadores) {
            Total += jugador.Total;
        }
        return Total;
    }

    public int getTotalH() {
        int TotalH = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.Sexo == 'H') {
                TotalH++;
            }
        }
        return TotalH;
    }

    public int getTotalM() {
        int TotalM = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.Sexo == 'M') {
                TotalM++;
            }
        }
        return TotalM;
    }

    //metodo toString
    public void reporte() {
        System.out.println(">> Equipo [Nombre=" + Nombre + ", Liga=" + Liga + ", Jugadores=" + Jugadores.size() + ", Bono=" + getTotalBono() + ", Total=" + getTotal() + ", Hombres=" + getTotalH() + ", Mujeres=" + getTotalM() + "]");

        for (Jugador jugador : Jugadores) {
            System.out.println(jugador);
        }
    }
    @Override
    public String toString() {
        return ">> Equipo [Nombre=" + Nombre + ", Liga=" + Liga + ", Jugadores=" + Jugadores.size() + ", Bono=" + getTotalBono() + ", Total=" + getTotal() + ", Hombres=" + getTotalH() + ", Mujeres=" + getTotalM() + "]";
    }

}