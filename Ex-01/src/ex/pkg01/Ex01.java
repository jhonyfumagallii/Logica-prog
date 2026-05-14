package ex.pkg01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double C, F;
        System.out.println("Digite a temperatura em C");
        C = teclado.nextDouble();
        F = (9 * C + 160) / 5;
        System.out.println("A temperatura em F é: " + F);

    }

}