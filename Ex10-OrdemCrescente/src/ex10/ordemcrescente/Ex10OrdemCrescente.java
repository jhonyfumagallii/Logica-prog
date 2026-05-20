package ex10.ordemcrescente;

import java.util.Scanner;

public class Ex10OrdemCrescente {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe os números");
        double N1, N2;
        N1 = teclado.nextDouble();
        N2 = teclado.nextDouble();
        if (N1 > N2) {
            System.out.println(N2 + ", " + N1);
        } else {
            System.out.println(N1 + ", " + N2);
        }
    }

}
