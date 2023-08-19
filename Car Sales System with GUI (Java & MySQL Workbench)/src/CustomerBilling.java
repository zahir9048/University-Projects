
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CustomerBilling extends javax.swing.JFrame {

    /**
     * Creates new form CustomerBilling
     */
    DateFormat dateFormat =new SimpleDateFormat("MM/dd/YY");
    Date date = new Date();
    Calendar cal= Calendar.getInstance();
    Connection con;
Statement stat1=null;
ResultSet rs1;
    public CustomerBilling() {
        initComponents();    
        this.setLocationRelativeTo(null);
         TXTDate.setText(""+dateFormat.format(date));
          bill();
    }
    
     public CustomerBilling(String a) {
        initComponents();
        this.setLocationRelativeTo(null);
        TXTusername.setText(a);
        TXTDate.setText(""+dateFormat.format(date));
         bill();
    }
public void bill(){
    try{
    String date = TXTDate.getText();
    String username = TXTusername.getText();
    Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carsalessystem","root","adil095");
    AreaTXTbill.setText("======================================================================"
                       +"\n                                                       TOYOTA CAR SALES SYSTEM" +
                      "\n======================================================================"
                       +"\nLUCKY-ONE MALL \nTOYOTAL MOTORS\nKARACHI"
                      +"\nNTN No : 0698064-3"
                    +"\n======================================================================"
                      +"\n   User Name :"+username+""
                      +"\n   Date :"+date+""
                      +"\n   Invoice No : LOM-LM-T3-24805"
                      +"\n======================================================================");       
                                 
        stat1 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        rs1=stat1.executeQuery("SELECT * FROM receipt"); 
        int i=0,Tprice=0;
        while(rs1.next()){      
            i++;
        AreaTXTbill.setText(AreaTXTbill.getText()+"\n  Car Name "+i+": "+rs1.getString("CARNAME")+"\n  Car Code : "+rs1.getString("CARCODE")+"\n  Engine : "+rs1.getString("ENGINE")+"\n  Colour : "+rs1.getString("COLOUR")+"\n  Price : "+rs1.getInt("PRICE_RS")+
                "\n======================================================================");
        Tprice=Tprice+rs1.getInt("PRICE_RS");
        }
        long Plus_Tax=(long)(Tprice*0.05)+Tprice;
        AreaTXTbill.setText(AreaTXTbill.getText()+"\nTotal Price : "+Tprice+
                                                  "\nTex per Car: 5%"+
                                                  "\nTotal Amount plus Tex : "+Plus_Tax            
               +"\n======================================================================"
                       +"\n\t\tTERMS & CONDITIONS"
                +"\n1. No Cash Refund." +
"\n2. Total price inclusive of all applicable taxes." +
"\n3. Cars on \"Sales\" can not be exchanged." +
"\n4. Kindly check the car at the time of purchase." +
"\n5. Sale Tax can be verified by using FBR invoice number at www.e.fbr.gov.pk after 24 Hrs"
                       + "  \n from time of invoice generated."
                +"\n======================================================================"
                +"\n                                                      THANKS FOR PURCHASING"
                +"\n======================================================================"
                +"\n                                                             Info: 0312-2552726"
                +"\n                                                         www.ToyotaCarSales.com"
                +"\n======================================================================"
                +"\nFBR Invoice Number :  11166821122017582706\n"
                 +"\nVerify this invoice through FBR TaxAsaan MobileApp\nSMS at 9966 and win exciting prizes in Draw"
        +"\n======================================================================");
                                stat1 = con.createStatement();
				String query = "DELETE FROM receipt";
				int deletedRows=stat1.executeUpdate(query);
				if(deletedRows>0){
				     System.out.println("Deleted All Rows In The Table Successfully...");
				   }else{
                                System.out.println("Table already empty."); 
				  }
    }catch(Exception s){
        
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaTXTbill = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TXTusername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TXTDate = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        LBLogin = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LBLminimize = new javax.swing.JLabel();
        LBLclose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        AreaTXTbill.setEditable(false);
        AreaTXTbill.setColumns(20);
        AreaTXTbill.setRows(5);
        jScrollPane1.setViewportView(AreaTXTbill);

        jButton1.setBackground(new java.awt.Color(34, 167, 240));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Print");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 240, 241));
        jLabel1.setText("User Name :");

        TXTusername.setEditable(false);
        TXTusername.setBackground(new java.awt.Color(108, 122, 137));
        TXTusername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TXTusername.setForeground(new java.awt.Color(228, 241, 254));
        TXTusername.setText("00000");
        TXTusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTusernameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("DATE :");

        TXTDate.setEditable(false);
        TXTDate.setBackground(new java.awt.Color(108, 122, 137));
        TXTDate.setForeground(new java.awt.Color(228, 241, 254));
        TXTDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTDateActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(34, 167, 240));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(LBLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer's Bill");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/Toyota-Logo-PNG-Clipart(1).png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXTDate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TXTusername, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TXTusername)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTDateActionPerformed

    private void TXTusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTusernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            AreaTXTbill.print();
            AreaTXTbill.setText("");
            String a =TXTusername.getText();                 
              new Customer(a).setVisible(true);
              setVisible(false);             
             this.dispose();
        }catch(Exception e){ JOptionPane.showMessageDialog(this,e);}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LBLminimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBLminimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_LBLminimizeMouseClicked

    private void LBLcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBLcloseMouseClicked
        
        System.exit(0);
    }//GEN-LAST:event_LBLcloseMouseClicked

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
            java.util.logging.Logger.getLogger(CustomerBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CustomerBilling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaTXTbill;
    private javax.swing.JLabel LBLclose;
    private javax.swing.JLabel LBLminimize;
    private javax.swing.JLabel LBLogin;
    private javax.swing.JTextField TXTDate;
    private javax.swing.JTextField TXTusername;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
