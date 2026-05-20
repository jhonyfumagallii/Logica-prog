package ex10.categorianadador;

import java.util.Scanner;

public class Ex10CategoriaNadador {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int I;
        String N;
        System.out.println("Digite sua idade");
        I = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Digite seu nome");
        N = teclado.nextLine();
        if (I < 5) {
            System.out.println(N + " Sem categoria");
        } else if (I < 8) {
            System.out.println(N + " Infantil A");
        } else if (I < 11) {
            System.out.println(N + " Infantil B");
        } else if (I < 14) {
            System.out.println(N + " Juvenil A");
        } else if (I < 18) {
            System.out.println(N + " Juvenil B");
        } else {
            System.out.println(N + " Adulto");
        }
    }

}
