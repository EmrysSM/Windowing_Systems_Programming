/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;
import javax.swing.SwingUtilities;


/**
 *
 * @author aaron
 */

public class HighScores extends javax.swing.JPanel {

    /**
     * Creates new form HighScores
     * @throws java.io.FileNotFoundException
     */
    final static int NUM_SCORES = 5;
    static HighScoreObject[] highScores = new HighScoreObject[NUM_SCORES];
    
    
    public HighScores() throws FileNotFoundException {
        initComponents();
        try{
        setScores();
        }catch(FileNotFoundException e){throw e;}
    }
    
    public void setScores() throws FileNotFoundException
    {
        String localDir = System.getProperty("user.dir");
        File inputFile = new File(localDir + "\\src\\resources\\scores.csv");
        Scanner scan = new Scanner(inputFile);
        //System.out.println(scan.next());
        for(int i = 0; i < NUM_SCORES; i++)
        {
            highScores[i] = new HighScoreObject(scan.next(), scan.next());
            
            //System.out.println(highScores[i].print());
        }
            lblScore0.setText(highScores[0].print());
            lblScore1.setText(highScores[1].print());
            lblScore2.setText(highScores[2].print());
            lblScore3.setText(highScores[3].print());
            lblScore4.setText(highScores[4].print());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblScore0 = new javax.swing.JLabel();
        lblScore1 = new javax.swing.JLabel();
        lblScore2 = new javax.swing.JLabel();
        lblScore3 = new javax.swing.JLabel();
        lblScore4 = new javax.swing.JLabel();

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblScore0.setText("jLabel1");

        lblScore1.setText("jLabel2");

        lblScore2.setText("jLabel3");

        lblScore3.setText("jLabel4");

        lblScore4.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblScore1)
                            .addComponent(lblScore0)
                            .addComponent(lblScore2)
                            .addComponent(lblScore3)
                            .addComponent(lblScore4))))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnBack)
                .addGap(59, 59, 59)
                .addComponent(lblScore0)
                .addGap(18, 18, 18)
                .addComponent(lblScore1)
                .addGap(18, 18, 18)
                .addComponent(lblScore2)
                .addGap(18, 18, 18)
                .addComponent(lblScore3)
                .addGap(18, 18, 18)
                .addComponent(lblScore4)
                .addContainerGap(141, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        mainFrame topFrame = (mainFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.changeContext("main screen");
    }//GEN-LAST:event_btnBackActionPerformed

    public HighScoreObject getHighScore(int i)
    {
        return highScores[i];
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblScore0;
    private javax.swing.JLabel lblScore1;
    private javax.swing.JLabel lblScore2;
    private javax.swing.JLabel lblScore3;
    private javax.swing.JLabel lblScore4;
    // End of variables declaration//GEN-END:variables

    
    
    boolean isHighScore(int score)
    {
        for(HighScoreObject h : highScores)
        {
            if(Integer.parseInt(h.getScore()) < score)
            {
                return true;
            }
        }
        return false;
    }
    
    void putNewHighScore(String name, String score)
    {
        int indexOfSmallest = 0;
        int smallestVal = Integer.parseInt(highScores[0].getScore());
        for(int i = 0; i < 5; i++)
        {
            if(Integer.parseInt(highScores[i].getScore()) < smallestVal)
            {
                smallestVal = Integer.parseInt(highScores[i].getScore());
                indexOfSmallest = i;
            }
        }
        highScores[indexOfSmallest] = new HighScoreObject(name, score);
    }
}
