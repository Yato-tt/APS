package Controller;

public class QuickSort {

    static int trocasQ = 0;

    public static ResultadoQuick sortQ(int[] vetorQ, int esq, int dir) {
        if (esq < dir) {
            int p = particao(vetorQ, esq, dir);
            sortQ(vetorQ, esq, p);
            sortQ(vetorQ, p + 1, dir);
        }
        return new ResultadoQuick(vetorQ, trocasQ);
    }

    static int particao(int[] vetorQ, int esq, int dir) {
        int meio = (int) (esq + dir) / 2;
        int pivot = vetorQ[meio];
        int i = esq - 1;
        int j = dir + 1;
        while (true) {
            do {
                i++;
            } while (vetorQ[i] < pivot);
            do {
                j--;
            } while (vetorQ[j] > pivot);
            if (i >= j) {
                return j;
            }
            int aux = vetorQ[i];
            vetorQ[i] = vetorQ[j];
            vetorQ[j] = aux;
            trocasQ++;
        }
    }
}