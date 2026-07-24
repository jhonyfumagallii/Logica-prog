package ex18.opcaomedia;

import java.util.Scanner;

public class Ex18OpcaoMedia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int o;
        double n1, n2, n3, media;
        System.out.println("Insira as suas notas.");
        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        n3 = teclado.nextDouble();
        System.out.println("Selecione a opção que tu deseja:");
        System.out.println("Digite 1 para média aritmética.");
        System.out.println("Digite 2 para média ponderada.");
        o = teclado.nextInt();
        if (o == 1) {
            media = (n1 + n2 + n3) / 3;
        } else {
            media = (n1 * 3 + n2 * 3 + n3 * 4) / (10);
        }
        System.out.println("Média: " + media);
    }

}
