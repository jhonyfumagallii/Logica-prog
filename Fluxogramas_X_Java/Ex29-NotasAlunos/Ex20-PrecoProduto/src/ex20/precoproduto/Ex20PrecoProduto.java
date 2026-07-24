package ex20.precoproduto;

import java.util.Scanner;

public class Ex20PrecoProduto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double preco;
        int codigo, quantidade;
        preco = 0;
        System.out.println("Insira o código.");
        codigo = teclado.nextInt();
        if (codigo != 5 && codigo != 6 && codigo != 2 && codigo != 12) {
            System.out.println("Código inválido.");
            return;
        }
        System.out.println("Insira a quantidade.");
        quantidade = teclado.nextInt();
        if (codigo == 5) {
            preco = 32 * quantidade;

        } else if (codigo == 6) {
            preco = 45 * quantidade;

        } else if (codigo == 2) {
            preco = 37 * quantidade;

        } else if (codigo == 12) {
            preco = 44 * quantidade;

        }
        System.out.println("Preço total: " + preco);
    }

}
