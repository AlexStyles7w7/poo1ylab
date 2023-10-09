package _p103_ClienteFactura;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Cliente cliente1 = new Cliente();
        Factura factura = new Factura();
        cliente1.setId("FIFA00-0010");
        cliente1.setNombre("Leonel Messi");
        cliente1.setDescuento(1);
        factura.setId(1);
        factura.setMonto(3500);
        factura.setCliente(cliente1);
        System.out.println(factura);
        System.out.println("Monto con descuento: " + factura.getMontoConDescuento());

        Factura factura2 = new Factura(2, new Cliente("LIGAMX-0012", "Guillermo Ochoa", 10), 5000);
        System.out.println("Factura ID         : " + factura2.getId());
        System.out.println("- Cliente ID         : " + factura2.getCliente().getId());
        System.out.println("- Cliente Nombre     : " + factura2.getCliente().getNombre());
        System.out.println("- Cliente Descuento  : " + factura2.getCliente().getDescuento()/100.0 + "%");
        System.out.println("Factura Monto      : " + factura2.getMonto());
        System.out.println("Monto con descuento: " + factura2.getMontoConDescuento());
    }
    
}
