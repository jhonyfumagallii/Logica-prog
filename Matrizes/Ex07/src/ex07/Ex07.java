package ex07;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String disciplinas[] = new String[10];
        String nomes[] = new String[40];
        double media[][] = new double[40][10];
        int opcao;
        int cont[] = new int[2];
        int opcaomedia[] = new int[2];
        int opcaoDisciplina;

        do {
            System.out.println("1 - Cadastrar um nome Disciplina (vetor)\n"
                    + "2 - Cadastrar um nome de Aluno (vetor)\n"
                    + "3 - Cadastrar uma Média de aluno em disciplina (matriz)\n"
                    + "4 - Listar disciplinas;\n"
                    + "5 - Listar alunos;\n"
                    + "6 - listar alunos e respectiva média em determinada disciplina;\n"
                    + "0 - Sair");
            opcao = teclado.nextInt();
            if (opcao == 1) {
                if (cont[0] < 10) {
                    System.out.println("Insira a disciplina");
                    teclado.nextLine();
                    disciplinas[cont[0]] = teclado.nextLine();
                    cont[0]++;
                } else {
                    System.out.println("O maximo de disciplinas ja foram cadastradas");
                }

            } else if (opcao == 2) {
                if (cont[1] < 40) {
                    System.out.println("Insira o nome do aluno");
                    teclado.nextLine();
                    nomes[cont[1]] = teclado.nextLine();
                    cont[1]++;
                } else {
                    System.out.println("O maximo de alunos ja foram cadastrados");
                }
            } else if (opcao == 3) {
                System.out.println("Selecione a disciplina: ");
                for (int i = 0; i < cont[0]; i++) {
                    System.out.println((i + 1) + " - " + disciplinas[i]);
                }
                opcaomedia[0] = teclado.nextInt();
                System.out.println("Selecione o aluno:");
                for (int i = 0; i < cont[1]; i++) {
                    System.out.println((i + 1) + " - " + nomes[i]);
                }
                opcaomedia[1] = teclado.nextInt();
                System.out.println("Insira a média");
                media[opcaomedia[1] - 1][opcaomedia[0] - 1] = teclado.nextDouble();
            } else if (opcao == 4) {
                for (int i = 0; i < cont[0]; i++) {
                    System.out.println((i + 1) + " - " + disciplinas[i]);
                }
            } else if (opcao == 5) {
                for (int i = 0; i < cont[1]; i++) {
                    System.out.println((i + 1) + " - " + nomes[i]);
                }
            } else if (opcao == 6) {
                System.out.println("Selecione a disciplina:");
                for (int i = 0; i < cont[0]; i++) {
                    System.out.println((i + 1) + " - " + disciplinas[i]);
                }

                opcaoDisciplina = teclado.nextInt();

                for (int j = 0; j < cont[1]; j++) {
                    System.out.println(nomes[j] + ": " + media[j][opcaoDisciplina - 1]);
                }
            }
        } while (opcao != 0);
    }

}
