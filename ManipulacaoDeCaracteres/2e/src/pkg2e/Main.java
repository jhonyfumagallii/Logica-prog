package pkg2e;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String senha;
        boolean numero = false, simbolo = false, maiuscula = false, tamanho = false;
        System.out.print("Digite uma senha, ela deve conter ao menos 8 caracteres, um número, um caractere maiúsculo e um símbolo: ");
        do {
            numero = false;
            simbolo = false;
            maiuscula = false;
            tamanho = false;
            senha = teclado.nextLine();
            for (int i = 0; i < senha.length(); i++) {
                if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(senha.charAt(i)) != -1) {
                    maiuscula = true;
                }
            }
            for (int i = 0; i < senha.length(); i++) {
                if ("!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".indexOf(senha.charAt(i)) != -1) {
                    simbolo = true;
                }
            }
            for (int i = 0; i < senha.length(); i++) {
                if ("0123456789".indexOf(senha.charAt(i)) != -1) {
                    numero = true;
                }
            }
            if (senha.length() >= 8) {
                tamanho = true;
            }
            if (maiuscula && tamanho && simbolo && numero) {
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
        } while (!(maiuscula && tamanho && simbolo && numero));
    }

}
