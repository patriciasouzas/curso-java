package aula20.exerciciosMatrizes;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[][][] compromissos = new String[12][31][24]; // agenda com 31 dias e 24 horas

        boolean sair = false;
        byte opcao;

        while (!sair) {

            System.out.println("Digite 1 para adicionar compromisso");
            System.out.println("Digite 2 para verificar compromisso");
            System.out.println("Digite 0 para sair");
            System.out.println();

            opcao = input.nextByte();

            if (opcao == 1) { // adicionar compromisso

                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.print("Entre com o mês: ");
                    mes = input.nextInt();

                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else System.out.print("Mês inválido. Digite novamente: ");
                }

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.print("Entre com o dia do mês: ");
                    dia = input.nextInt();

                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else System.out.print("Dia inválido. Digite novamente: ");
                }

                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.print("Entre com a hora do compromisso: ");
                    hora = input.nextInt();

                    if (hora > 0 && hora <= 8) {
                        horaValida = true;
                    } else System.out.println("Hora inválida. Digite novamente.");

                }

                mes--;
                dia--;
                System.out.print("Digite o compromisso: ");
                compromissos[mes][dia][hora] = input.next();
                System.out.println();

            } else if (opcao == 2) {

                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.print("Entre com o mês: ");
                    mes = input.nextInt();

                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else System.out.print("Mês inválido. Digite novamente: ");
                }

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.print("Entre com o dia do mês: ");
                    dia = input.nextInt();

                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else System.out.print("Dia inválido. Digite novamente: ");
                }

                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.print("Entre com a hora do compromisso: ");
                    hora = input.nextInt();

                    if (hora > 0 && hora <= 8) {
                        horaValida = true;
                    } else System.out.println("Hora inválida. Digite novamente.");
                }

                mes--;
                dia--;
                if (compromissos[mes][dia][hora] == null) {
                    System.out.println("Não há compromisso marcado para esse dia e horário.\n");
                } else {
                    System.out.print("O compromisso agendado é: ");
                    System.out.println(compromissos[mes][dia][hora]);
                    System.out.println();
                }

            } else if (opcao == 0) {
                sair = true;
            } else System.out.print("Opção inválida. Digite novamente.\n");
        }
    }
}
