package exerciciosOO.aulas25a27;

public class ContaTeste {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.depositar(250);
        conta.consultarSaldo();
        conta.chequeEspecial(false);
        System.out.println();
        conta.sacar(100);
        conta.consultarSaldo();
        conta.chequeEspecial(true);


    }
}
