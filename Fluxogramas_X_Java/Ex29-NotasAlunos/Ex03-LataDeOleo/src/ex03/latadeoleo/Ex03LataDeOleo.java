
package ex03.latadeoleo;
import java.util.Scanner;
public class Ex03LataDeOleo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double V, R, A;
        System.out.println("Digite o raio e a altura.");
        R = teclado.nextDouble();
        A = teclado.nextDouble();
        V = 3.14 * Math.pow(R, 2) * A;
        System.out.println("O volume da lata de óleo é " + V);

    }
    
}
