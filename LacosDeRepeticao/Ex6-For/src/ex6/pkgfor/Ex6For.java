package ex6.pkgfor;

import java.util.Scanner;

public class Ex6For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 1, divisores = 0, numero;
        System.out.println("Insira o número desejado.");
        numero = teclado.nextInt();
        for (; cont <= numero; cont++) {
            if (numero % cont == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            System.out.println("É primo.");
        } else {
            System.out.println("Não é primo.");
        }
    }

}
