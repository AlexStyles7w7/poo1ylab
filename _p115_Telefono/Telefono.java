package _p115_Telefono;

public class Telefono implements Gps,Radio,Conecta {
    @Override
    public void obtenerCoordenadas() {
        System.out.println("Obteniendo coordenadas del satelite mas cercano...");
    }
    @Override
    public void detenerRadio() {
        System.out.println("Deteniendo radio...");
    }
    @Override
    public void iniciarRadio() {
        System.out.println("Iniciando radio...");
    }
    @Override
    public void bluetooth() {
        System.out.println("Conectando el Bluetooth V3... Cuidado con quien compartes...");
    }
    @Override
    public void wifi() {
        System.out.println("Conectando el wifi al canal 5 ghz, si no me paso al de 2.4 ghz");
    }
    
}
