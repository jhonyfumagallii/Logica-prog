package dowhileex2;

import java.util.Scanner;

public class DoWhileEx2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double acum = 0, media, numero, cont = 0;
        System.out.println("Digite o número que deseja fazer a média. Para o resultado, digite 0");
        numero = teclado.nextDouble();
        acum = acum + numero;
        do {
            System.out.println("Digite o proximo numero.");
            numero = teclado.nextDouble();
            acum = acum + numero;
            cont++;
        } while (numero != 0);
        media = acum / cont;
        System.out.println("Foram digitados " + cont + " Numeros. Média: " + media);
    }

}
