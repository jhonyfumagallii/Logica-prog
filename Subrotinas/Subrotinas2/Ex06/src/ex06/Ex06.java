package ex06;

public class Ex06 {

    static int[] inversao(int numeroVet[]) {
        int inversao[] = new int[4];
        int cont = 3;
        for (int i = 0; i < 4; i++) {
            inversao[i] = numeroVet[cont];
            cont--;
        }
        return inversao;
    }

    public static void main(String[] args) {
        int[] vet = {1, 7, 3, 4};
        System.out.print("Inversao: ");
        vet = inversao(vet);
        for (int i = 0; i < 4; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println("");
    }

}
