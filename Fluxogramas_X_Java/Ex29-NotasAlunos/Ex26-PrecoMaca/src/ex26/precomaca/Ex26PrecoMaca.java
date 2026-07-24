package ex26.precomaca;

import java.util.Scanner;

public class Ex26PrecoMaca {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int macas;
        double total;
        System.out.println("Insira a quantidade de macas");
        macas = teclado.nextInt();
        if (macas < 12) {
            total = macas * 1.30;
        } else {
            total = macas;
        }
        System.out.println("O total da compra foi: " + total + "R$");
    }

}
