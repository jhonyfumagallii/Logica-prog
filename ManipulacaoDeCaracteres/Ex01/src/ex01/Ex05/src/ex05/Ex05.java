package ex05;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String ano;
        int Ano;
        System.out.println("Insira o ano no formato“dd/mm/aaaa” ou “dd/mm/aa”");
        ano = teclado.nextLine();
        String resp[] = ano.split("/");
        Ano = Integer.parseInt(resp[2]);
        Ano++;
        System.out.println("O proximo ano será " + resp[0] + "/" + resp[1] + "/" + Ano);
    }

}
