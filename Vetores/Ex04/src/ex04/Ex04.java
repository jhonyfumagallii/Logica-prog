package ex04;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String animais_vet[] = new String[5], frutas_vet[] = new String[5], mesclagem_vet[] = new String[10];
        int tamanho = 5, cont = 0;
        System.out.println("Insira os animais:");
        for (int i = 0; i < tamanho; i++) {
            animais_vet[i] = teclado.nextLine();
        }
        System.out.println("Insira as frutas:");
        for (int i = 0; i < tamanho; i++) {
            frutas_vet[i] = teclado.nextLine();
        }
        for (int i = 0; i < tamanho; i++) {
            mesclagem_vet[cont] = animais_vet[i];
            cont++;
            mesclagem_vet[cont] = frutas_vet[i];
            cont++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(mesclagem_vet[i] + " ");
        }
    }

}
