package ex15.categorianadador;

import java.util.Scanner;

public class Ex15CategoriaNadador {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String N;
        int I;
        System.out.println("Informe seu nome.");
        N = teclado.nextLine();
        System.out.println("Informe sua idade.");
        I = teclado.nextInt();
        if (I < 5) {
            System.out.println(N + ", Sem categoria.");
        } else if (I < 8) {
            System.out.println(N + ", Infantil A.");
        } else if (I < 11) {
            System.out.println(N + ", Infantil B.");
        } else if (I < 14) {
            System.out.println(N + ", Juvenil A.");
        } else if (I < 18) {
            System.out.println(N + ", Juvenil B.");
        } else {
            System.out.println(N + ", Adulto.");
        }
    }

}
