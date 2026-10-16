package ex02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        int tam;
        int cont = 0;
        System.out.print("Insira uma frase: ");
        frase = teclado.nextLine();
        frase = frase.toLowerCase();
        tam = frase.length();
        for (int i = 0; i < tam; i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'á' || frase.charAt(i) == 'à' || frase.charAt(i) == 'â' || frase.charAt(i) == 'ã'
                    || frase.charAt(i) == 'e' || frase.charAt(i) == 'é' || frase.charAt(i) == 'ê'
                    || frase.charAt(i) == 'i' || frase.charAt(i) == 'í'
                    || frase.charAt(i) == 'o' || frase.charAt(i) == 'ó' || frase.charAt(i) == 'ô' || frase.charAt(i) == 'õ'
                    || frase.charAt(i) == 'u' || frase.charAt(i) == 'ú' || frase.charAt(i) == 'ü' || frase.charAt(i) == 'ù' || frase.charAt(i) == 'û') {
                cont++;
            }
        }
        System.out.println("A sua frase tem " + cont + " vogais.");
    }

}
