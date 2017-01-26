
package tictactoe;

import java.util.ArrayList;

/**
 *
 * @author shasta-ritchie
 */

public class TTBoard extends javax.swing.JFrame {

    /**
     * Creates new form TTBoard
     */
    public TTBoard() {
        initComponents();
    }
    
    // initialize main lists and visual component
    ArrayList<Integer> player1 = new ArrayList<>();
    ArrayList<Integer> player2 = new ArrayList<>();
    boolean isplayer1 = true;
    ArrayList possibilities = initialize();

    boolean debugMode = false;

    private ArrayList initialize(){
       
        // Grid:
        // 1 4 7
        // 2 5 8
        // 3 6 9
        
        // Combinations needed for win:
        // (1,2,3) (4,5,6) (7,8,9)
        // (1,4,7) (2,5,8) (3,6,9)
        // (1,5,9) (3,5,7)
        
        ArrayList<Integer> a = new ArrayList<>(); a.add(1); a.add(2); a.add(3);
        ArrayList<Integer> b = new ArrayList<>(); b.add(4); b.add(5); b.add(6);
        ArrayList<Integer> c = new ArrayList<>(); c.add(7); c.add(8); c.add(9);
        ArrayList<Integer> d = new ArrayList<>(); d.add(1); d.add(4); d.add(7);        
        ArrayList<Integer> e = new ArrayList<>(); e.add(2); e.add(5); e.add(8);
        ArrayList<Integer> f = new ArrayList<>(); f.add(3); f.add(6); f.add(9);       
        ArrayList<Integer> g = new ArrayList<>(); g.add(1); g.add(5); g.add(9);
        ArrayList<Integer> h = new ArrayList<>(); h.add(3); h.add(5); h.add(7);

        ArrayList possibles = new ArrayList();
        possibles.add(a); possibles.add(b); possibles.add(c);
        possibles.add(d); possibles.add(e); possibles.add(f);
        possibles.add(g); possibles.add(h);
        
        
        
        //System.out.println(possibles);
        return possibles;
    }
    
    private void disable_board(){
        square1.setEnabled(false);
        square2.setEnabled(false);
        square3.setEnabled(false);
        square4.setEnabled(false);
        square5.setEnabled(false);
        square6.setEnabled(false);
        square7.setEnabled(false);
        square8.setEnabled(false);
        square9.setEnabled(false);
        
    }
    
    private void btn(int btn_num){
        if (isplayer1){
            player1.add(btn_num);
            if(debugMode) {
                System.out.println(player1);
            }
            win_check(player1, possibilities);
        } else {
            player2.add(btn_num);
            if(debugMode) {
                System.out.println(player2);
            }
            win_check(player2, possibilities);
        }
    }
    
    private void win() {
        currentPlayer.setText("You Win!!!");
        disable_board();
        restart_btn.setEnabled(true);
    }
    
    private void win_check(ArrayList lon, ArrayList possibles){
        
        if (player1.size() + player2.size() == 9){
            currentPlayer.setText("Cat's Game!");
            disable_board();
            restart_btn.setEnabled(true);
        } else {
            isplayer1 = !isplayer1;
            if(debugMode) {
                System.out.println(isplayer1);
            }
            currentPlayer.setText(isplayer1 ? "Player 1" : "Player 2");
        }
        
        for (Object counter : possibles){
            //System.out.println(counter);
            //System.out.println(lon.containsAll((ArrayList) counter));
            if (lon.containsAll((ArrayList) counter)){
                System.out.println("You Win!");
                win();
                break;
            }
        }

    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        square1 = new javax.swing.JButton();
        square2 = new javax.swing.JButton();
        square3 = new javax.swing.JButton();
        square4 = new javax.swing.JButton();
        square5 = new javax.swing.JButton();
        square6 = new javax.swing.JButton();
        square7 = new javax.swing.JButton();
        square8 = new javax.swing.JButton();
        square9 = new javax.swing.JButton();
        currentPlayer = new javax.swing.JLabel();
        restart_btn = new javax.swing.JButton();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        square1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square1ActionPerformed(evt);
            }
        });

        square2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square2ActionPerformed(evt);
            }
        });

        square3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square3ActionPerformed(evt);
            }
        });

        square4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square4ActionPerformed(evt);
            }
        });

        square5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square5ActionPerformed(evt);
            }
        });

        square6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square6ActionPerformed(evt);
            }
        });

        square7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square7ActionPerformed(evt);
            }
        });

        square8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square8ActionPerformed(evt);
            }
        });

        square9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square9ActionPerformed(evt);
            }
        });

        currentPlayer.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        currentPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentPlayer.setText("Player 1");

        restart_btn.setText("Restart");
        restart_btn.setEnabled(false);
        restart_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restart_btnActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Phosphate", 0, 44)); // NOI18N
        title.setText("Tic-Tac-Toe!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(square1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(square2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(square3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(square5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(square4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(square6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(square8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(square7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(square9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(restart_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(restart_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentPlayer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(square1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(square4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(square7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(square5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(square2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(square8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(square3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(square6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(square9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void square4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square4ActionPerformed
        square4.setText(isplayer1 ? "X" : "O");
        btn(4);
    }//GEN-LAST:event_square4ActionPerformed

    private void square2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square2ActionPerformed
        square2.setText(isplayer1 ? "X" : "O");
        btn(2);
    }//GEN-LAST:event_square2ActionPerformed

    private void square3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square3ActionPerformed
        square3.setText(isplayer1 ? "X" : "O");
        btn(3);
    }//GEN-LAST:event_square3ActionPerformed

    private void square5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square5ActionPerformed
        square5.setText(isplayer1 ? "X" : "O");
        btn(5);
    }//GEN-LAST:event_square5ActionPerformed

    private void square6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square6ActionPerformed
        square6.setText(isplayer1 ? "X" : "O");
        btn(6);
    }//GEN-LAST:event_square6ActionPerformed

    private void square9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square9ActionPerformed
        square9.setText(isplayer1 ? "X" : "O");
        btn(9);
    }//GEN-LAST:event_square9ActionPerformed

    private void square8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square8ActionPerformed
        square8.setText(isplayer1 ? "X" : "O");
        btn(8);
    }//GEN-LAST:event_square8ActionPerformed

    private void square7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square7ActionPerformed
        square7.setText(isplayer1 ? "X" : "O");
        btn(7);
    }//GEN-LAST:event_square7ActionPerformed

    private void square1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square1ActionPerformed
        square1.setText(isplayer1 ? "X" : "O");
        btn(1);
    }//GEN-LAST:event_square1ActionPerformed

    private void restart_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restart_btnActionPerformed
        // re-enable board
        square1.setEnabled(true);
        square2.setEnabled(true);
        square3.setEnabled(true);
        square4.setEnabled(true);
        square5.setEnabled(true);
        square6.setEnabled(true);
        square7.setEnabled(true);
        square8.setEnabled(true);
        square9.setEnabled(true);
        
        // re-initialize ArrayLists
        player1.clear();
        player2.clear();
        isplayer1 = true;
       
        // reset player indicator
        currentPlayer.setText("Player 1");
        // reset button text
        square1.setText("");
        square2.setText("");
        square3.setText("");
        square4.setText("");
        square5.setText("");
        square6.setText("");
        square7.setText("");
        square8.setText("");
        square9.setText("");

        // set reset button to disabled
        restart_btn.setEnabled(false);
        initialize();
        
    }//GEN-LAST:event_restart_btnActionPerformed

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
            java.util.logging.Logger.getLogger(TTBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TTBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TTBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TTBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TTBoard().setVisible(true);
            }
        });
        
        // main program loop HERE
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentPlayer;
    private javax.swing.JButton restart_btn;
    private javax.swing.JButton square1;
    private javax.swing.JButton square2;
    private javax.swing.JButton square3;
    private javax.swing.JButton square4;
    private javax.swing.JButton square5;
    private javax.swing.JButton square6;
    private javax.swing.JButton square7;
    private javax.swing.JButton square8;
    private javax.swing.JButton square9;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

}
