/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez02_metodi;

/**
 *
 * @author tss
 */
public class AppMetodi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* 
       // chiedere un numero e stamparne il quadrato
        //chiedere il prezzo e lo sconto e stamparne il risultato

         int valore1= Utils.askInt("dimmi la quantità", 1,100);
        float valore2 = Utils.askFloat("dimmi il peso caduno", 0,20);
        //faccio il quadrato
        float ris = valore1*valore2;
        //faccio stampare il nuovo valore
        System.out.println("peso totale =" + ris);
          float prezzo = Utils.askFloat("dimmi il prezzo in euro (es.50 o 99.99)", 0,2000);
        float sconto = Utils.askFloat("dimmi lo sconto % (es.20 o 33.33)", 0,100);
        float prezzoscontato = Utils.calcolaSconto(prezzo,sconto);
        String vistx = "prezzo =" +prezzo + "\n";
         vistx += "sconto =" +sconto + "\n";
        vistx += "prezzoscontato =" +prezzoscontato + "\n";
         System.out.println(vistx);
        float prezzoiva = Utils.askFloat("dimmi il prezzo in euro (es.50 o 100)", 0, 2000);
        float iva = Utils.askFloat("dimmi l'iva % (es.20 o 30.50)", 0, 100);

        float prezzoscorporato = Utils.scorporoPercentuale(prezzoiva, iva);
        String ivax = "prezzo =" + prezzoiva + "\n";
        ivax += "iva =" + iva + "\n";
        ivax += "prezzoscorporato =" + prezzoscorporato + "\n";

        System.out.println(ivax);

        String rx = Utils.aggiungiACapo(vistx, ivax);
       /System.out.println(rx);
         */

        int numvoti = Utils.askInt("quanti alunni", 1, 30);
        int[] listavoti;
        listavoti = Utils.caricaVoti(numvoti);
String testoTabellone =Utils.creaTabellone (listavoti);
        System.out.println(testoTabellone);
        
        
        listavoti = Utils.caricaVoti(numvoti);
String testoTabelloneHTML =Utils.creaTabelloneHTML (listavoti);
        System.out.println(testoTabelloneHTML);
        
    }

    
}
