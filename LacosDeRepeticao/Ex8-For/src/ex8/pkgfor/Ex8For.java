package ex8.pkgfor;

import java.util.Scanner;

public class Ex8For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, nome1 = "", nome2 = "", nome3 = "";
        int idade, menor18 = 0, somaIdade = 0, maiores18 = 0, mais80kg = 0, quantidadeJogadores, cont = 1;
        double peso, altura, somaAltura = 0, altura1 = 0, altura2 = 0, altura3 = 0, mediaIdade = 0, porcentagem80kg;
        System.out.print("Insira a quantidade de jogadores: ");
        quantidadeJogadores = teclado.nextInt();
        teclado.nextLine();
        for (; cont <= quantidadeJogadores; cont++) {
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

            somaAltura = somaAltura + altura;

            if (idade >= 18) {
                maiores18++;
                somaIdade = somaIdade + idade;
            }

            if (peso > 80) {
                mais80kg++;
            }

            if (idade < 18) {
                menor18++;
            }

            if (altura > altura1) {
                nome3 = nome2;
                altura3 = altura2;

                nome2 = nome1;
                altura2 = altura1;

                nome1 = nome;
                altura1 = altura;
            } else if (altura > altura2) {

                nome3 = nome2;
                altura3 = altura2;

                nome2 = nome;
                altura2 = altura;
            } else if (altura > altura3) {
                nome3 = nome;
                altura3 = altura;
            }
        }
        if (maiores18 != 0) {
            mediaIdade = (double) somaIdade / maiores18;
        }
        porcentagem80kg = ((double) mais80kg / quantidadeJogadores) * 100;
        somaAltura = somaAltura / quantidadeJogadores;

        System.out.println("\n===== RELATÓRIO =====");

        System.out.println("Menores de idade: " + menor18);

        if (maiores18 > 0) {
            System.out.println("Média de idade dos maiores: " + mediaIdade);
        } else {
            System.out.println("Não há jogadores maiores de idade.");
        }

        System.out.println("Porcentagem com mais de 80kg: " + porcentagem80kg + "%");

        System.out.println("Altura média do time: " + somaAltura);

        System.out.println("1º mais alto: " + nome1 + " - " + altura1 + " m");
        System.out.println("2º mais alto: " + nome2 + " - " + altura2 + " m");
        System.out.println("3º mais alto: " + nome3 + " - " + altura3 + " m");
    }

}
