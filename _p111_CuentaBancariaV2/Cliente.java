package _p111_CuentaBancariaV2;

import java.util.ArrayList;

public class Cliente {
    private String Nombre;
    private ArrayList<CuentaBancaria> Cuentas;
    
    public Cliente() {
        Cuentas = new ArrayList<>();
    }
    public Cliente(String nombre) {
        this();
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public ArrayList<CuentaBancaria> getCuentas() {
        return Cuentas;
    }
    public void agregarCuenta(CuentaBancaria cuenta) {
        Cuentas.add(cuenta);
    }
    public double getTotal() {
        double total = 0;
        for ( CuentaBancaria cuenta : Cuentas ) {
            total += cuenta.getSaldo();
        }
        return total;
    }
    
    @Override
    public String toString() {
        return "Cliente [Nombre=" + Nombre + ", Cuentas=" + Cuentas.size() + ",Total=" + this.getTotal() + "]";
    }
    
}
