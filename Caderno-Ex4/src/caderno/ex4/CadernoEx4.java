
package caderno.ex4;
import java.util.Scanner;
public class CadernoEx4 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        int numero, cont=0, zero=0, posi=0, neg=0;
        while (cont<10){
            cont++;
            System.out.println("Insira um numero");
            numero = teclado.nextInt();
            if(numero==0){
                zero++;
            }
            if(numero<0){
                neg++;
            }
            if(numero>0){
                posi++;
            }
              
        }
        System.out.println("Negativo: "+ neg+ ", Positivo: "+posi+", Zero: "+zero);
    }
    
}
