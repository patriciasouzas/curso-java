package exerciciosOO.aulas25a27;

public class ContaCorrente {

    int numero = 1;
    private double saldo;

    double sacar(double valorSaque) {

        if (saldo > 0 && saldo >= valorSaque) {

            if (valorSaque >= 0) {
                saldo = saldo - valorSaque;
            } else System.out.println("Valor de saque inválido.");

        } else System.out.println("Você não tem saldo suficiente para realizar o saque.");

        return saldo;
    }

    double depositar(double valorDeposito) {

        if (valorDeposito >= 0) {
            saldo = saldo + valorDeposito;
        } else System.out.println("Valor de depósito inválido.");

        return saldo;
    }

    void consultarSaldo() {
        System.out.println("O valor do saldo é: " + saldo);
    }

    void chequeEspecial(boolean isSpecial) {
        if (isSpecial == true) {
            System.out.println("Está no cheque especial.");
        } else System.out.println("Não está no cheque especial.");
    }
}
