package aula20.exerciciosMatrizes;

import java.util.Random;

// fazer matriz 10X10, saber qual é o maior e menor número da linha 5
// e saber qual é o maior e menor número da coluna 7
public class Exer02 {
    public static void main(String[] args) {

        int[][] valores = new int[10][10];
        int maiorL5 = 0;
        int menorL5 = Integer.MAX_VALUE;
        int linha5 = 5;
        int maiorC7 = 0;
        int menorC7 = Integer.MAX_VALUE;
        int coluna7 = 7;

        Random aleatorio = new Random();

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                valores[i][j] = aleatorio.nextInt(50);
            }
        }

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                System.out.print(valores[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < valores.length; i++) {
            if (valores[linha5][i] > maiorL5) {
                maiorL5 = valores[linha5][i];
            }
            if (valores[linha5][i] < menorL5) {
                menorL5 = valores[linha5][i];
            }
        }
        System.out.println("Maior valor da linha 5: " + maiorL5);
        System.out.println("Menor valor da linha 5: " + menorL5);

        for (int i = 0; i < valores.length; i++) {
            if (valores[i][coluna7] > maiorC7) {
                maiorC7 = valores[i][coluna7];
            }
            if (valores[i][coluna7] < menorC7) {
                menorC7 = valores[i][coluna7];
            }
        }
        System.out.println("Maior valor da coluna 7: " + maiorC7);
        System.out.println("Menor valor da coluna 7: " + menorC7);

    }
}
