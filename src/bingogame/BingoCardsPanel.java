/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingogame;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tylar
 */
public class BingoCardsPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    private Game game;
    private List<Boolean> bingoCheck;
    private List<BingoButton> buttons = new ArrayList();
    private List<Ball> drawnBalls;
    private DrawHistoryPane drawHistoryPanel;
    int count=0;
    
    public BingoCardsPanel() {
        initComponents();
    }
    public void setMainFrame(MainFrame mainFrame){
        this.mainFrame = mainFrame;
        game = mainFrame.getGame();
        drawHistoryPanel = mainFrame.getDrawHistoryPanel();
    }
    public void createCards(int x, int y, String[][] card){
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    buttons.add(new BingoButton(card[j][i]));
                    buttons.get(count).setBounds(x+=54, y, 48, 50);
                    this.add(buttons.get(count));
    //              buttons.get(i).setFont(new Font("Arial", Font.PLAIN, 8));
                    count++;
                }
                y+=58;
                x-=270;
            }
    }
    private void checkMatches(int index){
        bingoCheck = new ArrayList();
        this.drawnBalls = drawHistoryPanel.getDrawnBalls();
        boolean tempCheck = false;
        for(int x=0; x<(buttons.size()/2); x++){
            for(int y=0; y<drawnBalls.size(); y++){
                if(buttons.get(x + index).getCheck().equals("F-3700")){
                   tempCheck = true;
                   break;
                }
                else if(buttons.get(x + index).getCheck().equals(drawnBalls.get(y).toString()) && buttons.get(x + index).getClicked() == true){
                   tempCheck = true;
                   break;
                }
                else {
                    tempCheck = false;
                }
            }
            bingoCheck.add(tempCheck);
        }
        checkBingo(bingoCheck);
    }
    
    private void checkBingo(List<Boolean> bingoCheck){
        Boolean winner = false;
        for(int y=0; y<5; y++){
            for(int x=0; x<5; x++){
                if(bingoCheck.get(x+(y*5)) == false){
                    winner = false;
                    break;
                }
                else{
                    winner = true;
                }
            }
            if(winner == true)
                break;
            for(int x=0; x<5; x++){
                if(bingoCheck.get((x*5)+y) == false){
                    winner = false;
                    break;
                }
                else{
                    winner = true;
                }
            }
            if(winner == true)
                break;
            for(int x=0; x<5; x++){
                if(bingoCheck.get(x*6) == false){
                        winner = false;
                        break;
                    }
                    else{
                        winner = true;
                    }
            }
            if(winner == true)
                break;
            for(int x=0; x<5; x++){
                if(bingoCheck.get(4*x+4) == false){
                        winner = false;
                        break;
                    }
                    else{
                        winner = true;
                    }
            }
            if(winner == true)
                break;
        }
        if(winner == true){
            mainFrame.winner();
        }
        else{
            drawHistoryPanel.falseBingo();
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

        jButton61 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        playerOneBingoButton = new javax.swing.JButton();
        playerTwoBingoButton = new javax.swing.JButton();

        jButton1.setText("B");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("I");

        jButton3.setText("N");

        jButton19.setText("G");

        jButton25.setText("O");

        jButton36.setText("G");

        jButton37.setText("N");

        jButton41.setText("I");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton50.setText("B");

        jButton60.setText("O");

        playerOneBingoButton.setText("Player One Bingo");
        playerOneBingoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerOneBingoButtonActionPerformed(evt);
            }
        });

        playerTwoBingoButton.setText("Player Two Bingo");
        playerTwoBingoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerTwoBingoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playerTwoBingoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(playerOneBingoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(playerOneBingoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(playerTwoBingoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void playerOneBingoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerOneBingoButtonActionPerformed
        checkMatches(0);
    }//GEN-LAST:event_playerOneBingoButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    private void playerTwoBingoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerTwoBingoButtonActionPerformed
        checkMatches(25);
    }//GEN-LAST:event_playerTwoBingoButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton playerOneBingoButton;
    private javax.swing.JButton playerTwoBingoButton;
    // End of variables declaration//GEN-END:variables
}