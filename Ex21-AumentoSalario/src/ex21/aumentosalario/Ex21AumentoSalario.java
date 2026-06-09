package ex21.aumentosalario;

import java.util.Scanner;

public class Ex21AumentoSalario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sa, sn, dif;
        int code;
        System.out.println("Insira o codigo do cargo");
        code = teclado.nextInt();
        System.out.println("Insira o salario.");
        sa = teclado.nextDouble();
        if (code == 101) {
            sn = sa * 1.1;
        } else if (code == 102) {
            sn = sa * 1.2;
        } else if (code == 103) {
            sn = sa * 1.3;
        } else {
            sn = sa * 1.4;
        }
        dif = sn - sa;
        System.out.println("Salario antigo " + sa + ". Salario novo: " + sn + ". Diferença: " + dif);

    }

}


