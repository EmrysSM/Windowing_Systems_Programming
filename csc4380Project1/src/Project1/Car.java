/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
    
    public Car(
        int startX, int startY,
        int deltaX, int deltaY,
        int directionX, int directionY,
        int delay)
    {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
        this.directionX = directionX;
        this.directionY = directionY;
        

        setIcon( new ImageIcon("C:\\Users\\escottmurrell\\IdeaProjects\\Windowing_Systems_Programming\\csc4380Project1\\src\\resources\\red_car.png") );
        setSize( getPreferredSize() );
        setLocation(startX, startY);
        new javax.swing.Timer(delay, this).start();
    }
    
    
    public void actionPerformed(ActionEvent e) {
        Container parent = getParent();

        //  Determine next X position

        int nextX = getLocation().x + (deltaX * directionX);

        if (nextX < 0)
        {
            nextX = 0;
            directionX *= -1;
        }

        if ( nextX + getSize().width > parent.getSize().width)
        {
            nextX = parent.getSize().width - getSize().width;
            directionX *= -1;
        }

        //  Determine next Y position

        int nextY = getLocation().y + (deltaY * directionY);

        if (nextY < 0)
        {
            nextY = 0;
            directionY *= -1;
        }

        if ( nextY + getSize().height > parent.getSize().height)
        {
            nextY = parent.getSize().height - getSize().height;
            directionY *= -1;
        }

        //  Move the label

        setLocation(nextX, nextY);
    }

    public static void main(String[] args)
    {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        frame.setContentPane(panel);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().setLayout(null);
//      frame.getContentPane().add( new TimerAnimation(10, 10, 2, 3, 1, 1, 10) );
        frame.getContentPane().add(new Car(300, 100, 3, 2, -1, 1, 20) );
//      frame.getContentPane().add( new TimerAnimation(0, 000, 5, 0, 1, 1, 20) );
        frame.getContentPane().add(new Car(0, 200, 5, 0, 1, 1, 80) );
        frame.setSize(400, 400);
        frame.setLocationRelativeTo( null );
        frame.setVisible(true);
//      frame.getContentPane().add( new TimerAnimation(10, 10, 2, 3, 1, 1, 10) );
//      frame.getContentPane().add( new TimerAnimation(10, 10, 3, 0, 1, 1, 10) );
    }
}
