package _p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        Sedan miSedan = new Sedan("Vochito", "María Díaz", 4);
        System.out.println(miSedan + "\n");
        miSedan.sistemaElectrico();
        miSedan.combustionInterna();
        miSedan.carroceriaTres();
        miSedan.chasisMonocasco();
        miSedan.repostar();
        miSedan.arrancar();
        miSedan.frenar();
        System.out.println();

        Suv miSuv = new Suv("La Mamalona", "Carlos Castañeda", 6);
        System.out.println(miSuv + "\n");
        miSuv.sistemaElectrico();
        miSuv.combustionInterna();
        miSuv.traccion4x4();
        miSuv.chasisIndependiente();
        miSuv.repostar();
        miSuv.arrancar();
        miSuv.frenar();
    }
}