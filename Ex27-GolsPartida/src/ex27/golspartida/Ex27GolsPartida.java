package ex27.golspartida;

import java.util.Scanner;

public class Ex27GolsPartida {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int golst1, golst2;
        String t1, t2;
        System.out.println("Insira o time 1");
        t1 = teclado.nextLine();
        System.out.println("Insira os gols do time 1");
        golst1 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Insira o time 2");
        t2 = teclado.nextLine();
        System.out.println("Insira os gols do time 2");
        golst2 = teclado.nextInt();
        if (golst1 != golst2) {
            if (golst1 > golst2) {
                System.out.println("O time " + t1 + "é o vencedor da partida");
            } else {
                System.out.println("O time " + t2 + "é o vencedor da partida");
            }
        }
        System.out.println("A partida empatou");
    }

}
