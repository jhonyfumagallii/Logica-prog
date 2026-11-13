package ex07;

import java.util.Scanner;

public class Ex07 {

    static boolean primo(int n) {
        boolean primo = true;
        if (n < 2) {
            primo = false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                primo = false;
            }
        }
        return primo;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira um numero");
        if (primo(teclado.nextInt()) == true) {
            System.out.println("é primo");
        } else {
            System.out.println("Nao é primo");
        }
    }

}
