package aula19;

public class Arrays {
    public static void main(String[] args) {

        double tempDia001 = 33.5;
        double tempDia002 = 33.9;
        double tempDia003 = 34.9;
        double tempDia004 = 39.9;
        double tempDia005 = 31.9;

        double[] temperaturas = new double[365];
        temperaturas[0] = 33.5;
        temperaturas[1] = 33.9;
        temperaturas[2] = 34.9;
        temperaturas[3] = 39.9;
        temperaturas[4] = 31.9;

        System.out.println("O tamanho do array é: " + temperaturas.length);

        for (int i = 0; i<temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia " + (i + 1) + " = " + temperaturas[i]);
        }
    }
}
