// Inicializa de forma manual un arreglo de cadenas e imprime valores especificos.

public class _p82_InicializaArregloCadenas {
    public static void main(String[] args) {
        String[] municipio = new String[10];

        municipio[0] = "Apozol";
        municipio[1] = "Apulco";
        municipio[2] = "Cañitas";
        municipio[3] = "Jerez";
        municipio[4] = "Fresnillo";
        municipio[5] = "Rio Grande";
        municipio[6] = "Sain Alto";
        municipio[7] = "Sombrerete";
        municipio[8] = "Teul de Gonzalez Ortega";
        municipio[9] = "Atolinga";

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("\nPrimer elemento del arreglo: " + municipio[0]);
        System.out.println("\nUltimo elemento del arreglo: " + municipio[9]);

        System.out.println("\nTodos los elementos usando el ciclo for con indice");
        for( int i=0; i<10; i++)
            System.out.println( municipio[i] );

        System.out.println("\nTodos los elementos usando el ciclo for - each");
        for(String mun : municipio )
            System.out.println(mun.toUpperCase());

    }
    
}
