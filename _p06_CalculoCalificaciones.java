<<<<<<< HEAD
// Calculadora de calificaciones

import java.util.Scanner;

public class _p06_CalculoCalificaciones {
    public static void main(String[] args) {
        float cal1,cal2,cal3,suma,prom,min,max;
        Scanner obj=new Scanner(System.in);

        cal1=cal2=cal3=0;

        System.out.print("Calificación 1: "); cal1=obj.nextFloat();
        System.out.print("Calificación 2: "); cal2=obj.nextFloat();
        System.out.print("Calificación 3: "); cal3=obj.nextFloat();

        suma=cal1+cal2+cal3;
        prom=suma/3;
        min=Math.min(Math.min(cal1,cal2),cal3);
        max=Math.max(Math.max(cal1,cal2),cal3);

        System.out.printf("\nLas calificaciones fueron: %.2f, %.2f, %.2f\n",cal1,cal2,cal3);
        System.out.printf("Suma  : %.2f\n",suma);
        System.out.printf("Promedio  : %.2f\n",prom);
        System.out.printf("Menor  : %.2f\n",min);
        System.out.printf("Mayor  : %.2f\n",max);
    }
    
}
=======
// Calculadora de calificaciones

import java.util.Scanner;

public class _p06_CalculoCalificaciones {
    public static void main(String[] args) {
        float cal1,cal2,cal3,suma,prom,min,max;
        Scanner obj=new Scanner(System.in);

        cal1=cal2=cal3=0;

        System.out.print("Calificación 1: "); cal1=obj.nextFloat();
        System.out.print("Calificación 2: "); cal2=obj.nextFloat();
        System.out.print("Calificación 3: "); cal3=obj.nextFloat();

        suma=cal1+cal2+cal3;
        prom=suma/3;
        min=Math.min(Math.min(cal1,cal2),cal3);
        max=Math.max(Math.max(cal1,cal2),cal3);

        System.out.printf("\nLas calificaciones fueron: %.2f, %.2f, %.2f\n",cal1,cal2,cal3);
        System.out.printf("Suma  : %.2f\n",suma);
        System.out.printf("Promedio  : %.2f\n",prom);
        System.out.printf("Menor  : %.2f\n",min);
        System.out.printf("Mayor  : %.2f\n",max);
    }
    
}
>>>>>>> 89a9dccabc8d93930c92cb391395cb18f12a25ad
