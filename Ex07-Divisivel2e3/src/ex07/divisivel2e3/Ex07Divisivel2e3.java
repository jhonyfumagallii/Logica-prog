package ex07.divisivel2e3;

import java.util.Scanner;

public class Ex07Divisivel2e3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double N;
        System.out.println("Digite o número");
        N = teclado.nextDouble();
        if (N % 6 == 0) {
            System.out.println("O número é divisível");
        } else {
            System.out.println("O número não é divisível");
        }
    }

}
