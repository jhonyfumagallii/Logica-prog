package lacosderepeticao.ex2.dowhile;

import java.util.Scanner;

public class LacosDeRepeticaoEx2DoWhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int serie = 1, enesimo, cont = 0;
        System.out.println("Insira o termo");
        enesimo = teclado.nextInt();
        do {
            serie = serie * 2;
            System.out.print(serie + " ");
            cont++;
        } while (cont < enesimo);
    }

}
