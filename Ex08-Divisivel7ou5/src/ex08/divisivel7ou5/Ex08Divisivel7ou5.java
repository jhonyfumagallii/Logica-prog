package ex08.divisivel7ou5;

import java.util.Scanner;

public class Ex08Divisivel7ou5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N;
        System.out.println("Digite um número");
        N = teclado.nextInt();
        if (N % 5 == 0 || N % 7 == 0) {
            System.out.println("É divisível");
        } else {
            System.out.println("Não é divisível");
        }
    }

}
