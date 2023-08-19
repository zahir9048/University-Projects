import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Customer extends javax.swing.JFrame {
Connection con;
Statement stat1=null,stat2=null,stat3=null,stat4=null,stat5=null;
ResultSet rs1,rs2,rs3;
String CARNAME,MODEL,ENGINEDISPLACEMENT,ENGINEPOWER,FUELTYPE,GEARBOX,TRANSMISSIONTYPE,SEATINGCAPACITY,TOPSPEED,PRICE_RS,CARCODE;
PreparedStatement pst;
DateFormat dateFormat =new SimpleDateFormat("MM/dd/YY");
    Date date = new Date();
    Calendar cal= Calendar.getInstance();
    DefaultTableModel Model;
    public Customer() {
        initComponents();
        this.setLocationRelativeTo(null);
        connect();
        Model = (DefaultTableModel) table2.getModel();
        TXTDate.setText(""+dateFormat.format(date));
    }
    public Customer(String a) {
        initComponents();
        this.setLocationRelativeTo(null);
        name.setText(a);
        connect();
        Model = (DefaultTableModel) table2.getModel();
        TXTDate.setText(""+dateFormat.format(date));
    }
    public void connect() {
    try {       
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carsalessystem","root","adil095");
            
            stat1 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stat2 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stat3 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs1=stat1.executeQuery("SELECT * FROM HATCHBACK");
            rs2=stat2.executeQuery("SELECT * FROM SEDAN");
            rs3=stat3.executeQuery("SELECT * FROM SUV");
                } catch (ClassNotFoundException ex) {       
    }
      catch (SQLException ex) {}
}
public void table1(){
    int value =jComboBox1.getSelectedIndex();
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carsalessystem","root","adil095");
            stat1 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stat2 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stat3 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs1=stat1.executeQuery("SELECT * FROM HATCHBACK");
            rs2=stat2.executeQuery("SELECT * FROM SEDAN");
            rs3=stat3.executeQuery("SELECT * FROM SUV");
            
            if(value == 1){
            while(rs1.next()){
                String code =String.valueOf(rs1.getInt("CARCODE"));
                String car =String.valueOf(rs1.getString("CARNAME"));
                String model =String.valueOf(rs1.getString("Model"));
                String engineDisplacement = String.valueOf(rs1.getString("ENGINEDISPLACEMENT"));
                String enginePowert = String.valueOf(rs1.getString("ENGINEPOWER"));
                String fuel =String.valueOf(rs1.getString("FUELTYPE")); 
                String Gear =String.valueOf(rs1.getString("GEARBOX")); 
                String Transmission =String.valueOf(rs1.getString("TRANSMISSIONTYPE")); 
                String Seat =String.valueOf(rs1.getString("SEATINGCAPACITY"));
                String Spead =String.valueOf(rs1.getString("TOPSPEED"));
                String price=String.valueOf(rs1.getInt("PRICE_RS"));
                String tbdata[]={"HB-00"+code,car,model,engineDisplacement,enginePowert,fuel,Gear,Transmission,Seat,Spead,price};
                DefaultTableModel tblModel =(DefaultTableModel)table1.getModel();
                tblModel.addRow(tbdata);
            }
            }
            if(value == 2){
            while(rs2.next()){
                String code =String.valueOf(rs2.getInt("CARCODE"));
                String car =String.valueOf(rs2.getString("CARNAME"));
                String model =String.valueOf(rs2.getString("Model"));
                String engineDisplacement = String.valueOf(rs2.getString("ENGINEDISPLACEMENT"));
                String enginePowert = String.valueOf(rs2.getString("ENGINEPOWER"));
                String fuel =String.valueOf(rs2.getString("FUELTYPE")); 
                String Gear =String.valueOf(rs2.getString("GEARBOX")); 
                String Transmission =String.valueOf(rs2.getString("TRANSMISSIONTYPE")); 
                String Seat =String.valueOf(rs2.getString("SEATINGCAPACITY"));
                String Spead =String.valueOf(rs2.getString("TOPSPEED"));
                String price=String.valueOf(rs2.getInt("PRICE_RS"));
                String tbdata[]={"SED-00"+code,car,model,engineDisplacement,enginePowert,fuel,Gear,Transmission,Seat,Spead,price};
                DefaultTableModel tblModel =(DefaultTableModel)table1.getModel();
                tblModel.addRow(tbdata);
            }
            }
            if(value == 3){
            while(rs3.next()){
                String code =String.valueOf(rs3.getInt("CARCODE"));
                String car =String.valueOf(rs3.getString("CARNAME"));
                String model =String.valueOf(rs3.getString("Model"));
                String engineDisplacement = String.valueOf(rs3.getString("ENGINEDISPLACEMENT"));
                String enginePowert = String.valueOf(rs3.getString("ENGINEPOWER"));
                String fuel =String.valueOf(rs3.getString("FUELTYPE")); 
                String Gear =String.valueOf(rs3.getString("GEARBOX")); 
                String Transmission =String.valueOf(rs3.getString("TRANSMISSIONTYPE")); 
                String Seat =String.valueOf(rs3.getString("SEATINGCAPACITY"));
                String Spead =String.valueOf(rs3.getString("TOPSPEED"));
                String price=String.valueOf(rs3.getInt("PRICE_RS"));
                String tbdata[]={"SUV-00"+code,car,model,engineDisplacement,enginePowert,fuel,Gear,Transmission,Seat,Spead,price};
                DefaultTableModel tblModel =(DefaultTableModel)table1.getModel();
                tblModel.addRow(tbdata);
            }
            }
    }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
}
public void clear(){
     DefaultTableModel dm =(DefaultTableModel)table1.getModel();
    int rowCount = dm.getRowCount();    
    for (int i = rowCount - 1; i >= 0; i--) {
          dm.removeRow(i);        
    }
}
 public void JtableToDB(){
    DefaultTableModel tblModel =(DefaultTableModel)table2.getModel();
    if(tblModel.getRowCount()==0){
        JOptionPane.showMessageDialog(this, "Please Select car to Purchase");
    }
    else{
       try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carsalessystem","root","adil095"); 
        
            stat4 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stat5 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs1=stat4.executeQuery("SELECT * FROM receipt");
            rs2=stat5.executeQuery("SELECT * FROM BILLING");
           for(int i=0; i<tblModel.getRowCount(); i++){
               String Date =tblModel.getValueAt(i,0).toString();
               String Username=name.getText();
               String CarCode =tblModel.getValueAt(i,1).toString();
               String CarName =tblModel.getValueAt(i,2).toString();
               String Engine =tblModel.getValueAt(i,3).toString();
               String Colour =tblModel.getValueAt(i,5).toString();
               String Price =tblModel.getValueAt(i,7).toString();
               int price = Integer.parseInt(Price);
               String sql1 ="INSERT INTO receipt VALUES ('"+Date+"','"+Username+"','"+CarCode+"','"+CarName+"','"+Engine+"','"+Colour+"',"+price+")";
               stat4.executeUpdate(sql1);
               String sql2 ="INSERT INTO BILLING VALUES ('"+Date+"','"+Username+"','"+CarCode+"','"+CarName+"','"+Engine+"','"+Colour+"',"+price+")";
               stat5.executeUpdate(sql2);
           }
       }catch(Exception e){
           
       } 
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        BTNadd = new javax.swing.JButton();
        BTNdelete = new javax.swing.JButton();
        BTNclear = new javax.swing.JButton();
        BTNpurchase = new javax.swing.JButton();
        CBallyRim = new javax.swing.JCheckBox();
        CBhidLight = new javax.swing.JCheckBox();
        RDBTNred = new javax.swing.JRadioButton();
        RDBTNblue = new javax.swing.JRadioButton();
        RDBTNblack = new javax.swing.JRadioButton();
        RDBTNsilver = new javax.swing.JRadioButton();
        RDBTNwhite = new javax.swing.JRadioButton();
        RDBTNyellow = new javax.swing.JRadioButton();
        RDBTNgray = new javax.swing.JRadioButton();
        TXTDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TXTCarCode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        TXTcombo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        LBLogin = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LBLminimize = new javax.swing.JLabel();
        LBLclose = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BTNlogout = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Car Code", "Car Name", "Engine", "Fuel-Type", "Colour", "Accessories", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(table2);

        BTNadd.setBackground(new java.awt.Color(34, 167, 240));
        BTNadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNadd.setForeground(new java.awt.Color(255, 255, 255));
        BTNadd.setText("Add");
        BTNadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNaddActionPerformed(evt);
            }
        });

        BTNdelete.setBackground(new java.awt.Color(34, 167, 240));
        BTNdelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNdelete.setForeground(new java.awt.Color(255, 255, 255));
        BTNdelete.setText("Delete");
        BTNdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNdeleteActionPerformed(evt);
            }
        });

        BTNclear.setBackground(new java.awt.Color(34, 167, 240));
        BTNclear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNclear.setForeground(new java.awt.Color(255, 255, 255));
        BTNclear.setText("Clear");
        BTNclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNclearActionPerformed(evt);
            }
        });

        BTNpurchase.setBackground(new java.awt.Color(34, 167, 240));
        BTNpurchase.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNpurchase.setForeground(new java.awt.Color(255, 255, 255));
        BTNpurchase.setText("Purchase");
        BTNpurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNpurchaseActionPerformed(evt);
            }
        });

        CBallyRim.setBackground(new java.awt.Color(44, 62, 80));
        CBallyRim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CBallyRim.setForeground(new java.awt.Color(255, 255, 255));
        CBallyRim.setText("Alloy Rims");

        CBhidLight.setBackground(new java.awt.Color(44, 62, 80));
        CBhidLight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CBhidLight.setForeground(new java.awt.Color(255, 255, 255));
        CBhidLight.setText("HID Lights");

        RDBTNred.setBackground(new java.awt.Color(44, 62, 80));
        RDBTNred.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RDBTNred.setForeground(new java.awt.Color(255, 255, 255));
        RDBTNred.setText("Red");
        RDBTNred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDBTNredActionPerformed(evt);
            }
        });

        RDBTNblue.setBackground(new java.awt.Color(44, 62, 80));
        RDBTNblue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RDBTNblue.setForeground(new java.awt.Color(255, 255, 255));
        RDBTNblue.setText("Blue");
        RDBTNblue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDBTNblueActionPerformed(evt);
            }
        });

        RDBTNblack.setBackground(new java.awt.Color(44, 62, 80));
        RDBTNblack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RDBTNblack.setForeground(new java.awt.Color(255, 255, 255));
        RDBTNblack.setText("Black");
        RDBTNblack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDBTNblackActionPerformed(evt);
            }
        });

        RDBTNsilver.setBackground(new java.awt.Color(44, 62, 80));
        RDBTNsilver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RDBTNsilver.setForeground(new java.awt.Color(255, 255, 255));
        RDBTNsilver.setText("Silver");
        RDBTNsilver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDBTNsilverActionPerformed(evt);
            }
        });

        RDBTNwhite.setBackground(new java.awt.Color(44, 62, 80));
        RDBTNwhite.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RDBTNwhite.setForeground(new java.awt.Color(255, 255, 255));
        RDBTNwhite.setText("White");
        RDBTNwhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDBTNwhiteActionPerformed(evt);
            }
        });

        RDBTNyellow.setBackground(new java.awt.Color(44, 62, 80));
        RDBTNyellow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RDBTNyellow.setForeground(new java.awt.Color(255, 255, 255));
        RDBTNyellow.setText("Yellow");
        RDBTNyellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDBTNyellowActionPerformed(evt);
            }
        });

        RDBTNgray.setBackground(new java.awt.Color(44, 62, 80));
        RDBTNgray.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RDBTNgray.setForeground(new java.awt.Color(255, 255, 255));
        RDBTNgray.setText("Gray");
        RDBTNgray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDBTNgrayActionPerformed(evt);
            }
        });

        TXTDate.setEditable(false);
        TXTDate.setBackground(new java.awt.Color(108, 122, 137));
        TXTDate.setForeground(new java.awt.Color(255, 255, 255));
        TXTDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTDateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DATE :");

        TXTCarCode.setBackground(new java.awt.Color(108, 122, 137));
        TXTCarCode.setForeground(new java.awt.Color(255, 255, 255));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Car Code", "Car Name", "Model", "Engine Displacement", "Engine Power", "Fuel-Type", "Gear Box", "Transmission-Type", "Seating Capacity", "Top-Speed", "Price_RS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setMaxWidth(1000);
            table1.getColumnModel().getColumn(1).setMaxWidth(1000);
            table1.getColumnModel().getColumn(2).setMaxWidth(1000);
            table1.getColumnModel().getColumn(10).setResizable(false);
        }

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "HATCHBACK", "SEDAN", "SUV" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        TXTcombo.setEditable(false);
        TXTcombo.setBackground(new java.awt.Color(108, 122, 137));
        TXTcombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TXTcombo.setForeground(new java.awt.Color(255, 255, 255));
        TXTcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTcomboActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(34, 167, 240));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LBLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LBLogin.setForeground(new java.awt.Color(255, 255, 255));
        LBLogin.setText("Toyota Car Sales System - Purchase a Car ");

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(236, 240, 241));
        jLabel3.setText("Welcome ,");

        name.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        name.setForeground(new java.awt.Color(236, 240, 241));
        name.setText("ooooooooooooo");

        jButton4.setText("Get Help");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 204, 255));
        jLabel5.setText("Please Select Car type : ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 204, 255));
        jLabel6.setText("Add your car to purchase :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Car Code :");

        jLabel8.setBackground(new java.awt.Color(255, 51, 51));
        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 204, 255));
        jLabel8.setText("Enter the code of a car:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 204, 255));
        jLabel9.setText("Select the color of your car :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 204, 255));
        jLabel10.setText("Please Select Accessoies if you want :");

        BTNlogout.setBackground(new java.awt.Color(51, 51, 255));
        BTNlogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNlogout.setForeground(new java.awt.Color(255, 255, 255));
        BTNlogout.setText("Logout");
        BTNlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNlogoutActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/Toyota-Logo-PNG-Clipart(12).png"))); // NOI18N
        jLabel11.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1150, 1150, 1150)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name)
                        .addGap(183, 183, 183)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(98, 98, 98)
                                    .addComponent(TXTDate, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BTNlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTNadd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(BTNdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(BTNclear, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(BTNpurchase)
                        .addGap(353, 353, 353))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(TXTcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(RDBTNred)
                                .addGap(18, 18, 18)
                                .addComponent(RDBTNblue)
                                .addGap(18, 18, 18)
                                .addComponent(RDBTNblack)
                                .addGap(18, 18, 18)
                                .addComponent(RDBTNsilver)
                                .addGap(18, 18, 18)
                                .addComponent(RDBTNwhite)
                                .addGap(18, 18, 18)
                                .addComponent(RDBTNyellow)
                                .addGap(18, 18, 18)
                                .addComponent(RDBTNgray))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(TXTCarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(276, 276, 276)
                                .addComponent(CBhidLight)
                                .addGap(18, 18, 18)
                                .addComponent(CBallyRim)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TXTDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(BTNlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TXTCarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RDBTNred)
                    .addComponent(RDBTNblue)
                    .addComponent(RDBTNblack)
                    .addComponent(RDBTNsilver)
                    .addComponent(RDBTNwhite)
                    .addComponent(RDBTNyellow)
                    .addComponent(RDBTNgray))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBhidLight)
                    .addComponent(CBallyRim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNadd)
                    .addComponent(BTNdelete)
                    .addComponent(BTNpurchase)
                    .addComponent(BTNclear))
                .addGap(179, 179, 179)
                .addComponent(jButton4)
                .addGap(195, 195, 195))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
                String item = jComboBox1.getSelectedItem().toString();
        TXTcombo.setText(item);
        clear();
        table1();
        TXTCarCode.setText("");
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void BTNaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNaddActionPerformed
        // TODO add your handling code here:
        CARCODE=TXTCarCode.getText();        
         int code = Integer.parseInt(CARCODE); 
         int value =jComboBox1.getSelectedIndex();
                 String t=null;
                 String s =null;
   if(RDBTNred.isSelected()){
        t=RDBTNred.getText();
   }
   else if(RDBTNblue.isSelected()){
        t=RDBTNblue.getText();
   }
   else if(RDBTNblack.isSelected()){
        t=RDBTNblack.getText();
   }
   else if(RDBTNsilver.isSelected()){
        t=RDBTNsilver.getText();
   }
   else if(RDBTNwhite.isSelected()){
        t=RDBTNwhite.getText();
   }
   else if(RDBTNyellow.isSelected()){
        t=RDBTNyellow.getText();
   }
   else if(RDBTNgray.isSelected()){
        t=RDBTNgray.getText();
   }
  
    if(CBhidLight.isSelected()&&CBallyRim.isSelected()){
        s=CBhidLight.getText()+" & "+CBallyRim.getText();
   }
    else if(CBhidLight.isSelected()){
        s=CBhidLight.getText(); 
    }
    else if(CBallyRim.isSelected()){
        s=CBallyRim.getText(); 
    }
    else{
        s ="No Accessories";
    }
        try{
              if(value==1){
              pst=con.prepareStatement("Select * from HATCHBACK where CARCODE= ?");
              pst.setInt(1, code);
              rs1=pst.executeQuery();              
              if(rs1.next()){
                  if(t==null){
                       JOptionPane.showMessageDialog(this, "Please Select Colour of your Car");
                  }
                  else{
             Model.insertRow(Model.getRowCount(),new Object[]{TXTDate.getText(),"HB-00"+rs1.getString("CARCODE"),rs1.getString("CARNAME"),rs1.getString("ENGINEDISPLACEMENT"),rs1.getString("FUELTYPE"),t,s,rs1.getInt("PRICE_RS")});
                  }     
              }
              else{
                  JOptionPane.showMessageDialog(this, "This Car does not exist");
              }
              }
              else if(value==2){
              pst=con.prepareStatement("Select * from SEDAN where CARCODE= ?");
              pst.setInt(1, code);
              rs2=pst.executeQuery();              
              if(rs2.next()){
                  if(t==null){
                       JOptionPane.showMessageDialog(this, "Please Select Colour of your Car");
                  }
                  else{
             Model.insertRow(Model.getRowCount(),new Object[]{TXTDate.getText(),"SED-00"+rs2.getString("CARCODE"),rs2.getString("CARNAME"),rs2.getString("ENGINEDISPLACEMENT"),rs2.getString("FUELTYPE"),t,s,rs2.getInt("PRICE_RS")});
                  }   
              }
              else{
                  JOptionPane.showMessageDialog(this, "This Car does not exist");
              }
              }
             else if(value==3){
              pst=con.prepareStatement("Select * from SUV where CARCODE= ?");
              pst.setInt(1, code);
              rs3=pst.executeQuery();              
              if(rs3.next()){
              if(t==null){
                       JOptionPane.showMessageDialog(this, "Please Select Colour of your Car");
                  }
                  else{
             Model.insertRow(Model.getRowCount(),new Object[]{TXTDate.getText(),"SUV-00"+rs3.getString("CARCODE"),rs3.getString("CARNAME"),rs3.getString("ENGINEDISPLACEMENT"),rs3.getString("FUELTYPE"),t,s,rs3.getInt("PRICE_RS")});
                  }  
              }
              else{
                  JOptionPane.showMessageDialog(this, "This Car does not exist");
              }
              }
          }catch (Exception ex){JOptionPane.showMessageDialog(this, ""+ex);}
        //Model.insertRow(Model.getRowCount(),new Object[]{TXTDate.getText(),CarCode.getText(),TXTNum.getText(),TXTAge.getText()});
    }//GEN-LAST:event_BTNaddActionPerformed

    private void RDBTNredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDBTNredActionPerformed
        // TODO add your handling code here:
         if(RDBTNred.isSelected()) {
            RDBTNblue.setSelected(false);
            RDBTNblack.setSelected(false);
            RDBTNsilver.setSelected(false);
            RDBTNwhite.setSelected(false);
            RDBTNyellow.setSelected(false);
            RDBTNgray.setSelected(false);
        }        
    }//GEN-LAST:event_RDBTNredActionPerformed

    private void RDBTNblueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDBTNblueActionPerformed
        // TODO add your handling code here:
         if(RDBTNblue.isSelected()) {
            RDBTNred.setSelected(false);
            RDBTNblack.setSelected(false);
            RDBTNsilver.setSelected(false);
            RDBTNwhite.setSelected(false);
            RDBTNyellow.setSelected(false);
            RDBTNgray.setSelected(false);
        }
    }//GEN-LAST:event_RDBTNblueActionPerformed

    private void RDBTNblackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDBTNblackActionPerformed
        // TODO add your handling code here:
        if(RDBTNblack.isSelected()) {
            RDBTNred.setSelected(false);
            RDBTNblue.setSelected(false);
            RDBTNsilver.setSelected(false);
            RDBTNwhite.setSelected(false);
            RDBTNyellow.setSelected(false);
            RDBTNgray.setSelected(false);
        }
    }//GEN-LAST:event_RDBTNblackActionPerformed

    private void RDBTNsilverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDBTNsilverActionPerformed
        // TODO add your handling code here:
        if(RDBTNsilver.isSelected()) {
            RDBTNred.setSelected(false);
            RDBTNblue.setSelected(false);
            RDBTNblack.setSelected(false);
            RDBTNwhite.setSelected(false);
            RDBTNyellow.setSelected(false);
            RDBTNgray.setSelected(false);
        }
    }//GEN-LAST:event_RDBTNsilverActionPerformed

    private void RDBTNwhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDBTNwhiteActionPerformed
        // TODO add your handling code here:
        if(RDBTNwhite.isSelected()) {
            RDBTNred.setSelected(false);
            RDBTNblue.setSelected(false);
            RDBTNblack.setSelected(false);
            RDBTNsilver.setSelected(false);
            RDBTNyellow.setSelected(false);
            RDBTNgray.setSelected(false);
        }
    }//GEN-LAST:event_RDBTNwhiteActionPerformed

    private void RDBTNyellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDBTNyellowActionPerformed
        // TODO add your handling code here:
         if(RDBTNyellow.isSelected()) {
            RDBTNred.setSelected(false);
            RDBTNblue.setSelected(false);
            RDBTNblack.setSelected(false);
            RDBTNsilver.setSelected(false);
            RDBTNwhite.setSelected(false);
            RDBTNgray.setSelected(false);
        }
    }//GEN-LAST:event_RDBTNyellowActionPerformed

    private void RDBTNgrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDBTNgrayActionPerformed
        // TODO add your handling code here:
         if(RDBTNgray.isSelected()) {
            RDBTNred.setSelected(false);
            RDBTNblue.setSelected(false);
            RDBTNblack.setSelected(false);
            RDBTNsilver.setSelected(false);
            RDBTNwhite.setSelected(false);
            RDBTNyellow.setSelected(false);
        }
    }//GEN-LAST:event_RDBTNgrayActionPerformed

    private void TXTDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTDateActionPerformed

    private void BTNdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNdeleteActionPerformed
        // TODO add your handling code here:
       try{
        DefaultTableModel xm =(DefaultTableModel)table2.getModel();
    int rm =table2.getSelectedRow();    
    xm.removeRow(rm);
       }catch(Exception ex){
           JOptionPane.showMessageDialog(this, "Please Select Which car you want to remove");
       }
    }//GEN-LAST:event_BTNdeleteActionPerformed

    private void BTNpurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNpurchaseActionPerformed
        // TODO add your handling code here:
        JtableToDB();
        JOptionPane.showMessageDialog(this, "Enter Credit Card information");
                 String a =name.getText();                 
              new CreditCardinfo(a).setVisible(true);
              setVisible(false);             
             this.dispose();
    }//GEN-LAST:event_BTNpurchaseActionPerformed

    private void BTNclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNclearActionPerformed
        // TODO add your handling code here:
          DefaultTableModel dm =(DefaultTableModel)table2.getModel();
    int rowCount = dm.getRowCount();    
    for (int i = rowCount - 1; i >= 0; i--) {
          dm.removeRow(i);        
    }
        
    }//GEN-LAST:event_BTNclearActionPerformed

    private void LBLminimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBLminimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_LBLminimizeMouseClicked

    private void LBLcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBLcloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_LBLcloseMouseClicked

    private void TXTcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTcomboActionPerformed

    private void BTNlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNlogoutActionPerformed
        // TODO add your handling code here:
         SignInForm lf =new SignInForm();
        lf.setVisible(true);
        lf.pack();
        lf.setLocationRelativeTo(null);
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_BTNlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNadd;
    private javax.swing.JButton BTNclear;
    private javax.swing.JButton BTNdelete;
    private javax.swing.JButton BTNlogout;
    private javax.swing.JButton BTNpurchase;
    private javax.swing.JCheckBox CBallyRim;
    private javax.swing.JCheckBox CBhidLight;
    private javax.swing.JLabel LBLclose;
    private javax.swing.JLabel LBLminimize;
    private javax.swing.JLabel LBLogin;
    private javax.swing.JRadioButton RDBTNblack;
    private javax.swing.JRadioButton RDBTNblue;
    private javax.swing.JRadioButton RDBTNgray;
    private javax.swing.JRadioButton RDBTNred;
    private javax.swing.JRadioButton RDBTNsilver;
    private javax.swing.JRadioButton RDBTNwhite;
    private javax.swing.JRadioButton RDBTNyellow;
    private javax.swing.JTextField TXTCarCode;
    private javax.swing.JTextField TXTDate;
    private javax.swing.JTextField TXTcombo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel name;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    // End of variables declaration//GEN-END:variables
}
