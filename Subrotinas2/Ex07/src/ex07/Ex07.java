package ex07;

public class Ex07 {

    static int[] repetido(int numVet[]) {
        int cont;
        int[] vet2 = new int[numVet.length];
        int pos = 0;

        for (int i = 0; i < numVet.length; i++) {
            cont = 0;

            for (int j = 0; j < i; j++) {
                if (numVet[i] == numVet[j]) {
                    cont++;
                }
            }

            if (cont == 0) {
                vet2[pos] = numVet[i];
                pos++;
            }
        }

        int[] vet3 = new int[pos];
        for (int i = 0; i < pos; i++) {
            vet3[i] = vet2[i];
        }
        return vet3;
    }

    public static void main(String[] args) {
        int numero[] = new int[]{1, 2, 1, 4, 4, 5};
        numero = repetido(numero);
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }
    }

}
