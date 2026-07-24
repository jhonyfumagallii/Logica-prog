package competicao7;

import java.util.Scanner;

public class Competicao7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, acum = 0;
        System.out.println("Insira o menor numero");
        n1 = teclado.nextInt();
        System.out.println("Insira o maior numero");
        n2 = teclado.nextInt();
        if (n1 % 2 == 0) {
            if (n2 % 2 == 0) {

                while (n1 <= n2) {
                    acum = n1 + acum;
                    n1 = n1 + 2;
                }
            }
        }
        if (n1 % 2 == 1) {
            if (n2 % 2 == 1) {
                n1++;
                while (n1 <= n2) {
                    acum = n1 + acum;
                    n1 = n1 + 2;
                }
            }
        }
        if (n1 % 2 == 1) {
            if (n2 % 2 == 0) {
                n1++;
                while (n1 < n2) {
                    acum = n1 + acum;
                    n1 = n1 + 2;
                }
            }
        }
        if (n1 % 2 == 0) {
            if (n2 % 2 == 1) {

                while (n1 < n2) {
                    acum = n1 + acum;
                    n1++;
                }
            }
        }
        System.out.println(acum);
    }

}
