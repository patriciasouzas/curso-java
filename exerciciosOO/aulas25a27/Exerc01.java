package exerciciosOO.aulas25a27;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {

        String ligar;
        Scanner input = new Scanner(System.in);
        Lampada lampada = new Lampada();

        System.out.println("Você quer ligar a lâmpada? (S - N)");
        ligar = input.next();

        if (ligar.equalsIgnoreCase("S")) {
            lampada.ligarLampada();
            System.out.println("A lâmpada foi ligada.");
        } else if (ligar.equalsIgnoreCase("N")) {
            lampada.desligarLampada();
            System.out.println("A lâmpada foi desligada.");
        } else System.out.println("Opção desconhecida. Tente novamente.");

        lampada.mostrarEstado();
        System.out.println();

        System.out.println("----- mudança de estado -----");
        lampada.mudarEstado();
        lampada.mostrarEstado();

    }
}
