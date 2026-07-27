package ex3.pkgfor;

import java.util.Scanner;

public class Ex3For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int voto, votantes, a = 0, b = 0, c = 0, nulo = 0, branco = 0, cont = 0;
        System.out.println("Insira a quantidade de votantes");
        votantes = teclado.nextInt();
        for (; cont < votantes; cont++) {
            System.out.println("Aperte 1 para votar no candidato AAA.");
            System.out.println("Aperte 2 para votar no candidato BBB.");
            System.out.println("Aperte 3 para votar no candidato CCC.");
            System.out.println("Aperte 4 para votar em branco.");
            voto = teclado.nextInt();
            if (voto == 1) {
                a++;
            } else if (voto == 2) {
                b++;
            } else if (voto == 3) {
                c++;
            } else if (voto == 4) {
                branco++;
            } else {
                nulo++;
            }
        }
        System.out.println("Candidato AAA: " + a + " Candidato BBB: " + b + " Candidato CCC: " + c + " Branco: " + branco + " Nulo: " + nulo);
    }

}
