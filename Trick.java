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
public class Trick{
    private Card[] droppedCards;
    private String name;
    
    /**
     *
     */
    public Trick(){
        this.droppedCards = new Card[0];
        this.name = "null";
    }
    
    /**
     *
     * @param numberOfDroppedCards
     */
    public void setDroppedCards(int numberOfDroppedCards){
        this.droppedCards = null;
        this.droppedCards = new Card[numberOfDroppedCards];
    }
    
    /**
     *
     * @param card
     */
    public void setDroppedCards2(Card[] card){
        this.droppedCards = card;
    }
    
    /**
     *
     * @return
     */
    public Card[] getDroppedCards(){
        return this.droppedCards;
    }
    
    /**
     *
     */
    public void checkOneCard(){
        if(this.droppedCards.length == 1){
            
            this.setName("oneCard");
        }
    }
    
    /**
     *
     */
    public void checkTwoCards(){
        if(this.droppedCards.length == 2){
            if(this.droppedCards[0].getNumber() == this.droppedCards[1].getNumber()){
                this.setName("twoCards");
            }
        }
    }
    
    /**
     *
     */
    public void checkThreeCards(){
        if(this.droppedCards.length == 3){
            if(this.droppedCards[0].getNumber() == this.droppedCards[1].getNumber() &&
            this.droppedCards[0].getNumber() == this.droppedCards[2].getNumber()){
                this.setName("threeCards");
            }
        }
    }
    
    /**
     *
     */
    public void checkSteps(){
        if((this.droppedCards.length % 2) == 0 && this.droppedCards.length >= 4){
            
            if(this.droppedCards[0].getNumber() == this.droppedCards[1].getNumber()){
                for(int i = 2 ; i<this.droppedCards.length ; i+=2){
                    if((this.droppedCards[i].getNumber() == this.droppedCards[i+1].getNumber()) && 
                     (this.droppedCards[i-1].getNumber() == (this.droppedCards[i].getNumber()-1))){
                        
                    }else{
                        return;
                    }
                }
                this.setName("steps");
            }
            
        }
    }
    
    /**
     *
     */
    public void checkFullHouse(){
        if(this.droppedCards.length == 5){
            if(this.droppedCards[0].getNumber() == this.droppedCards[1].getNumber() &&
             this.droppedCards[0].getNumber() == this.droppedCards[2].getNumber()){
                if(this.droppedCards[3].getNumber() == this.droppedCards[4].getNumber()){
                    this.setName("fullHouse");
                }
            }
            if(this.droppedCards[2].getNumber() == this.droppedCards[3].getNumber() &&
             this.droppedCards[2].getNumber() == this.droppedCards[4].getNumber()){
                if(this.droppedCards[0].getNumber() == this.droppedCards[1].getNumber()){
                    this.setName("fullHouse");
                }
            }
        }
        
    }
    
    /**
     *
     */
    public void checkStraight(){
        if(this.droppedCards.length >= 5){
            for(int i = 0 ; i<this.droppedCards.length-1 ; i++){
                if(this.droppedCards[i].getNumber() != (this.droppedCards[i+1].getNumber()-1)){
                    return;
                }
            }
            this.setName("straight"+this.droppedCards.length);
        }
    }
    
    /**
     *
     */
    public void checkStraightFlush(){
        if(this.droppedCards.length >= 5){
            for(int i = 0 ; i<this.droppedCards.length-1; i++){
                if(this.droppedCards[i].getNumber() == (this.droppedCards[i+1].getNumber()-1) && 
                        this.droppedCards[i].getColor().equals(this.droppedCards[i+1].getColor())){
                    
                }else{
                    return;
                }
            }
            this.setName("straightFlush");
        }
    }
    
    /**
     *
     */
    public void checkQuads(){
        if(this.droppedCards.length == 4){
            for(int i = 0 ; i<this.droppedCards.length-1; i++){
                if(this.droppedCards[i].getName().equals("phoenix")){
                    return;
                }
                if(this.droppedCards[i].getNumber() != (this.droppedCards[i+1].getNumber())){
                    return;
                }
            }
            if(this.droppedCards[3].getName().equals("phoenix")){
                    return;
            }
            this.setName("quads");
        }
        
    }
    
    /**
     *
     * @throws IOException
     */
    public void checkTrick() throws IOException{
        if(this.droppedCards[0].getName().equals("phoenix") && this.droppedCards.length != 1){
            Phoenix ph = new Phoenix();
            ph.setVisible(true);
            TICHU.check=false;
            TICHU.input="";
            while(!TICHU.check){

                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            this.droppedCards[0].setNumber(Integer.parseInt(TICHU.input));
            this.sortDroppedCards(this.droppedCards, this.droppedCards.length);
        }
        this.checkOneCard();
        this.checkTwoCards();
        this.checkThreeCards();
        this.checkSteps();
        this.checkFullHouse();
        this.checkStraight();
        this.checkQuads();
        this.checkStraightFlush();
    }
    
    /**
     *
     * @param name
     */
    public void setName(String name){
        this.name = name;
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
     * @param unsortedArray
     * @param length
     */
    public void sortDroppedCards(Card[] unsortedArray , int length){
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
}
