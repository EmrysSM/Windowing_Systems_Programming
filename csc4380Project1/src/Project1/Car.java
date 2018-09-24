/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author escottmurrell
 */
public class Car extends JLabel implements ActionListener {
    int deltaX = 2;
    int deltaY = 3;
    int directionX = 1;
    int directionY = 1;
    Image img;
    String color;
    
    public Car(
        int startX, int startY,
        int deltaX, int deltaY,
        int directionX, int directionY,
        int delay, String colorDir)
    {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
        this.directionX = directionX;
        this.directionY = directionY;
        this.color = color;
        
        String localDir = System.getProperty("user.dir");
        img = Toolkit.getDefaultToolkit().createImage(localDir + colorDir);
        setIcon( new ImageIcon(img) );
        setSize( getPreferredSize() );
        setLocation(startX, startY);
        new javax.swing.Timer(delay, this).start();
    }
    
    boolean finished = false;
    public void actionPerformed(ActionEvent e) {
        if(!finished)
        {
        Container parent = getParent();

        //  Determine next X position

        int nextX = getLocation().x + (deltaX * directionX);

//        if (nextX < 0)
//        {
//            nextX = 0;
//            directionX *= -1;
//            parent.remove(this);
//            parent.repaint();
//        }
//
//        if ( nextX + getSize().width > parent.getSize().width)
//        {
//            nextX = parent.getSize().width - getSize().width;
//            directionX *= -1;
//            parent.remove(this);
//            parent.repaint();
//        }

        //  Determine next Y position

        int nextY = getLocation().y + (deltaY * directionY);

//        if (nextY < 0)
//        {
//            nextY = 0;
//            directionY *= -1;
//            parent.remove(this);
//            parent.repaint();
//        }

        if ( nextY + getSize().height > parent.getSize().height)
        {
//            nextY = parent.getSize().height - getSize().height;
//            directionY *= -1;
            parent.remove(this);
            parent.repaint();
            finished = true;
            return;
        }

        //  Move the label
            setLocation(nextX, nextY);
        }
    }

    public static void main(String[] args)
    {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        frame.setContentPane(panel);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().setLayout(null);
        frame.setSize(700, 400);
        frame.setLocationRelativeTo( null );
        frame.setVisible(true);
//        generateObstacles(panel);
    
    
    }
    
//    public static void generateObstacles(JPanel panel) {
//        Random rand = new Random();
//        
//        while(true) {
//            int num = rand.nextInt(7);
//            int xLoc = num * 100 + 50;
//            panel.add(new Car(xLoc, 0, 0, 1, 0, 1, 10));
//            try {
//                Thread.sleep(1000);
//            } catch(Exception e) {
//                System.out.println(e);
//            }
//        }
//    }
}
