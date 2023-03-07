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
            media = media + notas[i];
        }
        if (media / disciplinas.length >= 7) {
            System.out.println("O aluno está aprovado");
        } else System.out.println("O aluno está reprovado");
    }

    void exibirDisciplinasENotas() {
        for (int i = 0; i < disciplinas.length; i++) {
            System.out.println(disciplinas[i] + " - " + notas[i]);
        }
    }
}
