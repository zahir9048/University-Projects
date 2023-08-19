import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class SignInForm extends javax.swing.JFrame {

    String AdminUsername ="Leader123";
    String Adminpassword ="ssuet";
     Connection con;

Statement stat=null,stat1=null;
ResultSet rs,rs1;

    public SignInForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        connect();
        MyServer ms= new MyServer();        
    }
    public void connect() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carsalessystem","root","adil095"); 
            stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY); 
           stat1 = con.createStatement(); 
            rs=stat.executeQuery("SELECT USERNAME, PASSWORD FROM CUSTOMER"); 
   
    } catch (ClassNotFoundException ex) { }
      catch (SQLException ex) {}
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        LBLpassword = new javax.swing.JLabel();
        BTNsignAdmin = new javax.swing.JButton();
        BTNsignCustomer = new javax.swing.JButton();
        LBLRegister = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LBLogin = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LBLminimize = new javax.swing.JLabel();
        LBLclose = new javax.swing.JLabel();
        LBLusername = new javax.swing.JLabel();
        TXTusername = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        BTNclear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BTNhelp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        LBLpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBLpassword.setForeground(new java.awt.Color(236, 240, 241));
        LBLpassword.setText("Password:");

        BTNsignAdmin.setBackground(new java.awt.Color(34, 167, 240));
        BTNsignAdmin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTNsignAdmin.setForeground(new java.awt.Color(255, 255, 255));
        BTNsignAdmin.setText("Sign In As Administrator");
        BTNsignAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNsignAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNsignAdminActionPerformed(evt);
            }
        });

        BTNsignCustomer.setBackground(new java.awt.Color(34, 167, 240));
        BTNsignCustomer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTNsignCustomer.setForeground(new java.awt.Color(255, 255, 255));
        BTNsignCustomer.setText("Sign In As Customer");
        BTNsignCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNsignCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNsignCustomerActionPerformed(evt);
            }
        });

        LBLRegister.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LBLRegister.setForeground(new java.awt.Color(255, 255, 255));
        LBLRegister.setText(" If you did not signed up before then, Click here to create a new account");
        LBLRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBLRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBLRegisterMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(34, 167, 240));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LBLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LBLogin.setForeground(new java.awt.Color(255, 255, 255));
        LBLogin.setText("Welcome To Toyota Car Sales System");

        jPanel3.setBackground(new java.awt.Color(242, 38, 19));

        LBLminimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LBLminimize.setForeground(new java.awt.Color(255, 255, 255));
        LBLminimize.setText("-");
        LBLminimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBLminimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBLminimizeMouseClicked(evt);
            }
        });

        LBLclose.setBackground(new java.awt.Color(255, 51, 51));
        LBLclose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LBLclose.setForeground(new java.awt.Color(255, 255, 255));
        LBLclose.setText("X");
        LBLclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBLclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBLcloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBLminimize)
                .addGap(18, 18, 18)
                .addComponent(LBLclose)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLclose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LBLminimize))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LBLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        LBLusername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBLusername.setForeground(new java.awt.Color(236, 240, 241));
        LBLusername.setText("Username:");

        TXTusername.setBackground(new java.awt.Color(108, 122, 137));
        TXTusername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TXTusername.setForeground(new java.awt.Color(228, 241, 254));

        jPasswordField1.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(228, 241, 254));

        BTNclear.setBackground(new java.awt.Color(242, 38, 19));
        BTNclear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTNclear.setForeground(new java.awt.Color(255, 255, 255));
        BTNclear.setText("Clear");
        BTNclear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNclearActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SignIn");

        BTNhelp.setBackground(new java.awt.Color(34, 167, 240));
        BTNhelp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNhelp.setForeground(new java.awt.Color(255, 255, 255));
        BTNhelp.setText("Need Help?");
        BTNhelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNhelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNhelpActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/Toyota-Logo-PNG-Clipart(1).png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(LBLRegister))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LBLpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LBLusername, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(BTNclear, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXTusername, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(BTNsignAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTNsignCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(94, 94, 94)
                                .addComponent(BTNhelp, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(BTNhelp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLusername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNsignCustomer)
                    .addComponent(BTNsignAdmin)
                    .addComponent(BTNclear))
                .addGap(18, 18, 18)
                .addComponent(LBLRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNclearActionPerformed
        // TODO add your handling code here:
        TXTusername.setText("");
        jPasswordField1.setText("");
    }//GEN-LAST:event_BTNclearActionPerformed

    private void LBLcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBLcloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_LBLcloseMouseClicked

    private void LBLminimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBLminimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_LBLminimizeMouseClicked

    private void LBLRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBLRegisterMouseClicked
        RegisterForm rgf =new RegisterForm();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_LBLRegisterMouseClicked

    private void BTNsignCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNsignCustomerActionPerformed
 connect();
      String x = TXTusername.getText();
      String y = jPasswordField1.getText();
     try{
         int count1 =0;
         int count2 =0;
         int count3 =0;
     while(rs.next()){
         if(rs.getString("USERNAME").equals(x)==true && rs.getString("PASSWORD").equals(y)==true ){
             count1++;
         }
         else if(rs.getString("USERNAME").equals(x)==true && rs.getString("PASSWORD").equals(y)==false ){
             count2++;
         }
         else{
             count3++;
         }
     }  
     if(count1>0){
         String a =TXTusername.getText();
              new Customer(a).setVisible(true);
              setVisible(false);             
             this.dispose();
         }
     else if(count2>0){
         JOptionPane.showMessageDialog(this, "You entered Wrong password"); 
     }
        else{
         JOptionPane.showMessageDialog(this, "Your User name and Paswword are incorrect");
        }
     }catch(Exception ex){  JOptionPane.showMessageDialog(this,ex);} 
    }//GEN-LAST:event_BTNsignCustomerActionPerformed

    private void BTNsignAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNsignAdminActionPerformed

        String x = TXTusername.getText();
        String y = jPasswordField1.getText();
        
        if(AdminUsername.equals(x)==true && Adminpassword.equals(y)==true){
          Administrator admin =new Administrator();
        admin.setVisible(true);
        admin.pack();
        admin.setLocationRelativeTo(null);
        admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        }
        else if (AdminUsername.equals(x)==true && Adminpassword.equals(y)==false){
         JOptionPane.showMessageDialog(this, "You entered Wrong password");            
        }
        
        else{
         JOptionPane.showMessageDialog(this, "Your User name and Paswword are incorrect");
        }
    }//GEN-LAST:event_BTNsignAdminActionPerformed

    private void BTNhelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNhelpActionPerformed
        // TODO add your handling code here:
        FAQ f=new FAQ();
        f.setVisible(true);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_BTNhelpActionPerformed

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
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignInForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNclear;
    private javax.swing.JButton BTNhelp;
    private javax.swing.JButton BTNsignAdmin;
    private javax.swing.JButton BTNsignCustomer;
    private javax.swing.JLabel LBLRegister;
    private javax.swing.JLabel LBLclose;
    private javax.swing.JLabel LBLminimize;
    private javax.swing.JLabel LBLogin;
    private javax.swing.JLabel LBLpassword;
    private javax.swing.JLabel LBLusername;
    private javax.swing.JTextField TXTusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
