package exerciciosArray;

public class Exer13 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];

        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 14;
        vetorA[3] = 10;
        vetorA[4] = 5;
        vetorA[5] = 6;
        vetorA[6] = 10;
        vetorA[7] = 4;
        vetorA[8] = 3;
        vetorA[9] = 2;

        int soma = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 5 == 0)
            soma = soma + vetorA[i];
        }
        System.out.println("Soma dos elementos divisíveis por 5 = " + soma);
    }

}
