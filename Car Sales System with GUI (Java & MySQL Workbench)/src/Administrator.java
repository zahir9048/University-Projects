import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Administrator extends javax.swing.JFrame {

Connection con;
Statement stat1=null,stat2=null,stat3=null;
ResultSet rs1,rs2,rs3;
String CARNAME,MODEL,ENGINEDISPLACEMENT,ENGINEPOWER,FUELTYPE,GEARBOX,TRANSMISSIONTYPE,SEATINGCAPACITY,TOPSPEED,PRICE_RS,CARCODE;
PreparedStatement pst;

    public Administrator() {
        initComponents();
         this.setLocationRelativeTo(null);
        connect();
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
                     JOptionPane.showMessageDialog(this, ex); 
    }
      catch (SQLException ex) {  JOptionPane.showMessageDialog(this,ex); }
}
public void table(){
    int value =jComboBox1.getSelectedIndex();
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carsalessystem","root","adil095"); 
            stat1 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stat2 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stat3 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs1=stat1.executeQuery("SELECT * FROM hatchback");
            rs2=stat2.executeQuery("SELECT * FROM SEDAN");
            rs3=stat3.executeQuery("SELECT * FROM SUV");
            
            if(value == 1){
            while(rs1.next()){
                String code =String.valueOf(rs1.getString("CARCODE"));
                String car =String.valueOf(rs1.getString("CARNAME"));
                String model =String.valueOf(rs1.getString("Model"));
                String engine =String.valueOf(rs1.getString("ENGINEDISPLACEMENT"));
                String fuel =String.valueOf(rs1.getString("FUELTYPE"));                
                String price=String.valueOf(rs1.getInt("PRICE_RS"));
                String tbdata[]={code,car,model,engine,fuel,price};
                DefaultTableModel tblModel =(DefaultTableModel)CarTable.getModel();
                tblModel.addRow(tbdata);
            }
            }
            if(value == 2){
            while(rs2.next()){
                String code =String.valueOf(rs2.getString("CARCODE"));
                String car =String.valueOf(rs2.getString("CARNAME"));
                String model =String.valueOf(rs2.getString("Model"));
                String engine =String.valueOf(rs2.getString("ENGINEDISPLACEMENT"));
                String fuel =String.valueOf(rs2.getString("FUELTYPE"));                
                String price=String.valueOf(rs2.getInt("PRICE_RS"));
                String tbdata[]={code,car,model,engine,fuel,price};
                DefaultTableModel tblModel =(DefaultTableModel)CarTable.getModel();
                tblModel.addRow(tbdata);
            }
            }
            if(value == 3){
            while(rs3.next()){
                String code =String.valueOf(rs3.getString("CARCODE"));
                String car =String.valueOf(rs3.getString("CARNAME"));
                String model =String.valueOf(rs3.getString("Model"));
                String engine =String.valueOf(rs3.getString("ENGINEDISPLACEMENT"));
                String fuel =String.valueOf(rs3.getString("FUELTYPE"));                
                String price=String.valueOf(rs3.getInt("PRICE_RS"));
                String tbdata[]={code,car,model,engine,fuel,price};
                DefaultTableModel tblModel =(DefaultTableModel)CarTable.getModel();
                tblModel.addRow(tbdata);
            }
            }
    }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
}
public void clear(){
     DefaultTableModel dm =(DefaultTableModel)CarTable.getModel();
    int rowCount = dm.getRowCount();    
    for (int i = rowCount - 1; i >= 0; i--) {
          dm.removeRow(i);        
    }
}
public void ClearAll(){
            TXTCarname.setText("");
            TXTModel.setText("");
            TXTEngineDisplay.setText("");
            TXTEnginePower.setText("");
            TXTfueltype.setText("");
            TXTGearBox.setText("");
            TXTTransmisionType.setText("");
            TXTSeatingCapacity.setText("");
            TXTTopSpeed.setText("");
            TXTPrice.setText("");
            TXTCarCode.setText("");
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        LBLCarname = new javax.swing.JLabel();
        LBLEngineDisplay = new javax.swing.JLabel();
        LBLfueltype = new javax.swing.JLabel();
        LBLTransmissionType = new javax.swing.JLabel();
        LBLTopSpeed = new javax.swing.JLabel();
        TXTcombo = new javax.swing.JTextField();
        TXTCarname = new javax.swing.JTextField();
        TXTEngineDisplay = new javax.swing.JTextField();
        TXTfueltype = new javax.swing.JTextField();
        TXTTransmisionType = new javax.swing.JTextField();
        TXTTopSpeed = new javax.swing.JTextField();
        LBLCarCode = new javax.swing.JLabel();
        LBLModel = new javax.swing.JLabel();
        LBLEnginePower = new javax.swing.JLabel();
        LBLGearBox = new javax.swing.JLabel();
        LBLSeatingCapacity = new javax.swing.JLabel();
        LBLPrice = new javax.swing.JLabel();
        TXTCarCode = new javax.swing.JTextField();
        TXTModel = new javax.swing.JTextField();
        TXTEnginePower = new javax.swing.JTextField();
        TXTGearBox = new javax.swing.JTextField();
        TXTSeatingCapacity = new javax.swing.JTextField();
        TXTPrice = new javax.swing.JTextField();
        BTNfirst = new javax.swing.JButton();
        BTNprevious = new javax.swing.JButton();
        BTNnext = new javax.swing.JButton();
        BTNlast = new javax.swing.JButton();
        BTNsearch = new javax.swing.JButton();
        BTNinsert = new javax.swing.JButton();
        BTNupdate = new javax.swing.JButton();
        BTNdelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        LBLogin = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LBLminimize = new javax.swing.JLabel();
        LBLclose = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CarTable = new javax.swing.JTable();
        BTNlogout = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LBLCarname1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setMaximumRowCount(6);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "HATCHBACK", "SEDAN", "SUV" }));
        jComboBox1.setToolTipText("");
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setKeySelectionManager(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        LBLCarname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LBLCarname.setForeground(new java.awt.Color(51, 204, 255));
        LBLCarname.setText("Select the type of a car:");

        LBLEngineDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBLEngineDisplay.setForeground(new java.awt.Color(255, 255, 255));
        LBLEngineDisplay.setText("Engine Displacement");

        LBLfueltype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBLfueltype.setForeground(new java.awt.Color(255, 255, 255));
        LBLfueltype.setText("Fuel-Type");

        LBLTransmissionType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBLTransmissionType.setForeground(new java.awt.Color(255, 255, 255));
        LBLTransmissionType.setText("Transmission-Type");

        LBLTopSpeed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBLTopSpeed.setForeground(new java.awt.Color(255, 255, 255));
        LBLTopSpeed.setText("Top speed");

        TXTcombo.setBackground(new java.awt.Color(108, 122, 137));
        TXTcombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TXTcombo.setForeground(new java.awt.Color(255, 255, 255));
        TXTcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTcomboActionPerformed(evt);
            }
        });

        TXTCarname.setBackground(new java.awt.Color(108, 122, 137));
        TXTCarname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TXTCarname.setForeground(new java.awt.Color(255, 255, 255));

        TXTEngineDisplay.setBackground(new java.awt.Color(108, 122, 137));
        TXTEngineDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TXTEngineDisplay.setForeground(new java.awt.Color(255, 255, 255));
        TXTEngineDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTEngineDisplayActionPerformed(evt);
            }
        });

        TXTfueltype.setBackground(new java.awt.Color(108, 122, 137));
        TXTfueltype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TXTfueltype.setForeground(new java.awt.Color(255, 255, 255));
        TXTfueltype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTfueltypeActionPerformed(evt);
            }
        });

        TXTTransmisionType.setBackground(new java.awt.Color(108, 122, 137));
        TXTTransmisionType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TXTTransmisionType.setForeground(new java.awt.Color(255, 255, 255));

        TXTTopSpeed.setBackground(new java.awt.Color(108, 122, 137));
        TXTTopSpeed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TXTTopSpeed.setForeground(new java.awt.Color(255, 255, 255));

        LBLCarCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBLCarCode.setForeground(new java.awt.Color(255, 255, 255));
        LBLCarCode.setText("Car Code");

        LBLModel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBLModel.setForeground(new java.awt.Color(255, 255, 255));
        LBLModel.setText("Model");

        LBLEnginePower.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBLEnginePower.setForeground(new java.awt.Color(255, 255, 255));
        LBLEnginePower.setText("Engine Power");

        LBLGearBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBLGearBox.setForeground(new java.awt.Color(255, 255, 255));
        LBLGearBox.setText("Gear-Box");

        LBLSeatingCapacity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBLSeatingCapacity.setForeground(new java.awt.Color(255, 255, 255));
        LBLSeatingCapacity.setText("Seating Capacity");

        LBLPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBLPrice.setForeground(new java.awt.Color(255, 255, 255));
        LBLPrice.setText("Price");

        TXTCarCode.setBackground(new java.awt.Color(108, 122, 137));
        TXTCarCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TXTCarCode.setForeground(new java.awt.Color(255, 255, 255));

        TXTModel.setBackground(new java.awt.Color(108, 122, 137));
        TXTModel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TXTModel.setForeground(new java.awt.Color(255, 255, 255));
        TXTModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTModelActionPerformed(evt);
            }
        });

        TXTEnginePower.setBackground(new java.awt.Color(108, 122, 137));
        TXTEnginePower.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TXTEnginePower.setForeground(new java.awt.Color(255, 255, 255));

        TXTGearBox.setBackground(new java.awt.Color(108, 122, 137));
        TXTGearBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TXTGearBox.setForeground(new java.awt.Color(255, 255, 255));
        TXTGearBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTGearBoxActionPerformed(evt);
            }
        });

        TXTSeatingCapacity.setBackground(new java.awt.Color(108, 122, 137));
        TXTSeatingCapacity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TXTSeatingCapacity.setForeground(new java.awt.Color(255, 255, 255));

        TXTPrice.setBackground(new java.awt.Color(108, 122, 137));
        TXTPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TXTPrice.setForeground(new java.awt.Color(255, 255, 255));

        BTNfirst.setBackground(new java.awt.Color(34, 167, 240));
        BTNfirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNfirst.setForeground(new java.awt.Color(255, 255, 255));
        BTNfirst.setText("|<<");
        BTNfirst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNfirstActionPerformed(evt);
            }
        });

        BTNprevious.setBackground(new java.awt.Color(34, 167, 240));
        BTNprevious.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNprevious.setForeground(new java.awt.Color(255, 255, 255));
        BTNprevious.setText("<<");
        BTNprevious.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNpreviousActionPerformed(evt);
            }
        });

        BTNnext.setBackground(new java.awt.Color(34, 167, 240));
        BTNnext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNnext.setForeground(new java.awt.Color(255, 255, 255));
        BTNnext.setText(">>");
        BTNnext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNnextActionPerformed(evt);
            }
        });

        BTNlast.setBackground(new java.awt.Color(34, 167, 240));
        BTNlast.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNlast.setForeground(new java.awt.Color(255, 255, 255));
        BTNlast.setText(">>|");
        BTNlast.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNlastActionPerformed(evt);
            }
        });

        BTNsearch.setBackground(new java.awt.Color(242, 38, 19));
        BTNsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNsearch.setForeground(new java.awt.Color(255, 255, 255));
        BTNsearch.setText("Search");
        BTNsearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNsearchActionPerformed(evt);
            }
        });

        BTNinsert.setBackground(new java.awt.Color(242, 38, 19));
        BTNinsert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNinsert.setForeground(new java.awt.Color(255, 255, 255));
        BTNinsert.setText("Insert");
        BTNinsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNinsertActionPerformed(evt);
            }
        });

        BTNupdate.setBackground(new java.awt.Color(242, 38, 19));
        BTNupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNupdate.setForeground(new java.awt.Color(255, 255, 255));
        BTNupdate.setText("Update");
        BTNupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNupdateActionPerformed(evt);
            }
        });

        BTNdelete.setBackground(new java.awt.Color(242, 38, 19));
        BTNdelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNdelete.setForeground(new java.awt.Color(255, 255, 255));
        BTNdelete.setText("Delete");
        BTNdelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNdeleteActionPerformed(evt);
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(LBLogin)
                    .addContainerGap(258, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(LBLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        CarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Code", "Car Name", "Model", "Engine", "Fuel-Type", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CarTable);

        BTNlogout.setBackground(new java.awt.Color(51, 51, 255));
        BTNlogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNlogout.setForeground(new java.awt.Color(255, 255, 255));
        BTNlogout.setText("LOGOUT");
        BTNlogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNlogoutActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(242, 38, 19));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(34, 167, 240));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Record of bills");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome Administrator!");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/Toyota-Logo-PNG-Clipart(12).png"))); // NOI18N
        jLabel3.setText("jLabel3");

        LBLCarname1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBLCarname1.setForeground(new java.awt.Color(255, 255, 255));
        LBLCarname1.setText("Name of Car");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(454, 454, 454)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTNinsert, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(BTNsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTNnext, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(BTNlast, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTNupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTNprevious, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(LBLCarname, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(213, 213, 213)
                                .addComponent(jLabel2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBLEngineDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBLfueltype, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBLTopSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBLTransmissionType)
                            .addComponent(LBLCarname1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TXTcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TXTCarname, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TXTEngineDisplay, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TXTfueltype, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TXTTopSpeed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(TXTTransmisionType, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLEnginePower, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBLGearBox)
                    .addComponent(LBLSeatingCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBLPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBLModel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBLCarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXTSeatingCapacity, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(TXTGearBox, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TXTEnginePower, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TXTModel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TXTCarCode, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TXTPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LBLCarname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BTNlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TXTcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(LBLCarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TXTCarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(TXTCarname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(LBLCarname1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(LBLModel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(TXTModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(LBLEngineDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXTEngineDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LBLEnginePower, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXTEnginePower, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(TXTfueltype, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LBLfueltype, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LBLGearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXTGearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(TXTTransmisionType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LBLTransmissionType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LBLSeatingCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXTSeatingCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(LBLTopSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXTTopSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LBLPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXTPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(BTNnext)
                                            .addComponent(BTNlast))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BTNsearch)
                                            .addComponent(BTNinsert)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BTNfirst)
                                        .addGap(9, 9, 9)
                                        .addComponent(BTNupdate))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNprevious)
                        .addGap(9, 9, 9)
                        .addComponent(BTNdelete)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTEngineDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTEngineDisplayActionPerformed
     
    }//GEN-LAST:event_TXTEngineDisplayActionPerformed

    private void BTNfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNfirstActionPerformed
int value =jComboBox1.getSelectedIndex();
        try{
            if(value==1){
            rs1.first();
            TXTCarCode.setText("HB-00"+rs1.getString(1));
            TXTCarname.setText(rs1.getString(2));
            TXTModel.setText(rs1.getString(3));
            TXTEngineDisplay.setText(rs1.getString(4));
            TXTEnginePower.setText(rs1.getString(5));
            TXTfueltype.setText(rs1.getString(6));
            TXTGearBox.setText(rs1.getString(7));
            TXTTransmisionType.setText(rs1.getString(8));
            TXTSeatingCapacity.setText(rs1.getString(9));
            TXTTopSpeed.setText(rs1.getString(10));
            TXTPrice.setText(rs1.getString(11));
           
            }
            else if(value == 2){
                rs2.first();
            TXTCarCode.setText("SED-00"+rs2.getString(1));
            TXTCarname.setText(rs2.getString(2));
            TXTModel.setText(rs2.getString(3));
            TXTEngineDisplay.setText(rs2.getString(4));
            TXTEnginePower.setText(rs2.getString(5));
            TXTfueltype.setText(rs2.getString(6));
            TXTGearBox.setText(rs2.getString(7));
            TXTTransmisionType.setText(rs2.getString(8));
            TXTSeatingCapacity.setText(rs2.getString(9));
            TXTTopSpeed.setText(rs2.getString(10));
            TXTPrice.setText(rs2.getString(11));
            
            }
            else if(value == 3){
                rs3.first();
            TXTCarCode.setText("SUV-00"+rs3.getString(1));
            TXTCarname.setText(rs3.getString(2));
            TXTModel.setText(rs3.getString(3));
            TXTEngineDisplay.setText(rs3.getString(4));
            TXTEnginePower.setText(rs3.getString(5));
            TXTfueltype.setText(rs3.getString(6));
            TXTGearBox.setText(rs3.getString(7));
            TXTTransmisionType.setText(rs3.getString(8));
            TXTSeatingCapacity.setText(rs3.getString(9));
            TXTTopSpeed.setText(rs3.getString(10));
            TXTPrice.setText(rs3.getString(11));
            
            }
                       else{
             JOptionPane.showMessageDialog(this, "Please Select your Car ");  
           }
        } catch (SQLException ex) { }
    }//GEN-LAST:event_BTNfirstActionPerformed

    private void BTNnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNnextActionPerformed
         
     try{
          int value =jComboBox1.getSelectedIndex();

           if(value==1){    
            
            if(!rs1.isLast())
            {
                rs1.next();
            TXTCarCode.setText("HB-00"+rs1.getString(1));
            TXTCarname.setText(rs1.getString(2));
            TXTModel.setText(rs1.getString(3));
            TXTEngineDisplay.setText(rs1.getString(4));
            TXTEnginePower.setText(rs1.getString(5));
            TXTfueltype.setText(rs1.getString(6));
            TXTGearBox.setText(rs1.getString(7));
            TXTTransmisionType.setText(rs1.getString(8));
            TXTSeatingCapacity.setText(rs1.getString(9));
            TXTTopSpeed.setText(rs1.getString(10));
            TXTPrice.setText(rs1.getString(11));
            }
           }
           else if(value==2){    
            
            if(!rs2.isLast())
            {
                rs2.next();
            TXTCarCode.setText("SED-00"+rs2.getString(1));
            TXTCarname.setText(rs2.getString(2));
            TXTModel.setText(rs2.getString(3));
            TXTEngineDisplay.setText(rs2.getString(4));
            TXTEnginePower.setText(rs2.getString(5));
            TXTfueltype.setText(rs2.getString(6));
            TXTGearBox.setText(rs2.getString(7));
            TXTTransmisionType.setText(rs2.getString(8));
            TXTSeatingCapacity.setText(rs2.getString(9));
            TXTTopSpeed.setText(rs2.getString(10));
            TXTPrice.setText(rs2.getString(11));
            }
           }
           else if(value==3){    
            
            if(!rs3.isLast())
            {
                rs3.next();
            TXTCarCode.setText("SUV-00"+rs3.getString(1));
            TXTCarname.setText(rs3.getString(2));
            TXTModel.setText(rs3.getString(3));
            TXTEngineDisplay.setText(rs3.getString(4));
            TXTEnginePower.setText(rs3.getString(5));
            TXTfueltype.setText(rs3.getString(6));
            TXTGearBox.setText(rs3.getString(7));
            TXTTransmisionType.setText(rs3.getString(8));
            TXTSeatingCapacity.setText(rs3.getString(9));
            TXTTopSpeed.setText(rs3.getString(10));
            TXTPrice.setText(rs3.getString(11));

            }
           }
                      else{
             JOptionPane.showMessageDialog(this, "Please Select your Car ");  
           }
           
        } catch (SQLException ex) { }
    }//GEN-LAST:event_BTNnextActionPerformed

    private void BTNpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNpreviousActionPerformed
        // TODO add your handling code here:
        try {
            int value =jComboBox1.getSelectedIndex();
            if(value==1){  
            if(!rs1.isFirst()){
                rs1.previous();
            TXTCarCode.setText("HB-00"+rs1.getString(1));
            TXTCarname.setText(rs1.getString(2));
            TXTModel.setText(rs1.getString(3));
            TXTEngineDisplay.setText(rs1.getString(4));
            TXTEnginePower.setText(rs1.getString(5));
            TXTfueltype.setText(rs1.getString(6));
            TXTGearBox.setText(rs1.getString(7));
            TXTTransmisionType.setText(rs1.getString(8));
            TXTSeatingCapacity.setText(rs1.getString(9));
            TXTTopSpeed.setText(rs1.getString(10));
            TXTPrice.setText(rs1.getString(11));
            }
            }
            else if(value==2){ 
                if(!rs2.isFirst()){
                rs2.previous();
            TXTCarCode.setText("SED-00"+rs2.getString(1));
            TXTCarname.setText(rs2.getString(2));
            TXTModel.setText(rs2.getString(3));
            TXTEngineDisplay.setText(rs2.getString(4));
            TXTEnginePower.setText(rs2.getString(5));
            TXTfueltype.setText(rs2.getString(6));
            TXTGearBox.setText(rs2.getString(7));
            TXTTransmisionType.setText(rs2.getString(8));
            TXTSeatingCapacity.setText(rs2.getString(9));
            TXTTopSpeed.setText(rs2.getString(10));
            TXTPrice.setText(rs2.getString(11));
                }
            }
            else if(value==3){ 
                if(!rs3.isFirst()){
                rs3.previous();
           TXTCarCode.setText("SUV-00"+rs3.getString(1));
            TXTCarname.setText(rs3.getString(2));
            TXTModel.setText(rs3.getString(3));
            TXTEngineDisplay.setText(rs3.getString(4));
            TXTEnginePower.setText(rs3.getString(5));
            TXTfueltype.setText(rs3.getString(6));
            TXTGearBox.setText(rs3.getString(7));
            TXTTransmisionType.setText(rs3.getString(8));
            TXTSeatingCapacity.setText(rs3.getString(9));
            TXTTopSpeed.setText(rs3.getString(10));
            TXTPrice.setText(rs3.getString(11));

                }
            }
                       else{
             JOptionPane.showMessageDialog(this, "Please Select your Car ");  
           }
        } catch (SQLException ex) { }
    }//GEN-LAST:event_BTNpreviousActionPerformed

    private void BTNlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNlastActionPerformed
        // TODO add your handling code here:
        try
        {
            int value =jComboBox1.getSelectedIndex();
           if(value==1){
            rs1.last();
            TXTCarCode.setText("HB-00"+rs1.getString(1));
            TXTCarname.setText(rs1.getString(2));
            TXTModel.setText(rs1.getString(3));
            TXTEngineDisplay.setText(rs1.getString(4));
            TXTEnginePower.setText(rs1.getString(5));
            TXTfueltype.setText(rs1.getString(6));
            TXTGearBox.setText(rs1.getString(7));
            TXTTransmisionType.setText(rs1.getString(8));
            TXTSeatingCapacity.setText(rs1.getString(9));
            TXTTopSpeed.setText(rs1.getString(10));
            TXTPrice.setText(rs1.getString(11));
           }
           else if(value==2){
              rs2.last();  
            TXTCarCode.setText("SED-00"+rs2.getString(1));
            TXTCarname.setText(rs2.getString(2));
            TXTModel.setText(rs2.getString(3));
            TXTEngineDisplay.setText(rs2.getString(4));
            TXTEnginePower.setText(rs2.getString(5));
            TXTfueltype.setText(rs2.getString(6));
            TXTGearBox.setText(rs2.getString(7));
            TXTTransmisionType.setText(rs2.getString(8));
            TXTSeatingCapacity.setText(rs2.getString(9));
            TXTTopSpeed.setText(rs2.getString(10));
            TXTPrice.setText(rs2.getString(11));
           }
           else if(value==3){
              rs3.last(); 
            TXTCarCode.setText("SUV-00"+rs3.getString(1));
            TXTCarname.setText(rs3.getString(2));
            TXTModel.setText(rs3.getString(3));
            TXTEngineDisplay.setText(rs3.getString(4));
            TXTEnginePower.setText(rs3.getString(5));
            TXTfueltype.setText(rs3.getString(6));
            TXTGearBox.setText(rs3.getString(7));
            TXTTransmisionType.setText(rs3.getString(8));
            TXTSeatingCapacity.setText(rs3.getString(9));
            TXTTopSpeed.setText(rs3.getString(10));
            TXTPrice.setText(rs3.getString(11));

           }
           else{
             JOptionPane.showMessageDialog(this, "Please Select your Car ");  
           }
        } catch (SQLException ex) { }
    }//GEN-LAST:event_BTNlastActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
                // TODO add your handling code here:
        String item = jComboBox1.getSelectedItem().toString();
        TXTcombo.setText(item);
        clear();
        table();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void TXTcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTcomboActionPerformed

    private void TXTfueltypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTfueltypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTfueltypeActionPerformed

    private void TXTModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTModelActionPerformed

    private void TXTGearBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTGearBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTGearBoxActionPerformed

    private void BTNinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNinsertActionPerformed
        // TODO add your handling code here:
        int value =jComboBox1.getSelectedIndex();
        
        CARNAME = TXTCarname.getText();
        MODEL = TXTModel.getText();
        ENGINEDISPLACEMENT = TXTEngineDisplay.getText();
        ENGINEPOWER = TXTEnginePower.getText();
        FUELTYPE = TXTfueltype.getText();
        GEARBOX = TXTGearBox.getText();
        TRANSMISSIONTYPE = TXTTransmisionType.getText();
        SEATINGCAPACITY = TXTSeatingCapacity.getText();
        TOPSPEED = TXTTopSpeed.getText();
        PRICE_RS = TXTPrice.getText();    
        CARCODE = TXTCarCode.getText();
        int Price = Integer.parseInt(PRICE_RS);
        int code = Integer.parseInt(CARCODE);
      
        try{             
           if(value==1){
            // SELECT
            String sql ="INSERT INTO HATCHBACK VALUES ("+code+",'"+CARNAME+"','"+MODEL+"','"+ENGINEDISPLACEMENT+
  "','"+ENGINEPOWER+"','"+FUELTYPE+"','"+GEARBOX+"','"+TRANSMISSIONTYPE+"',"
                    + "'"+SEATINGCAPACITY+"','"+TOPSPEED+"',"+Price+")";
            stat1.executeUpdate(sql);
           JOptionPane.showMessageDialog(this, "Car sucessfully inserted in HATCHBACK ");
           }
           else if(value==2){ 
            String sql ="INSERT INTO SEDAN VALUES ("+code+",'"+CARNAME+"','"+MODEL+"','"+ENGINEDISPLACEMENT+
  "','"+ENGINEPOWER+"','"+FUELTYPE+"','"+GEARBOX+"','"+TRANSMISSIONTYPE+"',"
                    + "'"+SEATINGCAPACITY+"','"+TOPSPEED+"',"+Price+")";
            stat1.executeUpdate(sql);
           JOptionPane.showMessageDialog(this, "Car sucessfully inserted in SEDAN ");               
           }
          else if(value==3){ 
            String sql ="INSERT INTO SUV VALUES ("+code+",'"+CARNAME+"','"+MODEL+"','"+ENGINEDISPLACEMENT+
  "','"+ENGINEPOWER+"','"+FUELTYPE+"','"+GEARBOX+"','"+TRANSMISSIONTYPE+"'"
                    + ",'"+SEATINGCAPACITY+"','"+TOPSPEED+"',"+Price+")";
            stat1.executeUpdate(sql);
           JOptionPane.showMessageDialog(this, "Car sucessfully inserted in SUV ");                        
          }
           else{
             JOptionPane.showMessageDialog(this, "Please Select your Car! ");  
           }
        }catch (Exception ex) {JOptionPane.showMessageDialog(this, ""+ex); }
        clear();
        table();
    }//GEN-LAST:event_BTNinsertActionPerformed

    private void BTNupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNupdateActionPerformed
        // TODO add your handling code here:
        int value =jComboBox1.getSelectedIndex();
        
        CARNAME = TXTCarname.getText();
        MODEL = TXTModel.getText();
        ENGINEDISPLACEMENT = TXTEngineDisplay.getText();
        ENGINEPOWER = TXTEnginePower.getText();
        FUELTYPE = TXTfueltype.getText();
        GEARBOX = TXTGearBox.getText();
        TRANSMISSIONTYPE = TXTTransmisionType.getText();
        SEATINGCAPACITY = TXTSeatingCapacity.getText();
        TOPSPEED = TXTTopSpeed.getText();
        PRICE_RS = TXTPrice.getText();  
        CARCODE=TXTCarCode.getText();
        String code3 =CARCODE.substring(CARCODE.length() - 3);

        int Price = Integer.parseInt(PRICE_RS);
        int code = Integer.parseInt(code3);        
        
        try{
           if(value==1){
   String sql ="UPDATE HATCHBACK SET CARNAME = '"+CARNAME+"',MODEL ='"+MODEL+"',ENGINEDISPLACEMENT = '"+ENGINEDISPLACEMENT+
                    "',ENGINEPOWER = '"+ENGINEPOWER+"',FUELTYPE = '"+FUELTYPE+"',GEARBOX = '"+GEARBOX+"',TRANSMISSIONTYPE = '"
           +TRANSMISSIONTYPE+"',SEATINGCAPACITY = '"+SEATINGCAPACITY+"',TOPSPEED = '"+TOPSPEED+"',PRICE_RS = "
           +Price+" Where CARCODE = "+code ;
            stat1.executeUpdate(sql);
            
          JOptionPane.showMessageDialog(this, "Selected HATCHBACK Sucessfully Updated");
           }
           if(value==2){
   String sql ="UPDATE SEDAN SET CARNAME = '"+CARNAME+"',MODEL ='"+MODEL+"',ENGINEDISPLACEMENT = '"+ENGINEDISPLACEMENT+
                    "',ENGINEPOWER = '"+ENGINEPOWER+"',FUELTYPE = '"+FUELTYPE+"',GEARBOX = '"+GEARBOX+"',TRANSMISSIONTYPE = '"
           +TRANSMISSIONTYPE+"',SEATINGCAPACITY = '"+SEATINGCAPACITY+"',TOPSPEED = '"+TOPSPEED+"',PRICE_RS = "
           +Price+" Where CARCODE = "+code ;
            stat1.executeUpdate(sql);
            
          JOptionPane.showMessageDialog(this, "Selected SEDAN Sucessfully Updated");
           }
           if(value==3){
   String sql ="UPDATE SUV SET CARNAME = '"+CARNAME+"',MODEL ='"+MODEL+"',ENGINEDISPLACEMENT = '"+ENGINEDISPLACEMENT+
                    "',ENGINEPOWER = '"+ENGINEPOWER+"',FUELTYPE = '"+FUELTYPE+"',GEARBOX = '"+GEARBOX+"',TRANSMISSIONTYPE = '"
           +TRANSMISSIONTYPE+"',SEATINGCAPACITY = '"+SEATINGCAPACITY+"',TOPSPEED = '"+TOPSPEED+"',PRICE_RS = "
           +Price+" Where CARCODE = "+code ;
            stat1.executeUpdate(sql);
            
          JOptionPane.showMessageDialog(this, "Selected SUV Sucessfully Updated");
           }

        }catch (Exception ex) {          JOptionPane.showMessageDialog(this, ""+ex);}
        clear();
        table();
     
    }//GEN-LAST:event_BTNupdateActionPerformed

    private void BTNdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNdeleteActionPerformed
        // TODO add your handling code here:
          CARCODE=TXTCarCode.getText();
         String code3 =CARCODE.substring(CARCODE.length() - 3);
         int code = Integer.parseInt(code3); 
         int value =jComboBox1.getSelectedIndex();
        try{
            if(value==1){
            String sql ="DELETE FROM HATCHBACK WHERE CARCODE = "+code;
            stat1.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Selected Car Sucessfully Deleted");
            }
            else if(value==2){
            String sql ="DELETE FROM SEDAN WHERE CARCODE = "+code;
            stat1.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Selected Car Sucessfully Deleted");
            }
            else if(value==3){
            String sql ="DELETE FROM SUV WHERE CARCODE = "+code;
            stat1.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Selected Car Sucessfully Deleted");
            }
        }catch (Exception ex) {          JOptionPane.showMessageDialog(this, ""+ex);}
        clear();
        table();
        ClearAll();
    }//GEN-LAST:event_BTNdeleteActionPerformed

    private void BTNsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNsearchActionPerformed
           int value =jComboBox1.getSelectedIndex();
        
          CARCODE = TXTCarCode.getText();        
              int code = Integer.parseInt(CARCODE);
              if(value==1){
           try{
               pst=con.prepareStatement("Select * from HATCHBACK where  CARCODE= ?");
              pst.setInt(1, code);
              rs1=pst.executeQuery();
              if(rs1.next()){
            TXTCarname.setText(rs1.getString("CARNAME"));
            TXTModel.setText(rs1.getString("MODEL"));
            TXTEngineDisplay.setText(rs1.getString("ENGINEDISPLACEMENT"));
            TXTEnginePower.setText(rs1.getString("ENGINEPOWER"));            
            TXTfueltype.setText(rs1.getString("FUELTYPE"));
            TXTGearBox.setText(rs1.getString("GEARBOX"));
            TXTTransmisionType.setText(rs1.getString("TRANSMISSIONTYPE"));
            TXTSeatingCapacity.setText(rs1.getString("SEATINGCAPACITY"));            
            TXTTopSpeed.setText(rs1.getString("TOPSPEED"));
            TXTPrice.setText(rs1.getString("PRICE_RS"));
            TXTCarCode.setText("HB-00"+rs1.getString("CARCODE"));
            
              }
              else{
                  JOptionPane.showMessageDialog(this, "Car does not exist");
              }        
          }catch (Exception ex) {          JOptionPane.showMessageDialog(this, ""+ex);}
           
              }
              if(value==2){
           try{
               pst=con.prepareStatement("Select * from SEDAN where  CARCODE= ?");
              pst.setInt(1, code);
              rs2=pst.executeQuery();
              if(rs2.next()){
            TXTCarname.setText(rs2.getString("CARNAME"));
            TXTModel.setText(rs2.getString("MODEL"));
            TXTEngineDisplay.setText(rs2.getString("ENGINEDISPLACEMENT"));
            TXTEnginePower.setText(rs2.getString("ENGINEPOWER"));            
            TXTfueltype.setText(rs2.getString("FUELTYPE"));
            TXTGearBox.setText(rs2.getString("GEARBOX"));
            TXTTransmisionType.setText(rs2.getString("TRANSMISSIONTYPE"));
            TXTSeatingCapacity.setText(rs2.getString("SEATINGCAPACITY"));            
            TXTTopSpeed.setText(rs2.getString("TOPSPEED"));
            TXTPrice.setText(rs2.getString("PRICE_RS"));
            TXTCarCode.setText("SED-00"+rs2.getString("CARCODE"));
            
              }
              else{
                  JOptionPane.showMessageDialog(this, "Car does not exist");
              }        
          }catch (Exception ex) {          JOptionPane.showMessageDialog(this, ""+ex);}
           
              }
              if(value==3){
           try{
               pst=con.prepareStatement("Select * from SUV where  CARCODE= ?");
              pst.setInt(1, code);
              rs3=pst.executeQuery();
              if(rs3.next()){
            TXTCarname.setText(rs3.getString("CARNAME"));
            TXTModel.setText(rs3.getString("MODEL"));
            TXTEngineDisplay.setText(rs3.getString("ENGINEDISPLACEMENT"));
            TXTEnginePower.setText(rs3.getString("ENGINEPOWER"));            
            TXTfueltype.setText(rs3.getString("FUELTYPE"));
            TXTGearBox.setText(rs3.getString("GEARBOX"));
            TXTTransmisionType.setText(rs3.getString("TRANSMISSIONTYPE"));
            TXTSeatingCapacity.setText(rs3.getString("SEATINGCAPACITY"));            
            TXTTopSpeed.setText(rs3.getString("TOPSPEED"));
            TXTPrice.setText(rs3.getString("PRICE_RS"));
            TXTCarCode.setText("SUV-00"+rs3.getString("CARCODE"));
            
              }
              else{
                  JOptionPane.showMessageDialog(this, "Car does not exist");
              }        
          }catch (Exception ex) {          JOptionPane.showMessageDialog(this, ""+ex);}
           
              }
    }//GEN-LAST:event_BTNsearchActionPerformed

    private void LBLminimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBLminimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_LBLminimizeMouseClicked

    private void LBLcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBLcloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_LBLcloseMouseClicked

    private void BTNlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNlogoutActionPerformed
        // TODO add your handling code here:
        SignInForm lf =new SignInForm();
        lf.setVisible(true);
        lf.pack();
        lf.setLocationRelativeTo(null);
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_BTNlogoutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ClearAll();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         AdminViewBilling bill =new AdminViewBilling();
        bill.setVisible(true);
        bill.pack();
        bill.setLocationRelativeTo(null);
        bill.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNdelete;
    private javax.swing.JButton BTNfirst;
    private javax.swing.JButton BTNinsert;
    private javax.swing.JButton BTNlast;
    private javax.swing.JButton BTNlogout;
    private javax.swing.JButton BTNnext;
    private javax.swing.JButton BTNprevious;
    private javax.swing.JButton BTNsearch;
    private javax.swing.JButton BTNupdate;
    private javax.swing.JTable CarTable;
    private javax.swing.JLabel LBLCarCode;
    private javax.swing.JLabel LBLCarname;
    private javax.swing.JLabel LBLCarname1;
    private javax.swing.JLabel LBLEngineDisplay;
    private javax.swing.JLabel LBLEnginePower;
    private javax.swing.JLabel LBLGearBox;
    private javax.swing.JLabel LBLModel;
    private javax.swing.JLabel LBLPrice;
    private javax.swing.JLabel LBLSeatingCapacity;
    private javax.swing.JLabel LBLTopSpeed;
    private javax.swing.JLabel LBLTransmissionType;
    private javax.swing.JLabel LBLclose;
    private javax.swing.JLabel LBLfueltype;
    private javax.swing.JLabel LBLminimize;
    private javax.swing.JLabel LBLogin;
    private javax.swing.JTextField TXTCarCode;
    private javax.swing.JTextField TXTCarname;
    private javax.swing.JTextField TXTEngineDisplay;
    private javax.swing.JTextField TXTEnginePower;
    private javax.swing.JTextField TXTGearBox;
    private javax.swing.JTextField TXTModel;
    private javax.swing.JTextField TXTPrice;
    private javax.swing.JTextField TXTSeatingCapacity;
    private javax.swing.JTextField TXTTopSpeed;
    private javax.swing.JTextField TXTTransmisionType;
    private javax.swing.JTextField TXTcombo;
    private javax.swing.JTextField TXTfueltype;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
