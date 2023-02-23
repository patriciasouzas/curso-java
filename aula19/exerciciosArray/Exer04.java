package aula19.exerciciosArray;

public class Exer04 {
    public static void main(String[] args) {

        int[] vetorA = new int[15];
        double[] vetorB = new double[15];

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
        vetorA[10] = 1;
        vetorA[11] = 2;
        vetorA[12] = 2;
        vetorA[13] = 2;
        vetorA[14] = 7;

        System.out.println("VetorB = raiz quadrada VetorA");
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = Math.sqrt(vetorA[i]);
            System.out.printf("VetorA = %d | Vetor B = %.2f\n", vetorA[i], vetorB[i]);
        }
    }

}
