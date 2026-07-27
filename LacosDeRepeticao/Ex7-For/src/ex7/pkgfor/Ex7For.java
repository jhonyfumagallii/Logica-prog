package ex7.pkgfor;

import java.util.Scanner;

public class Ex7For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double cont = 1, numero, fatorial = 1, E = 1;
        System.out.println("Insira o número desejado");
        numero = teclado.nextInt();
        for (; cont <= numero; cont++) {
            fatorial = cont * fatorial;
            E = E + ((10 * cont) / fatorial);
        }
        System.out.println(E);
    }

}
