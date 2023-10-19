package _p110_CuentaBancariaV1;

import java.util.ArrayList;

public class Banco {
    private String Nombre;
    private String Domicilio;
    private ArrayList<Cliente> Cliente;

    public Banco() {
        Cliente = new ArrayList<>(); // reserva espacio en memoria para el arreglo

    }

    public Banco(String nombre, String domicilio) {
        this(); // llama al constructor vacio
        Nombre = nombre;
        Domicilio = domicilio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public ArrayList<Cliente> getCliente() {
        return Cliente;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        Cliente = cliente;
    }

    public void AgregarCliente(Cliente cliente) {
        Cliente.add(cliente);
    }

    @Override
    public String toString() {
        return "Banco [Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", Cliente=" + Cliente.size() + "]";
    }

}