package provaimparex1;

import java.util.Scanner;

public class ProvaImparEx1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        double idade, peso;
        System.out.println("Insira o nome");
        nome = teclado.nextLine();
        System.out.println("Insira a idade");
        idade = teclado.nextDouble();
        System.out.println("Insira o peso");
        peso = teclado.nextDouble();
        if (idade >= 0 && idade <= 12) {
            if (peso >= 0 && peso <= 35) {
                System.out.println("Nome: " + nome + ". Super junior.");
            } else {
                System.out.println("Nome: " + nome + ". Infantil.");
            }
        } else if (peso >= 0 && peso <= 35) {
            System.out.println("Nome: " + nome + ". Competidor.");
        } else {
            System.out.println("Nome: " + nome + ". Master.");
        }
    }

}
