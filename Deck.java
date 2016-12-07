/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichu;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Lefteris
 */
public class Deck {
     private Card[] deck;
     /**
     *
     */
    public Deck(){
         this.deck = new Card[56];
         for(int i = 0 ; i<13 ; i++){
             deck[i] = new Card(i+2 , "green" , 0);
         }
         for(int i = 0 ; i<13 ; i++){
             deck[i + 13] = new Card(i+2 , "black" , 0);
         }
         for(int i = 0 ; i<13 ; i++){
             deck[i + 26] = new Card(i+2 , "blue" , 0);
         }
         for(int i = 0 ; i<13 ; i++){
             deck[i + 39] = new Card(i+2 , "red" , 0);
         }
         for(int i = 0 ; i<52 ; i++){
             if (this.deck[i].getNumber() == 5){
                 this.deck[i].setPoints(5);
             }
             if ((this.deck[i].getNumber() == 10) || (this.deck[i].getNumber() == 13)){
                 this.deck[i].setPoints(10);                
             }
         }
         this.deck[52] = new Card(20 , "dragon" , 25);
         this.deck[52].setName("dragon");
         this.deck[53] = new Card(-1 , "phoenix" , 20);
         this.deck[53].setName("phoenix");
         this.deck[54] = new Card(1 , "mahjong" , 0);
         this.deck[54].setName("mahjong");     
         this.deck[55] = new Card(-1 , "dogs" , 0);
         this.deck[55].setName("dogs");
         Random rgen = new Random();  // Random number generator
        //--- Shuffle by exchanging each element randomly
         for(int j = 0 ; j < 4 ; j++){
            for (int i = 0 ; i<this.deck.length ; i++) {
               int randomPosition = rgen.nextInt(this.deck.length);
               Card temp = this.deck[i];
               this.deck[i] = this.deck[randomPosition];
               this.deck[randomPosition] = temp;
            }
         }
      }
     /**
     *
     * @param player1
     * @param player2
     * @param player3
     * @param player4
     * @throws IOException  
     */
    public void dealCards(Player player1 , Player player2 , Player player3 , Player player4 , Interface face) throws IOException{
        int pos1 = 0;
        int pos2 = 0;
        int pos3 = 0;
        int pos4 = 0;
        for(int i = 0 ; i < 56 ; i++){
            if(i % 4 == 0){
                player1.getPlayerCards()[pos1] = this.deck[i];
                pos1++;
            }else if(i % 4 == 1){
                player2.getPlayerCards()[pos2] = this.deck[i];
                pos2++;
            }else if(i % 4 == 2){
                player3.getPlayerCards()[pos3] = this.deck[i];
                pos3++;
            }else{
                player4.getPlayerCards()[pos4] = this.deck[i];
                pos4++;
                if(pos4 == 8){
                    
                    player1.sortCards(player1.getPlayerCards() , 8);
                    player2.sortCards(player2.getPlayerCards() , 8);
                    player3.sortCards(player3.getPlayerCards() , 8);
                    player4.sortCards(player4.getPlayerCards() , 8);
                    askGrandTichu(player1,player2,player3,player4,face);
                }
            }
        }
    }
    /**
     *
     * @param player1
     * @param player2
     * @param player3
     * @param player4
     * @throws IOException
     */
    public void askGrandTichu(Player player1 , Player player2 , Player player3 , Player player4 , Interface face) throws IOException{
       // Gui k=new Gui();
        GrandTichu gr;
        //k.frame.setVisible(true);
       
        face.playButton.setEnabled(false);
        face.passButton.setEnabled(false);
        face.tichuButton.setEnabled(false);
        
        for(int j = 0 ; j<4 ; j++){
            if(j % 4 == 0){
                //k.mainWindow(player1.getPlayerCards(), player1);
                
                
              
                face.printPlayerCards(player1);
                
                
                
                gr = new GrandTichu();
                gr.setVisible(true);
                TICHU.check=false;
                TICHU.input="";
                while(!TICHU.check){

                   try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                if(TICHU.input.equals("yes")){
                    player1.setGrandTichu(true);
                    face.player1TichuGrTichu.setText("Gr.Tichu");
                }

            }else if(j % 4 == 1){
               // k.mainWindow(player2.getPlayerCards(), player2);
                
               
                face.printPlayerCards(player2);
                
                
                gr = new GrandTichu();
                gr.setVisible(true);
                TICHU.check=false;
                TICHU.input="";
                while(!TICHU.check){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                
                if(TICHU.input.equals("yes")){
                    player2.setGrandTichu(true);
                    face.player2TichuGrTichu.setText("Gr.Tichu");
                }

            }else if(j % 4 == 2){
                //k.mainWindow(player3.getPlayerCards(), player3);
              
                face.printPlayerCards(player3);
                
                gr = new GrandTichu();
                gr.setVisible(true);
                TICHU.check=false;
                TICHU.input="";
                while(!TICHU.check){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                
                if(TICHU.input.equals("yes")){
                    player3.setGrandTichu(true);
                    face.player3TichuGrTichu.setText("Gr.Tichu");
                }

            }else{
                //k.mainWindow(player4.getPlayerCards(), player4);
                face.printPlayerCards(player4);
               
                gr = new GrandTichu();
                gr.setVisible(true);
                TICHU.check=false;
                TICHU.input="";
                while(!TICHU.check){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                
                if(TICHU.input.equals("yes")){
                    player4.setGrandTichu(true);
                    face.player4TichuGrTichu.setText("Gr.Tichu");
                }
            }
            
            //k.rem(this.deck, player4);
        }
        //k.frame.dispose();
        
        
        face.playButton.setEnabled(true);
        face.passButton.setEnabled(true);
        face.tichuButton.setEnabled(true);
    }
}
    

