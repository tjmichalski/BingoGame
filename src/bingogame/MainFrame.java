/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingogame;

import java.awt.BorderLayout;

/**
 *
 * @author Tylar
 */
public class MainFrame extends javax.swing.JFrame {

    private GameStartPanel gameStartPanel;
    private PlayerNamesPanel playerNamesPanel;
    private BingoCardsPanel bingoCardsPanel;
    private DrawHistoryPane drawHistoryPanel;
    private Game game;
    private WinnerPanel winnerPanel;

    public MainFrame() {
        initComponents();
        gameStartPanel = new GameStartPanel();
        this.gameStartPanel.setMainFrame(this);
        this.getContentPane().add(this.gameStartPanel, BorderLayout.CENTER); 
        gameStartPanel.start();
    }
    public void startGame(){
        this.getContentPane().remove(this.gameStartPanel);
        this.playerNamesPanel = new PlayerNamesPanel();
        this.bingoCardsPanel = new BingoCardsPanel();
        this.drawHistoryPanel = new DrawHistoryPane();
        this.playerNamesPanel.setMainFrame(this);
        this.bingoCardsPanel.setMainFrame(this);
        this.drawHistoryPanel.setMainFrame(this);
        this.getContentPane().add(this.bingoCardsPanel, BorderLayout.CENTER);
        this.getContentPane().add(this.playerNamesPanel, BorderLayout.NORTH);
        this.getContentPane().add(this.drawHistoryPanel, BorderLayout.SOUTH);
        this.validate();
        this.repaint(); 
        this.game = gameStartPanel.getGame();
        playerNamesPanel.setNames();
        bingoCardsPanel.createCards(-40, 58, game.getCard(0,0));
        bingoCardsPanel.createCards(424, 58, game.getCard(1,0));
    }   
    public void winner() {
        this.getContentPane().remove(this.bingoCardsPanel);
        this.getContentPane().remove(this.playerNamesPanel);
        this.getContentPane().remove(this.drawHistoryPanel);
        this.winnerPanel = new WinnerPanel();
        this.winnerPanel.setMainFrame(this);
        this.getContentPane().add(this.winnerPanel, BorderLayout.CENTER);
        this.validate();
        this.repaint();
    }
    public Game getGame(){
        return this.game;
    }
    public DrawHistoryPane getDrawHistoryPanel(){
        return this.drawHistoryPanel;
    }
    public void resetGame(){
        this.getContentPane().remove(this.bingoCardsPanel);
        this.bingoCardsPanel = new BingoCardsPanel();
        this.bingoCardsPanel.setMainFrame(this);
        this.getContentPane().add(this.bingoCardsPanel, BorderLayout.CENTER);
        this.validate();
        this.repaint();
        bingoCardsPanel.createCards(-40, 58, game.getCard(0,0));
        bingoCardsPanel.createCards(424, 58, game.getCard(1,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(770, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
