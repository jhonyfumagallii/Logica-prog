package ex09.maiornumero;

import java.util.Scanner;

public class Ex09MaiorNumero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double N1, N2;
        System.out.println("Insira os números");
        N1 = teclado.nextDouble();
        N2 = teclado.nextDouble();
        if (N1 > N2) {
            System.out.println("O número " + N1 + "É maior que " + N2);
        } else {
            System.out.println("O número " + N2 + "É maior que " + N1);
        }
    }

}
