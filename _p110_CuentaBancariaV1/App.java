package _p110_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\nProbando clase CuentaBancaria");
        CuentaBancaria cuenta1 = new CuentaBancaria(6000);
        System.out.println("Saldo inicial = " + cuenta1.getSaldo());
        cuenta1.deposita(10000);
        System.out.println("Saldo deposito = " + cuenta1.getSaldo());
        double credito = 1500;
        boolean retiro = cuenta1.retira(credito);

        if (retiro)
            System.out.println("Retiro de " + credito + " exito ya puede ir a pistear" + cuenta1.getSaldo());
        else
            System.out.println("Lastima margarito, que otro patrocine ");

        System.out.println("\nProbando clase cliente ");
        Cliente cliente1 = new Cliente("Juan Margarito Perez ", cuenta1);
        System.out.println("Cliente 1 = " + cliente1);
        Cliente cliente2 = new Cliente("Edgar Israel Nieves Bautista", new CuentaBancaria(1000));
        System.out.println("Cliente 2 = " + cliente2);
        cliente2.getCuenta().deposita(8500);
        System.out.println("Cliente 2 = despues del deposito de 8500 = " + cliente2);
        if (cliente2.getCuenta().retira(1500))
            System.out.println("El retiro de 1500 fue exitoso, te queda " + cliente2.getCuenta().getSaldo());
        else
            System.out.println("No money man = (");

        System.out.println("\nProbando clase de Banco");
        Banco miBanco = new Banco("Banco patito SA de CV ", "Clase las Escondida S/N");
        miBanco.AgregarCliente(cliente2);
        miBanco.AgregarCliente(cliente1);
        miBanco.AgregarCliente(new Cliente("Felipe Correo ", new CuentaBancaria(2000)));
        miBanco.getCliente().get(0).getCuenta().deposita(1500);
        miBanco.getCliente().get(1).getCuenta().retira(1000);
        miBanco.getCliente().get(2).getCuenta().deposita(2000);

        double totalbanco = 0;
        for (Cliente cliente : miBanco.getCliente()) {
            System.out.println(cliente);
            totalbanco = totalbanco + cliente.getCuenta().getSaldo();

        }
        System.out.println("Total dinero en el banco : " + totalbanco);
    }
}