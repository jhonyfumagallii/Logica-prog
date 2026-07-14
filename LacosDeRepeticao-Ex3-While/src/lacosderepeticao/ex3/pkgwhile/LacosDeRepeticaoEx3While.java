package lacosderepeticao.ex3.pkgwhile;

import java.util.Scanner;

public class LacosDeRepeticaoEx3While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int can1 = 0, can2 = 0, can3 = 0, branco = 0, votantes, voto;
        System.out.println("Quantos votantes há?");
        votantes = teclado.nextInt();
        while (votantes > 0) {
            votantes--;
            System.out.println("Digite 1 para votar no candidato AAA");
            System.out.println("Digite 2 para votar no candidato BBB");
            System.out.println("Digite 3 para votar no candidato CCC");
            System.out.println("Digite 4 para votar em branco");
            voto = teclado.nextInt();
            if (voto == 1) {
                can1++;
            }
            if (voto == 2) {
                can2++;
            }
            if (voto == 3) {
                can3++;
            }
            if (voto == 4) {
                branco++;
            }
        }
        System.out.println("Candidato AAA teve: " + can1 + " votos." + " Candidato BBB teve: " + can2 + " votos." + " Candidato CCC teve: " + can3 + " votos." + " Houve " + branco + " votos em branco.");
    }

}
