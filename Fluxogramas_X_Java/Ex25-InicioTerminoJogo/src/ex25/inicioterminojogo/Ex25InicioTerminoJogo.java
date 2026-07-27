package ex25.inicioterminojogo;

import java.util.Scanner;

public class Ex25InicioTerminoJogo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horaini, horafim, minutoini, minutofim, duracaohora, duracaomin, inicio, fim;
        System.out.println("Insira a hora inicial do jogo");
        horaini = teclado.nextInt();
        System.out.println("Insira o minuto inicial do jogo");
        minutoini = teclado.nextInt();
        System.out.println("Insira a hora que o jogo terminou");
        horafim = teclado.nextInt();
        System.out.println("Insira o minuto que o jogo terminou");
        minutofim = teclado.nextInt();
        inicio = horaini * 60 + minutoini;
        fim = horafim * 60 + minutofim;
        if (inicio < fim) {
            duracaomin = fim - inicio;
            duracaohora = duracaomin / 60;
            duracaomin = duracaomin % 60;
        } else {
            duracaomin = 24 * 60 - inicio + fim;
            duracaohora = duracaomin / 60;
            duracaomin = duracaomin % 60;
        }
        System.out.println("O tempo de duaração do jogo foi de :" + duracaohora + " horas e " + duracaomin + " minutos");
    }

}
