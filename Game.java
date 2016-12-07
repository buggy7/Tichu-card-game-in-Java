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
public class Game {
    private Interface face;
    private Deck deck;
    private Team team1;
    private Team team2;
    private Trick lastTrick;
    private int currenTrickPoints;
    private String playedLastTrick;
    private boolean roundEnded;
  //  Gui f = new Gui();
    /**
     *
     * @param name1
     * @param name2
     * @param name3
     * @param name4
     * @throws IOException
     */
    public Game(String name1,String name2,String name3,String name4) throws IOException{
        this.face = new Interface(this);
        this.deck=new Deck();
       // f.frame.setVisible(false);
        this.team1=new Team(name1 , name3);
        this.team2=new Team(name2 , name4);
        
        this.lastTrick = new Trick();
        this.playedLastTrick = "null";
        this.currenTrickPoints = 0;
        this.roundEnded = false;
    }
    
    /**
     *
     * @return
     */
    public boolean getRoundEnded(){
        return this.roundEnded; 
    }
    
    /**
     *
     * @param bool
     */
    public void setRoundEnded(boolean bool){
        this.roundEnded = bool;
    }
    
    /**
     *
     * @param points
     */
    public void setCurrenTrickPoints(int points){
        this.currenTrickPoints += points;
        
    }
    
    /**
     *
     */
    public void resetCurrenTrickPoints(){
        this.currenTrickPoints = 0; 
    }
    
    /**
     *
     * @return
     */
    public int getCurrenTrickPoints(){
        return this.currenTrickPoints; 
    }
    
    /**
     *
     * @param str
     */
    public void setPlayedLastTrick(String str){
        this.playedLastTrick = str;
    }
    
    /**
     *
     * @return
     */
    public String getPlayedLastTrick(){
        return this.playedLastTrick;
    }
    
    /**
     *
     * @return
     */
    public int countTrickPoints(){
        int points = 0;
        if(this.lastTrick.getDroppedCards() != null){
            for(int i = 0 ; i < this.lastTrick.getDroppedCards().length ; i++){
                if(this.lastTrick.getDroppedCards()[i] != null){
                    points += this.lastTrick.getDroppedCards()[i].getPoints();
               }
            }
        }        
        return points;
    }
    /**
     *
     * @return
     */
    public Player findMahjong(){
        Card[] tmp = this.team1.getPlayer1().getPlayerCards();
        Card[] tmp1 = this.team2.getPlayer1().getPlayerCards();
        Card[] tmp2 = this.team1.getPlayer2().getPlayerCards();
        Card[] tmp3 = this.team2.getPlayer2().getPlayerCards();
        for(int i=0;i<14;i++){
            if(tmp[i].getColor().equals("mahjong")){
                return this.team1.getPlayer1();
            }
            if(tmp1[i].getColor().equals("mahjong")){
                return this.team2.getPlayer1();
            }
            if(tmp2[i].getColor().equals("mahjong")){
                return this.team1.getPlayer2();
            }
            if(tmp3[i].getColor().equals("mahjong")){
                return this.team2.getPlayer2();
            }
        }
        return null;           
    }
    
    /**
     *
     * @throws IOException
     */
    public void startGame()throws IOException{
        
        
        
       /* Interface face = new Interface();
        face.setVisible(true);*/
        //----------Moirasma kartwn kai taksinomisi-------------------
        this.deck.dealCards(this.team1.getPlayer1() , this.team2.getPlayer1() , this.team1.getPlayer2() , this.team2.getPlayer2(),face);
        this.team1.getPlayer1().sortCards(this.team1.getPlayer1().getPlayerCards() , this.team1.getPlayer1().getPlayerCards().length);
        this.team1.getPlayer2().sortCards(this.team1.getPlayer2().getPlayerCards() , this.team1.getPlayer2().getPlayerCards().length);
        this.team2.getPlayer1().sortCards(this.team2.getPlayer1().getPlayerCards() , this.team2.getPlayer1().getPlayerCards().length);
        this.team2.getPlayer2().sortCards(this.team2.getPlayer2().getPlayerCards() , this.team2.getPlayer2().getPlayerCards().length);
        //-------------------------------------------------------------
        
        //-------vriskoume ton prwto paixti-------------------
        Player currentPlayer;
        currentPlayer = this.findMahjong();
        //-----------------------------------------------------
     //   f.frame.setVisible(true);
        while((this.team1.getTotalPoints() < 400 && this.team2.getTotalPoints() < 400) || (this.team1.getTotalPoints() == this.team2.getTotalPoints())){ 
            
            
            //---------elegxei an teleiwse o guors---------------
            if(this.getRoundEnded()){
           //     f.frame.setVisible(false);
                //----------------kanw ta aparetita resets kai ksanamirazw-----------
                face.resetPlayerCards();
                face.resetStatistics();
                this.team1.getPlayer1().resetPlayer("PLAYER1");
                this.team1.getPlayer2().resetPlayer("PLAYER3");
                this.team2.getPlayer1().resetPlayer("PLAYER2");
                this.team2.getPlayer2().resetPlayer("PLAYER4");
                this.deck = new Deck();
                this.deck.dealCards(this.team1.getPlayer1() , this.team2.getPlayer1() , this.team1.getPlayer2() , this.team2.getPlayer2(),face);
                this.team1.getPlayer1().sortCards(this.team1.getPlayer1().getPlayerCards() , this.team1.getPlayer1().getPlayerCards().length);
                this.team1.getPlayer2().sortCards(this.team1.getPlayer2().getPlayerCards() , this.team1.getPlayer2().getPlayerCards().length);
                this.team2.getPlayer1().sortCards(this.team2.getPlayer1().getPlayerCards() , this.team2.getPlayer1().getPlayerCards().length);
                this.team2.getPlayer2().sortCards(this.team2.getPlayer2().getPlayerCards() , this.team2.getPlayer2().getPlayerCards().length);
                currentPlayer = this.findMahjong();
                this.setPlayedLastTrick("null");
                this.lastTrick.setDroppedCards2(null);
                this.lastTrick.setName("null");
                this.setRoundEnded(false);
            //    f.frame.setVisible(true);
                this.resetCurrenTrickPoints();
            }
            
            //------------elegxos an enas paiktis nikise ena trick----------------
            if(this.getPlayedLastTrick().equals(currentPlayer.getName())){
                
                //----elegxos an eiani drakos----------
                if(this.lastTrick.getDroppedCards()[0].getName().equals("dragon")){
                    Dragon dragon = new Dragon();
                    dragon.setVisible(true);
                    if(currentPlayer.getName().equals("PLAYER1")){
                        dragon.leftPlayer.setText("PLAYER4 (left)");
                        dragon.rightPlayer.setText("PLAYER2 (right)");
                        
                    }else if(currentPlayer.getName().equals("PLAYER2")){
                        dragon.leftPlayer.setText("PLAYER1 (left)");
                        dragon.rightPlayer.setText("PLAYER3 (right)");
                    }else if(currentPlayer.getName().equals("PLAYER3 ")){
                        dragon.leftPlayer.setText("PLAYER2 (left)");
                        dragon.rightPlayer.setText("PLAYER4 (right)");
                    }else{
                        dragon.leftPlayer.setText("PLAYER3 (left)");
                        dragon.rightPlayer.setText("PLAYER1 (right)");
                    }
                    if(TICHU.input.equals("PLAYER1")){
                        this.team1.getPlayer1().setPlayerPoints(this.getCurrenTrickPoints());
                    }
                    if(TICHU.input.equals("PLAYER2")){
                        this.team2.getPlayer1().setPlayerPoints(this.getCurrenTrickPoints());
                    }
                    if(TICHU.input.equals("PLAYER3")){
                        this.team1.getPlayer2().setPlayerPoints(this.getCurrenTrickPoints());
                    }
                    if(TICHU.input.equals("PLAYER4")){
                        this.team2.getPlayer2().setPlayerPoints(this.getCurrenTrickPoints());
                    }
                }else{//---an den einai drakos pernei o idios toys pontous-------
                    currentPlayer.setPlayerPoints(this.getCurrenTrickPoints());
                }
                
                //---aparetita reset gia kanourio trick-------
                face.resetTrick();
                face.lastTrickLabel.setText("Last Tric Played By Player : No Trick");
                
                
                this.setPlayedLastTrick("null");
                this.lastTrick.setDroppedCards2(null);
                this.lastTrick.setName("null");
                
                
                this.resetCurrenTrickPoints();
            }
            //---telos elegxou gia nikiforo trick--------
            
            //------elegxos an enas paiktis exei akoma kartes----------
            if(currentPlayer.getRemainingCards()!=0){
             //   f.mainWindow(currentPlayer.getPlayerCards(),currentPlayer);
            //    f.prtrick(this.lastTrick.getDroppedCards());
                
                //---svinei tis kartes tou proigoumenou kai vazei tou kainouriou-----
                face.resetPlayerCards();
                face.printPlayerCards(currentPlayer);
                
                //---tupwnei to trick sto para8uro----
                face.printTrick(this.lastTrick.getDroppedCards());
                
                //----elegxei an prepei an apenergopoih8oun koumpia------
                if(currentPlayer.getRemainingCards() != 14 || currentPlayer.getGrandTichu() == true
                        || currentPlayer.getTichu() == true){
                    face.tichuButton.setEnabled(false);
                }else{
                    face.tichuButton.setEnabled(true);
                }
                //----allazei ton paixti pou paizei sto para8uro----
                face.currentPlayerLabel.setText("Current Player : "+currentPlayer.getName());
                
                //kanei reset to palio trick
                face.resetPlayedCards();
                
                //--perimenei ton paixti na paiksei----
                currentPlayer.playTrick(this.lastTrick);
                
                //---elegxos an prepei an ginei new game-----
                if(TICHU.input == "new"){
                    return;
                }
                
                //----elegxos an kapoios paiktis eipe tichu------
                if(TICHU.tichu == true){
                    if(currentPlayer.getName().equals("PLAYER1")){
                        face.player1TichuGrTichu.setText("Tichu");
                    }else if(currentPlayer.getName().equals("PLAYER2")){
                        face.player2TichuGrTichu.setText("Tichu");
                    }else if(currentPlayer.getName().equals("PLAYER3")){
                        face.player3TichuGrTichu.setText("Tichu");
                    }else{
                        face.player4TichuGrTichu.setText("Tichu");
                    }
                    currentPlayer.setTichu(true);
                    TICHU.tichu = false;
                }
                
                //----an den pei paso-----
                if(!currentPlayer.getTrick().getName().equals("pass")){
                    
                    
                    //----alages sto para8uro gia to poios epaikse teleutaios-----
                    face.lastTrickLabel.setText("Last Trick Played By Player : "+currentPlayer.getName());
                    if(currentPlayer.getName().equals("PLAYER1")){
                        face.player1RemainigCards.setText(Integer.toString(currentPlayer.getRemainingCards()));
                    }else if(currentPlayer.getName().equals("PLAYER2")){
                        face.player2RemainigCards.setText(Integer.toString(currentPlayer.getRemainingCards()));
                    }else if(currentPlayer.getName().equals("PLAYER3")){
                        face.player3RemainigCards.setText(Integer.toString(currentPlayer.getRemainingCards()));
                    }else{
                        face.player4RemainigCards.setText(Integer.toString(currentPlayer.getRemainingCards()));
                    }
                    
                    
                    this.setPlayedLastTrick(currentPlayer.getName());
                    this.lastTrick.setDroppedCards(currentPlayer.getTrick().getDroppedCards().length);
                    this.lastTrick.setDroppedCards2(currentPlayer.getTrick().getDroppedCards());
                    this.lastTrick.setName(currentPlayer.getTrick().getName());
                    this.setCurrenTrickPoints(this.countTrickPoints());
                    currentPlayer.getTrick().setName("null");
                    //-------------------elegxos an paixtike pahjong---------------------------------
                    if(this.lastTrick.getDroppedCards()[0].getName().equals("mahjong")){
                        Mahjong mahjong=new Mahjong();
                        mahjong.setVisible(true);
                        while(TICHU.wish == -1){
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        
                    }
                    if(TICHU.wish == -1 || TICHU.wish == 0){
                        face.wish.setText("Wished Cards : None");
                    }else{
                        
                        face.wish.setText("Wished Cards : "+TICHU.wish);
                    }
                    //--------------------------------------------------------------
                    
                    //-------------elegxos an epesan skulia-------------
                    if(currentPlayer.getTrick().getDroppedCards()[0].getName().equals("dogs")){
                       this.lastTrick.setName("null");
                       //f.rem(currentPlayer.getPlayerCards(), currentPlayer);
                       currentPlayer = changePlayer(currentPlayer , this.team1 , this.team2);
                    }
                }
                if(currentPlayer.getTrick().getName().equals("pass")){
                    currentPlayer.getTrick().setName("null");
                }
            }    
           // f.rem(currentPlayer.getPlayerCards(), currentPlayer);
            
            //----elegxos an o paiktis vgike------
            if(currentPlayer.getRemainingCards() == 0){
                //----elegxos an vgike prwtos kai an teleiwse o guros------
                this.checkIfRoundEnded();
                this.checkIfEndedFirst();
                
                
                //-----alages sto para8uro-------
                if(currentPlayer.getFinishedFirst()){
                    if(currentPlayer.getName().equals("PLAYER1")){
                        face.player1Finished.setText("Finished 1st");
                    }else if(currentPlayer.getName().equals("PLAYER2")){
                        face.player2Finished.setText("Finished 1st");
                    }else if(currentPlayer.getName().equals("PLAYER3")){
                        face.player3Finished.setText("Finished 1st");
                    }else{
                        face.player4Finished.setText("Finished 1st");
                    }
                }else{
                    if(currentPlayer.getName().equals("PLAYER1")){
                        face.player1Finished.setText("Finished");
                    }else if(currentPlayer.getName().equals("PLAYER2")){
                        face.player2Finished.setText("Finished");
                    }else if(currentPlayer.getName().equals("PLAYER3")){
                        face.player3Finished.setText("Finished");
                    }else{
                        face.player4Finished.setText("Finished");
                    }
                }
                
                
            }
            
            //------alagi paikti----------
            currentPlayer = changePlayer(currentPlayer , this.team1 , this.team2);
            while(currentPlayer.getRemainingCards() == 0){
                if(this.getPlayedLastTrick().equals(currentPlayer.getName())){
                    this.setPlayedLastTrick("null");
                    this.lastTrick.setDroppedCards2(null);
                    this.lastTrick.setName("null");
                    currentPlayer.setPlayerPoints(this.getCurrenTrickPoints());
                    this.resetCurrenTrickPoints();
                    
                    
                     face.resetTrick();
                    
                     
                }
                currentPlayer = changePlayer(currentPlayer , this.team1 , this.team2);
            } 
            
            //-----pros8esi pontos an teleiwse o guros--------
            if(roundEnded){
                this.addTeamPoints();
                
                
                face.lastTrickLabel.setText("Last Tric Played By Player : No Trick");
                face.scoreTeam1.setText(Integer.toString(this.team1.getTotalPoints()));
                face.scoreTeam2.setText(Integer.toString(this.team2.getTotalPoints()));
                
                
                
                
              
            }
        } 
    }
    
    /**
     *
     */
    public void checkIfRoundEnded(){
        if(this.team1.getPlayer1().getRemainingCards() == 0 && this.team1.getPlayer2().getRemainingCards() == 0){
            this.setRoundEnded(true);
            
        }
        if(this.team2.getPlayer1().getRemainingCards() == 0 && this.team2.getPlayer2().getRemainingCards() == 0){
            this.setRoundEnded(true);
            
        }                       
    }
    
    /**
     *
     * @param currentPlayer
     * @param team1
     * @param team2
     * @return
     */
    public Player changePlayer(Player currentPlayer , Team team1 , Team team2){
        switch (currentPlayer.getName()) {
            case "PLAYER1":
                return team2.getPlayer1();
            case "PLAYER2":
                return team1.getPlayer2();
            case "PLAYER3":
                return team2.getPlayer2();
            default:
                return team1.getPlayer1();
        }
    }
    /**
     *
     */
    public void checkIfEndedFirst(){
        if (this.team1.getPlayer1().getRemainingCards()==0 && this.team2.getPlayer1().getRemainingCards()!=0 && this.team2.getPlayer2().getRemainingCards()!=0 
                &&this.team1.getPlayer2().getRemainingCards()!=0){
            this.team1.getPlayer1().setFinishedFirst(true);        
        }
        if (this.team1.getPlayer1().getRemainingCards()!=0 && this.team2.getPlayer1().getRemainingCards()==0 && this.team2.getPlayer2().getRemainingCards()!=0 
                &&this.team1.getPlayer2().getRemainingCards()!=0){
            this.team2.getPlayer1().setFinishedFirst(true);        
        }
        if (this.team1.getPlayer1().getRemainingCards()!=0 && this.team2.getPlayer1().getRemainingCards()!=0 && this.team2.getPlayer2().getRemainingCards()==0 
                &&this.team1.getPlayer2().getRemainingCards()!=0){
            this.team2.getPlayer2().setFinishedFirst(true);        
        }
        if (this.team1.getPlayer1().getRemainingCards()!=0 && this.team2.getPlayer1().getRemainingCards()!=0 && this.team2.getPlayer2().getRemainingCards()!=0 
                &&this.team1.getPlayer2().getRemainingCards()==0){
            this.team1.getPlayer2().setFinishedFirst(true);       
        }
    }
    
    /**
     *
     */
    public void addTeamPoints(){
        
        /*Tichu*/
        
        if(this.team1.getPlayer1().getTichu()){
            if(this.team1.getPlayer1().getFinishedFirst()){
                this.team1.setTotalPoints(100);
            }else{
                this.team1.setTotalPoints(-100);
            }
        }
        if(this.team1.getPlayer2().getTichu()){
            if(this.team1.getPlayer2().getFinishedFirst()){
                this.team1.setTotalPoints(100);
            }else{
                this.team1.setTotalPoints(-100);
            }
        }
        if(this.team2.getPlayer1().getTichu()){
            if(this.team2.getPlayer1().getFinishedFirst()){
                this.team2.setTotalPoints(100);
            }else{
                this.team2.setTotalPoints(-100);
            }
        }
        if(this.team2.getPlayer2().getTichu()){
            if(this.team2.getPlayer2().getFinishedFirst()){
                this.team2.setTotalPoints(100);
            }else{
                this.team2.setTotalPoints(-100);
            }
        }
        
        /*Grand Tichu*/
        
        if(this.team1.getPlayer1().getGrandTichu()){
            if(this.team1.getPlayer1().getFinishedFirst()){
                this.team1.setTotalPoints(200);
            }else{
                this.team1.setTotalPoints(-200);
            }
        }
        if(this.team1.getPlayer2().getGrandTichu()){
            if(this.team1.getPlayer2().getFinishedFirst()){
                this.team1.setTotalPoints(200);
            }else{
                this.team1.setTotalPoints(-200);
            }
        }
        if(this.team2.getPlayer1().getGrandTichu()){
            if(this.team2.getPlayer1().getFinishedFirst()){
                this.team2.setTotalPoints(200);
            }else{
                this.team2.setTotalPoints(-200);
            }
        }
        if(this.team2.getPlayer2().getGrandTichu()){
            if(this.team2.getPlayer2().getFinishedFirst()){
                this.team2.setTotalPoints(200);
            }else{
                this.team2.setTotalPoints(-200);
            }
        }
        if(this.team1.getPlayer1().getRemainingCards() == 0 && this.team1.getPlayer2().getRemainingCards() == 0){
            if(this.team2.getPlayer1().getRemainingCards() != 0 && this.team2.getPlayer2().getRemainingCards() != 0){
                this.team1.setTotalPoints(200);
            }else{
                if(this.team2.getPlayer1().getRemainingCards() == 0){
                    if(this.team2.getPlayer1().getFinishedFirst()){
                        this.team2.setTotalPoints(this.team2.getPlayer1().getPlayerPoints() + this.team2.getPlayer2().getPlayerPoints());
                        this.team1.setTotalPoints(this.team1.getPlayer1().getPlayerPoints() + this.team1.getPlayer2().getPlayerPoints()
                                + (100-(this.team1.getPlayer1().getPlayerPoints() + this.team1.getPlayer2().getPlayerPoints() + this.team2.getPlayer1().getPlayerPoints()
                                + this.team2.getPlayer2().getPlayerPoints())));
                    }else{
                        this.team2.setTotalPoints(this.team2.getPlayer1().getPlayerPoints());
                        this.team1.setTotalPoints(this.team1.getPlayer1().getPlayerPoints() + this.team1.getPlayer2().getPlayerPoints() + this.team2.getPlayer2().getPlayerPoints()
                                + (100-(this.team1.getPlayer1().getPlayerPoints() + this.team1.getPlayer2().getPlayerPoints() + this.team2.getPlayer2().getPlayerPoints()
                                + this.team2.getPlayer1().getPlayerPoints())));
                    }
                }else{
                    if(this.team2.getPlayer2().getFinishedFirst()){
                        this.team2.setTotalPoints(this.team2.getPlayer2().getPlayerPoints() + this.team2.getPlayer1().getPlayerPoints());
                        this.team1.setTotalPoints(this.team1.getPlayer1().getPlayerPoints() + this.team1.getPlayer2().getPlayerPoints()
                                + (100-(this.team1.getPlayer1().getPlayerPoints() + this.team1.getPlayer2().getPlayerPoints() + this.team2.getPlayer1().getPlayerPoints()
                               + this.team2.getPlayer2().getPlayerPoints() )));
                    }else{
                        this.team2.setTotalPoints(this.team2.getPlayer2().getPlayerPoints());
                        this.team1.setTotalPoints(this.team1.getPlayer1().getPlayerPoints() + this.team1.getPlayer2().getPlayerPoints() + this.team2.getPlayer1().getPlayerPoints()
                                + (100-(this.team1.getPlayer1().getPlayerPoints() + this.team1.getPlayer2().getPlayerPoints() + this.team2.getPlayer1().getPlayerPoints()
                                + this.team2.getPlayer2().getPlayerPoints())));
                    }
                }
            }
        }
        
        
        if(this.team2.getPlayer1().getRemainingCards() == 0 && this.team2.getPlayer2().getRemainingCards() == 0){
            if(this.team1.getPlayer1().getRemainingCards() != 0 && this.team1.getPlayer2().getRemainingCards() != 0){
                this.team2.setTotalPoints(200);
            }else{
                if(this.team1.getPlayer1().getRemainingCards() == 0){
                    if(this.team1.getPlayer1().getFinishedFirst()){
                        this.team1.setTotalPoints(this.team1.getPlayer1().getPlayerPoints() + this.team1.getPlayer2().getPlayerPoints());
                        this.team2.setTotalPoints(this.team2.getPlayer1().getPlayerPoints() + this.team2.getPlayer2().getPlayerPoints()
                                + (100-(this.team2.getPlayer1().getPlayerPoints() + this.team2.getPlayer2().getPlayerPoints() + this.team1.getPlayer2().getPlayerPoints()
                                + this.team1.getPlayer1().getPlayerPoints())));
                    }else{
                        this.team1.setTotalPoints(this.team1.getPlayer1().getPlayerPoints());
                        this.team2.setTotalPoints(this.team2.getPlayer1().getPlayerPoints() + this.team2.getPlayer2().getPlayerPoints() + this.team1.getPlayer2().getPlayerPoints()
                                + (100-(this.team2.getPlayer1().getPlayerPoints() + this.team2.getPlayer2().getPlayerPoints() + this.team1.getPlayer2().getPlayerPoints()
                                + this.team1.getPlayer1().getPlayerPoints())));
                    }
                }else{
                    if(this.team1.getPlayer2().getFinishedFirst()){
                        this.team1.setTotalPoints(this.team1.getPlayer2().getPlayerPoints() + this.team1.getPlayer1().getPlayerPoints());
                        this.team2.setTotalPoints(this.team2.getPlayer1().getPlayerPoints() + this.team2.getPlayer2().getPlayerPoints()
                                + (100-(this.team2.getPlayer1().getPlayerPoints() + this.team2.getPlayer2().getPlayerPoints() + this.team1.getPlayer1().getPlayerPoints()
                                + this.team1.getPlayer2().getPlayerPoints())));
                    }else{
                        this.team1.setTotalPoints(this.team1.getPlayer2().getPlayerPoints());
                        this.team2.setTotalPoints(this.team2.getPlayer1().getPlayerPoints() + this.team2.getPlayer2().getPlayerPoints() + this.team1.getPlayer1().getPlayerPoints()
                                + (100-(this.team2.getPlayer1().getPlayerPoints() + this.team2.getPlayer2().getPlayerPoints() + this.team1.getPlayer1().getPlayerPoints()
                                + this.team1.getPlayer2().getPlayerPoints())));
                    }
                }
            }
        }
        
        
    }
}

