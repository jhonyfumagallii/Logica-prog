
package caderno.ex5.dowhile;
import java.util.Scanner;
public class CadernoEx5DoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double cont = 0, media, acum = 0, nota;
        String nome;
        do {
            cont++;
            System.out.println("\nInsira o nome");
            nome = teclado.nextLine();
            System.out.println("Insira a nota 1");
            nota = teclado.nextDouble();
            acum = acum + nota;
            System.out.println("Insira a nota 2");
            nota = teclado.nextDouble();
            acum = acum + nota;
            System.out.println("Insira a nota 3");
            nota = teclado.nextDouble();
            acum = acum + nota;
            System.out.println("Insira a nota 4");
            nota = teclado.nextDouble();
            acum = acum + nota;
            media = acum / 4;
            teclado.nextLine();
            System.out.println("Nome: " + nome + " Media: " + media);
            media = 0;
            nota = 0;
            acum = 0;
        } while (cont <= 35);
    }
    
}
