package _p115_Telefono;

public class App {
    public static void main(String[] args) {
        Telefono miPhone = new Telefono();

        miPhone.iniciarRadio();
        miPhone.detenerRadio();
        miPhone.obtenerCoordenadas();
        miPhone.wifi();
        miPhone.bluetooth();
    }
}
