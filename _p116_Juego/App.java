package _p116_Juego;

public class App {
    public static void main(String[] args) {
        JuegoDados misDados = new JuegoDados();

        misDados.iniciar();
        misDados.jugar();
        misDados.finalizar();

        JuegoAdivina miAdivina = new JuegoAdivina();

        miAdivina.iniciar();
        miAdivina.jugar();
        miAdivina.finalizar();
    }
}
