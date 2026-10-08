package ex04;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String Alunos_vet[] = new String[6];
        double notas[][] = new double[6][3];
        double media[] = {0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 6; i++) {
            System.out.print("Insira o nome do " + (i + 1) + "° aluno: ");
            Alunos_vet[i] = teclado.nextLine();
            System.out.println("Insira as notas dele:");
            for (int j = 0; j < 3; j++) {
                notas[i][j] = teclado.nextDouble();
            }
            System.out.println("\n");
            teclado.nextLine();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                media[i] += notas[i][j];
            }
            media[i] = media[i] / 3;
        }

        for (int i = 0; i < 6; i++) {
            if (media[i] >= 6) {
                System.out.println("O aluno " + Alunos_vet[i] + " esta aprovado");
            }
            if (media[i] < 6) {
                System.out.println("O aluno " + Alunos_vet[i] + " esta reprovado");
            }
        }
    }

}
