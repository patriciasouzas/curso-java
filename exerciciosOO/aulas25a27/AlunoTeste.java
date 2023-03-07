package exerciciosOO.aulas25a27;

import java.util.Scanner;

public class AlunoTeste {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        aluno.nome = input.next();

        System.out.print("Informe a matrícula do aluno: ");
        aluno.matricula = input.nextInt();

        System.out.print("Informe o curso do aluno: ");
        aluno.curso = input.next();

        for (int i = 0; i < aluno.disciplinas.length; i++) {
            System.out.print("Informe a disciplina: ");
            aluno.disciplinas[i] = input.next();

            System.out.print("Informe a nota: ");
            aluno.notas[i] = input.nextDouble();
        }

        aluno.exibirDisciplinasENotas();
        aluno.aprovado();
    }
}
