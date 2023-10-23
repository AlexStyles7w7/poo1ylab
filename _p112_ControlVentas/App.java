package _p112_ControlVentas;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Tienda miTienda = new Tienda("Abarrotes La Glorieta", "Don Chuy", "Fracc. Las Quintas");

        Cliente cliente1 = new Cliente("Felipe Calderón", "Las Lomas 123", "calderon@gmail.com");
        Cliente cliente2 = new Cliente("Enrique Peña", "5 de Mayo 321", "quique@gmail.com");
        Cliente cliente3 = new Cliente("Amlo", "Palacio Nacional 321", "peje@yahoo.com");
        Cliente cliente4 = new Cliente("Xochitl Galves", "Danone 123", "xochitl@precidencia.gob.mx");

        miTienda.setCliente(cliente1);
        miTienda.setCliente(cliente2);
        miTienda.setCliente(cliente3);
        miTienda.setCliente(cliente4);

        VentaContado venta1_cliente1 = new VentaContado("Martillo", 10, 60.5, 10, "Sacapuntas");
        VentaCredito venta2_cliente1 = new VentaCredito("Pala", 2, 1170.55, 3, 10);

        VentaCredito venta1_cliente2 = new VentaCredito("Clavo", 2, 160.34, 2, 20);
        VentaCredito venta2_cliente2 = new VentaCredito("Cinta de Aislar", 5, 71.34, 6, 20);
        VentaContado venta3_cliente2 = new VentaContado("Pinzas", 10, 650.33, 20, "Taladro");

        VentaContado venta1_cliente3 = new VentaContado("Thiner", 50, 65, 10, "Aerosol");

        cliente1.setVentas(venta2_cliente1);
        cliente1.setVentas(venta1_cliente1);
        cliente2.setVentas(venta1_cliente2);
        cliente2.setVentas(venta2_cliente2);
        cliente2.setVentas(venta3_cliente2);
        cliente3.setVentas(venta1_cliente3);

        miTienda.reporte();

    }
}