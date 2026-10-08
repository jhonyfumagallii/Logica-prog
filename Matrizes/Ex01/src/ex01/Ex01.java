package ex01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[][] = new int[5][5];
        System.out.println("insira 25 numeros");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                numeros[i][j] = teclado.nextInt();
            }
        }
        System.out.println("Os numeros escolhidos pelo usuario foram:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(numeros[i][j]);
            }
        }
    }

}
