package lacosderepeticao.ex1.pkgwhile;

public class LacosDeRepeticaoEx1While {

    public static void main(String[] args) {

        int numero = 0, cont = 0, resultado;
        while (numero < 11) {
            System.out.println("\nTabuada do: " + numero);
            while (cont < 11) {
                resultado = numero * cont;
                System.out.println(numero + " x " + cont + " = " + resultado);
                cont++;
            }
            numero++;
            cont = 0;
        }
    }

}
