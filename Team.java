/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichu;

/**
 *
 * @author Lefteris
 */
public class Team {
    private int totalPoints;
    private Player player1;
    private Player player2;
    
    /**
     *
     * @param name1
     * @param name2
     */
    public Team(String name1 , String name2){
        this.player1 = new Player(name1);
        this.player2 = new Player(name2);
        this.totalPoints = 0;
    }
    
    /**
     *
     * @return
     */
    public int getTotalPoints(){
        return this.totalPoints;
    }
    
    /**
     *
     * @param points
     */
    public void setTotalPoints(int points){
        this.totalPoints += points;
    }
    
    /**
     *
     */
    public void resetTotalPoints(){
        this.totalPoints = 0;
    }
    
    /**
     *
     * @return
     */
    public Player getPlayer1(){
        return this.player1;
    }
    
    /**
     *
     * @return
     */
    public Player getPlayer2(){
        return this.player2;
    }
}
