package ex01;
import java.util.Scanner;
public class Ex01 {
    static int total(int a, int b){
    int resp = a*b;
    return resp;
    }
    
    public static void main(String[] args) {
        int n1, n2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o 1 numero");
        n1 = teclado.nextInt();
        System.out.println("Insira o 2 numero");
        n2 = teclado.nextInt();
        System.out.println("Total: "+total(n1, n2));
    }
    
}
