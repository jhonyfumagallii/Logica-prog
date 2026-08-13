package ex02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros_vet[] = new int[10], tamanho = 10, maiores = 0;
        System.out.println("Informe 10 numeros:");

        for (int i = 0; i < tamanho; i++) {
            numeros_vet[i] = teclado.nextInt();
        }
        
        for (int i = 0; i < tamanho; i++) {
            if (numeros_vet[i] > 50) {
                maiores++;
            }
        }
        
        if (maiores > 0) {
            System.out.println("\nLista dos numeros maiores que 50:");
        } else {
            System.out.println("\nNao ha numeros maiores que 50");
        }

        for (int i = 0; i < tamanho; i++) {
            if (numeros_vet[i] > 50) {
                System.out.println(numeros_vet[i]);
            }
        }
    }
}
