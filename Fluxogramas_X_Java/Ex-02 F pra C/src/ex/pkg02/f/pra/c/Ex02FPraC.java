package ex.pkg02.f.pra.c;
import java.util.Scanner;
public class Ex02FPraC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double F, C;
        System.out.println("Digite a temperatura em F");
        F = teclado.nextDouble();
        C = (F-32)/1.8;
        System.out.println("A temperatura em C é: " + C);
    }
}