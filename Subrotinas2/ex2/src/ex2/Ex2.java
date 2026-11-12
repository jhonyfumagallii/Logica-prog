package ex2;

import java.util.Scanner;

public class Ex2 {

    static boolean palindromo(String palavra, int inicio, int fim) {

        if (inicio >= fim) {
            return true;
        } else if (palavra.charAt(inicio) != palavra.charAt(fim)) {
            return false;
        } else {
            return palindromo(palavra, inicio + 1, fim - 1);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palavra;
        System.out.println("Insira uma palavra");
        palavra = teclado.nextLine();
        palindromo(palavra, 0, palavra.length() - 1);
        if (palindromo(palavra, 0, palavra.length() - 1)) {
            System.out.println(palavra + " é um palindromo!");
        } else {
            System.out.println(palavra + " nao é um palindromo!");
        }
    }

}
