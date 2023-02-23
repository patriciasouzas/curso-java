package exerciciosArray;

public class Exer14 {
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

        int cont = 0;
        int impares = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 1) {
                impares = impares + vetorA[i];
                cont++;
            }
        }

        System.out.println("A média dos números ímpares é = " + (impares/cont));
    }

}
