/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichu;

/**
 *
 * @author Lefteris
 */
public class Card {
    private int number;
    private String color;
    private String name;
    private int points;
    
    /**
     *
     * @param number
     * @param color 
     * @param points  
     */
    public Card(int number , String color , int points){
         this.number = number;
         this.color = color;
         this.points = points;
         this.name = color + number;
    }
    
    /**
     *
     * @param number
     */
    public void setNumber(int number){
         this.number = number;
    }
    
    /**
     *
     * @param color
     */
    public void setColor(String color){
         this.color = color;
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
     * @param points
     */
    public void setPoints(int points){
         this.points = points;
    }
    
    /**
     *
     * @return
     */
    public int getNumber(){
        return this.number;
    }
    
    /**
     *
     * @return
     */
    public String getColor(){
        return this.color;
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
    public int getPoints(){
        return this.points;
    }
}