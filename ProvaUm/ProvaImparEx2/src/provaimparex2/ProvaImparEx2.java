package provaimparex2;

import java.util.Scanner;

public class ProvaImparEx2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double idade1, idade2, media;
        String nome1, nome2;
        System.out.println("Insira o nome da primeira pessoa");
        nome1 = teclado.nextLine();
        System.out.println("Insira a idade da primeira pessoa");
        idade1 = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Insira o nome da segunda pessoa");
        nome2 = teclado.nextLine();
        System.out.println("Insira a idade da segunda pessoa");
        idade2 = teclado.nextDouble();
        media = (idade1 + idade2) / 2;
        if (idade1 < idade2) {
            System.out.println("Pessoa mais jovem: " + nome1 + ". Media de idades: " + media);
        } else if (idade2 < idade1) {
            System.out.println("Pessoa mais jovem: " + nome2 + ". Media de idades: " + media);
        } else {
            System.out.println("Mesma idade. Media de idades: " + media);
        }
    }

}
