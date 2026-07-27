package ex4.dowhile;

import java.util.Scanner;

public class Ex4DoWhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, resultado = 1, cont = 1;
        System.out.println("Insira o número.");
        numero = teclado.nextInt();
        do {
            System.out.print(cont);
            if (cont < numero) {
                System.out.print(" x ");
            }
            resultado = resultado * cont;
            cont++;
        } while (cont <= numero);
        System.out.println(" = " + resultado);
    }

}
