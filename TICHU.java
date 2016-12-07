/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichu;

import java.io.IOException;


/**
 *
 * @author Lefteris
 */
public class TICHU{

    /**
     * @param args the command line arguments
     * @throws IOException  
     */
    static public boolean check = false;
    static public String input = "";
    static public boolean tichu = false;
    static int wish = -1;
    public static void main(String[] args) throws IOException {
        Game game = new Game("PLAYER1","PLAYER2","PLAYER3","PLAYER4");
        game.startGame();
        while("new".equals(TICHU.input)){
            TICHU.input = "";
            game = new Game("PLAYER1","PLAYER2","PLAYER3","PLAYER4");
            game.startGame();
        }
    }
}
