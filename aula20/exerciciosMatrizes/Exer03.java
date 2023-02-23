package aula20.exerciciosMatrizes;

import java.util.Random;

// fazer matriz 3X3 e imprimir, saber quantos pares e quantos ímpares tem

public class Exer03 {
    public static void main(String[] args) {

        int[][] valores = new int[3][3];
        int pares = 0;
        int impares = 0;

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
            for (int j = 0; j < valores[i].length; j++) {
                if (valores[i][j] % 2 == 0) {
                    pares++;
                }
                if (valores[i][j] % 2 == 1) {
                    impares++;
                }
            }
        }
        System.out.println("A quantidade de números pares é: " + pares);
        System.out.println("A quantidade de números ímpares é: " + impares);

    }
}
