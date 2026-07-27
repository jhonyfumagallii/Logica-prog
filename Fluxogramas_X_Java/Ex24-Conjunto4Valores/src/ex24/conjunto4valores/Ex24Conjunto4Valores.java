package ex24.conjunto4valores;

import java.util.Scanner;

public class Ex24Conjunto4Valores {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int i;
        double a, b, c, maior=0, medio, menor;
        System.out.println("Digite 1 se quiser a ordem crescente, 2 em ordem decrescente e 3 se quiser que o maior numero fique entre os outros 3.");
        i = kb.nextInt();
        System.out.println("Insira os valores.");
        a = kb.nextInt();
        b = kb.nextInt();
        c = kb.nextInt();
        if (a >= b) {
            if (a >= c) {
                maior = a;
                if (b >= c) {
                    medio = b;
                    menor = c;
                } else {
                    medio = c;
                    menor = b;
                }
            } else {
                maior = c;
                medio = a;
                menor = b;
            }
        } else if (b >= c) {
            maior = b;
            if (a >= c) {
                medio = a;
                menor = c;
            } else {
                medio = c;
                menor = a;
            }
        } else {
            maior = c;
            medio = b;
            menor = a;
        }
        if (i == 1) {
            System.out.println("Os numeros em ordem crescente sao:" + menor + ", " + medio + ", " + maior + ".");
        }
        else if (i==2) {
           System.out.println("Os numeros em ordem decrescente sao:" + maior + ", " + medio + ", " + menor + "."); 
        }
        else if (i == 3) {
            System.out.println("Os numeros com o maior entre eles sao:" + menor + ", " + maior + ", " + medio + ".");
        }
        else {
            System.out.println("Digite uma opçao valida.");
        }
    }

}
