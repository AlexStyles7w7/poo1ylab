// Diseñe un programa que permita procesar la solicitud e imprimir: tamaño de la compra, cantidad comprada, total compra, descuento, 
// total de compra con descuento de una pizza.

import java.util.Scanner;

public class _p36_CompraPizza {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner obj = new Scanner(System.in);
        int pizzas, peque, med, grande;
        double descuento, totaldesc, pago;
        // Indicador de precios y pregunta cuantas pizzas se compraran.
        System.out.println("Elige el tamaño de tu/tus pizzas.");
        System.out.println("Pizza chica: $50.00");
        System.out.println("Pizza mediana: $100.00");
        System.out.println("Pizza grande: $200.00");
        System.out.println("¿Cuantas pizzas compraras?");
        pizzas = obj.nextInt();
        System.out.println("Pizzas pequeñas:");
        peque = obj.nextInt();
        System.out.println("Pizzas medianas:");
        med = obj.nextInt();
        System.out.println("Pizzas grandes:");
        grande = obj.nextInt();

        pago = (peque * 50) + (med * 100) + (grande * 200);
        // Elegi poner el precio minimo para descuento en 200 porque en 2000 tendrian
        // que comprar muchas pizzas.
        if (pago > 200) {
            descuento = pago * 0.15;
            totaldesc = pago - descuento;
            System.out.println("\nTotal de pizzas: " + pizzas);
            System.out.println("Chicas  : " + peque);
            System.out.println("Medianas: " + med);
            System.out.println("Grandes : " + grande);
            System.out.println("\nPrecio total: " + pago);
            System.out.printf("\n¡Felicidades!, adquirio un descuento del 15 por ciento, su nuevo total es de: %.2f",
                    totaldesc);
        } else if (pago <= 200) {
            System.out.println("\nTotal de pizzas: " + pizzas);
            System.out.println("Chicas  : " + peque);
            System.out.println("Medianas: " + med);
            System.out.println("Grandes : " + grande);
            System.out.println("\nPrecio total: " + pago);
        }
        System.out.println("\nGracias por su compra.");

    }

}
