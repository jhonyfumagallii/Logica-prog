package ex30.mediadeaproveitamento;

import java.util.Scanner;

public class Ex30MediadeAproveitamento {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2, n3, medex, medalu;
        char notaf;
        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        n3 = teclado.nextDouble();
        medex = teclado.nextDouble();
        medalu = (n1 + (n2 * 2) + (n3 * 3) + medex) / 7;
        if (medalu >= 9) {
            notaf = 'A';
        } else if (medalu >= 7.5) {
            notaf = 'B';
        } else if (medalu >= 6) {
            notaf = 'C';
        } else if (medalu >= 4) {
            notaf = 'D';
        } else {
            notaf = 'E';
        }
    }

}
