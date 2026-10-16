package ex04;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        System.out.println("Insira seu nome completo.");
        nome = teclado.nextLine();
        nome = nome.trim();
        String resp[] = nome.split("\\s+");
        System.out.println("Seu primeiro nome é: " + resp[0]);
    }

}
