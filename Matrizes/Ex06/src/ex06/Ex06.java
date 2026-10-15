package ex06;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        int numeros[][] = new int[5][15];
        int cont[] = new int[25];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                numeros[i][j] = (int) (Math.random() * 25) + 1;
                cont[numeros[i][j] - 1]++;
            }
        }

        for (int i = 0; i < 25; i++) {
            System.out.println("Número " + (i + 1) + " repetiu " + cont[i] + " vezes");
        }
    }

}
