package _P147_TercerExamenParcial;

import java.io.Serializable;

public class Jugador implements Serializable {
    String Nombre;
    int Edad;
    char Sexo;
    String EstadoCivil;
    String Puesto;
    double Salario;

    public Jugador() {
    }
    public Jugador(String nombre, int edad, char sexo, String estadoCivil, String puesto, double salario) {
        Nombre = nombre;
        Edad = edad;
        Sexo = sexo;
        EstadoCivil = estadoCivil;
        Puesto = puesto;
        Salario = salario;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public char getSexo() {
        return Sexo;
    }
    public void setSexo(char sexo) {
        Sexo = sexo;
    }
    public String getEstadoCivil() {
        return EstadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        EstadoCivil = estadoCivil;
    }
    public String getPuesto() {
        return Puesto;
    }
    public void setPuesto(String puesto) {
        Puesto = puesto;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double salario) {
        Salario = salario;
    }
    
}
