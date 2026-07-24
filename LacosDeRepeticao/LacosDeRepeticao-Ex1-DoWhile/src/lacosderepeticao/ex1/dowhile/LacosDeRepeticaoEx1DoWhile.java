package lacosderepeticao.ex1.dowhile;

public class LacosDeRepeticaoEx1DoWhile {

    public static void main(String[] args) {
        int cont = 0, numero = 0, resultado;
        do {
            System.out.println("\nTabuada do " + numero);
            do {
                resultado = numero * cont;
                System.out.println(numero + " x " + cont + " = " + resultado);
                cont++;
            } while (cont < 11);
            numero++;
            cont = 0;

        } while (numero < 11);
    }

}
