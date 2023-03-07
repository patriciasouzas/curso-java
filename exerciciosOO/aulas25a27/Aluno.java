package exerciciosOO.aulas25a27;

public class Aluno {

    String nome;
    int matricula;
    String curso;
    String[] disciplinas = new String[3];
    double[] notas = new double[3];
    double media;

    public void aprovado() {
        for (int i = 0; i < disciplinas.length; i++) {
            media += notas[i];
        }
        if (media / disciplinas.length >= 7) {
            System.out.println("O aluno está aprovado");
        } else System.out.println("O aluno está reprovado");
    }

    void exibirInfosAluno() {
        System.out.print("\nNome: " + nome);
        System.out.print("\nMatrícula: " + matricula);
        System.out.print("\nCurso: " + curso);
        System.out.println();

        for (int i = 0; i < disciplinas.length; i++) {
            System.out.println(disciplinas[i] + " - " + notas[i]);
        }
    }
}
