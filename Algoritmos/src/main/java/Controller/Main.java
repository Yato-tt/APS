package Controller;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String opc;
        boolean ord = true;

        while (ord) {

            //Tela
            opc = (JOptionPane.showInputDialog(null, "Digite:\n 1 - Shell Sort & Quick Sort \n 2 - Seleciton Sort & Shell Sort \n 3 - Quick Sort & Selection Sort \n 4 - Encerrar:"));

            int[] vetorS = new int[10];

            for (int i = 0; i < vetorS.length; i++) {
                vetorS[i] = (int) Math.floor(Math.random() * vetorS.length);
            }

            int[] vetorQ = new int[15000];

            for (int i = 0; i < vetorQ.length; i++) {
                vetorQ[i] = (int) Math.floor(Math.random() * vetorQ.length);
            }

            int[] vetorSe = new int[15000];

            for (int i = 0; i < vetorSe.length; i++) {
                vetorSe[i] = (int) Math.floor(Math.random() * vetorSe.length);
            }

            /*System.out.println("\n\nDesordenado");
            for (int i = 0; i < vetorS.length; i++) {
                System.out.print(vetorS[i] + " ");
            }*/
            ResultadoShell rShell;

            long inicioShell, fimShell;

            ResultadoQuick rQuick;

            long inicioQuick, fimQuick;

            ResultadoSelection rSelection;

            long inicioSelection, fimSelection;

            switch (opc) {
                case "1":
                    System.out.println("\n\nDesordenado");
                    for (int i = 0; i < vetorS.length; i++) {
                        System.out.print(vetorS[i] + " ");
                    }

                    inicioShell = System.currentTimeMillis();
                    
                    rShell = ShellSort.sortS(vetorS.clone());
                    System.out.println("\n\nOrdenado");
                    for (int i = 0; i < vetorS.length; i++) {
                        System.out.print(vetorS[i] + " ");
                    }
                    fimShell = System.currentTimeMillis();

                    inicioQuick = System.currentTimeMillis();
                    rQuick = QuickSort.sortQ(vetorQ.clone(), 0, vetorQ.length - 1);
                    fimQuick = System.currentTimeMillis();

                    JOptionPane.showMessageDialog(null, "\nShell Sort \nTempo: " + (fimShell - inicioShell) + " ms" + "\nTrocas: " + rShell.getTrocasS());
                    JOptionPane.showMessageDialog(null, "\nQuick Sort \nTempo: " + (fimQuick - inicioQuick) + "ms" + "\nTrocas: " + rQuick.getTrocasQ());
                    break;

                case "2":

                    inicioSelection = System.currentTimeMillis();
                    rSelection = SelectionSort.sortSele(vetorSe.clone());
                    fimSelection = System.currentTimeMillis();

                    inicioShell = System.currentTimeMillis();
                    rShell = ShellSort.sortS(vetorSe.clone());
                    fimShell = System.currentTimeMillis();

                    JOptionPane.showMessageDialog(null, "\nSelection Sort \nTempo: " + (fimSelection - inicioSelection) + " ms" + "\nTrocas: " + rShell.getTrocasS());
                    JOptionPane.showMessageDialog(null, "\nShell Sort \nTempo: " + (fimShell - inicioShell) + " ms" + "\nTrocas: " + rSelection.getTrocasSe());
                    break;

                case "3":

                    inicioQuick = System.currentTimeMillis();
                    rQuick = QuickSort.sortQ(vetorQ.clone(), 0, vetorQ.length - 1);
                    fimQuick = System.currentTimeMillis();

                    inicioSelection = System.currentTimeMillis();
                    rSelection = SelectionSort.sortSele(vetorQ.clone());
                    fimSelection = System.currentTimeMillis();

                    JOptionPane.showMessageDialog(null, "\nQuick Sort \nTempo: " + (fimQuick - inicioQuick) + "ms" + "\nTrocas: " + rQuick.getTrocasQ());
                    JOptionPane.showMessageDialog(null, "\nSelection Sort \nTempo: " + (fimSelection - inicioSelection) + " ms" + "\nTrocas: " + rSelection.getTrocasSe());
                    break;

                case "4":

                    JOptionPane.showMessageDialog(null, "Encerrando...");
                    ord = false;
                    break;
            }
        }
    }
}
