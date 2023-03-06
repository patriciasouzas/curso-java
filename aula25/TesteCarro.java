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

        System.out.println("A autonomia do carro é: " + van.obterAutonomia() + " Km");

        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(15);

        System.out.println("\nQuantidade de combustível para 10Km: " + qtdCombustivel10);
        System.out.println("Quantidade de combustível para 15Km: " + qtdCombustivel15);
    }
}
