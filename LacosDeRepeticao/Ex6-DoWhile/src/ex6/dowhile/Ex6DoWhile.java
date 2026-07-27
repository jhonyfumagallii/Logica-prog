package ex6.dowhile;

import java.util.Scanner;

public class Ex6DoWhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 1, divisores = 0, numero;
        System.out.println("Insira o número desejado.");
        numero = teclado.nextInt();
        do {
            if (numero % cont == 0) {
                divisores++;
            }
            cont++;
        } while (cont <= numero);
        if (divisores == 2) {
            System.out.println("É primo.");
        } else {
            System.out.println("Não é primo.");
        }
    }

}
