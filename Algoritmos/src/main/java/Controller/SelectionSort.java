package Controller;

public class SelectionSort {
    public static ResultadoSelection sortSele(int[] vetorSe){
        
            int trocasSe = 0;
            int menor, aux;
            
            for(int i = 0; i < vetorSe.length; i++){
                menor = i;
                for(int j = i+1; j < vetorSe.length; j++){
                if(vetorSe[j] < vetorSe[menor]){    
                   menor = j;  
                }
            }
                aux = vetorSe[menor];
                vetorSe[menor] = vetorSe[i];
                vetorSe[i] = aux;
                trocasSe++;
            }
            
        return new ResultadoSelection(vetorSe, trocasSe);      
    }        
}                               

