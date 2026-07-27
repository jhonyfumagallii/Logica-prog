package ex5.pkgwhile;

import java.util.Scanner;

public class Ex5While {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont=0, temp1=1, temp2=1, resultado, enesimo;
        System.out.println("Insira o enesimo termo desejado.");
        enesimo = teclado.nextInt();
        while (cont<enesimo){
            System.out.print(temp1+ " ");
            resultado = temp1 + temp2;
            temp1=temp2;
            temp2 = resultado;
            cont++;
        }
        System.out.println();
    }
    
}
