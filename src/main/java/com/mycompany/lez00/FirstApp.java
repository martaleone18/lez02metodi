/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez00;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class FirstApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        prima preparo le variabili che mi servono 
        poi chiedo all'utente vari dati per riempirle
        poi elaboro in risultato l'output con il prezzofinale calcolato
        poi gestisco output
        
         */
        // fase 1 dichiarazione variabile
        System.out.println("1234");
        String nomefornito; // nome cliente
        String frasesaluto = "Benvenuto"; // testo di benvenuto
        String risultato = " "; // variabile per l'output finale da spedire
        int sogliacontanti = 3000;
        int sogliacarta = 5000;

        int sogliaspesespedizione = 1000;
        int costospedizione = 50;

        int costopackaging = 5;
        String msgSpedizione;
        float qta;
        float perc;
        float prezzo;
        float prezzofinale; // contiene in float l'elaborazione per il calcolo prezzi 
        int cod;

        // fase 2 input utente
        String strprezzo = JOptionPane.showInputDialog("dimmi il prezzo");
        // converto il prezzo in float
        prezzo = Float.parseFloat(strprezzo);
        String strqta = JOptionPane.showInputDialog("dimmi la quantità");
        qta = Float.parseFloat(strqta);
        String strperc = JOptionPane.showInputDialog("dimmi lo sconto");
        perc = Float.parseFloat(strperc);
       
        try{
        String strcod = JOptionPane.showInputDialog("dimmi codice tipo cliente (es. 1, o 3)");
        cod = Integer.parseInt(strcod);
        }
        catch (Exception err){
            cod = 1;
            JOptionPane.showMessageDialog(null,"hai scritto un cod errato e ti " + "è stato messo il cod 1 di fornitore locale");
        } 
            
        // fase 3 
        // calcolo prezzo finale con sconto e prezzi richiesti
        prezzofinale = prezzo * qta - (prezzo * qta * perc / 100);
        // se prezzo finale minore di sogliaspesepsedizione allora aggiungo al prezzo finale il costo di spedizione
        // altrimenti non faccio nulla
        if (prezzofinale < sogliaspesespedizione) {
            // aggiungo spese

            prezzofinale += costospedizione + costopackaging * qta;

            // preparo messaggio spese
            msgSpedizione = "Applicato costo di spedizione di " + costospedizione
                    + "€ perchè inferiore a spesa minima di" + sogliaspesespedizione + "€ packging";
        } else {
            msgSpedizione = "Nessun costo di spedizione applicato " + costospedizione
                    + "€ perchè hai superato la spesa di" + sogliaspesespedizione + "€";
        }

        nomefornito = JOptionPane.showInputDialog("dimmi un nome");
        // preparo risultato
        risultato = frasesaluto;
        risultato = risultato + " ";
        risultato = risultato + nomefornito;
        // aggiungo riga prezzofinale
        risultato += "\nmi devi" + prezzofinale + "euro";
        // mostro in output risultato

        // se prezzofinale sotto soglia contanti messaggio ok
        // altrimenti messagggio  bonifico
        if (prezzofinale <= sogliacontanti) {
            risultato += "\npuoi pagare anche in contanti";

        } else { //caso > 3000
            // devo capire  se usare carta o bonifico
            if (prezzofinale > sogliacontanti && prezzofinale < sogliacarta) {
                risultato += "\npuoi pagare solo con bonifico o carta";

            } else {
                risultato += "\npuoi pagare solo con bonifico";

            }
        }

        risultato += "\n" + msgSpedizione;
        if ((qta > 50 || prezzofinale > 2000) && perc > 0) {
            risultato += "\ncliennte gold";
        } else {
            risultato += "\ncliente basic";

        }
        String msgCod;
        switch (cod) {
            case 1:
                msgCod = "\nFornitore locale";
                break;
            case 2:
                msgCod = "\nFornitore estero";

                break;
            default:
                msgCod = "\nFornitore altro";
        }
        risultato += msgCod;

        JOptionPane.showMessageDialog(null, risultato);

        // TODO code application logic here
    }

}
