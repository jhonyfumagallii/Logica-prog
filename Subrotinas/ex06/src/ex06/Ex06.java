package ex06;

import java.util.Scanner;

public class Ex06 {

    static int calcularDuracaoJogo(int horaInicio, int minutoInicio, int horaFinal, int minutoFinal) {
        int duracaoMinutos = 0;
        int duracaoHoras = 0;

        duracaoHoras = horaFinal - horaInicio;

        if (horaInicio > horaFinal) {
            duracaoHoras = (24 - horaInicio) + horaFinal;
        }

        duracaoMinutos = minutoInicio - minutoFinal;

        if (minutoInicio > minutoFinal) {
            duracaoMinutos = (60 - minutoInicio) + minutoFinal;
            duracaoHoras--;
        }

        return duracaoHoras * 60 + duracaoMinutos;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite a hora de inicio, minuto de inicio, hora de fim e minuto de fim do jogo.");

        System.out.println(calcularDuracaoJogo(keyboard.nextInt(), keyboard.nextInt(), keyboard.nextInt(), keyboard.nextInt()));
    }

}
