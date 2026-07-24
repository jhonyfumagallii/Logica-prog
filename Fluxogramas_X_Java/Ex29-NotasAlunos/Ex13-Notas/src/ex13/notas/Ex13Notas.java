package ex13.notas;

import java.util.Scanner;

public class Ex13Notas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2, n3, media;
        System.out.println("Insira as notas");
        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        n3 = teclado.nextDouble();
        media = (n1 + n2 + n3) / 3;
        if (media >= 6) {
            System.out.println("Média: " + media + ", Aprovado.");
        } else {
            System.out.println("Média: " + media + ", Reprovado.");
        }

    }

}
