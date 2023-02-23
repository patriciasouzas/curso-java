package aula19.exerciciosArray;

public class Exer10 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

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

        System.out.println("VetorB = o resto da divisão por 2");
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] % 2;
            System.out.printf("VetorB = %d\n", vetorB[i]);
        }
    }

}
