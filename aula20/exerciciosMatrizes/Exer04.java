package aula20.exerciciosMatrizes;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[][] compromissos = new String[31][24]; // agenda com 31 dias e 24 horas

        boolean sair = false;
        byte opcao;

        while (!sair) {

            System.out.println("Digite 1 para adicionar compromisso");
            System.out.println("Digite 2 para verificar compromisso");
            System.out.println("Digite 0 para sair");

            opcao = input.nextByte();

            if (opcao == 1) { // adicionar compromisso

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês: ");
                    dia = input.nextInt();

                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else System.out.println("Dia inválido. Digite novamente.");
                }

                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.println("Entre com a hora do compromisso: ");
                    hora = input.nextInt();

                    if (hora > 0 && hora <= 24) {
                        horaValida = true;
                    } else System.out.println("Hora inválida. Digite novamente.");
                }

                dia--;
                System.out.println("Digite o compromisso: ");
                compromissos[dia][hora] = input.next();

            } else if (opcao == 2) {
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês: ");
                    dia = input.nextInt();

                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else System.out.println("Dia inválido. Digite novamente.");
                }

                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.println("Entre com a hora do compromisso: ");
                    hora = input.nextInt();

                    if (hora > 0 && hora <= 24) {
                        horaValida = true;
                    } else System.out.println("Hora inválida. Digite novamente.");
                }

                dia--;
                if (compromissos[dia][hora] == null) {
                    System.out.println("Não há compromisso marcado para esse dia e horário.\n");
                } else {
                    System.out.println("O compromisso agendado é: ");
                    System.out.println(compromissos[dia][hora]);
                    System.out.println();
                }

            } else if (opcao == 0) {
                sair = true;
            } else System.out.println("Opção inválida. Digite novamente.");
        }
    }
}
