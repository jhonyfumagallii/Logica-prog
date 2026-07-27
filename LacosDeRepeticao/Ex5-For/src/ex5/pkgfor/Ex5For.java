package ex5.pkgfor;

import java.util.Scanner;

public class Ex5For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int antigo=1, novo=1, temp, cont=0, enesimo;
        System.out.println("Insira o enésimo termo desejado.");
        enesimo = teclado.nextInt();
        for (; cont<enesimo;cont++) {
            System.out.print(antigo+" ");
            temp=antigo+novo;
            antigo=novo;
            novo=temp;   
        }
        System.out.println("");
    }

}
