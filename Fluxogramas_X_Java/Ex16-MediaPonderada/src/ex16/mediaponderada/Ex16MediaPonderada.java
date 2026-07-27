package ex16.mediaponderada;

import java.util.Scanner;

public class Ex16MediaPonderada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int c;
        double n1, n2, n3, media;
        System.out.println("Insira o código do aluno.");
        c = teclado.nextInt();
        System.out.println("Agora, insira as notas.");
        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        n3 = teclado.nextDouble();
        if (n1 < n2) {
            if (n2 < n3) {
                media = (n3 * 4 + n2 * 3 + n1 * 3) / 10;
            } else {
                media = (n2 * 4 + n3 * 3 + n1 * 3) / 10;
            }
        } else if (n1 < n3) {
            media = (n3 * 4 + n2 * 3 + n1 * 3) / 10;
        } else {
            media = (n1 * 4 + n2 * 3 + n3 * 3) / 10;
        }
        if (media >= 5) {
            System.out.println("Média: " + media + ", Aprovado.");
        } else {
            System.out.println("Média: " + media + ", Reprovado.");
        }
    }

}
