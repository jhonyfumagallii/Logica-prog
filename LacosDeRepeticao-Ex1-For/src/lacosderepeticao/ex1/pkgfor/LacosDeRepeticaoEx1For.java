package lacosderepeticao.ex1.pkgfor;

public class LacosDeRepeticaoEx1For {

    public static void main(String[] args) {
        int resultado = 0;
        for (int cont = 0; cont < 11; cont++) {
            System.out.println("\nTabuada do " + cont);
            for (int numero = 0; numero < 11; numero++) {
                resultado = cont * numero;
                System.out.println(cont + " x " + numero + " = " + resultado);
            }
        }
    }

}
