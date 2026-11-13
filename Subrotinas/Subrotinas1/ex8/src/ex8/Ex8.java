package ex8;

import java.util.Scanner;

public class Ex8 {

    static int maior(int[] nvet) {
        int maior = 0;
        for (int i = 0; i < 5; i++) {
            if (nvet[i] > maior) {
                maior = nvet[i];
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira 5 numeros");
        System.out.println("o maior é " + maior(new int[]{teclado.nextInt(), teclado.nextInt(), teclado.nextInt(), teclado.nextInt(), teclado.nextInt()}));
    }

}
