// Clase para manejar objetos.

package _p97_Empleado04;

import java.util.List;
import java.util.ArrayList;

public class App {
   public static void main(String[] args) {
    
    ArrayList<Empleado> empleados = new ArrayList<>();
    int suma=0, th=0, tm=0, tc=0, tnc=0;

    empleados.add(new Empleado("Juan Perez",35,'H',true));
    empleados.add(new Empleado("Maria de Jesus",16,'M',false));
    empleados.add(new Empleado("Dario Jimenez",33,'H',true));
    empleados.add(new Empleado("Jessica",45,'M',true));

    System.out.println(empleados.get(2).toString());

    for (Empleado empleado : empleados) {
        System.out.println(empleado.toString());
    }

    for(int i=0; i<empleados.size(); i++) {
        suma = suma + empleados.get(i).getEdad();
        if(empleados.get(i).getSexo()=='H') th++; else tm++;
        if(empleados.get(i).getCasado()) tc++; else tnc++;
    }
    System.out.println("Promedio edades: " + (suma/empleados.size()));
    System.out.println("Hombres: " + th + " Mujeres: " + tm);
    System.out.println("Casados: " + tc + " Solteros: " + tnc);
    
   }
}
