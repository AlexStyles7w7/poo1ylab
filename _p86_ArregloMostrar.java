// Mostrar un arreglo usando una funcion, lo eleva al cuadrado usando una funcion.

public class _p86_ArregloMostrar {

    public static void Mostrar(int[] arreglo) {
        for( int i=0; i<arreglo.length; i++ ) 
            System.out.print(arreglo[i] + " ");
        
    }

    public static void Cuadrado(int[] arreglo) {
        for( int i=0; i<arreglo.length; i++ )
            arreglo[i] = arreglo[i] * arreglo[i];
    }

    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8,3,5,7};
        int[] arr2 = {1,3,5,7,9,11,12,13};
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("\nElementos del arr1: "); Mostrar(arr1);
        System.out.println("\nElementos del arr2: "); Mostrar(arr2);
        System.out.println("\nElementos de arr1 elevados al cuadrado: ");
        Cuadrado(arr1); Mostrar(arr1);
        System.out.println("\nElementos de arr2 elevados al cuadrado: ");
        Cuadrado(arr2); Mostrar(arr2);

    }
    
}
