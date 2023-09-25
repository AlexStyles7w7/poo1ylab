// Realiza un programa que te imprima el pago total del registro de una escuela, segun lo que se indica.

import java.util.Scanner;

public class _p80_PrimerExamenParcial {
    

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int alumnos=0,docentes=0,trabajadores=0,hombre=0,mujer=0,participantes,edad;
        double total,totalA,totalD,totalT,totalE;
        char gen,resp,reg;
        String nombre;
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("\nControl Escolar\n");
        System.out.print("Ingresa los datos de los participantes: \n");

        do{
        System.out.print("Nombre: "); nombre = obj.next();
        System.out.print("");
        System.out.print("Edad: "); edad = obj.nextInt();
            while(edad<18) {
                System.out.print("No puedes registrarte si eres menor de edad\n");
                break;
            }
        System.out.print("Generos:\n[M]asculino\n[F]emenino\n"); gen = Character.toUpperCase(obj.next().charAt(0));
        System.out.print("Tipo de registro:\n[E]studiante\n[D]ocente\n[T]rabajador\n"); reg = Character.toUpperCase(obj.next().charAt(0));
        System.out.print("¿Continuar? (S/N)"); resp = Character.toUpperCase(obj.next().charAt(0));
        }while(resp != 'N');

        if(gen=='M') {hombre=hombre+1;}
        else if(gen=='F') {mujer=mujer+1;}

        if(reg=='E') {alumnos=alumnos+1;}
        else if(reg=='D') {docentes=docentes+1;}
        else if(reg=='T') {trabajadores=trabajadores+1;}

        participantes = alumnos+docentes+trabajadores;
        totalE = participantes/edad;

        System.out.print("El sistema registro los siguientes datos: ");
        System.out.printf("\nAlumnos: %d",alumnos);
        System.out.printf("\nDocentes: %d",docentes);
        System.out.printf("\nTrabajadores: %d",trabajadores);
        System.out.printf("\nHombres: %d",hombre);
        System.out.printf("\nMujeres: %d",mujer);
        System.out.printf("\nTotal de participantes: %d",participantes);
        System.out.printf("\nPromedio de la edad: %.2f",totalE);

        totalA = alumnos*50;
        totalD = docentes*80;
        totalT = trabajadores*60;
        total = totalA+totalD+totalT;

        System.out.print("El total de dinero recaudado es de: ");
        System.out.printf("Dinero por alumnos: %.2f",totalA);
        System.out.printf("Dinero por docentes: %.2f",totalD);
        System.out.printf("Dinero por trabajadores: %.2f",totalT);
        System.out.printf("Dinero por todos: %.2f",total);

        if(total<100){System.out.print("ganancias BAJAS");}
        else if(total>100||total<200){System.out.print("ganancias MODERADAS");}
        else if(total>200){System.out.print("ganancias BUENAS");}

    }
}