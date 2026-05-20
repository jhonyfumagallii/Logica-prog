package ex11.menornúmero;

import java.util.Scanner;

public class Ex11MenorNúmero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2, n3;
        System.out.println("Digite os números");
        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        n3 = teclado.nextDouble();
        if (n1 < n2) {
            if (n1 < n3) {
                System.out.println("Menor numero: " + n1);
            } else {
                System.out.println("Menor número: " + n3);
            }
        } else if (n1 < n3) {
            System.out.println("Menor número: " + n2);
        } else if (n2 < n3) {
            System.out.println("Menor número: " + n2);
        } else {
            System.out.println("Menor número: " + n3);
        }
    }

}
