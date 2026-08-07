package vetores_introducao;

import java.util.Scanner;

public class Vetores_introducao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String comidasfav_vet[] = new String[5];
        int tamanho = 5;
        System.out.print("Insira suas comidas favoritas: ");
        for (int i = 0; i < tamanho; i++) {
            comidasfav_vet[i] = teclado.nextLine();
        }
        System.out.print("Suas comidas favoritas são: ");
        for (int i = 0; i < tamanho; i++) {

            if (i == tamanho - 1) {
                System.out.print(comidasfav_vet[i] + ".");
            } else {
                System.out.print(comidasfav_vet[i] + ", ");
            }
        }
        System.out.println("");
    }

}
