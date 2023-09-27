// Genera dos arreglos de números aleatorios y los suma en un tercer arreglo

import java.util.Random;

public class _p89_ArregloAleatorios {
    public static void Mostrar(float[] nums) {
        for (float n : nums)
            System.out.printf("%.2f ", n);
        System.out.println("\n");
    }

    public static void GeneraAleatorio(float[] nums) {
        float min = 10.5f, max = 41.5f;
        Random rnd = new Random();
        for (int i = 0; i < nums.length; i++)

            nums[i] = Math.abs(rnd.nextFloat(max - min)) + min;

    }

    public static void SumaArreglos(float[] a1, float[] a2, float[] a3) {
        for (int i = 0; i < a1.length; i++)
            a3[i] = a1[i] + a2[i];

    }

    public static void main(String[] args) {
        int MAX = 15;
        float[] nums1 = new float[MAX];
        float[] nums2 = new float[MAX];
        float[] nums3 = new float[MAX];
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("\nPrimer arreglo de numeros aleatorios: ");
        GeneraAleatorio(nums1); Mostrar(nums1);
        System.out.println("\nSegundo arreglo de numeros aleatorios: ");
        GeneraAleatorio(nums2); Mostrar(nums2);
        System.out.println("\nLa suma de los arreglos es: ");
        SumaArreglos(nums1, nums2, nums3); Mostrar(nums3);
        
    }
}