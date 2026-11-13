package ex03;

public class Ex03 {

    static void seg(int s) {
        int h = s / 3600;
        s = s % 3600;
        int m = s / 60;
        s = s % 60;
        System.out.println("H: " + h);
        System.out.println("M: " + m);
        System.out.println("S: " + s);
    }

    public static void main(String[] args) {
        seg(3659);
    }

}
