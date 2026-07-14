package lacosderepeticao.ex2.pkgwhile;

import java.util.Scanner;

public class LacosDeRepeticaoEx2While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int enesimo, serie = 1, cont = 0;
        System.out.println("Informe o termo.");
        enesimo = teclado.nextInt();
        while (cont < enesimo) {
            serie = serie * 2;
            System.out.print(serie + ", ");
            cont++;
        }
    }

}
