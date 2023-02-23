package aula20.exerciciosMatrizes;

import java.util.Random;

// fazer matriz 4X4, saber qual é o maior número e dizer onde está posicionado
public class Exer01 {
    public static void main(String[] args) {

        int[][] valores = new int[4][4];
        int posicaoI = 0;
        int posicaoJ = 0;
        int maior = 0;

        Random aleatorio = new Random();

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                valores[i][j] = aleatorio.nextInt(9);
                System.out.print(valores[i][j] + " ");
                if (maior < valores[i][j]) {
                    maior = valores[i][j];
                    posicaoI = i + 1;
                    posicaoJ = j + 1;
                }
            }
            System.out.println();
        }
        System.out.println("Maior : " + maior);
        System.out.println("Linha: " + posicaoI);
        System.out.println("Coluna: " + posicaoJ);

    }
}
