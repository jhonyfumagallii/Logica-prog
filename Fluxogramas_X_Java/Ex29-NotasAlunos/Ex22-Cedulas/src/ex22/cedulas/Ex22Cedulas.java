package ex22.cedulas;

import java.util.Scanner;

public class Ex22Cedulas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int notas100 = 0, notas50 = 0, notas10 = 0, notas5 = 0, notas1 = 0, valor = 0, valororig = 0;
        System.out.println("Insira o valor");
        valororig = teclado.nextInt();
        valor = valororig;

        notas100 = valororig / 100;
        valor = valororig - notas100 * 100;

        notas50 = valor / 50;
        valor = valor - notas50 * 50;

        notas10 = valor / 10;
        valor = valor - notas10 * 10;

        notas5 = valor / 5;
        valor = valor - notas5 * 5;

        notas1 = valor / 1;

        System.out.println("Valor: " + valororig + ". Notas de 100: " + notas100 + ". Notas de 50: " + notas50 + ". Notas de 10: " + notas10 + ". Notas de 1: " + notas1);
    }

}
