package ex14.multiplos;

import java.util.Scanner;

public class Ex14Multiplos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b;
        System.out.println("Insira os números");
        a = teclado.nextInt();
        b = teclado.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("Não é possível verificar múltiplos com zero");
        } else if (a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

    }

}
