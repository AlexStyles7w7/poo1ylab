package _p111_CuentaBancariaV2;

public class App {
    public static void main(String[] args) {
        // Creamos un banco
        Banco mibanco = new Banco("Banco del norte SA de CV", "Priva las Cumbres 123");
        System.out.print("\033[H\033[2J"); System.out.flush();

        mibanco.agregarCliente(new Cliente("Carlos Fuentes"));
        mibanco.agregarCliente(new Cliente("Juan De La Fuente"));
        mibanco.agregarCliente(new Cliente("Rene Mayorga"));
        mibanco.agregarCliente(new Cliente("Maria Vazquez"));
        mibanco.reporte();

        mibanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000, 0.10));
        mibanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000, 0.20));
        mibanco.getClientes().get(0).agregarCuenta(new CuentaDeCheques(1000, 500));
        mibanco.getClientes().get(1).agregarCuenta(new CuentaDeCheques(2500, 500));
        mibanco.getClientes().get(2).agregarCuenta(new CuentaDeCheques(2000, 600));
        mibanco.getClientes().get(2).agregarCuenta(new CuentaDeAhorro(2000, 0.40));
        mibanco.reporte();

        mibanco.getClientes().get(0).getCuentas().get(0).retira(500);
        mibanco.getClientes().get(0).getCuentas().get(1).retira(100);
        mibanco.getClientes().get(1).getCuentas().get(0).deposita(100);
        mibanco.getClientes().get(2).getCuentas().get(0).deposita(300);
        mibanco.getClientes().get(2).getCuentas().get(1).retira(1000);
        mibanco.reporte();
        mibanco.calcularInteres();
        mibanco.reporte();
    }
}