package ex06.imparpar;

import java.util.Scanner;

public class Ex06ImparPar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N;
        System.out.println("Digite o número");
        N = teclado.nextInt();
        if (N % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }

}
