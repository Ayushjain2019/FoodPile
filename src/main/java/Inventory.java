
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public class Inventory extends javax.swing.JFrame {

    private Connection conn;
    
       String nam= Form.getnm();  
       
       String srch="",v,so="",sh="";
       
    public Inventory() throws ClassNotFoundException, SQLException {
        initComponents();
        
           // center the form
       this.setLocationRelativeTo(null);
        
         // create a yellow border for the jpanel_title
        // 0 border in the top
        Border jpanel_inventory = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.yellow);
        // set the border to the jPanel_title
        jPanel_inventory.setBorder(jpanel_inventory);
        
        //connection
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/project";
        conn = DriverManager.getConnection(url, "root", "Ayush@123");
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        pnm = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        name = new javax.swing.JTextField();
        category = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        thquantity = new javax.swing.JTextField();
        value = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        sval = new javax.swing.JTextField();
        sbutton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel_inventory = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        inm = new javax.swing.JRadioButton();
        prc = new javax.swing.JRadioButton();
        ctg = new javax.swing.JRadioButton();
        qnt = new javax.swing.JRadioButton();
        thqnt = new javax.swing.JRadioButton();
        inm1 = new javax.swing.JRadioButton();
        ctg1 = new javax.swing.JRadioButton();
        prc1 = new javax.swing.JRadioButton();
        qnt1 = new javax.swing.JRadioButton();
        thqnt1 = new javax.swing.JRadioButton();
        logout = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        Alert = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "item_name", "category", "price", "quantity", "threshold_quantity"
            }
        ));
        jScrollPane1.setViewportView(Table);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        sbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sbutton.setForeground(new java.awt.Color(0, 0, 204));
        sbutton.setText("Sub search");
        sbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbuttonActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 204));
        jButton3.setText("Sort");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(155, 155, 155));

        jPanel_inventory.setBackground(new java.awt.Color(0, 240, 0));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Inventory");

        javax.swing.GroupLayout jPanel_inventoryLayout = new javax.swing.GroupLayout(jPanel_inventory);
        jPanel_inventory.setLayout(jPanel_inventoryLayout);
        jPanel_inventoryLayout.setHorizontalGroup(
            jPanel_inventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_inventoryLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel7)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel_inventoryLayout.setVerticalGroup(
            jPanel_inventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_inventoryLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_inventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel_inventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("item_name");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("category");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("price");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("quantity");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("threshold_quantity");

        inm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        inm.setForeground(new java.awt.Color(0, 0, 204));
        inm.setText("item_name");
        inm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inmActionPerformed(evt);
            }
        });

        prc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        prc.setForeground(new java.awt.Color(0, 0, 204));
        prc.setText("price");
        prc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prcActionPerformed(evt);
            }
        });

        ctg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ctg.setForeground(new java.awt.Color(0, 0, 204));
        ctg.setText("category");
        ctg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctgActionPerformed(evt);
            }
        });

        qnt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qnt.setForeground(new java.awt.Color(0, 0, 204));
        qnt.setText("quantity");
        qnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qntActionPerformed(evt);
            }
        });

        thqnt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        thqnt.setForeground(new java.awt.Color(0, 0, 204));
        thqnt.setText("threshold_quantity");
        thqnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thqntActionPerformed(evt);
            }
        });

        inm1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        inm1.setForeground(new java.awt.Color(0, 0, 204));
        inm1.setText("item_name");
        inm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inm1ActionPerformed(evt);
            }
        });

        ctg1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ctg1.setForeground(new java.awt.Color(0, 0, 204));
        ctg1.setText("category");
        ctg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctg1ActionPerformed(evt);
            }
        });

        prc1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        prc1.setForeground(new java.awt.Color(0, 0, 204));
        prc1.setText("price");
        prc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prc1ActionPerformed(evt);
            }
        });

        qnt1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qnt1.setForeground(new java.awt.Color(0, 0, 204));
        qnt1.setText("quantity");
        qnt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qnt1ActionPerformed(evt);
            }
        });

        thqnt1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        thqnt1.setForeground(new java.awt.Color(0, 0, 204));
        thqnt1.setText("threshold_quantity");
        thqnt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thqnt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton3)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(inm1)
                                            .addComponent(inm))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(ctg)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(prc))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(ctg1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(prc1)
                                                .addGap(12, 12, 12)))))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(qnt)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(thqnt))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(qnt1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(thqnt1)))
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(value, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sval, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton2)
                                            .addComponent(sbutton)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10)
                                        .addGap(212, 212, 212)
                                        .addComponent(jLabel12)
                                        .addGap(25, 25, 25))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(thquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(235, 235, 235))))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inm)
                    .addComponent(ctg)
                    .addComponent(prc)
                    .addComponent(qnt)
                    .addComponent(thqnt)
                    .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctg1)
                    .addComponent(inm1)
                    .addComponent(prc1)
                    .addComponent(qnt1)
                    .addComponent(thqnt1)
                    .addComponent(sval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sbutton))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(0, 0, 204));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        refresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refresh.setForeground(new java.awt.Color(0, 0, 204));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        Alert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Alert.setForeground(new java.awt.Color(0, 0, 204));
        Alert.setText("Alert");
        Alert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlertActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Pie chart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 204));
        jButton8.setText("Bar graph");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 204));
        jButton7.setText("Edit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 204));
        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        insert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insert.setForeground(new java.awt.Color(0, 0, 204));
        insert.setText("Add");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 204));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnm)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(refresh)
                            .addComponent(logout))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Alert)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton8)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jButton7)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(insert)
                                .addComponent(jButton4)))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pnm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(logout)
                .addGap(59, 59, 59)
                .addComponent(refresh)
                .addGap(18, 18, 18)
                .addComponent(Alert)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addComponent(jButton8)
                .addGap(27, 27, 27)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(insert)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    //show content of table
    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        DefaultTableModel tableModel = ( DefaultTableModel) Table.getModel();
          
        
        try {                                        
            
            tableModel.setRowCount(0);
           
            String query2 = "SELECT * FROM user where username = ?";
           
            PreparedStatement preStat = conn.prepareStatement(query2);
            preStat.setString(1, nam);
            ResultSet result = preStat.executeQuery();
            
            while(result.next()) {
                String nm = result.getString("item_name");
                String ct= result.getString("category");
                float pc  = result.getFloat("price");
                int qt=result.getInt("quantity");
                int thqt=result.getInt("threshold_quantity");
                
               tableModel.addRow(new Object[] {nm, ct, pc, qt, thqt });
               
              
            }
            
            pnm.setText(nam);
            
            
            preStat.close();
            
        } catch (Exception ex) {
           ex.printStackTrace();
        }
   
    }//GEN-LAST:event_refreshActionPerformed

    
    //insert into the table
    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed

        try{
            String qy1="select *FROM user where item_name=? and username=?";
          PreparedStatement pst1;  
        
          pst1 = conn.prepareStatement(qy1);
        
        
            pst1.setString(1,name.getText());
            pst1.setString(2,nam);
              ResultSet rst1=pst1.executeQuery();
        
          if(name.getText().equals("") || category.getText().equals("") || price.getText().equals("") || quantity.getText().equals("") || thquantity.getText().equals("")){
            JOptionPane.showMessageDialog(null, "One or more fields empty", "Unable to Add",JOptionPane.ERROR_MESSAGE);
       }
          
          else if(rst1.next()){
              JOptionPane.showMessageDialog(null, "Item_name already in inventory", "Unable to Update",JOptionPane.ERROR_MESSAGE);
          }
          else{
        
            String n=name.getText();
            String c=category.getText();
            float p=Float.parseFloat(price.getText());
            int q=Integer.parseInt(quantity.getText());
            int t=Integer.parseInt(thquantity.getText());
            
            
            String s = "INSERT INTO user (item_name, category, price , quantity, threshold_quantity, username) VALUES(?, ?, ?, ?, ?,?)";
            PreparedStatement pS = conn.prepareStatement(s);
            
            pS.setString(1, n);
            pS.setString(2, c);
            pS.setFloat(3, p);
            pS.setInt(4, q);
            pS.setInt(5,t);
            pS.setString(6, nam);
            pS.executeUpdate();
            
            refresh.doClick();
            
           
                
     
            
              pS.close();
              
              name.setText("");
              category.setText("");
              price.setText("");
              quantity.setText("");
              thquantity.setText("");
              
        }} catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_insertActionPerformed

    //searching into the table
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       DefaultTableModel tableModel = ( DefaultTableModel) Table.getModel();
        
        if(srch.equals("")){
            JOptionPane.showMessageDialog(null, "Search field empty", "Unable to Search",JOptionPane.ERROR_MESSAGE);
        }
        
        else if(value.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Value field empty", "Unable to Search",JOptionPane.ERROR_MESSAGE);
        }
        else{
        try {
         
            
           tableModel.setRowCount(0);
          
            v=value.getText();
            
            
            String qry2="Select * from user where "+srch+" = ? and username = ?" ;
            PreparedStatement pr = conn.prepareStatement(qry2);
            pr.setString(1, v);
            pr.setString(2, nam);
            
            ResultSet rt = pr.executeQuery();
            
             while(rt.next()) {
                String nm = rt.getString("item_name");
                String ct= rt.getString("category");
                float pc  = rt.getFloat("price");
                int qt=rt.getInt("quantity");
                int thqt=rt.getInt("threshold_quantity");
                
               tableModel.addRow(new Object[] {nm, ct, pc, qt, thqt });
            }
             
             
            
           
             value.setText("");
              pr.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    //sorting the table
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        if(so.equals("")){
            JOptionPane.showMessageDialog(null, "Sort field empty", "Unable to Sort",JOptionPane.ERROR_MESSAGE);
        }
        else{
        try {
            
            DefaultTableModel tableModel = ( DefaultTableModel) Table.getModel();
            
            tableModel.setRowCount(0);
            
            
            String qry3="select * from user where username = ? order by "+so;
            PreparedStatement pst=conn.prepareStatement(qry3);
            
            pst.setString(1, nam);
            
            ResultSet rs=pst.executeQuery();
            
            while(rs.next()) {
                String nm = rs.getString("item_name");
                String ct= rs.getString("category");
                float pc  = rs.getFloat("price");
                int qt=rs.getInt("quantity");
                int thqt=rs.getInt("threshold_quantity");
                
                tableModel.addRow(new Object[] {nm, ct, pc, qt, thqt });
            }
            
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    
    //delete a row in table
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            
           int row=Table.getSelectedRow();
            String name = (String) Table.getValueAt(row,0);
            
          
            String qry="DELETE FROM user where item_name=? and username=?";
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setString(1,name);
            ps.setString(2,nam);
              ps.executeUpdate();
              
              refresh.doClick();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Select which row to delete", "Unable to delete",JOptionPane.ERROR_MESSAGE);
        }
              
    }//GEN-LAST:event_jButton4ActionPerformed

    
    //select a row in table
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
          try{int row=Table.getSelectedRow();
            String nm = (String) model.getValueAt(row,0);
              String ct = (String) model.getValueAt(row,1);
                String pc = model.getValueAt(row,2).toString();
                  String qt = model.getValueAt(row,3).toString();
                   String thqt = model.getValueAt(row,4).toString();
                    
                    name.setText(nm);
                    category.setText(ct);
                    price.setText(pc);
                    quantity.setText(qt);
                    thquantity.setText(thqt);
          }catch(Exception e){
              JOptionPane.showMessageDialog(null, "Select which row to edit", "Unable to delete",JOptionPane.ERROR_MESSAGE);
          }  
                                    
    }//GEN-LAST:event_jButton7ActionPerformed

    
    //update the table
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

       try{
           
        
        if(name.getText().equals("") || category.getText().equals("") || price.getText().equals("") || quantity.getText().equals("") || thquantity.getText().equals("")){
            JOptionPane.showMessageDialog(null, "One or more fields empty", "Unable to Update",JOptionPane.ERROR_MESSAGE);
       }
      
       
       else{
        
            
            String qry5= "update user set category=?, price=?, quantity=?, threshold_quantity=? where item_name=? and username=?";
            
            PreparedStatement prst= conn.prepareStatement(qry5);
            
            prst.setString(5, name.getText());
            prst.setString(1, category.getText());
            prst.setFloat(2, Float.parseFloat(price.getText()));
            prst.setInt(3, Integer.parseInt(quantity.getText()));
            prst.setInt(4,Integer.parseInt(thquantity.getText()));
            prst.setString(6,nam);
            
            prst.executeUpdate();
            
            refresh.doClick();
            
             name.setText("");
              category.setText("");
              price.setText("");
              quantity.setText("");
              thquantity.setText("");
              
            prst.close();}}
         catch (SQLException ex) {
            ex.printStackTrace();
        }
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        try {
            // TODO add your handling code here:
            dispose();
            new Form().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
         DefaultTableModel model = ( DefaultTableModel) Table.getModel();
        try{  int rw=Table.getSelectedRow();
            String sname = (String) model.getValueAt(rw,0);
              String scag = (String) model.getValueAt(rw,1);
                String sprice = model.getValueAt(rw,2).toString();
                  String squantity = model.getValueAt(rw,3).toString();
                   String sthq = model.getValueAt(rw,4).toString();
                   
      DefaultCategoryDataset dcd = new DefaultCategoryDataset();
           
            dcd.setValue(new Float(sprice),"Values", "price");
              dcd.setValue(new Float(squantity),"Values", "quantity");
                dcd.setValue(new Float(sthq),"Values", "threshold_quantity");
                           

                 JFreeChart chart= ChartFactory.createBarChart3D(sname, "details", "Values", dcd, PlotOrientation.VERTICAL, false, true, false);
               chart.getTitle().setPaint(Color.RED);
               CategoryPlot p=chart.getCategoryPlot();
               p.setRangeGridlinePaint(Color.BLUE);
               ChartFrame fr=new ChartFrame("item details",chart);
               fr.setVisible(true);
               fr.setSize(500,500);}
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Select whose bar chart to show", "Unable to delete",JOptionPane.ERROR_MESSAGE);
        }
        
       
       
    }//GEN-LAST:event_jButton8ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueActionPerformed

    private void sbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbuttonActionPerformed
        // TODO add your handling code here:
         if(sh.equals("")){
            JOptionPane.showMessageDialog(null, "SubSearch field empty", "Unable to Search",JOptionPane.ERROR_MESSAGE);
        }
        else if(sval.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Value field empty", "Unable to Search",JOptionPane.ERROR_MESSAGE);
        }
        else{
          DefaultTableModel tableModel = ( DefaultTableModel) Table.getModel();
        try {
         
            
           tableModel.setRowCount(0);
            
            String sva=sval.getText();
            
            
            String qy2="Select * from user where "+srch+" = ? and username = ? and "+sh+" =?";
            PreparedStatement r = conn.prepareStatement(qy2);
            r.setString(1, v);
            r.setString(2, nam);
            r.setString(3,sva);
            
            ResultSet rt = r.executeQuery();
            
             while(rt.next()) {
                String nm = rt.getString("item_name");
                String ct= rt.getString("category");
                float pc = rt.getFloat("price");
                int qt=rt.getInt("quantity");
                int tqt=rt.getInt("threshold_quantity");
                
               tableModel.addRow(new Object[] {nm, ct, pc, qt, tqt });
            }
             
             
            
             
             sval.setText("");
              r.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
                                            

    
        }   
    }//GEN-LAST:event_sbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
          DefaultTableModel model = ( DefaultTableModel) Table.getModel();
        try{  int rw=Table.getSelectedRow();
            String sname = (String) model.getValueAt(rw,0);
              String scag = (String) model.getValueAt(rw,1);
                String sprice = model.getValueAt(rw,2).toString();
                  String squantity = model.getValueAt(rw,3).toString();
                   String sthq = model.getValueAt(rw,4).toString();
                   
      DefaultPieDataset dcd = new DefaultPieDataset();
      
       dcd.setValue("price",new Float(sprice));
              dcd.setValue("quantity",new Float(squantity));
                dcd.setValue("threshold_quantity",new Float(sthq));
                           

                 JFreeChart chart= ChartFactory.createPieChart3D(sname,dcd,true, true,true);
               ChartFrame fr=new ChartFrame("item details",chart);
               fr.setVisible(true);
               fr.setSize(500,500);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Select whose pie chart to show", "Unable to delete",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AlertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlertActionPerformed
        // TODO add your handling code here:
         DefaultTableModel tableModel = ( DefaultTableModel) Table.getModel();
          
        
         
        try {                                        
            
            tableModel.setRowCount(0);
           
            String query2 = "SELECT * FROM user where username = ?";
           
            PreparedStatement preStat = conn.prepareStatement(query2);
            preStat.setString(1, nam);
            ResultSet result = preStat.executeQuery();
            
            while(result.next()) {
                
                String nm = result.getString("item_name");
                String ct= result.getString("category");
                float pc  = result.getFloat("price");
                int qt=result.getInt("quantity");
                int thqt=result.getInt("threshold_quantity");
                
                   if(qt<=thqt){
                    JOptionPane.showMessageDialog(null, nm+" is at or below its threshold quantity", "Alert",JOptionPane.ERROR_MESSAGE);
    
                
               tableModel.addRow(new Object[] {nm, ct, pc, qt, thqt });}
              
            }
            
            
            
            
            preStat.close();
            
        } catch (Exception ex) {
           ex.printStackTrace();
        }
        
    }//GEN-LAST:event_AlertActionPerformed

    private void inmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inmActionPerformed
       
        if(inm.isSelected()){
            prc.setSelected(false);
            ctg.setSelected(false);
            thqnt.setSelected(false);
            qnt.setSelected(false);
            
            so=srch="item_name";
            
        }
    }//GEN-LAST:event_inmActionPerformed

    private void prcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prcActionPerformed
        // TODO add your handling code here:
         if(prc.isSelected()){
            inm.setSelected(false);
            ctg.setSelected(false);
            thqnt.setSelected(false);
            qnt.setSelected(false);
            so=srch="price";
        }
    }//GEN-LAST:event_prcActionPerformed

    private void inm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inm1ActionPerformed
        // TODO add your handling code here:
        
        if(inm1.isSelected()){
            prc1.setSelected(false);
            ctg1.setSelected(false);
            thqnt1.setSelected(false);
            qnt1.setSelected(false);
            
            sh="item_name";
            
        }
    }//GEN-LAST:event_inm1ActionPerformed

    private void prc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prc1ActionPerformed
        // TODO add your handling code here:
        
        if(prc1.isSelected()){
            inm1.setSelected(false);
            ctg1.setSelected(false);
            thqnt1.setSelected(false);
            qnt1.setSelected(false);
            sh="price";
        }
    }//GEN-LAST:event_prc1ActionPerformed

    private void ctgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctgActionPerformed
        // TODO add your handling code here:
         if(ctg.isSelected()){
            prc.setSelected(false);
            inm.setSelected(false);
            thqnt.setSelected(false);
            qnt.setSelected(false);
            
            so=srch="category";
        }
    }//GEN-LAST:event_ctgActionPerformed

    private void qntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qntActionPerformed
        // TODO add your handling code here:
        
         if(qnt.isSelected()){
            prc.setSelected(false);
            inm.setSelected(false);
            ctg.setSelected(false);
            thqnt.setSelected(false);
            
            so=srch="quantity";
        }
    }//GEN-LAST:event_qntActionPerformed

    private void thqntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thqntActionPerformed
        // TODO add your handling code here:
        
         if(thqnt.isSelected()){
            prc.setSelected(false);
            inm.setSelected(false);
            ctg.setSelected(false);
            qnt.setSelected(false);
            
            so=srch="threshold_quantity";
        }
    }//GEN-LAST:event_thqntActionPerformed

    private void ctg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctg1ActionPerformed
        // TODO add your handling code here:
        if(ctg1.isSelected()){
            prc1.setSelected(false);
            inm1.setSelected(false);
            thqnt1.setSelected(false);
            qnt1.setSelected(false);
            
            sh="category";
        }
    }//GEN-LAST:event_ctg1ActionPerformed

    private void qnt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qnt1ActionPerformed
        // TODO add your handling code here:
        
         if(qnt1.isSelected()){
            prc1.setSelected(false);
            inm1.setSelected(false);
            ctg1.setSelected(false);
            thqnt1.setSelected(false);
            
            sh="quantity";
        }
    }//GEN-LAST:event_qnt1ActionPerformed

    private void thqnt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thqnt1ActionPerformed
        // TODO add your handling code here:
        if(thqnt1.isSelected()){
            prc1.setSelected(false);
            inm1.setSelected(false);
            ctg1.setSelected(false);
            qnt1.setSelected(false);
            
            sh="threshold_quantity";
        }
    }//GEN-LAST:event_thqnt1ActionPerformed
  

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alert;
    private javax.swing.JTable Table;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField category;
    private javax.swing.JRadioButton ctg;
    private javax.swing.JRadioButton ctg1;
    private javax.swing.JRadioButton inm;
    private javax.swing.JRadioButton inm1;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_inventory;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField name;
    private javax.swing.JLabel pnm;
    private javax.swing.JRadioButton prc;
    private javax.swing.JRadioButton prc1;
    private javax.swing.JTextField price;
    private javax.swing.JRadioButton qnt;
    private javax.swing.JRadioButton qnt1;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton refresh;
    private javax.swing.JButton sbutton;
    private javax.swing.JTextField sval;
    private javax.swing.JRadioButton thqnt;
    private javax.swing.JRadioButton thqnt1;
    private javax.swing.JTextField thquantity;
    private javax.swing.JTextField value;
    // End of variables declaration//GEN-END:variables
}
