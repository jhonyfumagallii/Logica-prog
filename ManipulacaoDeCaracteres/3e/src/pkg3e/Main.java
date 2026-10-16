package pkg3e;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String senha, tentativa;
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        long inicio, fim;

        System.out.print("Digite uma senha de 4 letras: ");
        senha = teclado.nextLine();

        inicio = System.currentTimeMillis();

        for (int a = 0; a < letras.length(); a++) {
            for (int b = 0; b < letras.length(); b++) {
                for (int c = 0; c < letras.length(); c++) {
                    for (int d = 0; d < letras.length(); d++) {
                        tentativa = "" + letras.charAt(a) + letras.charAt(b)
                                + letras.charAt(c) + letras.charAt(d);

                        if (tentativa.equals(senha)) {
                            fim = System.currentTimeMillis();
                            System.out.println("Senha descoberta: " + tentativa);
                            System.out.println("Tempo: " + (fim - inicio) + " milissegundos");
                            return;
                        }
                    }
                }
            }
        }
    }
}
