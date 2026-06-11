package ex23.horariojogo;

import java.util.Scanner;

public class Ex23HorarioJogo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int comeco, termino, duracao;
        System.out.println("Insira a hora do inicio do jogo");
        comeco = teclado.nextInt();
        System.out.println("Insira a hora do termino do jogo");
        termino = teclado.nextInt();
        if (termino <= comeco) {
            duracao = 24 + termino - comeco;
        } else {
            duracao = termino - comeco;
        }
        System.out.println("Duracao: " + duracao + "h");

    }

}
