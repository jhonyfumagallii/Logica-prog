package ex8.pkgwhile;

import java.util.Scanner;

public class Ex8While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome, nome1 = "", nome2 = "", nome3 = "";

        int idade, menor18 = 0, somaIdade = 0, maiores18 = 0, mais80kg = 0, quantidadeJogadores, cont = 1;

        double peso, altura, somaAltura = 0, altura1 = 0, altura2 = 0, altura3 = 0;

        System.out.print("Insira a quantidade de jogadores: ");
        quantidadeJogadores = teclado.nextInt();
        teclado.nextLine();

        while (cont <= quantidadeJogadores) {

            System.out.println("\nJogador " + cont);

            System.out.print("Nome: ");
            nome = teclado.nextLine();

            System.out.print("Idade: ");
            idade = teclado.nextInt();

            System.out.print("Peso: ");
            peso = teclado.nextDouble();

            System.out.print("Altura: ");
            altura = teclado.nextDouble();
            teclado.nextLine();

            if (idade < 18) {
                menor18++;
            } else {
                somaIdade += idade;
                maiores18++;
            }

            if (peso > 80) {
                mais80kg++;
            }

            somaAltura += altura;

            if (altura > altura1) {
                altura3 = altura2;
                nome3 = nome2;

                altura2 = altura1;
                nome2 = nome1;

                altura1 = altura;
                nome1 = nome;
            } else if (altura > altura2) {
                altura3 = altura2;
                nome3 = nome2;

                altura2 = altura;
                nome2 = nome;
            } else if (altura > altura3) {
                altura3 = altura;
                nome3 = nome;
            }

            cont++;
        }

        System.out.println("\n===== RELATÓRIO =====");

        System.out.println("Menores de idade: " + menor18);

        if (maiores18 > 0) {
            System.out.println("Média de idade dos maiores: " + (double) somaIdade / maiores18);
        } else {
            System.out.println("Não há jogadores maiores de idade.");
        }

        System.out.println("Porcentagem com mais de 80kg: " + ((double) mais80kg / quantidadeJogadores * 100) + "%");

        System.out.println("Altura média do time: " + (somaAltura / quantidadeJogadores));

        System.out.println("1º mais alto: " + nome1 + " - " + altura1 + " m");
        System.out.println("2º mais alto: " + nome2 + " - " + altura2 + " m");
        System.out.println("3º mais alto: " + nome3 + " - " + altura3 + " m");
    }
}
