package aula25;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 12;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.5;

        van.exibirAutonomia();
    }
}
