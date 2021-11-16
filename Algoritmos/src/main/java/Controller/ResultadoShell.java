package Controller;

public class ResultadoShell {
    int[] vetorS;
    int trocasS;
    
    public ResultadoShell(int[] vetorS, int trocasS) {
        this.trocasS = trocasS;
        this.vetorS = vetorS;
    }

    public int[] getVetorS() {
        return vetorS;
    }

    public int getTrocasS() {
        return trocasS;
    }   
}
