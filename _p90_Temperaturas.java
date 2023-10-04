// Declarar un arreglo de temperatura que muestre todos los elementos y convierta a 0 los mayores a 10.

public class _p90_Temperaturas {

    public static void main(String[] args) {
        int MAX = 9;
        double[] Temperaturas = new double[MAX];

        Temperaturas[0] = 2.34;
        Temperaturas[1] = 44.56;
        Temperaturas[2] = 7.89;
        Temperaturas[3] = 0.5;
        Temperaturas[4] = 2.5;
        Temperaturas[5] = 4.67;
        Temperaturas[6] = 40.3;
        Temperaturas[7] = 22.35;
        Temperaturas[8] = 56.22;

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("\nLa primer temperatura es: " + Temperaturas[0]);
        System.out.println("\nLa tercer temperatura es: " + Temperaturas[2]);
        System.out.println("\nLas temperaturas son: ");
        for( double temperatura : Temperaturas )
            System.out.print( temperatura + " ");

        System.out.println(" "); 
        System.out.println("\nTemperaturas reducidas a 0: ");
        System.out.println("Temperatura 2: " + Temperaturas[1]);
        System.out.println(Temperaturas[1]-Temperaturas[1]);
        System.out.println("Temperatura 7: " + Temperaturas[6]);
        System.out.println(Temperaturas[6]-Temperaturas[6]);
        System.out.println("Temperatura 8: " + Temperaturas[7]);
        System.out.println(Temperaturas[7]-Temperaturas[7]);
        System.out.println("Temperatura 9: " + Temperaturas[8]);
        System.out.println(Temperaturas[8]-Temperaturas[8]);
        
        System.out.println("\nTemperaturas: ");
            for( double temperatura : Temperaturas )
            System.out.print( temperatura + " ");


    }
}
