/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myfirstapp;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class MyFirstApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // fase 1 dichiarazione variabili
        //cognome e nome dell'utente
        //età dell'utente
        String cognomefornito;
        String nomefornito;
        Float eta;
        String risultato = " ";
        int tesserasocio = 25;
        int quotatessera = 10;

        //fase 2 input dell'utente
        cognomefornito = JOptionPane.showInputDialog("dimmi il tuo cognome");

        nomefornito = JOptionPane.showInputDialog("dimmi il tuo nome");

        String streta = JOptionPane.showInputDialog("dimmi la tua eta");
        //converto l'eta in float
        eta = Float.parseFloat(streta);

        //fase 3 calcolo messaggio finale
        risultato = risultato + " ";
        risultato += cognomefornito;
        risultato = risultato + " ";
        risultato += nomefornito;
        risultato = risultato + " ";
        risultato += " di anni " + eta;

        if (eta <= tesserasocio) {
            risultato += "\nottieni la tessera socio gratuitamente";
        } else {
            risultato += "\nnecessario pagare una quota fissa di" + " " + "€" + " " + quotatessera + " "
                    + "per ottenemare tessera socio";
        }

        //mostro in output il messaggio
        JOptionPane.showMessageDialog(null, risultato);

    }

}
