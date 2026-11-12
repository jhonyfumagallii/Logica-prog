package ex01;

public class Ex01 {

    static void num(int n) {
        System.out.println(n);
        if (n != 100) {
            num(n + 1);
        }
    }

    public static void main(String[] args) {
        num(0);
    }

}
