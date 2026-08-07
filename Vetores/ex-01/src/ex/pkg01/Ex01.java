package ex.pkg01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero_vet[] = new int[5], tamanho = 5;
        System.out.print("Insira 5 numeros:");
        for (int i = 0; i < tamanho; i++) {
            numero_vet[i] = teclado.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            if (numero_vet[i] % 2 == 0) {
                System.out.println(numero_vet[i]);
            }
        }
    }

}
