package view.user;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.StartFrame;
import model.User;
import service.UserService;

public class SignupUserFrame extends javax.swing.JFrame {

        UserService userService;
        User user;

        public SignupUserFrame() {
                initComponents();
                userService = new UserService();
                user = new User();
        }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        passwordField = new javax.swing.JPasswordField();
        signupButton = new javax.swing.JButton();
        yournameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(350, 650));

        jPanel1.setPreferredSize(new java.awt.Dimension(350, 650));

        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordFieldMouseClicked(evt);
            }
        });
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        signupButton.setBackground(new java.awt.Color(102, 255, 204));
        signupButton.setText("Sign up");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        yournameTextField.setText("Tên");
        yournameTextField.setToolTipText("");
        yournameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                yournameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                yournameTextFieldFocusLost(evt);
            }
        });
        yournameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yournameTextFieldMouseClicked(evt);
            }
        });
        yournameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yournameTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Nhanh chóng và dễ dàng");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Đăng ký");

        usernameTextField.setText("Tên đăng nhập");
        usernameTextField.setToolTipText("");
        usernameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTextFieldFocusLost(evt);
            }
        });
        usernameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTextFieldMouseClicked(evt);
            }
        });
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("*");

        jLabel4.setText("*");

        phoneTextField.setText("số di động hoặc email");
        phoneTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneTextFieldFocusLost(evt);
            }
        });
        phoneTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneTextFieldMouseClicked(evt);
            }
        });
        phoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(125, 125, 125))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(yournameTextField)
                        .addComponent(passwordField)
                        .addComponent(signupButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(yournameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(backButton)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_passwordFieldActionPerformed

        private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
                // TODO add your handling code here:
                user.setName(yournameTextField.getText());
                user.setPhone(phoneTextField.getText());
                user.setUsername(usernameTextField.getText());
                user.setPassword(String.valueOf(passwordField.getPassword()));
                

                try {
                        userService.addUser(user);
                } catch (SQLException ex) {
                        Logger.getLogger(SignupUserFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                        
                this.dispose();
                new StartFrame().setVisible(true);
        }//GEN-LAST:event_signupButtonActionPerformed

        private void yournameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yournameTextFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_yournameTextFieldActionPerformed

        private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_usernameTextFieldActionPerformed

        private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
                // TODO add your handling code here:
                this.dispose();
                new StartFrame().setVisible(true);
        }//GEN-LAST:event_backButtonActionPerformed

        private void usernameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFieldFocusGained
                // TODO add your handling code here:
                if (usernameTextField.getText().equals("username")) {
                        usernameTextField.setText("");
                }
        }//GEN-LAST:event_usernameTextFieldFocusGained

        private void usernameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFieldFocusLost
                // TODO add your handling code here
                if (usernameTextField.getText().equals("")) {
                        usernameTextField.setText("username");
                }
        }//GEN-LAST:event_usernameTextFieldFocusLost

        private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
                // TODO add your handling code here:
                if (passwordField.getText().equals("password")) {
                        passwordField.setText("");
                }
        }//GEN-LAST:event_passwordFieldFocusGained

        private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
                // TODO add your handling code here:
                if (passwordField.getText().equals("")) {
                        passwordField.setText("password");
                }
        }//GEN-LAST:event_passwordFieldFocusLost

        private void yournameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yournameTextFieldFocusGained
                // TODO add your handling code here:
                if (yournameTextField.getText().equals("your name")) {
                        yournameTextField.setText("");
                }
        }//GEN-LAST:event_yournameTextFieldFocusGained

        private void yournameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yournameTextFieldFocusLost
                // TODO add your handling code here:
                if (yournameTextField.getText().equals("")) {
                        yournameTextField.setText("your name");
                }
        }//GEN-LAST:event_yournameTextFieldFocusLost

        private void phoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_phoneTextFieldActionPerformed

        private void phoneTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneTextFieldFocusGained
                // TODO add your handling code here:
                if (phoneTextField.getText().equals("phone number")) {
                        phoneTextField.setText("");
                }
        }//GEN-LAST:event_phoneTextFieldFocusGained

        private void phoneTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneTextFieldFocusLost
                // TODO add your handling code here:
                if (phoneTextField.getText().equals("")) {
                        phoneTextField.setText("phone number");
                }
        }//GEN-LAST:event_phoneTextFieldFocusLost

    private void usernameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTextFieldMouseClicked
        // TODO add your handling code here:
        usernameTextField.setText("");
    }//GEN-LAST:event_usernameTextFieldMouseClicked

    private void passwordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_passwordFieldMouseClicked

    private void yournameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yournameTextFieldMouseClicked
        // TODO add your handling code here:
        yournameTextField.setText("");
    }//GEN-LAST:event_yournameTextFieldMouseClicked

    private void phoneTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneTextFieldMouseClicked
        // TODO add your handling code here:
        phoneTextField.setText("");
    }//GEN-LAST:event_phoneTextFieldMouseClicked

        /**
         * @param args the command line arguments
         */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton signupButton;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JTextField yournameTextField;
    // End of variables declaration//GEN-END:variables
}
