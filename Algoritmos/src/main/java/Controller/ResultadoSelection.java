package Controller;

public class ResultadoSelection {
    int[] vetorSe;
    int trocasSe;
    
    public ResultadoSelection(int[] vetorSe, int trocasSe){
        this.vetorSe = vetorSe;
        this.trocasSe = trocasSe;
    }

    public int[] getVetorSe() {
        return vetorSe;
    }

    public int getTrocasSe() {
        return trocasSe;
    }
}
