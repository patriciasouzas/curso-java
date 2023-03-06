package exercicio.aula24;

import java.util.Date;

public class Exerc04 {
    public static void main(String[] args) {

        LivroDeBiblioteca biblioteca = new LivroDeBiblioteca();

        biblioteca.autor = "Cecília Queiroz";
        biblioteca.editora = "Baixo clero";
        biblioteca.genero = "Suspense";
        biblioteca.qtdPaginas = 340;
        biblioteca.emprestado = true;
        biblioteca.titulo = "A garotinha bonitinha";
        biblioteca.dataDevolucao = new Date();
        biblioteca.dataEmprestimo = new Date();
    }
}
