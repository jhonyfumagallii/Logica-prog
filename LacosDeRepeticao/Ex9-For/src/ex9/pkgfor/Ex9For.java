package ex9.pkgfor;

import java.util.Scanner;

public class Ex9For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0, quantidade;
        char produto = 0;
        double total = 0, valorpago, troco;
        boolean valido = false;
        for (; opcao != 3;) {
            System.out.println("1 - Registrar venda");
            System.out.println("2 - Apresentar total e calcular troco");
            System.out.println("3 - Sair");
            System.out.print("Escolha a opção: ");
            opcao = teclado.nextInt();

            if (opcao == 1) {
                System.out.println("\na – Água - R$ 3,5");
                System.out.println("b – Salgado R$ 5,00");
                System.out.println("c – Salada de Frutas R$ 7,50");
                System.out.print("Escolha o produto: ");
                while (valido == false) {
                    produto = teclado.next().charAt(0);

                    if (produto == 'a') {
                        System.out.print("Insira a quantidade: ");
                        quantidade = teclado.nextInt();
                        total += quantidade * 3.5;
                        valido = true;
                        System.out.println("");
                    } else if (produto == 'b') {
                        System.out.print("Insira a quantidade: ");
                        quantidade = teclado.nextInt();
                        total += quantidade * 5;
                        valido = true;
                        System.out.println("");
                    } else if (produto == 'c') {
                        System.out.print("Insira a quantidade: ");
                        quantidade = teclado.nextInt();
                        total += quantidade * 7.5;
                        valido = true;
                        System.out.println("");
                    } else {
                        System.out.print("Insira uma opção válida: ");
                    }
                }
                valido = false;
            }
            if (opcao == 2) {
                if (total == 0) {
                    System.out.println("Nenhuma venda registrada. ");
                } else {
                    System.out.println("\nTotal a pagar R$ : " + total);
                    System.out.print("Valor pago R$ : ");
                    valorpago = teclado.nextDouble();
                    if (valorpago >= total) {
                        troco = valorpago - total;
                        System.out.println("Troco: R$ " + troco);
                        total = 0;
                        System.out.println("");
                    } else {
                        total = total - valorpago;
                        System.out.println("Faltam: R$ " + total);
                        System.out.println("");
                    }
                }
            }

            if (opcao == 3) {
                System.out.println("Encerrando...");
            }
        }
    }

}
