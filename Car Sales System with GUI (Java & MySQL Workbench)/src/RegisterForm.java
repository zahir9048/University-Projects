
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegisterForm extends javax.swing.JFrame {
Connection con;
Statement stat=null,stat1=null;
ResultSet rs;
String FIRSTNAME,LASTNAME,PASSWORD,BIRTHDATE,USERNAME,Cpassword;
    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        connect();
    }
    public void connect() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carsalessystem","root","adil095"); 
            stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY); 
               
    } catch (ClassNotFoundException ex) {
        
    }
      catch (SQLException ex) {
          
        }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBLpassword1 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LBLpassword = new javax.swing.JLabel();
        BTNregCostumer = new javax.swing.JButton();
        LBLlogin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LBLogin = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LBLminimize = new javax.swing.JLabel();
        LBLclose = new javax.swing.JLabel();
        LBLusername = new javax.swing.JLabel();
        TXTusername = new javax.swing.JTextField();
        jPasswordPASSWORD = new javax.swing.JPasswordField();
        BTNcancel = new javax.swing.JButton();
        TXTFirstName = new javax.swing.JTextField();
        LBLFirstName = new javax.swing.JLabel();
        TXTFirstLast = new javax.swing.JTextField();
        LBLFirstLast = new javax.swing.JLabel();
        jPasswordCONFERM = new javax.swing.JPasswordField();
        LBLConfermpassword = new javax.swing.JLabel();
        LBLBirthDate = new javax.swing.JLabel();
        TXTDateOfBirth = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        LBLpassword1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBLpassword1.setForeground(new java.awt.Color(236, 240, 241));
        LBLpassword1.setText("Password:");

        jPasswordField2.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(228, 241, 254));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SignIn");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        LBLpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBLpassword.setForeground(new java.awt.Color(236, 240, 241));
        LBLpassword.setText(" Password:");

        BTNregCostumer.setBackground(new java.awt.Color(34, 167, 240));
        BTNregCostumer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNregCostumer.setForeground(new java.awt.Color(255, 255, 255));
        BTNregCostumer.setText("Register As Customer");
        BTNregCostumer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNregCostumer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNregCostumerActionPerformed(evt);
            }
        });

        LBLlogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LBLlogin.setForeground(new java.awt.Color(255, 255, 255));
        LBLlogin.setText("Already registered? Click here to Login");
        LBLlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBLlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBLloginMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(34, 167, 240));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LBLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LBLogin.setForeground(new java.awt.Color(255, 255, 255));
        LBLogin.setText("Toyota Car Sales System");

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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(LBLogin)
                    .addContainerGap(258, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(LBLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        LBLusername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBLusername.setForeground(new java.awt.Color(236, 240, 241));
        LBLusername.setText("Username:");

        TXTusername.setBackground(new java.awt.Color(108, 122, 137));
        TXTusername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TXTusername.setForeground(new java.awt.Color(228, 241, 254));

        jPasswordPASSWORD.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordPASSWORD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordPASSWORD.setForeground(new java.awt.Color(228, 241, 254));

        BTNcancel.setBackground(new java.awt.Color(242, 38, 19));
        BTNcancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNcancel.setForeground(new java.awt.Color(255, 255, 255));
        BTNcancel.setText("Clear");
        BTNcancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcancelActionPerformed(evt);
            }
        });

        TXTFirstName.setBackground(new java.awt.Color(108, 122, 137));
        TXTFirstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TXTFirstName.setForeground(new java.awt.Color(228, 241, 254));

        LBLFirstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBLFirstName.setForeground(new java.awt.Color(236, 240, 241));
        LBLFirstName.setText("First Name:");

        TXTFirstLast.setBackground(new java.awt.Color(108, 122, 137));
        TXTFirstLast.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TXTFirstLast.setForeground(new java.awt.Color(228, 241, 254));

        LBLFirstLast.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBLFirstLast.setForeground(new java.awt.Color(236, 240, 241));
        LBLFirstLast.setText("Last Name:");

        jPasswordCONFERM.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordCONFERM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordCONFERM.setForeground(new java.awt.Color(228, 241, 254));

        LBLConfermpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBLConfermpassword.setForeground(new java.awt.Color(236, 240, 241));
        LBLConfermpassword.setText("    Confirm:");

        LBLBirthDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBLBirthDate.setForeground(new java.awt.Color(236, 240, 241));
        LBLBirthDate.setText("Date of Birth: ");

        TXTDateOfBirth.setBackground(new java.awt.Color(108, 122, 137));
        TXTDateOfBirth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TXTDateOfBirth.setForeground(new java.awt.Color(228, 241, 254));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SignUp");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/Toyota-Logo-PNG-Clipart(1).png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LBLpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LBLusername, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TXTusername)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jPasswordPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LBLFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LBLFirstLast, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(14, 14, 14)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TXTFirstLast, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(TXTFirstName)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addGap(117, 117, 117)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LBLConfermpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordCONFERM, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LBLBirthDate)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LBLlogin)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(BTNregCostumer)
                                        .addGap(18, 18, 18)
                                        .addComponent(BTNcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(TXTDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(17, 65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLFirstLast, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTFirstLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLusername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordCONFERM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBLConfermpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNcancel)
                    .addComponent(BTNregCostumer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBLlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNregCostumerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNregCostumerActionPerformed
        // TODO add your handling code here:
       FIRSTNAME = TXTFirstName.getText();
       LASTNAME = TXTFirstLast.getText();
       USERNAME = TXTusername.getText();
       PASSWORD = jPasswordPASSWORD.getText();  
       Cpassword = jPasswordCONFERM.getText();
       BIRTHDATE = TXTDateOfBirth.getText(); 
       if(PASSWORD.equals(Cpassword)==false){
           JOptionPane.showMessageDialog(this, "Password does not matched");
       }
       else{
         try{
            String sql ="INSERT INTO CUSTOMER VALUES ('"+FIRSTNAME+"','"+LASTNAME+"','"+USERNAME+"','"+PASSWORD+"','"+BIRTHDATE+"')";
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "You are Successfuly registered Now Sign in to your Account");
        TXTFirstName.setText("");
        TXTFirstLast.setText("");
        TXTusername.setText("");
        jPasswordPASSWORD.setText("");
        TXTDateOfBirth.setText("");
        jPasswordCONFERM.setText("");
        
         }catch (Exception ex) {JOptionPane.showMessageDialog(this, ex);}
       }
    }//GEN-LAST:event_BTNregCostumerActionPerformed

    private void LBLloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBLloginMouseClicked
        SignInForm lf =new SignInForm();
        lf.setVisible(true);
        lf.pack();
        lf.setLocationRelativeTo(null);
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_LBLloginMouseClicked

    private void LBLminimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBLminimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_LBLminimizeMouseClicked

    private void LBLcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBLcloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_LBLcloseMouseClicked

    private void BTNcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcancelActionPerformed
      TXTFirstName.setText("");
      TXTFirstLast.setText("");
      TXTusername.setText("");
      jPasswordPASSWORD.setText("");
      jPasswordCONFERM.setText("");
      TXTDateOfBirth.setText("");
    }//GEN-LAST:event_BTNcancelActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNcancel;
    private javax.swing.JButton BTNregCostumer;
    private javax.swing.JLabel LBLBirthDate;
    private javax.swing.JLabel LBLConfermpassword;
    private javax.swing.JLabel LBLFirstLast;
    private javax.swing.JLabel LBLFirstName;
    private javax.swing.JLabel LBLclose;
    private javax.swing.JLabel LBLlogin;
    private javax.swing.JLabel LBLminimize;
    private javax.swing.JLabel LBLogin;
    private javax.swing.JLabel LBLpassword;
    private javax.swing.JLabel LBLpassword1;
    private javax.swing.JLabel LBLusername;
    private javax.swing.JTextField TXTDateOfBirth;
    private javax.swing.JTextField TXTFirstLast;
    private javax.swing.JTextField TXTFirstName;
    private javax.swing.JTextField TXTusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordCONFERM;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordPASSWORD;
    // End of variables declaration//GEN-END:variables
}
