package ex.livrovet;

import java.util.Scanner;

public class ExLivroVet {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numerosVet[] = new int[5];
        int resultado = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("digite o " + (i + 1) + "o numero");
            numerosVet[i] = teclado.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            resultado += numerosVet[i];
        }
        System.out.print("\nOs numeros digitados foram ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numerosVet[i]);
            if (i < 4) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + resultado);
    }

}
