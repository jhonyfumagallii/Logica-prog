package ex10.pkgfor;

import java.util.Scanner;

public class Ex10For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cor;
        int azul = 0, verde = 0, vermelho = 0;
        boolean sair = false;
        System.out.println("Digite as cores desejadas, escreva \"Sair\" para encerrar o programa");
        for (; sair == false;) {
            cor = teclado.nextLine();
            if (cor.equalsIgnoreCase("azul")) {
                azul++;
            }
            if (cor.equalsIgnoreCase("vermelho")) {
                vermelho++;
            }
            if (cor.equalsIgnoreCase("verde")) {
                verde++;
            }
            if (cor.equalsIgnoreCase("sair")) {
                sair = true;
            }
        }
        System.out.println("A cor azul foi digitada: " + azul + " vezes.");
        if (vermelho > verde) {
            System.out.println("Vermelho foi mais digitado que verde.");
        } else if (verde > vermelho) {
            System.out.println("Verde foi mais digitado que vermelho.");
        } else {
            System.out.println("Verde e vermelho foram digitados a mesma quantidade de vezes");
        }
    }

}
