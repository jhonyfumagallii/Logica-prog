package ex05;

public class Ex05 {

    static void notas(double n1, double n2, double n3, char a) {
        if (a == 'A') {
            double media = (n1 + n2 + n3) / 3;
            System.out.println(media);
        } else if (a == 'P') {
            double media = ((n1 * 5) + (n2 * 3) + (n3 * 2)) / 10;
            System.out.println(media);
        }
    }

    public static void main(String[] args) {
        notas(1, 2, 3, 'P');
    }

}
