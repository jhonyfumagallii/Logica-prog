package ex.pkg05;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio[] = new int[100], numeroUsuario[] = new int[5];
        for (int i = 1; i < 6; i++) {
            System.out.println("Insira o " + i + " numero.");
            numeroUsuario[i - 1] = teclado.nextInt();
        }
        for (int i = 0; i < 100; i++) {
            numeroAleatorio[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 100; j++) {
                if (numeroAleatorio[j] == numeroUsuario[i]) {
                    System.out.println("O numero " + numeroUsuario[i] + " esta na posicao " + j + " do vetor aleatorio");
                }
            }

        }
    }

}
