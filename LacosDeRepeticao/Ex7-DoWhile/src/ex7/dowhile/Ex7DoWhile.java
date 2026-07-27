package ex7.dowhile;

import java.util.Scanner;

public class Ex7DoWhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double cont = 1, numero, fatorial = 1, E = 1;
        System.out.println("Insira o número desejado");
        numero = teclado.nextInt();
        do {
            fatorial = cont * fatorial;
            E = E + ((10 * cont) / fatorial);
            cont++;
        } while (cont <= numero);
        System.out.println(E);
    }

}
