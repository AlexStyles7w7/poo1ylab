<<<<<<< HEAD
// Calcular la hipotenusa una vez dados el cateto A y el cateto B.

import java.util.Scanner;

public class _p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        int catetoa,catetob;
        float hipotenusa;
        Scanner obj = new Scanner(System.in);
//En esta parte, se piden los datos de los catetos.
        System.out.print("Dame el cateto a: ");
        catetoa = obj.nextInt();
        System.out.print("Dame el cateto b: ");
        catetob = obj.nextInt();
//aqui se registran los datos obtenidos y se multiplican para una efectividad mas rapida.
        double catetoa1 = catetoa*catetoa;
        double catetob1 = catetob*catetob;

        hipotenusa = (float) Math.sqrt(catetoa1+catetob1);

        System.out.println(String.format("\nLa hipotenusa de las longitudes dadas es de: %.2f",hipotenusa));

    }
}
=======
// Calcular la hipotenusa una vez dados el cateto A y el cateto B.

import java.util.Scanner;

public class _p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        int catetoa,catetob;
        float hipotenusa;
        Scanner obj = new Scanner(System.in);
//En esta parte, se piden los datos de los catetos.
        System.out.print("Dame el cateto a: ");
        catetoa = obj.nextInt();
        System.out.print("Dame el cateto b: ");
        catetob = obj.nextInt();
//aqui se registran los datos obtenidos y se multiplican para una efectividad mas rapida.
        double catetoa1 = catetoa*catetoa;
        double catetob1 = catetob*catetob;

        hipotenusa = (float) Math.sqrt(catetoa1+catetob1);

        System.out.println(String.format("\nLa hipotenusa de las longitudes dadas es de: %.2f",hipotenusa));

    }
}
>>>>>>> 89a9dccabc8d93930c92cb391395cb18f12a25ad
