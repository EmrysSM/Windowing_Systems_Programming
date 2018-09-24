/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author escottmurrell
 */
public class ControlledCar extends Car implements ActionListener {
    
    public ControlledCar(
        int startX, int startY,
        int deltaX, int deltaY,
        int directionX, int directionY,
        int delay, String color) {
        super(startX,startY, deltaX, deltaY, directionX, directionY, delay, color);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
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
            return;
        }

        //  Move the label
        setLocation(nextX, nextY);
    }
}
