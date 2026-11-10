package ex09;

import java.util.Scanner;

public class Ex09 {

    static void nome(String nome) {
        int tam;

        String nomeVet[] = nome.split(" ");
        tam = nomeVet.length;

        if (tam == 2) {
            System.out.println(nome);
        } else {
            for (int i = 1; i < tam - 1; i++) {
                nomeVet[i] = nomeVet[i].substring(0, 1) + ". ";
            }
            nome = nomeVet[0] + " ";
            for (int i = 1; i < tam; i++) {
                nome += nomeVet[i];
            }
        }
        System.out.println(nome);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira seu nome completo: ");
        nome(teclado.nextLine());
    }

}
