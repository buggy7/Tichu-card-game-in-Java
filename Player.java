/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichu;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lefteris
 */
public class Player {
    private boolean callTichu;
    private boolean callGrandTichu;
    private boolean finishedFirst;
    private int playerPoints;
    private int remainingCards;
    private String name;
    private Card[] playerCards;
    private Trick trick;

    /**
    *
    * @param name 
    */
    public Player(String name){
         this.playerPoints = 0;
         this.playerCards = new Card[14];
         this.trick = new Trick();
         this.remainingCards = 14;
         this.name = name;
         this.callGrandTichu = false;
         this.callTichu = false;
         this.finishedFirst = false;
    }
    
    /**
     *
     * @param name
     */
    public void resetPlayer(String name){
         this.playerPoints = 0;
         this.playerCards = new Card[14];
         this.trick = new Trick();
         this.remainingCards = 14;
         this.name = name;
         this.callGrandTichu = false;
         this.callTichu = false;
         this.finishedFirst = false;
    }
    
    private boolean findCard(){
        
        for (int i=0;i<14;i++){
            if(this.playerCards[i] != null){
                if(TICHU.wish==this.playerCards[i].getNumber())
                    return true;
            }
           
        }
        return false;
        
    }
    
    /**
     *
     * @return
     */
    public Trick getTrick(){
        return this.trick;
    }
    
    /**
     *
     * @return
     */
    public Card[] getPlayerCards(){
        return this.playerCards;
    }
    
    /**
     *
     * @return
     */
    public String getName(){
        return this.name;
    }
    
    /**
     *
     * @return
     */
    public int getRemainingCards(){
        return this.remainingCards;
    }
    
    /**
     *
     * @return
     */
    public int getPlayerPoints(){
        return this.playerPoints;
    }
    
    /**
     *
     * @param newCards
     */
    public void setRemainingCards(int newCards){
        this.remainingCards = this.remainingCards - newCards;
    }
    
    /**
     *
     */
    public void resetRemainingCards(){
        this.remainingCards = 14;
    }
    
    /**
     *
     * @param newPoints
     */
    public void setPlayerPoints(int newPoints){
        this.playerPoints += newPoints;
    }
    
    /**
     *
     */
    public void resetPLayerPoints(){
        this.playerPoints = 0;
    }
    
    /**
     *
     * @return
     */
    public boolean getTichu(){
        return this.callTichu;
    }
    
    /**
     *
     * @return
     */
    public boolean getGrandTichu(){
        return this.callGrandTichu;
    }
    
    /**
     *
     * @return
     */
    public boolean getFinishedFirst(){
        return this.finishedFirst;
    }
    
    /**
     *
     * @param bool
     */
    public void setTichu(boolean bool){
        this.callTichu = bool;
    }
    
    /**
     *
     * @param bool
     */
    public void setGrandTichu(boolean bool){
        this.callGrandTichu = bool;
    }
    
    /**
     *
     * @param bool
     */
    public void setFinishedFirst(boolean bool){
        this.finishedFirst = bool;
    }
    
    
   
    
    /**
     *
     * @param unsortedArray
     * @param length
     */
    public void sortCards(Card[] unsortedArray , int length){
        int counter;
        int index;
        Card temp;
        for(counter = 0 ; counter < (length-1) ; counter++) {//Loop once for each element in the array.
            for(index = 0 ; index < (length-1-counter) ; index++) {//Once for each element, minus the counter.
                if(unsortedArray[index].getNumber() > unsortedArray[index + 1].getNumber()) {//Test if need a swap or not.
                    temp = unsortedArray[index];//These three lines just swap the two elements:
                    unsortedArray[index] = unsortedArray[index + 1];
                    unsortedArray[index + 1] = temp;
                }
            }
        }
     }
    /**
     *
     * @param lastTrick
     * @throws IOException
     */
    public void playTrick(Trick lastTrick) throws IOException{
       
        
        String[] str;
        //------Edw perimenoume na pesei enas swstos sundiasmos-------------
        while(this.trick.getName().equals("null")){
            TICHU.check=false;
            TICHU.input="";
            
            //------------Edw to programma perimnei to xristi na kanei mia energeia p.x. Play/Pass----------
            while(!TICHU.check){
                
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            //--------------------------------------------------------------------------
            
            //---------Edw elegxoume an 8eloume na ksekinisoume kainourio paixnidi----------
            if("new".equals(TICHU.input)){
                return;
            }
            //------------------------------------
            
            
            str = TICHU.input.split(" ");
            
            
            this.trick.setDroppedCards(str.length);
            
            //-------------Elegxos se periptosi Pass-----------------
            if(str[0].equals("pass")){
                
               //--------------Elegxos gia ekplirwsi euxhs-----------------------
               if(lastTrick.getName().equals("oneCard")){
                    if(TICHU.wish != 0){
                        if(this.findCard()){
                            if(lastTrick.getDroppedCards()[0].getNumber() < TICHU.wish){
                                this.trick.setName("null");
                                System.out.println("You have to fullfill the wish");
                                continue;
                            }
                        }

                    }
                }
               //-------------------------------------------------------
               
                this.trick.setName("pass");
                /*------elegxei an o paiktis ksekinaei ena kainourio trick se autin tin periptosi
                           den mporei na pei paso---------------*/
               if(lastTrick.getName().equals("null")){
                        this.trick.setName("null");
                        System.out.println("YOU SHALL NOT PASS, please Play again");
                        continue;
                }
               //--------------------------
                return;//--ama to paso isxuei epistrefei
            }
            //------------------------------telos elegxou gia paso-------------------------
            
            //-----------------Elegxoi gia Play-----------------
            //-----Metafora stoixeiwn ton karton pou paixtikan apo tis kartes tou paixtoi stis kartes pou erikse--------
            for(int j = 0 ; j<str.length ; j++){
                for(int i = 0 ; i<14 ; i++){
                    if(this.playerCards[i] != null){
                        if(str[j].equals(this.playerCards[i].getName())){
                            this.trick.getDroppedCards()[j] = new Card(this.playerCards[i].getNumber() , this.playerCards[i].getColor() , this.playerCards[i].getPoints());
                            this.trick.getDroppedCards()[j].setName(this.playerCards[i].getName());
                        }
                    }
                }
            }
            //----------------------------------------------------------
            
            this.trick.sortDroppedCards(this.trick.getDroppedCards() , str.length);//sortarisma ton kartwn
            this.trick.checkTrick();//elegxos an einai kapoios egyros sundiasmos
            
            //----------------elegxws an uparxei kapoio trick sto trapezi---------------
            if(!lastTrick.getName().equals("null")){
                //----elegxos an to trick pou paixtike einai antoistoixo tou idi uparxontos--------------
                if(lastTrick.getName().equals(this.trick.getName())){
                    
                    //---elegxos ekplirosis eyxhs---------
                    if(lastTrick.getName().equals("oneCard") || lastTrick.getName().equals("null")){
                        if(TICHU.wish != 0){
                            if(this.findCard()){
                                if(lastTrick.getDroppedCards()[0].getNumber() < TICHU.wish
                                        && this.trick.getDroppedCards()[0].getNumber() != TICHU.wish){
                                    this.trick.setName("null");
                                    System.out.println("You have to fullfill the wish");
                                    continue;
                                }else{
                                    TICHU.wish = -1;
                                }
                            }
                            
                        }
                    }
                    //---telos elegxou euxhs------
                    
                    //---eidikos elegxos gia periptosou full house elegxete i timi tis 3is kartas----
                    if(lastTrick.getName().equals("fullHouse")){
                        if(this.trick.getDroppedCards()[2].getNumber() <= lastTrick.getDroppedCards()[2].getNumber()){
                            this.trick.setName("null");
                            System.out.println("Invalid trick play again");
                            continue;
                        }
                    }//----gia ola ta alla o elegxos einai idios elegxete i timi tis prwtis kartas-------
                    else if(this.trick.getDroppedCards()[0].getNumber() <= lastTrick.getDroppedCards()[0].getNumber()){
                        //----elegxoi gia eidikes kartes----------
                        if(this.trick.getName().equals("oneCard") && this.trick.getDroppedCards()[0].getName().equals("phoenix")
                         && !lastTrick.getDroppedCards()[0].getName().equals("dragon")){
                            this.trick.getDroppedCards()[0].setNumber(lastTrick.getDroppedCards()[0].getNumber());
                        }else{
                            this.trick.setName("null");
                            System.out.println("Invalid trick play again");
                            continue;
                        }
                        
                    }//----elegxoi gia vomves----------
                }else if(this.trick.getName().equals("quads")){
                    if(lastTrick.getName().equals("quads")){
                        if(this.trick.getDroppedCards()[0].getNumber() < lastTrick.getDroppedCards()[0].getNumber()){
                            this.trick.setName("null");
                            System.out.println("Invalid trick play again");
                            continue;
                        }
                    }
                    if(lastTrick.getName().equals("straightFlush")) {
                        this.trick.setName("null");
                        System.out.println("Invalid trick play again");
                        continue;
                    }
                    
                }else if(this.trick.getName().equals("straightFlush")){
                    if(lastTrick.getName().equals("straightFlush")){
                        if(lastTrick.getDroppedCards().length > this.trick.getDroppedCards().length){
                            this.trick.setName("null");
                            System.out.println("Invalid trick play again");
                            continue;
                        }
                        if(lastTrick.getDroppedCards().length == this.trick.getDroppedCards().length){
                            if(lastTrick.getDroppedCards()[0].getNumber() >= this.trick.getDroppedCards()[0].getNumber()){
                                this.trick.setName("null");
                                System.out.println("Invalid trick play again");
                                continue;
                            }
                        }
                    }//----------telos elegxwn gia vomva--------------

                }else{//---to trick einai diaforetikou tupou apo to idi uparxon opote zeiteite na kanapaikseis---
                
                    this.trick.setName("null");
                    System.out.println("Invalid trick play again");
                    continue;
                }
            }
            
            //--------------------------------------------------------------------------
            
            //---afairesi twn kartwn pou paixtikan apo ton paixti------ 
            if(!this.trick.getName().equals("null")){
                for(int j = 0 ; j<str.length ; j++){
                    for(int i = 0 ; i<14 ; i++){
                        if(this.playerCards[i] != null){
                            if(str[j].equals(this.playerCards[i].getName())){
                                this.playerCards[i] = null;
                                
                                
                            }
                        }
                    }
                }
            }
            //----telos efaireseis kartwn---------------
            
            if(this.trick.getName().equals("null")) {
                continue;
            }
            //---afairesi ari8mou kartwn apo ton paixti-----
            this.setRemainingCards(this.trick.getDroppedCards().length);
            
        }
    }
    
    
    
}

