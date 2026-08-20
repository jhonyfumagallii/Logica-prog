package ex03;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vet_numero[] = new int[9], tamanho = 9, primos = 0;
        System.out.println("Insira os numeros:");
        for (int i = 0; i < tamanho; i++) {
            vet_numero[i] = teclado.nextInt();
        }
        for (int i = 0; i < tamanho; i++) {
            for (int j = 1; j <= vet_numero[i]; j++) {
                if (vet_numero[i] % j == 0) {
                    primos++;
                }

            }
            if (primos == 2) {
                System.out.println(vet_numero[i] + " É primo.");
            }
            primos = 0;
        }
    }
}
