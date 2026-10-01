package ex06;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precoCombustivel;
        int quantidadeAutomoveis, maisEconomico = 0, menosEconomico = 0;
        System.out.print("Insira a quantidade de automoveis: ");
        quantidadeAutomoveis = teclado.nextInt();
        String modeloAutomoveisVet[] = new String[quantidadeAutomoveis];
        double consumoMedioVet[] = new double[quantidadeAutomoveis];
        double gastoVet[] = new double[quantidadeAutomoveis];
        System.out.print("Insira o preco do combustivel: ");
        precoCombustivel = teclado.nextDouble();

        for (int i = 0; i < quantidadeAutomoveis; i++) {
            teclado.nextLine();
            System.out.print("Insira o modelo do " + (i + 1) + " automovel: ");
            modeloAutomoveisVet[i] = teclado.nextLine();
            System.out.print("Insira o consumo médio do " + (i + 1) + " automovel: ");
            consumoMedioVet[i] = teclado.nextDouble();
        }

        for (int i = 0; i < quantidadeAutomoveis; i++) {
            if (consumoMedioVet[i] > consumoMedioVet[maisEconomico]) {
                maisEconomico = i;
            }

            if (consumoMedioVet[i] < consumoMedioVet[menosEconomico]) {
                menosEconomico = i;
            }
        }

        for (int i = 0; i < quantidadeAutomoveis; i++) {
            gastoVet[i] = (780 / consumoMedioVet[i]) * precoCombustivel;
        }

        System.out.println("O veículo mais econômico é o " + modeloAutomoveisVet[maisEconomico]);
        System.out.println("O veículo menos econômico é o " + modeloAutomoveisVet[menosEconomico]);
        for (int i = 0; i < quantidadeAutomoveis; i++) {
            System.out.println("O " + modeloAutomoveisVet[i] + " gastará R$ " + gastoVet[i]);
        }
    }

}
