package ex4.pkgfor;

import java.util.Scanner;

public class Ex4For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, resultado = 1, cont = 1;
        System.out.println("Insira o numero.");
        numero = teclado.nextInt();
        for (; cont <= numero; cont++) {
            System.out.print(cont);
            if (cont < numero) {
                System.out.print(" x ");
            }
            resultado = resultado * cont;
        }
        System.out.println(" = " + resultado);
    }

}
