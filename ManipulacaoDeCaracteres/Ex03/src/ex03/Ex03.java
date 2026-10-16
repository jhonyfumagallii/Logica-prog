package ex03;

import java.util.Scanner;

public class Ex03 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String frase;
    int cont;
    System.out.print("Insira uma frase: ");
    frase = teclado.nextLine();
    frase = frase.trim();
    if (frase.isEmpty()) {
        cont = 0;
    } else {
        String resp[] = frase.split("\\s+");
        cont = resp.length;
    }
    System.out.println("A sua frase tem " + cont + " palavras.");

}

}
