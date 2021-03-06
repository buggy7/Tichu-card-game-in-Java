/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichu;

/**
 *
 * @author matzaflokos
 */
public class Dragon extends javax.swing.JFrame {

    /**
     * Creates new form Dragon
     */
    public Dragon() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        leftPlayer = new javax.swing.JLabel();
        rightPlayer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Give Stack To :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        leftPlayer.setBackground(new java.awt.Color(255, 102, 0));
        leftPlayer.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        leftPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leftPlayer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        leftPlayer.setOpaque(true);
        leftPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftPlayerMouseClicked(evt);
            }
        });
        jPanel1.add(leftPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 160, 150, 50));

        rightPlayer.setBackground(new java.awt.Color(255, 102, 0));
        rightPlayer.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        rightPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rightPlayer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        rightPlayer.setOpaque(true);
        rightPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightPlayerMouseClicked(evt);
            }
        });
        jPanel1.add(rightPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 160, 150, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leftPlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftPlayerMouseClicked
        // TODO add your handling code here:
        TICHU.input = leftPlayer.getText();
        //TICHU.check = true;
        this.dispose();
        
    }//GEN-LAST:event_leftPlayerMouseClicked

    private void rightPlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightPlayerMouseClicked
        // TODO add your handling code here:
        TICHU.input = rightPlayer.getText();
        //TICHU.check = true;
        this.dispose();
    }//GEN-LAST:event_rightPlayerMouseClicked

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
            java.util.logging.Logger.getLogger(Dragon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dragon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dragon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dragon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dragon().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel leftPlayer;
    public javax.swing.JLabel rightPlayer;
    // End of variables declaration//GEN-END:variables
}
