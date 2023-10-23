package _p112_ControlVentas;

import java.util.ArrayList;

public class Cliente {
    private String Nombre;
    private String Domicilio;
    private String Correo;
    private ArrayList<Venta> Ventas;

    // Creamos los constructores
    public Cliente() {
        Ventas = new ArrayList<>();
    }

    public Cliente(String nombre, String domicilio, String correo) {
        this();
        Nombre = nombre;
        Domicilio = domicilio;
        Correo = correo;
    }

    // Getters and Setters
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

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public ArrayList<Venta> getVentas() {
        return Ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.Ventas = ventas;
    }

    public void setVentas(Venta venta1) {
        this.Ventas.add(venta1);
    }

    // Sobrecarga de TotalVentas
    public double getTotal() {
        double total = 0;
        for (Venta venta : Ventas) {
            total += venta.getTotalVenta();
        }
        return total;
    }

    // Creamos el metodo toString
    @Override
    public String toString() {
        return "Cliente [Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", Correo=" + Correo + "]";
    }

}