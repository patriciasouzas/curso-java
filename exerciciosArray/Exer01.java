package exerciciosArray;

import java.util.Arrays;

public class Exer01 {
    public static void main(String[] args) {

        int[] vetorA = new int[5];
        int[] vetorB = new int[4];

        vetorA[0] = 6;
        vetorA[1] = 9;
        vetorA[2] = 7;
        vetorA[3] = 3;
        vetorA[4] = 8;

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i];
            System.out.printf("VetorA = %d | Vetor B = %d\n", vetorA[i], vetorB[i]);
        }
    }

}
