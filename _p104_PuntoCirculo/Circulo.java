package _p104_PuntoCirculo;

public class Circulo {
    private Punto Centro;
    private double Radio;

    public Circulo() {
    }    
    public Circulo(Punto centro, double radio) {
        Centro = centro;
        Radio = radio;
    }

    public Punto getCentro() {
        return Centro;
    }
    public void setCentro(Punto centro) {
        Centro = centro;
    }
    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo [Centro=" + Centro + ", Radio=" + Radio + "]";
    }
    public double getCircunferencia() {
        return 2*3.1416*Radio;
    }
    public double getArea() {
        return Math.PI*Math.pow(Radio, 2);
    }    
    
}
