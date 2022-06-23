package main;

import javax.swing.*;

public class GameWindow  {
    private JFrame jFrame;
    //constructor
    public GameWindow(){
        jFrame=new JFrame();
        /**
         * Metodo per settare la size della finestra
         */
        jFrame.setSize(400,400);


        /**
         * metodo che permette di chiudere l'operazione se chiudi la finestra
         * a seconda dell'integer passato fa diverse operazioni
         */
        jFrame.setDefaultCloseOperation(3);

        /**
         * metodo per vedere la finestra,è settata di default a false altrimenti
         * setVisible è un metodo che deve stare sempre SOTTO !!
         * Altrimenti potresti avere problemi
         */
        jFrame.setVisible(true);



    }
}
