package _p104_PuntoCirculo;

public class Punto {
    private int X,Y;

    public Punto() {
    }
    public Punto(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }
    public void setX(int x) {
        X = x;
    }
    public int getY() {
        return Y;
    }
    public void setY(int y) {
        Y = y;
    }

    @Override
    public String toString() {
        return "Punto [X=" + X + ", Y=" + Y + "]";
    }
    public double getDistancia(Punto centro) {
        return Math.sqrt(Math.pow(centro.getX(),2) + Math.pow(centro.getY(),2));
    }

}
