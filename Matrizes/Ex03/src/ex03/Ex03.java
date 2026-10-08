package ex03;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[][] = new int[2][2];
        int resultado[][] = new int[2][2];
        int maior;
        System.out.println("Insira 4 numeros");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                numeros[i][j] = teclado.nextInt();
            }
        }
        maior = numeros[0][0];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (numeros[i][j] > maior) {
                    maior = numeros[i][j];
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = numeros[i][j] * maior;
            }
        }
        System.out.println("\nA matriz resultante é:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(resultado[i][j]);
            }
        }
    }

}
