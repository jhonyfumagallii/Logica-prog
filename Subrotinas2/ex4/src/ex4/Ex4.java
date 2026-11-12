package ex4;

import java.util.Scanner;

public class Ex4 {

    static double media(double numVet[]) {
        double media = 0;
        for (int i = 0; i < 3; i++) {
            media += numVet[i];
        }
        return media / 3;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira 3 numeros");
        System.out.println("Média: " + media(new double[]{
            teclado.nextDouble(),
            teclado.nextDouble(),
            teclado.nextDouble()
        }));
    }

}
