/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.SwingUtilities;

/**
 *
 * @author aaron
 */


public class GamePanel extends javax.swing.JPanel {

    /**
     * Creates new form GamePanel
     */
    Image img;
    static int currentScore;
    mainFrame topFrame;
    Car pCar;
    static ControlledCar userCar;
    AudioInputStream audioInputStream;
    Clip clip;
    

    public GamePanel() {
        initComponents();
        topFrame = (mainFrame) SwingUtilities.getWindowAncestor(this);
        String localDir = System.getProperty("user.dir");
        img = Toolkit.getDefaultToolkit().createImage(localDir + "\\src\\resources\\streetBackground.png");
        currentScore = 0;
//        this.setBackground(Color.black);
    }
    
    public static void generateObstacles(JPanel panel) {
        
        Random rand = new Random();
        
        Timer time = new Timer(1000, new ActionListener() {
//        while(true) {
//            String localDir = System.getProperty("user.dir");
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = rand.nextInt(7);
                int xLoc = num * 100+ 20;
                panel.add(new Car(xLoc, 0, 0, 1, 1, 1, 10, "\\src\\resources\\red_car.png"));
    //            try {
    //                Thread.sleep(1000);
    //            } catch(Exception e) {
    //                System.out.println(e);
    //            }
                currentScore+= 100;
                lblScore.setText("Score: " + currentScore);
                
            }
        });
        time.start();
    }
    
    public boolean collisions() {
        Component[] comps = this.getComponents();
        boolean hit = false;
                int carCount = 0;
                for (Component comp : comps) {
                    if (comp instanceof Car) {
                        carComps[carCount] = comp;
                        carCount++;
                    }
                }
                for (Component carComp : carComps) {
                    if ((carComp.getLocation().y + carComp.getSize().height) >= userCar.getLocation().y &&
                            carComp.getLocation().x == userCar.getLocation().x) {
                        hit = true;
                        break;
                    }
                }
            
        return hit;
    }
    
    public void gameOver(){
        topFrame.setLastScore(currentScore);
        clip.close();
        topFrame.changeContext("results");
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
       g.drawImage(img, 0, 0, this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblScore = new javax.swing.JLabel();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblScore.setBackground(new java.awt.Color(187, 187, 187));
        lblScore.setForeground(new java.awt.Color(255, 255, 255));
        lblScore.setText("Score:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(618, Short.MAX_VALUE)
                .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblScore)
                .addContainerGap(364, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        generateObstacles(this);
        topFrame = (mainFrame) SwingUtilities.getWindowAncestor(this);
        userCar = new ControlledCar(320, 300, 100, 100, 0, 0, 10, topFrame.currentVehicle);
        this.add(userCar);
        userCar.requestFocusInWindow();
        Timer collTime = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (collisions()) {
                    gameOver();
                }
            }
        });
        collTime.start();
        String localDir = System.getProperty("user.dir");;
        //The following audio file was pulled off of opengameart.org. All credit for it goes to Zander Noriega
        try { 
            audioInputStream =  AudioSystem.getAudioInputStream(new File(localDir + "\\src\\resources\\Game_bgm.wav"));
            clip = AudioSystem.getClip(); 
            clip.open(audioInputStream); 
            clip.loop(Clip.LOOP_CONTINUOUSLY); 
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel lblScore;
    // End of variables declaration//GEN-END:variables
}
