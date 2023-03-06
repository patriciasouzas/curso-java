package aula25;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é de " + capCombustivel * consumoCombustivel + " Km.");
    }

    double obterAutonomia() {
        System.out.println("\nMétodo obterAutonomia foi chamado.");
        return capCombustivel * consumoCombustivel;
    }
}
