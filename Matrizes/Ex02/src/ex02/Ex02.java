package ex02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[][] = new int[3][3];
        int menor;
        System.out.println("Insira 9 numeros");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numeros[i][j] = teclado.nextInt();
            }
        }
        menor = numeros[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (numeros[i][j] < menor) {
                    menor = numeros[i][j];
                }
            }
        }
        System.out.println("O menor numero é " + menor);
    }

}
