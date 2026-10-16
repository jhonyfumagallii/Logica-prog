package pkg1e;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String senha = "aAbcdEEEf12!@", senhausuario;
        do {
            System.out.println("Insira a senha: ");
            senhausuario=teclado.nextLine();
            if (senhausuario.equals(senha)) {
                System.out.println("Senha correta.");
            } else {
                System.out.println("Senha incorreta.");
                System.out.println("\n");
            }
        } while (!senhausuario.equals(senha));
    }
    
}
