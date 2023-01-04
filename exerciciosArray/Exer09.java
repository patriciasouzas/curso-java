package exerciciosArray;

public class Exer09 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;
        vetorA[5] = 6;
        vetorA[6] = 5;
        vetorA[7] = 4;
        vetorA[8] = 3;
        vetorA[9] = 2;

        vetorB[0] = 2;
        vetorB[1] = 3;
        vetorB[2] = 3;
        vetorB[3] = 2;
        vetorB[4] = 3;
        vetorB[5] = 2;
        vetorB[6] = 3;
        vetorB[7] = 8;
        vetorB[8] = 7;
        vetorB[9] = 9;

        System.out.println("VetorC = VetorA / VetorB");
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i] / vetorB[i];
            System.out.printf("VetorC = %d | VetorA = %d / Vetor B = %d\n", vetorC[i], vetorA[i], vetorB[i]);
        }
    }

}
