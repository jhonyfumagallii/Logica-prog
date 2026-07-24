package ex19.saldoecredito;

import java.util.Scanner;

public class Ex19SaldoeCredito {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double s, c;
        System.out.println("Insira seu saldo.");
        s = teclado.nextDouble();
        if (s < 201) {
            System.out.println("Saldo: " + s + ", Crédito: Nenhum");
        } else if (s < 401) {
            c = s * 0.2;
            System.out.println("Saldo: " + s + ", Crédito: " + c);
        } else if (s < 601) {
            c = s * 0.3;
            System.out.println("Saldo: " + s + ", Crédito: " + c);
        } else {
            c = s * 0.4;
            System.out.println("Saldo: " + s + ", Crédito: " + c);
        }

    }

}
