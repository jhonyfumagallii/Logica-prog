package ex06;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, Nome[] = new String[2];
        int tam;
        System.out.print("Insira seu nome completo: ");
        nome = teclado.nextLine();
        Nome[0] = nome.substring(0, nome.lastIndexOf(" "));
        Nome[1] = nome.substring(nome.lastIndexOf(" ")+1);
        nome = Nome[1] + ", " + Nome[0];
        System.out.println(nome);
    }
    
}
