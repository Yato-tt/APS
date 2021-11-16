
package Controller;

public class ShellSort {
      static ResultadoShell sortS(int[] vetorS){      
        int trocasS = 0;
        int h = 1;
        int n = vetorS.length;
        while(h < n){
            h = h * 3 + 1;   
        }
        h = (int) Math.floor(h / 3);
        
        int passou, j;
        while(h > 0){
            for(int i = h; i < n; i++){
               passou = vetorS[i];
               j = i;
               while(j >= h && vetorS[j - h] > passou){
                   vetorS[j] = vetorS[j - h];
                   j = j - h;
                   trocasS++;
               }
               vetorS[j] = passou;
               trocasS++;
            }
            h = h / 2;
            }       
            return new ResultadoShell(vetorS, trocasS);
        }
    }

