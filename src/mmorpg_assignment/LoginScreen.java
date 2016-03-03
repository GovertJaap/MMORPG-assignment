/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmorpg_assignment;

import java.awt.GridLayout;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Luuk Tito
 */
public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreen
     * @throws javax.swing.UnsupportedLookAndFeelException
     */
    public LoginScreen() throws UnsupportedLookAndFeelException {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jtUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtUsernameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Welcome to World of Something");

        jButton1.setText("Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Username:");

        jLabel3.setText("Password:");

        jtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtUsername)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(jtPassword))
                .addGap(219, 219, 219))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 174, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(143, 143, 143))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(139, 139, 139))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPasswordActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //        String Register = JOptionPane.showInputDialog(jPanel2, "Fill in username", null);
        Register();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LoginScreen().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private void Login() {
        String username = jtUsername.getText();
        String password = jtPassword.getText();
        if (!username.equals("") && !password.equals("")) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("MMORPG_assignmentPU");
            EntityManager em = emf.createEntityManager();

            em.getTransaction().begin();
            Users checkUser = em.find(Users.class, username);
            if (checkUser != null) {
                if (checkUser.getPassword().equals(password)) {
                    em.getTransaction().commit();
                    em.close();
                    emf.close();
                    JOptionPane.showConfirmDialog(null, "You've succesfully logged in!", "Succes", JOptionPane.PLAIN_MESSAGE);  
                    this.dispose();
                    new UserManagement(username).setVisible(true);
                }
                else {
                    JOptionPane.showConfirmDialog(null, "The password is not correct.", "Error", JOptionPane.PLAIN_MESSAGE);    
                }
            }
            else {
                JOptionPane.showConfirmDialog(null, "The user does not exist.", "Error", JOptionPane.PLAIN_MESSAGE);    
            }

        }
        else {
            tryAdminLogin();
              
        }       
    }
    
    private void Register() {  
        JPanel newAccount = new JPanel(new GridLayout(0,1));
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JTextField firstNameField = new JTextField();
        JTextField lastNameField = new JTextField();
        JTextField ibanField = new JTextField();
        newAccount.add(new JLabel("Username: "));
        newAccount.add(usernameField);
        newAccount.add(new JLabel("Password: "));
        newAccount.add(passwordField);
        newAccount.add(new JLabel("First Name: "));
        newAccount.add(firstNameField);
        newAccount.add(new JLabel("Last Name: "));
        newAccount.add(lastNameField);
        newAccount.add(new JLabel("Iban Number: "));
        newAccount.add(ibanField);
        
        int result = JOptionPane.showConfirmDialog(null, newAccount, "Register Account", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            String username = usernameField.getText();
            String password = passwordField.getText();
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String iban = ibanField.getText();
            if (!username.equals("") && !password.equals("") && !firstName.equals("") && !lastName.equals("") && !iban.equals("")) {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("MMORPG_assignmentPU");
                EntityManager em = emf.createEntityManager();
                em.getTransaction().begin();
                
                Users checkUser = em.find(Users.class, username);
                if (checkUser == null) {
                    Users newUser = new Users(username, 5, firstName, lastName, iban, new Date(), 5, password, Boolean.FALSE, 5);
                    em.persist(newUser);
                    em.getTransaction().commit();
                    em.close();
                    emf.close();
                    JOptionPane.showConfirmDialog(null, "Your account was succesfully created!", "Succes", JOptionPane.PLAIN_MESSAGE);
                    this.dispose();
                    new UserManagement(username).setVisible(true);
                }
                else {
                    JOptionPane.showConfirmDialog(null, "This username was already taken.", "Failure", JOptionPane.PLAIN_MESSAGE);
                    Register();
                }
            }
            else {
                JOptionPane.showConfirmDialog(null, "Not all fields were filled in", "Error", JOptionPane.PLAIN_MESSAGE);
                Register();
            }
        } 
    }
    
    
    private void tryAdminLogin() 
    {
            String answer = JOptionPane.showInputDialog(null, "Are you an admin?" , "Do you want to Login anyway?",JOptionPane.PLAIN_MESSAGE);
            if (answer.equals("yes")) {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("MMORPG_assignmentPU");
                EntityManager em = emf.createEntityManager();

                em.getTransaction().begin();
                Users checkUser = em.find(Users.class, "a");
                if (checkUser != null) {
                    if (checkUser.getPassword().equals("a")) {
                        em.getTransaction().commit();
                        em.close();
                        emf.close();
                        JOptionPane.showConfirmDialog(null, "You've succesfully logged in!", "Succes", JOptionPane.PLAIN_MESSAGE);  
                        this.dispose();
                        new UserManagement("a").setVisible(true);
                    }  
                }
            }  
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jtPassword;
    private javax.swing.JTextField jtUsername;
    // End of variables declaration//GEN-END:variables
}
