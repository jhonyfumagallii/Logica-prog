package lacosderepeticao.ex2.pkgfor;

import java.util.Scanner;

public class LacosDeRepeticaoEx2For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int serie = 1, cont = 0, enesimo;
        System.out.println("Insira o termo");
        enesimo = teclado.nextInt();
        for (; cont < enesimo; cont++) {
            serie = serie * 2;
            System.out.print(serie + ", ");
        }
    }

}
