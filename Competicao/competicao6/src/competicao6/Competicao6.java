package competicao6;

import java.util.Scanner;

public class Competicao6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 10, acum = 0;

        while (n <= 15) {
            acum = n + acum;
            n++;
        }
        System.out.println(acum);

    }

}
