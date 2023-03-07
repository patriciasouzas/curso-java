package exerciciosOO.aulas25a27;

public class Lampada {

    String modelo;
    String tensao;
    boolean ligada;

    void ligarLampada() {
        ligada = true;
    }

    void desligarLampada() {
        ligada = false;
    }

    void mostrarEstado() {
        if (ligada) {
            System.out.println("Lâmpada ligada.");
        } else {
            System.out.println("Lâmpada desligada.");
        }
    }

    void mudarEstado() {
        if (ligada) {
            desligarLampada();
        } else ligarLampada();
    }
}
