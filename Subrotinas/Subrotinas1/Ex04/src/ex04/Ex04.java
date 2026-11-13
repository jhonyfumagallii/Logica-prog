package ex04;

public class Ex04 {

    static void triangulo(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && a == c && b == c) {
                System.out.println("Eh um triangulo equilatero");
            } else if (a == b && a != c || a == c && a != b || c == b && c != a) {
                System.out.println("Eh um triangulo Isosceles");
            } else {
                System.out.println("Eh um triangulo Escaleno");
            }
        } else {
            System.out.println("Nao eh um triangulo");
        }
    }

    public static void main(String[] args) {
        triangulo(2, 3, 4);

    }

}
