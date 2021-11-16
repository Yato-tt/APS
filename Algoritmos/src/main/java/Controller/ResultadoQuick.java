package Controller;

public class ResultadoQuick {
    int[] vetorQ;
    int trocasQ;
    
public ResultadoQuick(int[] vetorQ, int trocasQ){
    this.trocasQ = trocasQ;
    this.vetorQ = vetorQ;
    }

    public int[] getVetorQ() {
        return vetorQ;
    }

    public int getTrocasQ() {
        return trocasQ;
    }
}
