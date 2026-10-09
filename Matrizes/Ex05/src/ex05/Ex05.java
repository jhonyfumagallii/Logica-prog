package ex05;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String lojasVet[] = new String[4];
        String produtosVet[] = new String[6];
        double preços[][] = new double[4][6];
        int cont = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Insira o nome da " + (i + 1) + "° Loja: ");
            lojasVet[i] = teclado.nextLine();
        }

        System.out.println("\n");

        for (int i = 0; i < 6; i++) {
            System.out.print("Insira o nome do " + (i + 1) + "° produto: ");
            produtosVet[i] = teclado.nextLine();
        }

        System.out.println("\n");

        for (int i = 0; i < 4; i++) {
            System.out.println("Loja " + lojasVet[i]);
            for (int j = 0; j < 6; j++) {
                System.out.print("Insira o preço do " + (j + 1) + "° produto: ");
                preços[i][j] = teclado.nextDouble();
                teclado.nextLine();
            }
            System.out.println("\n");
        }

        System.out.println("Produtos acima de R$ 50,00:");
        for (int i = 0; i < 4; i++) {
            System.out.println("\n");
            System.out.println("Loja " + lojasVet[i]);
            for (int j = 0; j < 6; j++) {
                if (preços[i][j] > 50) {
                    System.out.println(produtosVet[j]);
                } else {
                    cont++;
                }
                if (cont == 6) {
                    System.out.println("A loja não possui produtos acima de R$ 50,00");
                }
            }
            cont = 0;
        }
    }

}
