/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.two;

import javax.swing.JOptionPane;

/**
 *
 * @author Christine Fryling
 */
public class OrderImage extends javax.swing.JFrame {

    /**
     * Creates new form OrderImage
     */
    public OrderImage() {
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

        OrderDialog = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        crustLabel = new javax.swing.JLabel();
        eightRadio = new javax.swing.JRadioButton();
        tenRadio = new javax.swing.JRadioButton();
        twelveRadio = new javax.swing.JRadioButton();
        sixteenRadio = new javax.swing.JRadioButton();
        typeLabel = new javax.swing.JLabel();
        thinRadio = new javax.swing.JRadioButton();
        deepRadio = new javax.swing.JRadioButton();
        handRadio = new javax.swing.JRadioButton();
        toppingsLabel = new javax.swing.JLabel();
        cheeseCheck = new javax.swing.JCheckBox();
        pepperCheck = new javax.swing.JCheckBox();
        olivesCheck = new javax.swing.JCheckBox();
        sausageCheck = new javax.swing.JCheckBox();
        greenCheck = new javax.swing.JCheckBox();
        hamCheck = new javax.swing.JCheckBox();
        pineappleCheck = new javax.swing.JCheckBox();
        mushroomsCheck = new javax.swing.JCheckBox();
        redCheck = new javax.swing.JCheckBox();
        submitBtn = new javax.swing.JButton();
        sizeGroup = new javax.swing.ButtonGroup();
        typeGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        loginBtn = new javax.swing.JButton();
        orderBtn = new javax.swing.JButton();
        couponBtn = new javax.swing.JButton();
        feedbackBtn = new javax.swing.JButton();
        pizzaLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pizzaTxtArea = new javax.swing.JTextArea();
        yourPizzaLabel = new javax.swing.JLabel();

        OrderDialog.setLocation(new java.awt.Point(400, 400));
        OrderDialog.setSize(new java.awt.Dimension(500, 300));

        jPanel2.setBounds(new java.awt.Rectangle(32767, 32768, 100, 100));

        crustLabel.setText("Crust Size:");

        sizeGroup.add(eightRadio);
        eightRadio.setText("8\"");
        eightRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightRadioActionPerformed(evt);
            }
        });

        sizeGroup.add(tenRadio);
        tenRadio.setText("10\"");
        tenRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenRadioActionPerformed(evt);
            }
        });

        sizeGroup.add(twelveRadio);
        twelveRadio.setText("12\"");
        twelveRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twelveRadioActionPerformed(evt);
            }
        });

        sizeGroup.add(sixteenRadio);
        sixteenRadio.setText("16\"");
        sixteenRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixteenRadioActionPerformed(evt);
            }
        });

        typeLabel.setText("Crust Type:");

        typeGroup.add(thinRadio);
        thinRadio.setText("Thin");
        thinRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thinRadioActionPerformed(evt);
            }
        });

        typeGroup.add(deepRadio);
        deepRadio.setText("Deep Dish");
        deepRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deepRadioActionPerformed(evt);
            }
        });

        typeGroup.add(handRadio);
        handRadio.setText("Hand Tossed");
        handRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handRadioActionPerformed(evt);
            }
        });

        toppingsLabel.setText("Toppings:");

        cheeseCheck.setText("Extra Cheese");

        pepperCheck.setText("Pepperoni");

        olivesCheck.setText("Olives");

        sausageCheck.setText("Sausage");

        greenCheck.setText("Green Peppers");

        hamCheck.setText("Ham");

        pineappleCheck.setText("Pineapple");

        mushroomsCheck.setText("Mushrooms");

        redCheck.setText("Red Peppers");

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(typeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thinRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deepRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(handRadio))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(crustLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eightRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tenRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twelveRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sixteenRadio))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(toppingsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cheeseCheck)
                                    .addComponent(sausageCheck)
                                    .addComponent(pineappleCheck))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(mushroomsCheck)
                                        .addGap(18, 18, 18)
                                        .addComponent(redCheck))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pepperCheck)
                                            .addComponent(greenCheck))
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(hamCheck)
                                            .addComponent(olivesCheck)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(submitBtn)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crustLabel)
                    .addComponent(eightRadio)
                    .addComponent(tenRadio)
                    .addComponent(twelveRadio)
                    .addComponent(sixteenRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thinRadio)
                    .addComponent(deepRadio)
                    .addComponent(handRadio)
                    .addComponent(typeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toppingsLabel)
                    .addComponent(cheeseCheck)
                    .addComponent(pepperCheck)
                    .addComponent(olivesCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sausageCheck)
                    .addComponent(greenCheck)
                    .addComponent(hamCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pineappleCheck)
                    .addComponent(mushroomsCheck)
                    .addComponent(redCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(submitBtn)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout OrderDialogLayout = new javax.swing.GroupLayout(OrderDialog.getContentPane());
        OrderDialog.getContentPane().setLayout(OrderDialogLayout);
        OrderDialogLayout.setHorizontalGroup(
            OrderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        OrderDialogLayout.setVerticalGroup(
            OrderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        orderBtn.setText("Order Pizza");
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });

        couponBtn.setText("Find Coupon");

        feedbackBtn.setText("Offer Feedback");

        pizzaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab/two/Whole-Pizza-100x100.jpg"))); // NOI18N

        pizzaTxtArea.setColumns(20);
        pizzaTxtArea.setRows(5);
        jScrollPane1.setViewportView(pizzaTxtArea);

        yourPizzaLabel.setText("Your Pizza:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(couponBtn)
                            .addComponent(loginBtn)
                            .addComponent(orderBtn)
                            .addComponent(feedbackBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(pizzaLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yourPizzaLabel))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(loginBtn)
                        .addGap(5, 5, 5)
                        .addComponent(orderBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(couponBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(feedbackBtn)
                        .addGap(26, 26, 26)
                        .addComponent(pizzaLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(yourPizzaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed
        // TODO add your handling code here:
        OrderDialog.setVisible(true);
        
        
    }//GEN-LAST:event_orderBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        if(eightRadio.isSelected() || tenRadio.isSelected() || twelveRadio.isSelected() || sixteenRadio.isSelected())
        {
            if(thinRadio.isSelected() | deepRadio.isSelected() | handRadio.isSelected())
            {
                 //check validity here
                OrderDialog.setVisible(false);
                //fix it so the buttons show
                pizzaTxtArea.setText("Size: " + size + "\nCrust Type: " + type + "\nToppings: ");
            }
            else
            {
                 JOptionPane.showMessageDialog(null,"Error. Select type of crust.");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Error. Missing size and/or type of crust.");
        }
        
    }//GEN-LAST:event_submitBtnActionPerformed

    
    
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnActionPerformed

    private String size;

    private void eightRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightRadioActionPerformed
        // TODO add your handling code here:
        if(eightRadio.isSelected())
        {
            size = "8 inches";
        }
    }//GEN-LAST:event_eightRadioActionPerformed

    private void tenRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenRadioActionPerformed
        // TODO add your handling code here:
        if(tenRadio.isSelected())
        {
            size = "10 inches";
        }
    }//GEN-LAST:event_tenRadioActionPerformed

    private void twelveRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twelveRadioActionPerformed
        // TODO add your handling code here:
        if(twelveRadio.isSelected())
        {
            size = "12 inches";
        }
    }//GEN-LAST:event_twelveRadioActionPerformed

    private void sixteenRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixteenRadioActionPerformed
        // TODO add your handling code here:
        if(sixteenRadio.isSelected())
        {
            size = "16 inches";
        }
    }//GEN-LAST:event_sixteenRadioActionPerformed

    private String type;
    
    private void thinRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thinRadioActionPerformed
        // TODO add your handling code here:
        if(thinRadio.isSelected())
        {
            type = "Thin Crust";
        }
       
    }//GEN-LAST:event_thinRadioActionPerformed

    private void deepRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deepRadioActionPerformed
        // TODO add your handling code here:
        if(deepRadio.isSelected())
        {
            type = "Deep Dish Crust";
        }
    }//GEN-LAST:event_deepRadioActionPerformed

    private void handRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handRadioActionPerformed
        // TODO add your handling code here:
        if(handRadio.isSelected())
        {
            type = "Hand Tossed Crust";
        }
    }//GEN-LAST:event_handRadioActionPerformed

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
            java.util.logging.Logger.getLogger(OrderImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderImage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog OrderDialog;
    private javax.swing.JCheckBox cheeseCheck;
    private javax.swing.JButton couponBtn;
    private javax.swing.JLabel crustLabel;
    private javax.swing.JRadioButton deepRadio;
    private javax.swing.JRadioButton eightRadio;
    private javax.swing.JButton feedbackBtn;
    private javax.swing.JCheckBox greenCheck;
    private javax.swing.JCheckBox hamCheck;
    private javax.swing.JRadioButton handRadio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JCheckBox mushroomsCheck;
    private javax.swing.JCheckBox olivesCheck;
    private javax.swing.JButton orderBtn;
    private javax.swing.JCheckBox pepperCheck;
    private javax.swing.JCheckBox pineappleCheck;
    private javax.swing.JLabel pizzaLabel;
    private javax.swing.JTextArea pizzaTxtArea;
    private javax.swing.JCheckBox redCheck;
    private javax.swing.JCheckBox sausageCheck;
    private javax.swing.JRadioButton sixteenRadio;
    private javax.swing.ButtonGroup sizeGroup;
    private javax.swing.JButton submitBtn;
    private javax.swing.JRadioButton tenRadio;
    private javax.swing.JRadioButton thinRadio;
    private javax.swing.JLabel toppingsLabel;
    private javax.swing.JRadioButton twelveRadio;
    private javax.swing.ButtonGroup typeGroup;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel yourPizzaLabel;
    // End of variables declaration//GEN-END:variables
}
