/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichu;

import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author matzaflokos
 */
public class Interface extends javax.swing.JFrame{
    String[] playedCards = new String[14];
    /**
     * Creates new form Interface
     */
    public Interface(Game game) {
        this.resetPlayedCards();
        this.getContentPane().setBackground(new Color(0, 102, 0));
        this.setVisible(true);
        initComponents();
    }
    public void resetPlayedCards(){
        for(int i = 0 ; i < 14 ; i++){
            playedCards[i] = "";
        }
    }
    public void resetStatistics(){
        this.player1Finished.setText("Not Finished");
        this.player2Finished.setText("Not Finished");
        this.player3Finished.setText("Not Finished");
        this.player4Finished.setText("Not Finished");
        this.player1TichuGrTichu.setText("-");
        this.player3TichuGrTichu.setText("-");
        this.player2TichuGrTichu.setText("-");
        this.player4TichuGrTichu.setText("-");
        this.player1RemainigCards.setText("14");
        this.player2RemainigCards.setText("14");
        this.player3RemainigCards.setText("14");
        this.player4RemainigCards.setText("14");
        

    }
    public void resetPlayerCards(){
        this.playerCard1.setIcon(null);
        this.playerCard2.setIcon(null);
        this.playerCard3.setIcon(null);
        this.playerCard4.setIcon(null);
        this.playerCard5.setIcon(null);
        this.playerCard6.setIcon(null);
        this.playerCard7.setIcon(null);
        this.playerCard8.setIcon(null);
        this.playerCard9.setIcon(null);
        this.playerCard10.setIcon(null);
        this.playerCard11.setIcon(null);
        this.playerCard12.setIcon(null);
        this.playerCard13.setIcon(null);
        this.playerCard14.setIcon(null);
        
        this.playerCard1.setText("");
        this.playerCard2.setText("");
        this.playerCard3.setText("");
        this.playerCard4.setText("");
        this.playerCard5.setText("");
        this.playerCard6.setText("");
        this.playerCard7.setText("");
        this.playerCard8.setText("");
        this.playerCard9.setText("");
        this.playerCard10.setText("");
        this.playerCard11.setText("");
        this.playerCard12.setText("");
        this.playerCard13.setText("");
        this.playerCard14.setText("");
    }
    public void printPlayerCards(Player player){
        for (int i=0;i<player.getPlayerCards().length;i++){
            if(player.getPlayerCards()[i] != null){
                if(i == 0){
                    this.playerCard1.setIcon(new ImageIcon("CardImages/"+player.getPlayerCards()[i].getName()+".jpg"));
                    this.playerCard1.setText(player.getPlayerCards()[i].getName());
                    this.playerCard1.setVisible(true);
                }else if(i == 1){
                    this.playerCard2.setIcon(new ImageIcon("CardImages/"+player.getPlayerCards()[i].getName()+".jpg"));
                    this.playerCard2.setText(player.getPlayerCards()[i].getName());
                    this.playerCard2.setVisible(true);
                }else if(i == 2){
                    this.playerCard3.setIcon(new ImageIcon("CardImages/"+player.getPlayerCards()[i].getName()+".jpg"));
                    this.playerCard3.setText(player.getPlayerCards()[i].getName());
                    this.playerCard3.setVisible(true);
                }else if(i == 3){
                    this.playerCard4.setIcon(new ImageIcon("CardImages/"+player.getPlayerCards()[i].getName()+".jpg"));
                    this.playerCard4.setText(player.getPlayerCards()[i].getName());
                    this.playerCard4.setVisible(true);
                }else if(i == 4){
                    this.playerCard5.setIcon(new ImageIcon("CardImages/"+player.getPlayerCards()[i].getName()+".jpg"));
                    this.playerCard5.setText(player.getPlayerCards()[i].getName());
                    this.playerCard5.setVisible(true);
                }else if(i == 5){
                    this.playerCard6.setIcon(new ImageIcon("CardImages/"+player.getPlayerCards()[i].getName()+".jpg"));
                    this.playerCard6.setText(player.getPlayerCards()[i].getName());
                    this.playerCard6.setVisible(true);
                }else if(i == 6){
                    this.playerCard7.setIcon(new ImageIcon("CardImages/"+player.getPlayerCards()[i].getName()+".jpg"));
                    this.playerCard7.setText(player.getPlayerCards()[i].getName());
                    this.playerCard7.setVisible(true);
                }else if(i == 7){
                    this.playerCard8.setIcon(new ImageIcon("CardImages/"+player.getPlayerCards()[i].getName()+".jpg"));
                    this.playerCard8.setText(player.getPlayerCards()[i].getName());
                    this.playerCard8.setVisible(true);
                }else if(i == 8){
                    this.playerCard9.setIcon(new ImageIcon("CardImages/"+player.getPlayerCards()[i].getName()+".jpg"));
                    this.playerCard9.setText(player.getPlayerCards()[i].getName());
                    this.playerCard9.setVisible(true);
                }else if(i == 9){
                    this.playerCard10.setIcon(new ImageIcon("CardImages/"+player.getPlayerCards()[i].getName()+".jpg"));
                    this.playerCard10.setText(player.getPlayerCards()[i].getName());
                    this.playerCard10.setVisible(true);
                }else if(i == 10){
                    this.playerCard11.setIcon(new ImageIcon("CardImages/"+player.getPlayerCards()[i].getName()+".jpg"));
                    this.playerCard11.setText(player.getPlayerCards()[i].getName());
                    this.playerCard11.setVisible(true);
                }else if(i == 11){
                    this.playerCard12.setIcon(new ImageIcon("CardImages/"+player.getPlayerCards()[i].getName()+".jpg"));
                    this.playerCard12.setText(player.getPlayerCards()[i].getName());
                    this.playerCard12.setVisible(true);
                }else if(i == 12){
                    this.playerCard13.setIcon(new ImageIcon("CardImages/"+player.getPlayerCards()[i].getName()+".jpg"));  
                    this.playerCard13.setText(player.getPlayerCards()[i].getName());
                    this.playerCard13.setVisible(true);
                }else{
                    this.playerCard14.setIcon(new ImageIcon("CardImages/"+player.getPlayerCards()[i].getName()+".jpg"));
                    this.playerCard14.setText(player.getPlayerCards()[i].getName());
                    this.playerCard14.setVisible(true);
                }
            }else{
                if(i == 0){
                    this.playerCard1.setIcon(null);
                    this.playerCard1.setVisible(false);
                }else if(i == 1){
                    this.playerCard2.setIcon(null);
                    this.playerCard2.setVisible(false);
                }else if(i == 2){
                    this.playerCard3.setIcon(null);
                    this.playerCard3.setVisible(false);
                }else if(i == 3){
                    this.playerCard4.setIcon(null);
                    this.playerCard4.setVisible(false);
                }else if(i == 4){
                    this.playerCard5.setIcon(null);
                    this.playerCard5.setVisible(false);
                }else if(i == 5){
                    this.playerCard6.setIcon(null);
                    this.playerCard6.setVisible(false);
                }else if(i == 6){
                    this.playerCard7.setIcon(null);
                    this.playerCard7.setVisible(false);
                }else if(i == 7){
                    this.playerCard8.setIcon(null);
                    this.playerCard8.setVisible(false);
                }else if(i == 8){
                    this.playerCard9.setIcon(null);
                    this.playerCard9.setVisible(false);
                }else if(i == 9){
                    this.playerCard10.setIcon(null);
                    this.playerCard10.setVisible(false);
                }else if(i == 10){
                    this.playerCard11.setIcon(null);
                    this.playerCard11.setVisible(false);
                }else if(i == 11){
                    this.playerCard12.setIcon(null);
                    this.playerCard12.setVisible(false);
                }else if(i == 12){
                    this.playerCard13.setIcon(null);  
                    this.playerCard13.setVisible(false);
                }else{
                    this.playerCard14.setIcon(null);
                    this.playerCard14.setVisible(false);
                }
            }
           
        }
    }
    public void resetCardsPosition(){
        this.playerCard1.setBounds(0, 11, 106, 159);
        this.playerCard2.setBounds(80, 11, 106, 159);
        this.playerCard3.setBounds(160, 11, 106, 159);
        this.playerCard4.setBounds(240, 11, 106, 159);
        this.playerCard5.setBounds(320, 11, 106, 159);
        this.playerCard6.setBounds(400, 11, 106, 159);
        this.playerCard7.setBounds(480, 11, 106, 159);
        this.playerCard8.setBounds(560, 11, 106, 159);
        this.playerCard9.setBounds(640, 11, 106, 159);
        this.playerCard10.setBounds(720, 11, 106, 159);
        this.playerCard11.setBounds(800, 11, 106, 159);
        this.playerCard12.setBounds(880, 11, 106, 159);
        this.playerCard13.setBounds(960, 11, 106, 159);
        this.playerCard14.setBounds(1040, 11, 106, 159);
    }
    public void resetTrick(){
        this.DCard1.setIcon(null);
        this.DCard2.setIcon(null);
        this.DCard3.setIcon(null);
        this.DCard4.setIcon(null);
        this.DCard5.setIcon(null);
        this.DCard6.setIcon(null);
        this.DCard7.setIcon(null);
        this.DCard8.setIcon(null);
        this.DCard9.setIcon(null);
        this.DCard10.setIcon(null);
        this.DCard11.setIcon(null);
        this.DCard12.setIcon(null);
        this.DCard13.setIcon(null);
        this.DCard14.setIcon(null);
        
        
        
    }
    public void printTrick(Card[] cards){
        if (cards == null){
                return;
        }
        for(int i = 0 ; i < cards.length ;i++){
            
            if(i == 0){
                this.DCard1.setIcon(new ImageIcon("CardImages/"+cards[i].getName()+".jpg"));
            }else if(i == 1){
                this.DCard2.setIcon(new ImageIcon("CardImages/"+cards[i].getName()+".jpg"));
            }else if(i == 2){
                this.DCard3.setIcon(new ImageIcon("CardImages/"+cards[i].getName()+".jpg"));
            }else if(i == 3){
                this.DCard4.setIcon(new ImageIcon("CardImages/"+cards[i].getName()+".jpg"));
            }else if(i == 4){
                this.DCard5.setIcon(new ImageIcon("CardImages/"+cards[i].getName()+".jpg"));
            }else if(i == 5){
                this.DCard6.setIcon(new ImageIcon("CardImages/"+cards[i].getName()+".jpg"));
            }else if(i == 6){
                this.DCard7.setIcon(new ImageIcon("CardImages/"+cards[i].getName()+".jpg"));
            }else if(i == 7){
                this.DCard8.setIcon(new ImageIcon("CardImages/"+cards[i].getName()+".jpg"));
            }else if(i == 8){
                this.DCard9.setIcon(new ImageIcon("CardImages/"+cards[i].getName()+".jpg"));
            }else if(i == 9){
                this.DCard10.setIcon(new ImageIcon("CardImages/"+cards[i].getName()+".jpg"));
            }else if(i == 10){
                this.DCard11.setIcon(new ImageIcon("CardImages/"+cards[i].getName()+".jpg"));
            }else if(i == 11){
                this.DCard12.setIcon(new ImageIcon("CardImages/"+cards[i].getName()+".jpg"));
            }else if(i == 12){
                this.DCard13.setIcon(new ImageIcon("CardImages/"+cards[i].getName()+".jpg"));    
            }else{
                this.DCard14.setIcon(new ImageIcon("CardImages/"+cards[i].getName()+".jpg"));
            }
        }
        for(int i = cards.length ; i < 14 ;i++){
            
            if(i == 0){
                this.DCard1.setIcon(null);
            }else if(i == 1){
                this.DCard2.setIcon(null);
            }else if(i == 2){
                this.DCard3.setIcon(null);
            }else if(i == 3){
                this.DCard4.setIcon(null);
            }else if(i == 4){
                this.DCard5.setIcon(null);
            }else if(i == 5){
                this.DCard6.setIcon(null);
            }else if(i == 6){
                this.DCard7.setIcon(null);
            }else if(i == 7){
                this.DCard8.setIcon(null);
            }else if(i == 8){
                this.DCard9.setIcon(null);
            }else if(i == 9){
                this.DCard10.setIcon(null);
            }else if(i == 10){
                this.DCard11.setIcon(null);
            }else if(i == 11){
                this.DCard12.setIcon(null);
            }else if(i == 12){
                this.DCard13.setIcon(null);    
            }else{
                this.DCard14.setIcon(null);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passButton = new javax.swing.JButton();
        tichuButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        newGameButton = new javax.swing.JButton();
        DCards = new javax.swing.JLayeredPane();
        DCard14 = new javax.swing.JLabel();
        DCard13 = new javax.swing.JLabel();
        DCard12 = new javax.swing.JLabel();
        DCard11 = new javax.swing.JLabel();
        DCard10 = new javax.swing.JLabel();
        DCard9 = new javax.swing.JLabel();
        DCard8 = new javax.swing.JLabel();
        DCard7 = new javax.swing.JLabel();
        DCard6 = new javax.swing.JLabel();
        DCard5 = new javax.swing.JLabel();
        DCard4 = new javax.swing.JLabel();
        DCard3 = new javax.swing.JLabel();
        DCard2 = new javax.swing.JLabel();
        DCard1 = new javax.swing.JLabel();
        playerCardsPanel = new javax.swing.JLayeredPane();
        playerCard14 = new javax.swing.JLabel();
        playerCard13 = new javax.swing.JLabel();
        playerCard12 = new javax.swing.JLabel();
        playerCard11 = new javax.swing.JLabel();
        playerCard10 = new javax.swing.JLabel();
        playerCard9 = new javax.swing.JLabel();
        playerCard8 = new javax.swing.JLabel();
        playerCard7 = new javax.swing.JLabel();
        playerCard6 = new javax.swing.JLabel();
        playerCard5 = new javax.swing.JLabel();
        playerCard4 = new javax.swing.JLabel();
        playerCard3 = new javax.swing.JLabel();
        playerCard2 = new javax.swing.JLabel();
        playerCard1 = new javax.swing.JLabel();
        scorePanel = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        scoreTeam1 = new javax.swing.JLabel();
        scoreTeam2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        infoPanel = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        player1Finished = new javax.swing.JLabel();
        player2Finished = new javax.swing.JLabel();
        player3Finished = new javax.swing.JLabel();
        player4Finished = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        player1RemainigCards = new javax.swing.JLabel();
        player2RemainigCards = new javax.swing.JLabel();
        player3RemainigCards = new javax.swing.JLabel();
        player4RemainigCards = new javax.swing.JLabel();
        player1TichuGrTichu = new javax.swing.JLabel();
        player2TichuGrTichu = new javax.swing.JLabel();
        player3TichuGrTichu = new javax.swing.JLabel();
        player4TichuGrTichu = new javax.swing.JLabel();
        currentPlayerLabel = new javax.swing.JLabel();
        lastTrickLabel = new javax.swing.JLabel();
        wish = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tichu Game By Saridakis & Karatzas v1.2");
        setBackground(new java.awt.Color(0, 102, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passButton.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        passButton.setText("PASS");
        passButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passButtonMousePressed(evt);
            }
        });
        getContentPane().add(passButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 430, 100, 100));

        tichuButton.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        tichuButton.setText("TICHU");
        tichuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tichuButtonMousePressed(evt);
            }
        });
        getContentPane().add(tichuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 370, 220, 50));

        playButton.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        playButton.setText("PLAY");
        playButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playButtonMousePressed(evt);
            }
        });
        getContentPane().add(playButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 430, 100, 100));

        newGameButton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        newGameButton.setText("New Game");
        newGameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newGameButtonMousePressed(evt);
            }
        });
        getContentPane().add(newGameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 80));

        DCards.setBackground(new java.awt.Color(0, 102, 0));
        DCards.setOpaque(true);
        DCard14.setBounds(780, 0, 106, 159);
        DCards.add(DCard14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DCard13.setBounds(720, 0, 106, 159);
        DCards.add(DCard13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DCard12.setBounds(660, 0, 106, 159);
        DCards.add(DCard12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DCard11.setBounds(600, 0, 106, 159);
        DCards.add(DCard11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DCard10.setBounds(540, 0, 106, 159);
        DCards.add(DCard10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DCard9.setBounds(480, 0, 106, 159);
        DCards.add(DCard9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DCard8.setBounds(420, 0, 106, 159);
        DCards.add(DCard8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DCard7.setBounds(360, 0, 106, 159);
        DCards.add(DCard7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DCard6.setBounds(300, 0, 106, 159);
        DCards.add(DCard6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DCard5.setBounds(240, 0, 106, 159);
        DCards.add(DCard5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DCard4.setBounds(180, 0, 106, 159);
        DCards.add(DCard4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DCard3.setBounds(120, 0, 106, 159);
        DCards.add(DCard3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DCard2.setBounds(60, 0, 106, 159);
        DCards.add(DCard2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DCard1.setBounds(0, 0, 106, 159);
        DCards.add(DCard1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(DCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 886, 159));

        playerCardsPanel.setBackground(new java.awt.Color(102, 102, 0));
        playerCardsPanel.setOpaque(true);

        playerCard14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playerCard14MousePressed(evt);
            }
        });
        playerCard14.setBounds(1040, 11, 106, 159);
        playerCardsPanel.add(playerCard14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        playerCard13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playerCard13MousePressed(evt);
            }
        });
        playerCard13.setBounds(960, 11, 106, 159);
        playerCardsPanel.add(playerCard13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        playerCard12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playerCard12MousePressed(evt);
            }
        });
        playerCard12.setBounds(880, 11, 106, 159);
        playerCardsPanel.add(playerCard12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        playerCard11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playerCard11MousePressed(evt);
            }
        });
        playerCard11.setBounds(800, 11, 106, 159);
        playerCardsPanel.add(playerCard11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        playerCard10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playerCard10MousePressed(evt);
            }
        });
        playerCard10.setBounds(720, 11, 106, 159);
        playerCardsPanel.add(playerCard10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        playerCard9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playerCard9MousePressed(evt);
            }
        });
        playerCard9.setBounds(640, 11, 106, 159);
        playerCardsPanel.add(playerCard9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        playerCard8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playerCard8MousePressed(evt);
            }
        });
        playerCard8.setBounds(560, 11, 106, 159);
        playerCardsPanel.add(playerCard8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        playerCard7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playerCard7MousePressed(evt);
            }
        });
        playerCard7.setBounds(480, 11, 106, 159);
        playerCardsPanel.add(playerCard7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        playerCard6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playerCard6MousePressed(evt);
            }
        });
        playerCard6.setBounds(400, 11, 106, 159);
        playerCardsPanel.add(playerCard6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        playerCard5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playerCard5MousePressed(evt);
            }
        });
        playerCard5.setBounds(320, 11, 106, 159);
        playerCardsPanel.add(playerCard5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        playerCard4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playerCard4MousePressed(evt);
            }
        });
        playerCard4.setBounds(240, 11, 106, 159);
        playerCardsPanel.add(playerCard4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        playerCard3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playerCard3MousePressed(evt);
            }
        });
        playerCard3.setBounds(160, 11, 106, 159);
        playerCardsPanel.add(playerCard3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        playerCard2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playerCard2MousePressed(evt);
            }
        });
        playerCard2.setBounds(80, 11, 100, 160);
        playerCardsPanel.add(playerCard2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        playerCard1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playerCard1MousePressed(evt);
            }
        });
        playerCard1.setBounds(0, 11, 106, 159);
        playerCardsPanel.add(playerCard1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(playerCardsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1150, 170));

        scorePanel.setBackground(new java.awt.Color(153, 51, 0));
        scorePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        scorePanel.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SCORE");
        jLabel1.setBounds(0, 0, 230, 50);
        scorePanel.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Team 1");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setBounds(0, 60, 110, 50);
        scorePanel.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Team 2");
        jLabel3.setBounds(110, 60, 120, 50);
        scorePanel.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        scoreTeam1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        scoreTeam1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreTeam1.setText("0");
        scoreTeam1.setBounds(0, 110, 110, 60);
        scorePanel.add(scoreTeam1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        scoreTeam2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        scoreTeam2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreTeam2.setText("0");
        scoreTeam2.setBounds(110, 110, 120, 60);
        scorePanel.add(scoreTeam2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOpaque(true);
        jSeparator1.setBounds(110, 50, 6, 130);
        scorePanel.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOpaque(true);
        jSeparator2.setBounds(0, 50, 230, 6);
        scorePanel.add(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(scorePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 230, 180));

        infoPanel.setBackground(new java.awt.Color(0, 102, 51));
        infoPanel.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Player 1");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setBounds(0, 50, 110, 50);
        infoPanel.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Player 2");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.setBounds(0, 100, 110, 50);
        infoPanel.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Player 3");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setBounds(0, 150, 110, 50);
        infoPanel.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Player 4");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.setBounds(0, 200, 110, 50);
        infoPanel.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Remainig Cards");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel8.setBounds(110, 0, 110, 50);
        infoPanel.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Finished");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel9.setBounds(330, 0, 110, 50);
        infoPanel.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        player1Finished.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        player1Finished.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player1Finished.setText("Not Finished");
        player1Finished.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        player1Finished.setBounds(330, 50, 110, 50);
        infoPanel.add(player1Finished, javax.swing.JLayeredPane.DEFAULT_LAYER);

        player2Finished.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        player2Finished.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player2Finished.setText("Not Finished");
        player2Finished.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        player2Finished.setBounds(330, 100, 110, 50);
        infoPanel.add(player2Finished, javax.swing.JLayeredPane.DEFAULT_LAYER);

        player3Finished.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        player3Finished.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player3Finished.setText("Not Finished");
        player3Finished.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        player3Finished.setBounds(330, 150, 110, 50);
        infoPanel.add(player3Finished, javax.swing.JLayeredPane.DEFAULT_LAYER);

        player4Finished.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        player4Finished.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player4Finished.setText("Not Finished");
        player4Finished.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        player4Finished.setBounds(330, 200, 110, 50);
        infoPanel.add(player4Finished, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Name");
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel14.setBounds(0, 0, 110, 50);
        infoPanel.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Tichu/GrTichu");
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel15.setBounds(220, 0, 110, 50);
        infoPanel.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        player1RemainigCards.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        player1RemainigCards.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player1RemainigCards.setText("14");
        player1RemainigCards.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        player1RemainigCards.setBounds(110, 50, 110, 50);
        infoPanel.add(player1RemainigCards, javax.swing.JLayeredPane.DEFAULT_LAYER);

        player2RemainigCards.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        player2RemainigCards.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player2RemainigCards.setText("14");
        player2RemainigCards.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        player2RemainigCards.setBounds(110, 100, 110, 50);
        infoPanel.add(player2RemainigCards, javax.swing.JLayeredPane.DEFAULT_LAYER);

        player3RemainigCards.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        player3RemainigCards.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player3RemainigCards.setText("14");
        player3RemainigCards.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        player3RemainigCards.setBounds(110, 150, 110, 50);
        infoPanel.add(player3RemainigCards, javax.swing.JLayeredPane.DEFAULT_LAYER);

        player4RemainigCards.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        player4RemainigCards.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player4RemainigCards.setText("14");
        player4RemainigCards.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        player4RemainigCards.setBounds(110, 200, 110, 50);
        infoPanel.add(player4RemainigCards, javax.swing.JLayeredPane.DEFAULT_LAYER);

        player1TichuGrTichu.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        player1TichuGrTichu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player1TichuGrTichu.setText("-");
        player1TichuGrTichu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        player1TichuGrTichu.setBounds(220, 50, 110, 50);
        infoPanel.add(player1TichuGrTichu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        player2TichuGrTichu.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        player2TichuGrTichu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player2TichuGrTichu.setText("-");
        player2TichuGrTichu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        player2TichuGrTichu.setBounds(220, 100, 110, 50);
        infoPanel.add(player2TichuGrTichu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        player3TichuGrTichu.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        player3TichuGrTichu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player3TichuGrTichu.setText("-");
        player3TichuGrTichu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        player3TichuGrTichu.setBounds(220, 150, 110, 50);
        infoPanel.add(player3TichuGrTichu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        player4TichuGrTichu.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        player4TichuGrTichu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player4TichuGrTichu.setText("-");
        player4TichuGrTichu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        player4TichuGrTichu.setBounds(220, 200, 110, 50);
        infoPanel.add(player4TichuGrTichu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(infoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 440, 250));

        currentPlayerLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        currentPlayerLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        currentPlayerLabel.setText("Current Player : Player 1");
        getContentPane().add(currentPlayerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 730, 40));

        lastTrickLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lastTrickLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastTrickLabel.setText("Last Trick Played By Player : No Trick");
        getContentPane().add(lastTrickLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 430, 30));

        wish.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        wish.setText("Wished Card : None");
        getContentPane().add(wish, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 220, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newGameButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameButtonMousePressed
        // TODO add your handling code here:
        TICHU.input = "new";
        TICHU.wish = -1;
        TICHU.check = true;
        this.dispose();
    }//GEN-LAST:event_newGameButtonMousePressed

    private void playerCard1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerCard1MousePressed
        // TODO add your handling code here:
        Rectangle x = this.playerCard1.getBounds();
        if(x.y == 0){
            playedCards[0] = "";
            this.playerCard1.setBounds(0, 11, 106, 159);
        }else{
            playedCards[0] = this.playerCard1.getText();
            System.out.println(this.playerCard1.getText());
            this.playerCard1.setBounds(0, 0, 106, 159);
        }
    }//GEN-LAST:event_playerCard1MousePressed

    private void playerCard2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerCard2MousePressed
        // TODO add your handling code here:
        Rectangle x = this.playerCard2.getBounds();
        if(x.y == 0){
            playedCards[1] = "";
            this.playerCard2.setBounds(80, 11, 106, 159);
        }else{
            playedCards[1] = this.playerCard2.getText();
                this.playerCard2.setBounds(80, 0, 106, 159);
    }//GEN-LAST:event_playerCard2MousePressed
}
    private void playerCard3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerCard3MousePressed
        // TODO add your handling code here:
        Rectangle x = this.playerCard3.getBounds();
        if(x.y == 0){
            playedCards[2] = "";
            this.playerCard3.setBounds(160, 11, 106, 159);
        }else{
            playedCards[2] = this.playerCard3.getText();
            this.playerCard3.setBounds(160, 0, 106, 159);
        }
    }//GEN-LAST:event_playerCard3MousePressed

    private void playerCard4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerCard4MousePressed
        // TODO add your handling code here:
        Rectangle x = this.playerCard4.getBounds();
        if(x.y == 0){
            playedCards[3] = "";
            this.playerCard4.setBounds(240, 11, 106, 159);
        }else{
            playedCards[3] = this.playerCard4.getText();
            this.playerCard4.setBounds(240, 0, 106, 159);
        }
    }//GEN-LAST:event_playerCard4MousePressed

    private void playerCard5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerCard5MousePressed
        // TODO add your handling code here:
        Rectangle x = this.playerCard5.getBounds();
        if(x.y == 0){
            playedCards[4] = "";
            this.playerCard5.setBounds(320, 11, 106, 159);
        }else{
             playedCards[4] = this.playerCard5.getText();
            this.playerCard5.setBounds(320, 0, 106, 159);
        }
    }//GEN-LAST:event_playerCard5MousePressed

    private void playerCard6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerCard6MousePressed
        // TODO add your handling code here:
         Rectangle x = this.playerCard6.getBounds();
        if(x.y == 0){
            playedCards[5] = "";
            this.playerCard6.setBounds(400, 11, 106, 159);
        }else{
             playedCards[5] = this.playerCard6.getText();
            this.playerCard6.setBounds(400, 0, 106, 159);
        }
    }//GEN-LAST:event_playerCard6MousePressed

    private void playerCard7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerCard7MousePressed
        // TODO add your handling code here:
        Rectangle x = this.playerCard7.getBounds();
        if(x.y == 0){
            playedCards[6] = "";
            this.playerCard7.setBounds(480, 11, 106, 159);
        }else{
            playedCards[6] = this.playerCard7.getText();
            this.playerCard7.setBounds(480, 0, 106, 159);
        }
    }//GEN-LAST:event_playerCard7MousePressed

    private void playerCard8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerCard8MousePressed
        // TODO add your handling code here:
        Rectangle x = this.playerCard8.getBounds();
        if(x.y == 0){
            playedCards[7] = "";
            this.playerCard8.setBounds(560, 11, 106, 159);
        }else{
            playedCards[7] = this.playerCard8.getText();
            this.playerCard8.setBounds(560, 0, 106, 159);
        }
    }//GEN-LAST:event_playerCard8MousePressed

    private void playerCard9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerCard9MousePressed
        // TODO add your handling code here:
        Rectangle x = this.playerCard9.getBounds();
        if(x.y == 0){
            playedCards[8] = "";
            this.playerCard9.setBounds(640, 11, 106, 159);
        }else{
            playedCards[8] = this.playerCard9.getText();
            this.playerCard9.setBounds(640, 0, 106, 159);
        }
    }//GEN-LAST:event_playerCard9MousePressed

    private void playerCard10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerCard10MousePressed
        // TODO add your handling code here:
        Rectangle x = this.playerCard10.getBounds();
        if(x.y == 0){
            playedCards[9] = "";
            this.playerCard10.setBounds(720, 11, 106, 159);
        }else{
            playedCards[9] = this.playerCard10.getText();
            this.playerCard10.setBounds(720, 0, 106, 159);
        }
    }//GEN-LAST:event_playerCard10MousePressed

    private void playerCard11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerCard11MousePressed
        // TODO add your handling code here:
        Rectangle x = this.playerCard11.getBounds();
        if(x.y == 0){
            playedCards[10] = "";
            this.playerCard11.setBounds(800, 11, 106, 159);
        }else{
            playedCards[10] = this.playerCard11.getText();
            this.playerCard11.setBounds(800, 0, 106, 159);
        }
    }//GEN-LAST:event_playerCard11MousePressed

    private void playerCard12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerCard12MousePressed
        // TODO add your handling code here:
        Rectangle x = this.playerCard12.getBounds();
        if(x.y == 0){
            playedCards[11] = "";
            this.playerCard12.setBounds(880, 11, 106, 159);
        }else{
            playedCards[11] = this.playerCard12.getText();
            this.playerCard12.setBounds(880, 0, 106, 159);
        }
    }//GEN-LAST:event_playerCard12MousePressed

    private void playerCard13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerCard13MousePressed
        // TODO add your handling code here:
         Rectangle x = this.playerCard13.getBounds();
        if(x.y == 0){
            playedCards[12] = "";
            this.playerCard13.setBounds(960, 11, 106, 159);
        }else{
            playedCards[12] = this.playerCard13.getText();
            this.playerCard13.setBounds(960, 0, 106, 159);
        }
    }//GEN-LAST:event_playerCard13MousePressed

    private void playerCard14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerCard14MousePressed
        // TODO add your handling code here:
        Rectangle x = this.playerCard14.getBounds();
        if(x.y == 0){
            playedCards[13] = "";
            this.playerCard14.setBounds(1040, 11, 106, 159);
        }else{
            playedCards[13] = this.playerCard14.getText();
            this.playerCard14.setBounds(1040, 0, 106, 159);
        }
    }//GEN-LAST:event_playerCard14MousePressed

    private void playButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMousePressed
        // TODO add your handling code here:
         if(this.playButton.isEnabled()){
            TICHU.input = "";
            for(int i = 0 ; i < 14 ;i++){
                System.out.println(playedCards[i]);
                if(!playedCards[i].equals("")){
                    TICHU.input += playedCards[i] + " ";
                    playedCards[i] = "";
                }
            }
            this.resetCardsPosition();
            TICHU.check=true;
        }
    }//GEN-LAST:event_playButtonMousePressed

    private void tichuButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tichuButtonMousePressed
        // TODO add your handling code here:
         if(this.tichuButton.isEnabled()){
            this.tichuButton.setEnabled(false);
            TICHU.tichu = true;
        }
    }//GEN-LAST:event_tichuButtonMousePressed

    private void passButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passButtonMousePressed
        // TODO add your handling code here:
        if(this.playButton.isEnabled()){
            this.resetCardsPosition();
            TICHU.input="pass";
            TICHU.check=true;
        }
    }//GEN-LAST:event_passButtonMousePressed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface(null).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DCard1;
    private javax.swing.JLabel DCard10;
    private javax.swing.JLabel DCard11;
    private javax.swing.JLabel DCard12;
    private javax.swing.JLabel DCard13;
    private javax.swing.JLabel DCard14;
    private javax.swing.JLabel DCard2;
    private javax.swing.JLabel DCard3;
    private javax.swing.JLabel DCard4;
    private javax.swing.JLabel DCard5;
    private javax.swing.JLabel DCard6;
    private javax.swing.JLabel DCard7;
    private javax.swing.JLabel DCard8;
    private javax.swing.JLabel DCard9;
    private javax.swing.JLayeredPane DCards;
    public javax.swing.JLabel currentPlayerLabel;
    private javax.swing.JLayeredPane infoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel lastTrickLabel;
    private javax.swing.JButton newGameButton;
    public javax.swing.JButton passButton;
    public javax.swing.JButton playButton;
    public javax.swing.JLabel player1Finished;
    public javax.swing.JLabel player1RemainigCards;
    public javax.swing.JLabel player1TichuGrTichu;
    public javax.swing.JLabel player2Finished;
    public javax.swing.JLabel player2RemainigCards;
    public javax.swing.JLabel player2TichuGrTichu;
    public javax.swing.JLabel player3Finished;
    public javax.swing.JLabel player3RemainigCards;
    public javax.swing.JLabel player3TichuGrTichu;
    public javax.swing.JLabel player4Finished;
    public javax.swing.JLabel player4RemainigCards;
    public javax.swing.JLabel player4TichuGrTichu;
    public javax.swing.JLabel playerCard1;
    public javax.swing.JLabel playerCard10;
    public javax.swing.JLabel playerCard11;
    public javax.swing.JLabel playerCard12;
    public javax.swing.JLabel playerCard13;
    public javax.swing.JLabel playerCard14;
    public javax.swing.JLabel playerCard2;
    public javax.swing.JLabel playerCard3;
    public javax.swing.JLabel playerCard4;
    public javax.swing.JLabel playerCard5;
    public javax.swing.JLabel playerCard6;
    public javax.swing.JLabel playerCard7;
    public javax.swing.JLabel playerCard8;
    public javax.swing.JLabel playerCard9;
    private javax.swing.JLayeredPane playerCardsPanel;
    private javax.swing.JLayeredPane scorePanel;
    public javax.swing.JLabel scoreTeam1;
    public javax.swing.JLabel scoreTeam2;
    public javax.swing.JButton tichuButton;
    public javax.swing.JLabel wish;
    // End of variables declaration//GEN-END:variables
}
