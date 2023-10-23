package _p112_ControlVentas;

public abstract class Venta {
    private String Articulo;
    private int Cantidad;
    private double Precio;

    // Creamos el constructor
    public Venta(String articulo, int cantidad, double precio) {
        Articulo = articulo;
        Cantidad = cantidad;
        Precio = precio;
    }

    // Getters and Setters
    public String getArticulo() {
        return Articulo;
    }

    public void setArticulo(String articulo) {
        Articulo = articulo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    // Metodo absctracto para heredarlo a las demás clases
    public abstract double getTotalVenta();

    // Creamos el metodo toString
    @Override
    public String toString() {
        return "Venta [Articulo=" + Articulo + ", Cantidad=" + Cantidad + ", Precio=" + Precio + ", Total=" + "]";
    }

}