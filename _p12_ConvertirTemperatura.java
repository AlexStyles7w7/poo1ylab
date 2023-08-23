//Se desea convertir la temperatura de grados Farenheit a grados Celsius.

import java.util.Scanner;

public class _p12_ConvertirTemperatura {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
//Aqui se registra la temperatura en Farenheit
        System.out.print("Dame la temperatura (Farenheit): ");
        double Farenheit=obj.nextDouble();
//La formula principal, el profesor indico que se multiplicaba por 5/9 pero me daba un resultado incorrecto,
//solo cambie el dato de 5/9 a 1.8000
        double Celsius = (Farenheit - 32) / 1.8000;

        System.out.println(String.format("El resultante de %.2f Farenheit es de: %.2f Celsius",Farenheit,Celsius));
        
    }
}
