package ex03;

import java.util.Scanner;

public class Ex03 {

    static int numero(int numero[]) {
        int maior = 0;
        for (int i = 0; i < 5; i++) {
            if (maior < numero[i]) {
                maior = numero[i];
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira 5 numeros");
        System.out.println("Maior: " + numero(new int[]{
            teclado.nextInt(),
            teclado.nextInt(),
            teclado.nextInt(),
            teclado.nextInt(),
            teclado.nextInt()
        }));
    }

}
