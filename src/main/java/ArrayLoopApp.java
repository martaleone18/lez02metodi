
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tss
 */
public class ArrayLoopApp {

    static int[] movs;
    static int max_moves = 6;
    static int saldo = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        movs = new int[max_moves];
        //movs [0]= 200;
        //movs [1] = -50;
        //int val = movs [0];

        //fase input dati
        getMovs();
        // fase elaborazione dati
        //calcolo del saldo
        saldo = preparaSaldo();
        //fase output
        printOutput();

    }

    static int preparaSaldo() {
        int newsaldo = 0;
        for (int i = 0; i < movs.length; i++) {
            newsaldo = newsaldo + movs[i];
        }
        return newsaldo;

    }

    static void getMovs() {

        for (int i = 0; i < movs.length; i++) {
            movs[i] = mygetInt();

        }// fine fase input array movs

    }

    static void printOutput() {
        String output = "";
        //inizio fase lettura e conti vari

        for (int i = 0; i < movs.length; i++) {
            int nriga = i + 1;
            output += nriga + ":";
            //output += (i+1) + ":"
            if (movs[i] > 0) {
                output += "+" + movs[i] + "\n";

            } else {
                output += movs[i] + "\n";

            }

            output += "il saldo è di" + saldo;
            JOptionPane.showMessageDialog(null, output);
        }

    }

    static int mygetInt() {
        int ris = 0;
        boolean ok = false;
        while (ok == false) {
            try {

                String strmov = JOptionPane.showInputDialog("dimmi valore movimento (es. 0,1 o 250)");
                ris = Integer.parseInt(strmov);
                ok = true;

            } catch (Exception err) {
                ris = 0;
                JOptionPane.showMessageDialog(null, "hai scritto un valore errato e ti " + "è stato messo il valore 0");
            }
        }

        return ris;
    }

}
