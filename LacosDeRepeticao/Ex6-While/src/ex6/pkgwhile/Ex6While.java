package ex6.pkgwhile;

import java.util.Scanner;

public class Ex6While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, cont = 1, divisores = 0;
        System.out.println("Insira o número desejado.");
        numero = teclado.nextInt();
        while (cont <= numero) {
            if (numero % cont == 0) {
                divisores++;
            }
            cont++;
        }
        if (divisores == 2) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
    }

}
