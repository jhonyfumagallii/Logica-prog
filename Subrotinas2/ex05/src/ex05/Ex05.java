package ex05;

import java.util.Scanner;

public class Ex05 {

    static boolean verificacao(int vet[], int num) {
        for (int i = 0; i < 10; i++) {
            if (vet[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o numero a ser comparado");
        if (verificacao(new int[]{
            5, 4, 1, 2, 6, 21, 11, 7, 8, 10
        }, teclado.nextInt())) {
            System.out.println("O numero escolhido existe no vetor!");
        } else {
            System.out.println("O numero escolhido nao existe no vetor!");
        }
    }

}
