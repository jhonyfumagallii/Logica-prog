package ex01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        int num;
        System.out.print("Insira uma frase: ");
        frase = teclado.nextLine();
        num = frase.length();
        System.out.println("A sua frase tem " + num + " caracteres");
    }

}
