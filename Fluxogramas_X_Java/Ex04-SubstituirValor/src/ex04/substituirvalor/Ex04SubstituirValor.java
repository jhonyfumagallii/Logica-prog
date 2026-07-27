package ex04.substituirvalor;
import java.util.Scanner;
public class Ex04SubstituirValor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double A, B, temp;
        System.out.println("Digite os valores A e B");
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        temp = A;
        A = B;
        B = temp;
        System.out.println("B é " + B + ", A é " + A);
            
                
    }
    
}
