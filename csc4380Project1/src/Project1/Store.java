/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author aaron
 */
public class Store extends javax.swing.JPanel {

    ImageIcon redCar, blueCar, greenCar, purpleCar, yellowCar, redTruck, blueTruck,
            greenTruck, purpleTruck, yellowTruck;
    JButton btnRedCar, btnBlueCar, btnGreenCar, btnPurpleCar, btnYellowCar, btnRedTruck,
            btnBlueTruck, btnGreenTruck, btnPurpleTruck, btnYellowTruck;
    
    
    
    public Store() {
        initComponents();
         String localDir = System.getProperty("user.dir");
        redCar = new ImageIcon(localDir + "\\src\\resources\\red_car.png");
        btnRedCar = new JButton(redCar);
        
        btnRedCar.setSize(55,60);
        btnRedCar.setLocation(60, 100);
        //button.setEditable(false);
        this.add(btnRedCar);
        
        
        blueCar = new ImageIcon(localDir + "\\src\\resources\\blue_car.png");
        btnBlueCar = new JButton(blueCar);
        
        btnBlueCar.setSize(55,60);
        btnBlueCar.setLocation(190, 100);
        //button.setEditable(false);
        this.add(btnBlueCar);
        
        
        
        greenCar = new ImageIcon(localDir + "\\src\\resources\\green_car.png");
        btnGreenCar = new JButton(greenCar);
        
        btnGreenCar.setSize(55,60);
        btnGreenCar.setLocation(320, 100);
        //button.setEditable(false);
        this.add(btnGreenCar);
        
        
        
        purpleCar = new ImageIcon(localDir + "\\src\\resources\\purple_car.png");
        btnPurpleCar = new JButton(purpleCar);
        
        btnPurpleCar.setSize(55,60);
        btnPurpleCar.setLocation(450, 100);
        //button.setEditable(false);
        this.add(btnPurpleCar);
        
        
        
        yellowCar = new ImageIcon(localDir + "\\src\\resources\\yellow_car.png");
        btnYellowCar = new JButton(yellowCar);
        
        btnYellowCar.setSize(55,60);
        btnYellowCar.setLocation(580, 100);
        //button.setEditable(false);
        this.add(btnYellowCar);
        
        
        
        redTruck = new ImageIcon(localDir + "\\src\\resources\\red_truck.png");
        btnRedTruck = new JButton(redTruck);
        
        btnRedTruck.setSize(55,60);
        btnRedTruck.setLocation(60, 220);
        //button.setEditable(false);
        this.add(btnRedTruck);
        
        
        
        blueTruck = new ImageIcon(localDir + "\\src\\resources\\blue_truck.png");
        btnBlueTruck = new JButton(blueTruck);
        
        btnBlueTruck.setSize(55,60);
        btnBlueTruck.setLocation(190, 220);
        //button.setEditable(false);
        this.add(btnBlueTruck);
        
        
        
        greenTruck = new ImageIcon(localDir + "\\src\\resources\\green_truck.png");
        btnGreenTruck = new JButton(greenTruck);
        
        btnGreenTruck.setSize(55,60);
        btnGreenTruck.setLocation(320, 220);
        //button.setEditable(false);
        this.add(btnGreenTruck);
        
        
        
        purpleTruck = new ImageIcon(localDir + "\\src\\resources\\purple_truck.png");
        btnPurpleTruck = new JButton(purpleTruck);
        
        btnPurpleTruck.setSize(55,60);
        btnPurpleTruck.setLocation(450, 220);
        //button.setEditable(false);
        this.add(btnPurpleTruck);
        
        
        
        yellowTruck = new ImageIcon(localDir + "\\src\\resources\\yellow_truck.png");
        btnYellowTruck = new JButton(yellowTruck);
        
        btnYellowTruck.setSize(55,60);
        btnYellowTruck.setLocation(580, 220);
        //button.setEditable(false);
        this.add(btnYellowTruck);
        
        
        
        
        
        initCustomComponents();
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
        lblRedCar = new javax.swing.JLabel();
        lblBlueCar = new javax.swing.JLabel();
        lblGreenCar = new javax.swing.JLabel();
        lblPurpleCar = new javax.swing.JLabel();
        lblGoldCar = new javax.swing.JLabel();
        lblRedTruck = new javax.swing.JLabel();
        lblBlueTruck = new javax.swing.JLabel();
        lblGreenTruck = new javax.swing.JLabel();
        lblPurpleTruck = new javax.swing.JLabel();
        lblGoldTruck = new javax.swing.JLabel();

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblRedCar.setText("$0");

        lblBlueCar.setText("$2,000");

        lblGreenCar.setText("$3,000");

        lblPurpleCar.setText("$4,000");

        lblGoldCar.setText("$5,000");

        lblRedTruck.setText("$6,000");

        lblBlueTruck.setText("$7,000");

        lblGreenTruck.setText("$8,000");

        lblPurpleTruck.setText("$9,000");

        lblGoldTruck.setText("$10,000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRedTruck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRedCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBlueCar)
                    .addComponent(lblBlueTruck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGreenCar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblGreenTruck, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPurpleCar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPurpleTruck, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGoldCar)
                    .addComponent(lblGoldTruck))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRedCar)
                    .addComponent(lblBlueCar)
                    .addComponent(lblGreenCar)
                    .addComponent(lblPurpleCar)
                    .addComponent(lblGoldCar))
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRedTruck)
                    .addComponent(lblBlueTruck)
                    .addComponent(lblGreenTruck)
                    .addComponent(lblPurpleTruck)
                    .addComponent(lblGoldTruck))
                .addContainerGap(185, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        mainFrame topFrame = (mainFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.changeContext("main screen");
    }//GEN-LAST:event_btnBackActionPerformed

    
    private void btnRedCarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        mainFrame topFrame = (mainFrame) SwingUtilities.getWindowAncestor(this);
        System.out.println("Hello");
    }   
    
    private void btnBlueCarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        mainFrame topFrame = (mainFrame) SwingUtilities.getWindowAncestor(this);
    } 
    
    private void btnGreenCarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        mainFrame topFrame = (mainFrame) SwingUtilities.getWindowAncestor(this);
    } 
    
    private void btnPurpleCarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        mainFrame topFrame = (mainFrame) SwingUtilities.getWindowAncestor(this);
    } 
    
    private void btnYellowCarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        mainFrame topFrame = (mainFrame) SwingUtilities.getWindowAncestor(this);
    } 
    
    private void btnRedTruckActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        mainFrame topFrame = (mainFrame) SwingUtilities.getWindowAncestor(this);
    } 
    
    private void btnBlueTruckActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        mainFrame topFrame = (mainFrame) SwingUtilities.getWindowAncestor(this);
    } 
    
    private void btnGreenTruckActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        mainFrame topFrame = (mainFrame) SwingUtilities.getWindowAncestor(this);
    } 
    
    private void btnPurpleTruckActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        mainFrame topFrame = (mainFrame) SwingUtilities.getWindowAncestor(this);
    } 
    
    private void btnYellowTruckActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        mainFrame topFrame = (mainFrame) SwingUtilities.getWindowAncestor(this);
    } 
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblBlueCar;
    private javax.swing.JLabel lblBlueTruck;
    private javax.swing.JLabel lblGoldCar;
    private javax.swing.JLabel lblGoldTruck;
    private javax.swing.JLabel lblGreenCar;
    private javax.swing.JLabel lblGreenTruck;
    private javax.swing.JLabel lblPurpleCar;
    private javax.swing.JLabel lblPurpleTruck;
    private javax.swing.JLabel lblRedCar;
    private javax.swing.JLabel lblRedTruck;
    // End of variables declaration//GEN-END:variables

    private void initCustomComponents() {
        btnRedCar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedCarActionPerformed(evt);
            }
        });
        
        btnBlueCar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlueCarActionPerformed(evt);
            }
        });
        
        
        btnGreenCar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGreenCarActionPerformed(evt);
            }
        });
        
        
        btnPurpleCar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurpleCarActionPerformed(evt);
            }
        });
        
        btnYellowCar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYellowCarActionPerformed(evt);
            }
        });
        
        btnRedTruck.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedTruckActionPerformed(evt);
            }
        });
        
        btnBlueTruck.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlueTruckActionPerformed(evt);
            }
        });
        
        
        btnGreenTruck.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGreenTruckActionPerformed(evt);
            }
        });
        
        
        btnPurpleTruck.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurpleTruckActionPerformed(evt);
            }
        });
        
        
        btnYellowTruck.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYellowTruckActionPerformed(evt);
            }
        });
    }
}
