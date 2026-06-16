package ex28.idadehomemmulher;

import java.util.Scanner;

public class Ex28IdadeHomemMulher {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade_masc1, idade_masc2, maior_masc, menor_masc, idade_fem1, idade_fem2, maior_fem, menor_fem, soma, produto;
        idade_masc1 = teclado.nextInt();
        idade_masc2 = teclado.nextInt();
        idade_fem1 = teclado.nextInt();
        idade_fem2 = teclado.nextInt();
        if (idade_masc1 > idade_masc2) {
            maior_masc = idade_masc1;
            menor_masc = idade_masc2;
        } else {
            maior_masc = idade_masc2;
            menor_masc = idade_masc1;
        }
        if (idade_fem1 > idade_fem2) {
            maior_fem = idade_fem1;
            menor_fem = idade_fem2;
        } else {
            maior_fem = idade_fem2;
            menor_fem = idade_fem1;
        }
        soma = maior_masc + menor_fem;
        produto = maior_fem * menor_masc;
    }

}
