/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichu;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author matzaflokos
 */
public class Gui implements ActionListener{
    JFrame frame=new JFrame("Tichu Game by Saridakis && Karatzas v1.0");
    Container container = new Container();
    JPanel table=new JPanel();
    JPanel playerCards=new JPanel();
    JPanel tricks=new JPanel();
    //JPanel p4=new JPanel();
    JButton[] cardButtons=new JButton[14];
    JButton[] but2=new JButton[14];
    JButton play= new JButton("play");
    JButton pass= new JButton("pass");
    JButton tichu = new JButton("tichu");
    JLabel cardPicks=new JLabel("");
    
    /**
     *
     */
    public Gui(){
        this.frame.setSize(1366, 768);
        this.frame.setVisible(false);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.add(container);
        container.add(table);
        table.setBounds(0, 0, 1100, 500);
        //p1.setBackground(Color.yellow);
        
        container.add(playerCards);
        playerCards.setBounds(0, 500, 1200, 159);
        playerCards.setBackground(Color.red);
        playerCards.setLayout(new GridLayout(0,14));
        
        tricks.setBounds(0, 200, 1200, 159);
        tricks.setBackground(Color.yellow);
        container.add(play);
        container.add(pass);
        container.add(tichu);
        tichu.setBounds(1200, 600, 166, 50);
        tichu.addActionListener(this);
        table.add(tricks);
        this.play.setBounds(1200, 500, 166, 50);
        this.play.addActionListener(this);
        this.pass.setBounds(1200, 550, 166, 50);
        pass.addActionListener(this);
        container.add(cardPicks);
        this.cardPicks.setBounds(0, 660,1366,108);
        this.cardPicks.setBackground(Color.black);
        cardPicks.setVisible(true);
        this.frame.setVisible(true);
    }
    /**
     *
     * @param card
     */
    public void prtrick(Card[] card){
        if (card == null){
            tricks.setLayout(new GridLayout(0,1));
            rem2();
            return;
        }else if (card.length!=0) {
            tricks.setLayout(new GridLayout(0,card.length));
        }
            
        //p3.setLayout(new GridLayout(0,card.length));
        rem2();
        for (int i=0;i<card.length;i++){
            
                but2[i]=new JButton("",new ImageIcon("CardImages/"+card[i].getName()+".jpg"));
                tricks.add(but2[i]);
        }
        tricks.setVisible(true);
    }
    /**
     *
     * @param card
     * @param player
     */
    public void mainWindow(Card[] card,Player player){
        cardPicks.setText("");
        playerCards.setVisible(false);
        for (int i=0;i<card.length;i++){
            if(card[i] != null){
                cardButtons[i]=new JButton(card[i].getName(),new ImageIcon("CardImages/"+card[i].getName()+".jpg"));
                cardButtons[i].addActionListener(this);
                playerCards.add(cardButtons[i]);
            }
           
        }
        TICHU.input="";
        playerCards.setVisible(true);
        TICHU.check=false;
        
        
    }
    /**
     *
     */
    public void rem2(){
        tricks.setVisible(false);
        tricks.removeAll();
    }
    /**
     *
     * @param card
     * @param p
     */
    public void rem(Card[] card,Player p){
        playerCards.setVisible(false);
        playerCards.removeAll();
    }

    /**
     *
     * @param ae
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("play")) {
            TICHU.check=true;
        }
        else if(ae.getActionCommand().equals("pass")){
            TICHU.input=ae.getActionCommand();
            TICHU.check=true;
        }else{
            TICHU.input+=ae.getActionCommand()+" ";
            this.cardPicks.setText(TICHU.input);
            this.cardPicks.setVisible(true);
        }
    }
}
