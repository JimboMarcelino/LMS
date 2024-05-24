
package library_management_system;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.ShowPasswordIcon.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        roboto1 = new efectos.Roboto();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        UsernameIcon = new javax.swing.JLabel();
        UsernamerSMetroTextPlaceHolder = new rojerusan.RSMetroTextPlaceHolder();
        Password = new javax.swing.JLabel();
        PasswordIcon = new javax.swing.JLabel();
        HidePasswordIcon = new javax.swing.JLabel();
        ShowPasswordIcon = new javax.swing.JLabel();
        PasswordPlaceHolder = new rojerusan.RSPasswordTextPlaceHolder();
        LoginButton = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        SignupButton = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(71, 136, 199));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Library Management System");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/LMS (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel2)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jLabel2)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 720));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 136, 199));
        jLabel3.setText("Login to your account");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 50, -1, -1));

        Username.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Username.setForeground(new java.awt.Color(71, 136, 199));
        Username.setText("Username");
        jPanel2.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 205, -1, -1));

        UsernameIcon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        UsernameIcon.setForeground(new java.awt.Color(71, 136, 199));
        UsernameIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/icons8-male-user-40.png"))); // NOI18N
        jPanel2.add(UsernameIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 234, -1, -1));

        UsernamerSMetroTextPlaceHolder.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        UsernamerSMetroTextPlaceHolder.setPlaceholder(" Username");
        UsernamerSMetroTextPlaceHolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernamerSMetroTextPlaceHolderActionPerformed(evt);
            }
        });
        jPanel2.add(UsernamerSMetroTextPlaceHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 232, 318, -1));

        Password.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(71, 136, 199));
        Password.setText("Password");
        jPanel2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 293, -1, -1));

        PasswordIcon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PasswordIcon.setForeground(new java.awt.Color(71, 136, 199));
        PasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/icons8-password-40.png"))); // NOI18N
        jPanel2.add(PasswordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 320, -1, 42));

        HidePasswordIcon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        HidePasswordIcon.setForeground(new java.awt.Color(71, 136, 199));
        HidePasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/icons8-invisible-25.png"))); // NOI18N
        HidePasswordIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HidePasswordIconMousePressed(evt);
            }
        });
        jPanel2.add(HidePasswordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, 42));

        ShowPasswordIcon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ShowPasswordIcon.setForeground(new java.awt.Color(71, 136, 199));
        ShowPasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/icons8-eye-25.png"))); // NOI18N
        ShowPasswordIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ShowPasswordIconMousePressed(evt);
            }
        });
        jPanel2.add(ShowPasswordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, 42));

        PasswordPlaceHolder.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(71, 136, 199)));
        PasswordPlaceHolder.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        PasswordPlaceHolder.setPlaceholder("Password");
        PasswordPlaceHolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordPlaceHolderActionPerformed(evt);
            }
        });
        jPanel2.add(PasswordPlaceHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 320, 318, 42));

        LoginButton.setBackground(new java.awt.Color(71, 136, 199));
        LoginButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.setFocusPainted(false);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        jPanel2.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 458, 318, 39));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(71, 136, 199));
        jLabel8.setText("OR");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 509, -1, -1));

        SignupButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        SignupButton.setForeground(new java.awt.Color(71, 136, 199));
        SignupButton.setText("Signup");
        SignupButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(71, 136, 199)));
        SignupButton.setFocusPainted(false);
        SignupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SignupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 530, 318, 39));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(71, 136, 199));
        jLabel9.setText("I don't have an account");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 575, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 500, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupButtonActionPerformed
        SignUp SignUpFrame = new SignUp();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_SignupButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        Dashboard DashboardFrame = new Dashboard();
        DashboardFrame.setVisible(true);
        DashboardFrame.pack();
        DashboardFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void PasswordPlaceHolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordPlaceHolderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordPlaceHolderActionPerformed

    private void HidePasswordIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HidePasswordIconMousePressed
        ShowPasswordIcon.setVisible(true);
        HidePasswordIcon.setVisible(false);
        PasswordPlaceHolder.setEchoChar((char)0);
    }//GEN-LAST:event_HidePasswordIconMousePressed

    private void ShowPasswordIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowPasswordIconMousePressed
        HidePasswordIcon.setVisible(true);
        ShowPasswordIcon.setVisible(false);
        PasswordPlaceHolder.setEchoChar('*');
    }//GEN-LAST:event_ShowPasswordIconMousePressed

    private void UsernamerSMetroTextPlaceHolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernamerSMetroTextPlaceHolderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernamerSMetroTextPlaceHolderActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HidePasswordIcon;
    private javax.swing.JToggleButton LoginButton;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel PasswordIcon;
    private rojerusan.RSPasswordTextPlaceHolder PasswordPlaceHolder;
    private javax.swing.JLabel ShowPasswordIcon;
    private javax.swing.JToggleButton SignupButton;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel UsernameIcon;
    private rojerusan.RSMetroTextPlaceHolder UsernamerSMetroTextPlaceHolder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private efectos.Roboto roboto1;
    // End of variables declaration//GEN-END:variables
}
