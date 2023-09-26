// Inicializar de forma manual un arreglo de numeros flotantes y lo imprima.

public class _p81_InicializaArregloNumeros {
    public static void main(String[] args) {
        int MAX=8;

        double[] nums = new double[MAX];

        nums[0] = 5.0;
        nums[1] = 10.0;
        nums[2] = 15.5;
        nums[3] = 20.5;
        nums[4] = 25.0;
        nums[5] = 100.22;
        nums[6] = 90.0;
        nums[7] = 666;
        // nums[8] = 66; no se puede ya que se sale del limite.

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("\nEl primer elemento del arreglo es " + nums[0]);
        System.out.println("\nEl ultimo elemento del arreglo es " + nums[6]);

        System.out.println("\nTodos los valores del arreglo con un ciclo for tradicional: ");
        for( int i=0; i < MAX; i++ )
            System.out.println( nums[i] );

        System.out.println("\nTodos los valores del arreglo con un ciclo for - each: ");
        for( double num : nums )
            System.out.println( num );


    }
    
}
