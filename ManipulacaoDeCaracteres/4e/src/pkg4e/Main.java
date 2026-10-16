package pkg4e;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String senha, tentativa;
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        long inicio, fim;

        System.out.print("Digite uma senha de 8 caracteres, com pelo menos um número: ");
        senha = teclado.nextLine();

        inicio = System.currentTimeMillis();

        for (int a = 0; a < caracteres.length(); a++) {
            for (int b = 0; b < caracteres.length(); b++) {
                for (int c = 0; c < caracteres.length(); c++) {
                    for (int d = 0; d < caracteres.length(); d++) {
                        for (int e = 0; e < caracteres.length(); e++) {
                            for (int f = 0; f < caracteres.length(); f++) {
                                for (int g = 0; g < caracteres.length(); g++) {
                                    for (int h = 0; h < caracteres.length(); h++) {

                                        tentativa = "" + caracteres.charAt(a)
                                                + caracteres.charAt(b)
                                                + caracteres.charAt(c)
                                                + caracteres.charAt(d)
                                                + caracteres.charAt(e)
                                                + caracteres.charAt(f)
                                                + caracteres.charAt(g)
                                                + caracteres.charAt(h);

                                        if (tentativa.equals(senha)) {
                                            boolean temNumero = false;

                                            for (int i = 0; i < tentativa.length(); i++) {
                                                if (tentativa.charAt(i) >= '0'
                                                        && tentativa.charAt(i) <= '9') {
                                                    temNumero = true;
                                                }
                                            }

                                            if (temNumero) {
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
                }
            }
        }
    }
}
