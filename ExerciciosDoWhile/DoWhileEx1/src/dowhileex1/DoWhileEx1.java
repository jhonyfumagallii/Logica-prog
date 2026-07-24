package dowhileex1;

import java.util.Scanner;

public class DoWhileEx1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int senha, senhacerta = 1234;
        System.out.println("Insira a senha.");
        senha = teclado.nextInt();
        if (senha != senhacerta) {
            do {
                System.out.println("Senha incorreta. Digite a senha novamente.");
                senha = teclado.nextInt();
            } while (senha != senhacerta);
        }
        System.out.println("Senha correta.");

    }

}
