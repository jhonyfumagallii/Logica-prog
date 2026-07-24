package ex12.pkg3nordemcrescente;

import java.util.Scanner;

public class Ex123NOrdemCrescente {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2, n3;
        System.out.println("Informe os Números");
        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        n3 = teclado.nextDouble();
        if (n1 < n2) {
            if (n1 < n3) {
                if (n2 < n3) {
                    System.out.println(n1 + ", " + n2 + ", " + n3);
                } else {
                    System.out.println(n1 + ", " + n3 + ", " + n2);
                }
            } else {
                System.out.println(n3 + ", " + n1 + ", " + n2);
            }
        } else if (n1 < n3) {
            System.out.println(n2 + ", " + n1 + ", " + n3);
        } else if (n2 < n3) {
            System.out.println(n2 + ", " + n3 + ", " + n1);
        } else {
            System.out.println(n3 + ", " + n2 + ", " + n1);
        }
    }

}
