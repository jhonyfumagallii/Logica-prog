package ex5.dowhile;

import java.util.Scanner;

public class Ex5DoWhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int antigo = 1, novo = 1, temp, enesimo, cont = 0;
        System.out.println("Insira o enésimo termo desejado");
        enesimo = teclado.nextInt();
        do {
            System.out.print(antigo + " ");
            temp = antigo + novo;
            antigo = novo;
            novo = temp;
            cont++;
        } while (cont < enesimo);
        System.out.println("");
    }

}
