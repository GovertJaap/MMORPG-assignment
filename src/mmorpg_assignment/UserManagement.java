/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmorpg_assignment;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import static java.lang.Integer.parseInt;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author gover_000
 */
public class UserManagement extends javax.swing.JFrame {

    public String usernameLogIn = "";
    public Integer balanceCurrent = 0;
    public Integer slotsCurrent = 0;
    public Integer monthsCurrent = 0;
    /**
     * Creates new form NewJFrame
     */
    public UserManagement(String username) {
        usernameLogIn = username;
        initComponents();
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MMORPG_assignmentPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        Users checkUser = em.find(Users.class, usernameLogIn);
        balanceCurrent = checkUser.getBalance();
        MoneyAmountTxtfield1.setText("€ " + balanceCurrent.toString() + ",-"); 
        slotsCurrent = checkUser.getCharacterSlots();
        SlotsTxtfield1.setText(slotsCurrent.toString());
        monthsCurrent = checkUser.getMonthsPayed();
        SubscriptionAmountTxtfield.setText(monthsCurrent.toString());
        
        em.getTransaction().commit();
        em.close();
        emf.close();
        
        MoneyAmountTxtfield.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) { 
                 MoneyAmountTxtfield.setText("");
            }
             public void focusLost(FocusEvent e) { 
                 //
            }
        });
                
        SlotsTxtfield.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) { 
                 SlotsTxtfield.setText("");
            }
             public void focusLost(FocusEvent e) { 
                 //
            }
        });
    }
    
    public UserManagement() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Backbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        MoneyAmountTxtfield = new javax.swing.JTextField();
        MoneyTransaction = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        SubscriptionMonth1 = new javax.swing.JRadioButton();
        SubscriptionMonth2 = new javax.swing.JRadioButton();
        SubscriptionMonth3 = new javax.swing.JRadioButton();
        SubscriptionMonth4 = new javax.swing.JRadioButton();
        RenewButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        SlotsTxtfield = new javax.swing.JTextField();
        SlotsButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        MoneyAmountTxtfield1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SlotsTxtfield1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        SubscriptionAmountTxtfield = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(775, 450));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(775, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("User Management");

        Backbutton.setText("Back");
        Backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbuttonActionPerformed(evt);
            }
        });

        jLabel2.setText("Add money: ");

        MoneyAmountTxtfield.setText("Amount");
        MoneyAmountTxtfield.setToolTipText("");
        MoneyAmountTxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoneyAmountTxtfieldActionPerformed(evt);
            }
        });

        MoneyTransaction.setText("Complete transaction");
        MoneyTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoneyTransactionActionPerformed(evt);
            }
        });

        jLabel3.setText("Renew Subscription:");

        buttonGroup1.add(SubscriptionMonth1);
        SubscriptionMonth1.setText("1 month (€ 5,-)");

        buttonGroup1.add(SubscriptionMonth2);
        SubscriptionMonth2.setText("2 months (€ 8,-)");

        buttonGroup1.add(SubscriptionMonth3);
        SubscriptionMonth3.setText("3 months (€ 10,-)");
        SubscriptionMonth3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubscriptionMonth3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(SubscriptionMonth4);
        SubscriptionMonth4.setText("1 year (€ 35,-)");
        SubscriptionMonth4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubscriptionMonth4ActionPerformed(evt);
            }
        });

        RenewButton.setText("Renew");
        RenewButton.setActionCommand("");
        RenewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenewButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Buy character slots (€ 1,-):");

        SlotsTxtfield.setText("Amount");

        SlotsButton.setText("Buy slot(s)");
        SlotsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlotsButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Current balance:");

        MoneyAmountTxtfield1.setEditable(false);
        MoneyAmountTxtfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoneyAmountTxtfield1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Current amount of slots:");

        SlotsTxtfield1.setEditable(false);

        jLabel7.setText("Months Left:");

        SubscriptionAmountTxtfield.setEditable(false);
        SubscriptionAmountTxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubscriptionAmountTxtfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MoneyAmountTxtfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(MoneyAmountTxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(MoneyTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SubscriptionMonth1)
                                    .addComponent(jLabel3)
                                    .addComponent(SubscriptionMonth2)
                                    .addComponent(SubscriptionMonth3)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(RenewButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SubscriptionMonth4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SubscriptionAmountTxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SlotsTxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SlotsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(SlotsTxtfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel1)))
                .addGap(0, 61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(SubscriptionAmountTxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(MoneyAmountTxtfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(MoneyAmountTxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MoneyTransaction))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SubscriptionMonth1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SubscriptionMonth2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SlotsTxtfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(SlotsTxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SlotsButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SubscriptionMonth3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SubscriptionMonth4)
                .addGap(18, 18, 18)
                .addComponent(RenewButton)
                .addGap(29, 29, 29)
                .addComponent(Backbutton)
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("User Managment", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Character Management", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubscriptionMonth3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubscriptionMonth3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubscriptionMonth3ActionPerformed

    private void MoneyTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoneyTransactionActionPerformed
        Transaction(MoneyAmountTxtfield.getText());
    }//GEN-LAST:event_MoneyTransactionActionPerformed

    private void RenewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenewButtonActionPerformed
//        System.out.println(buttonGroup1.getSelection().isSelected());
//        buttonGroup1.getSelection();
        Renew();
    }//GEN-LAST:event_RenewButtonActionPerformed

    private void SlotsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlotsButtonActionPerformed
        Slots(SlotsTxtfield.getText());
    }//GEN-LAST:event_SlotsButtonActionPerformed

    private void BackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbuttonActionPerformed
        this.dispose();
        try {
            new LoginScreen().setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(UserManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BackbuttonActionPerformed

    private void MoneyAmountTxtfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoneyAmountTxtfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MoneyAmountTxtfield1ActionPerformed

    private void MoneyAmountTxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoneyAmountTxtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MoneyAmountTxtfieldActionPerformed

    private void SubscriptionAmountTxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubscriptionAmountTxtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubscriptionAmountTxtfieldActionPerformed

    private void SubscriptionMonth4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubscriptionMonth4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubscriptionMonth4ActionPerformed

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
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserManagement().setVisible(true);
            }
        });
    }
    
    private void Transaction (String Amount) {
        Integer AmountIntBalance = null;
        try {
            AmountIntBalance = Integer.parseInt(Amount);
        }
        catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(null, "You didn't fill in a valid input", "Alert",JOptionPane.PLAIN_MESSAGE);
        }
        if (AmountIntBalance != null) {
            if (AmountIntBalance < 0) {
                JOptionPane.showConfirmDialog(null, "You can't enter a negative number", "Alert",JOptionPane.PLAIN_MESSAGE);
            }
            else {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("MMORPG_assignmentPU");
                EntityManager em = emf.createEntityManager();

                em.getTransaction().begin();
                Users checkUser = em.find(Users.class, usernameLogIn);
                balanceCurrent = checkUser.getBalance();
                balanceCurrent = balanceCurrent + AmountIntBalance;
                checkUser.setBalance(balanceCurrent);
                MoneyAmountTxtfield1.setText("€ " + balanceCurrent.toString() + ",-");       
                em.getTransaction().commit();
                em.close();
                emf.close(); 
                JOptionPane.showConfirmDialog(null, "You've succesfully added € " + AmountIntBalance + ",- to your balance", "Succes",JOptionPane.PLAIN_MESSAGE);
            }
        } 
    }
    
    private void Slots (String Amount) {
        Integer AmountIntSlots = null;
        try {
            AmountIntSlots = Integer.parseInt(Amount);
        }
        catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(null, "You didn't fill in a valid input", "Alert",JOptionPane.PLAIN_MESSAGE);
        }
        if(AmountIntSlots != null) {
            if (AmountIntSlots < 0) {
                JOptionPane.showConfirmDialog(null, "You can't enter a negative number", "Alert",JOptionPane.PLAIN_MESSAGE);
            }
            else if (AmountIntSlots > balanceCurrent) {
                JOptionPane.showConfirmDialog(null, "You don't have enough money to buy that many slots!", "Alert",JOptionPane.PLAIN_MESSAGE);
            }
            else {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("MMORPG_assignmentPU");
                EntityManager em = emf.createEntityManager();

                em.getTransaction().begin();
                Users checkUser = em.find(Users.class, usernameLogIn);
                slotsCurrent = slotsCurrent + AmountIntSlots;
                checkUser.setCharacterSlots(slotsCurrent);
                SlotsTxtfield1.setText(slotsCurrent.toString());
                balanceCurrent = balanceCurrent - AmountIntSlots;
                checkUser.setBalance(balanceCurrent);
                MoneyAmountTxtfield1.setText("€ " + balanceCurrent.toString() + ",-");       
                em.getTransaction().commit();
                em.close();
                emf.close();
            }
        }          
    }
    
    private void Renew() {
        if (buttonGroup1.getSelection() == null) {
            JOptionPane.showConfirmDialog(null, "You didn't select a subscription amount", "Alert",JOptionPane.PLAIN_MESSAGE);
        }
        else {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("MMORPG_assignmentPU");
            EntityManager em = emf.createEntityManager();

            em.getTransaction().begin();
            Users checkUser = em.find(Users.class, usernameLogIn);

            if (SubscriptionMonth1.isSelected() == true) {
                if (balanceCurrent >= 5) {
                    balanceCurrent = balanceCurrent - 5;
                    checkUser.setBalance(balanceCurrent);
                    MoneyAmountTxtfield1.setText("€ " + balanceCurrent.toString() + ",-");
                    monthsCurrent = monthsCurrent + 1;
                    checkUser.setMonthsPayed(monthsCurrent);
                    SubscriptionAmountTxtfield.setText(monthsCurrent.toString());
                    checkUser.setLastPayment(new Date());
                    JOptionPane.showConfirmDialog(null, "You've succesfully added 1 month of subscription to your account", "Succes",JOptionPane.PLAIN_MESSAGE);
                }
                else {
                    JOptionPane.showConfirmDialog(null, "Sorry you don't have enough money for that subscription", "Alert",JOptionPane.PLAIN_MESSAGE);
                }
            }
            else if (SubscriptionMonth2.isSelected() == true){
                if (balanceCurrent >= 8) {
                    balanceCurrent = balanceCurrent - 8;
                    checkUser.setBalance(balanceCurrent);
                    MoneyAmountTxtfield1.setText("€ " + balanceCurrent.toString() + ",-");
                    monthsCurrent = monthsCurrent + 2;
                    checkUser.setMonthsPayed(monthsCurrent);
                    SubscriptionAmountTxtfield.setText(monthsCurrent.toString());
                    checkUser.setLastPayment(new Date());
                    JOptionPane.showConfirmDialog(null, "You've succesfully added 2 months of subscription to your account", "Succes",JOptionPane.PLAIN_MESSAGE);
                }
                else {
                    JOptionPane.showConfirmDialog(null, "Sorry you don't have enough money for that subscription", "Alert",JOptionPane.PLAIN_MESSAGE);
                }
            }
            else if (SubscriptionMonth3.isSelected() == true){
                if (balanceCurrent >= 10) {
                    balanceCurrent = balanceCurrent - 10;
                    checkUser.setBalance(balanceCurrent);
                    MoneyAmountTxtfield1.setText("€ " + balanceCurrent.toString() + ",-");
                    monthsCurrent = monthsCurrent + 3;
                    checkUser.setMonthsPayed(monthsCurrent);
                    SubscriptionAmountTxtfield.setText(monthsCurrent.toString());
                    checkUser.setLastPayment(new Date());
                    JOptionPane.showConfirmDialog(null, "You've succesfully added 3 months of subscription to your account", "Succes",JOptionPane.PLAIN_MESSAGE);
                }
                else {
                    JOptionPane.showConfirmDialog(null, "Sorry you don't have enough money for that subscription", "Alert",JOptionPane.PLAIN_MESSAGE);
                }
            }     
            else {
                if (balanceCurrent >= 35) {
                    balanceCurrent = balanceCurrent - 35;
                    checkUser.setBalance(balanceCurrent);
                    MoneyAmountTxtfield1.setText("€ " + balanceCurrent.toString() + ",-");
                    monthsCurrent = monthsCurrent + 12;
                    checkUser.setMonthsPayed(monthsCurrent);
                    SubscriptionAmountTxtfield.setText(monthsCurrent.toString());
                    checkUser.setLastPayment(new Date());
                    JOptionPane.showConfirmDialog(null, "You've succesfully added 1 year of subscription to your account", "Succes",JOptionPane.PLAIN_MESSAGE);
                }
                else {
                    JOptionPane.showConfirmDialog(null, "Sorry you don't have enough money for that subscription", "Alert",JOptionPane.PLAIN_MESSAGE);
                }
            }
            em.getTransaction().commit();
            em.close();
            emf.close();
        }    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbutton;
    private javax.swing.JTextField MoneyAmountTxtfield;
    private javax.swing.JTextField MoneyAmountTxtfield1;
    private javax.swing.JButton MoneyTransaction;
    private javax.swing.JButton RenewButton;
    private javax.swing.JButton SlotsButton;
    private javax.swing.JTextField SlotsTxtfield;
    private javax.swing.JTextField SlotsTxtfield1;
    private javax.swing.JTextField SubscriptionAmountTxtfield;
    private javax.swing.JRadioButton SubscriptionMonth1;
    private javax.swing.JRadioButton SubscriptionMonth2;
    private javax.swing.JRadioButton SubscriptionMonth3;
    private javax.swing.JRadioButton SubscriptionMonth4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
