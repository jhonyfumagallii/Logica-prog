package ex17.parimparpositivonegativo;

import java.util.Scanner;

public class Ex17ParImparPositivoNegativo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Insira o número.");
        n = teclado.nextInt();
        if (n < 0) {
            if (n % 2 == 0) {
                System.out.println("O número é negativo e par.");
            } else {
                System.out.println("O número é negativo e ímpar");
            }
        } else if (n > 0) {
            if (n % 2 == 0) {
                System.out.println("O número é positivo e par.");
            } else {
                System.out.println("O número é positivo e ímpar.");
            }
        } else {
            System.out.println("O número é 0");
        }
    }

}
