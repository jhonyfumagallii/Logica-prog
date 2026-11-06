package ex02;
import java.util.Scanner;
public class Ex02 {
    static int total(int a, int b){
        int maior, menor, resp=0;
        if (a>b) {
            maior = a;
            menor = b+1 ;
        } else{
            maior = b;
            menor = a+1;
        }
        for (; menor < maior; menor++) {
            resp += menor;
        }
        return resp;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2;
        System.out.println("Insira o n1");
        n1 = teclado.nextInt();
        System.out.println("Insira o n2");
        n2 = teclado.nextInt();
        System.out.println(total(n1,n2));
    }
    
}
