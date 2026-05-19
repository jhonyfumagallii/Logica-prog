package ex05.volumecaixa;
import java.util.Scanner;
public class Ex05VolumeCaixa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double C, L, A, V;
        System.out.println("Informe o comprimento, a largura e a altura da caixa.");
        C = teclado.nextDouble();
        L = teclado.nextDouble();
        A = teclado.nextDouble();
        V = C * L * A;
        System.out.println("O volume é " + V);
    }
    
}
