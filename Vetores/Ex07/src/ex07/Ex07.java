package ex07;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomesVet[] = new String[5];
        int aumentoVet[] = {0, 0, 0, 0, 0};
        double novoSalarioVet[] = new double[5];
        double salariosVet[] = new double[5];
        double temposVet[] = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o nome do " + (i + 1) + "° funcionario: ");
            nomesVet[i] = teclado.nextLine();
            System.out.println("Insira o salario do " + (i + 1) + "° funcionario: ");
            salariosVet[i] = teclado.nextDouble();
            System.out.println("Insira o tempo de serviço (em anos) do " + (i + 1) + "° funcionario: ");
            temposVet[i] = teclado.nextDouble();
            System.out.println("\n");
            teclado.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            if (salariosVet[i] < 1940) {
                aumentoVet[i] = aumentoVet[i] + 1;
            }

            if (temposVet[i] > 5) {
                aumentoVet[i] = aumentoVet[i] + 2;
            }
        }

        for (int i = 0; i < 5; i++) {
            if (aumentoVet[i] == 1) {
                novoSalarioVet[i] = (salariosVet[i] * 0.15) + salariosVet[i];
            } else if (aumentoVet[i] == 2) {
                novoSalarioVet[i] = (salariosVet[i] * 0.25) + salariosVet[i];
            } else if (aumentoVet[i] == 3) {
                novoSalarioVet[i] = (salariosVet[i] * 0.35) + salariosVet[i];
            }
        }

        System.out.println("========RELATORIO DE QUEM NAO TERA AUMENTO========");
        for (int i = 0; i < 5; i++) {
            if (aumentoVet[i] == 0) {
                System.out.println("O funcionario " + nomesVet[i] + " nao tera aumento.");
            }
        }

        System.out.println("\n========RELATORIO DE QUEM TERA AUMENTO========");
        for (int i = 0; i < 5; i++) {
            if (aumentoVet[i] != 0) {
                System.out.println("O funcionario " + nomesVet[i] + " tera o salario reajustado para R$ " + novoSalarioVet[i]);
            }
        }
    }

}
