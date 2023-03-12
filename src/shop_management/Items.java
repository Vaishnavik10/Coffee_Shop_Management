
package shop_management;
import java.sql.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import net.proteanit.sql.DbUtils;

import javax.swing.JOptionPane;

public class Items extends javax.swing.JFrame {

    public Items() {
        initComponents();
        ShowProducts();
        CountProd();
    }
    ResultSet rs = null,rs1=null;
    Connection con = null;
    Statement st = null,st1 = null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        Category = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        filtercb = new javax.swing.JComboBox<>();
        addbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductList = new javax.swing.JTable();
        PName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 51, 102));
        jPanel1.setForeground(new java.awt.Color(255, 51, 102));

        jPanel2.setBackground(new java.awt.Color(255, 51, 102));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel4.setText("Name");

        jLabel6.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel6.setText("Category");

        jLabel7.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel7.setText("Price");

        Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bevarage", "Snake" }));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel8.setText("Item Management");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setText("Item List");

        jLabel10.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabel10.setText("Filter");

        filtercb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        filtercb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filtercbItemStateChanged(evt);
            }
        });

        addbtn.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        editbtn.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        editbtn.setText("EDIT");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        deletebtn.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        ProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Category", "Price"
            }
        ));
        ProductList.setRowHeight(29);
        ProductList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PName, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(editbtn)
                                .addGap(65, 65, 65)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deletebtn))))
                        .addGap(256, 256, 256))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(filtercb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel8)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editbtn)
                    .addComponent(deletebtn)
                    .addComponent(addbtn))
                .addGap(36, 36, 36)
                .addComponent(jLabel9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filtercb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel2.setText("Items");

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel1.setText("Selling");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel3.setText("Logout");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1756, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(263, 263, 263))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
               if(PName.getText().isEmpty() || Price.getText().isEmpty() || Category.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this,"Missing Information...");
        }else{
            try {
                CountProd();
		con = DriverManager.getConnection("jdbc:mysql://localhost/cafedb","root","");
//                PreparedStatement Pst =con.preparedStatement("insert into producttb1(PNum,PName,Category,Price)values(?,?,?,?)");
//                PreparedStatement Pst =con.preparedStatement("select *from producttb1");
                PreparedStatement Pst=con.prepareStatement("update producttb1 set PName=?,Category=?,Price=? where PNum=?");
                Pst.setInt(4,Key);
                Pst.setString(1,PName.getText());
                Pst.setString(2,Category.getSelectedItem().toString());
                Pst.setInt(3,Integer.valueOf(Price.getText()));
                
                int row = Pst.executeUpdate();
          
                JOptionPane.showMessageDialog(this, "Item Updated");
                con.close();
                ShowProducts();
		}
		catch(SQLException e1)
		{
			JOptionPane.showMessageDialog(this, e1);
		}
        }
    }//GEN-LAST:event_editbtnActionPerformed
public void Connect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/cafedb","root","");
		}catch(ClassNotFoundException | SQLException e)
		{	
			System.out.print(e);
		}
	}
private void ShowProducts()
{
    try{
        con = DriverManager.getConnection("jdbc:mysql://localhost/cafedb","root","");
        st=con.createStatement();
        rs = (shop_management.ResultSet) st.executeQuery("select * from producttb1");
        ProductList=null;
        ProductList.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(SQLException e)
    {
        
    }			
}
private void FilterProducts()
{
    try{
        con = DriverManager.getConnection("jdbc:mysql://localhost/cafedb","root","");
        st=con.createStatement();
        rs = (shop_management.ResultSet) st.executeQuery("select * from producttb1 where Category ='"+filtercb.getSelectedIndex().toString()+"'");
        ProductList=null;
        ProductList.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(SQLException e)
    {
        JOptionpane.showMessageDialog(this,e);
    }			
}

private void CountProd(){
    try{
        st1 =con.createStatement();
        rs1 = st1.executeQuery("select max(PNum) from producttb1");
        rs1.next();
        PNum=rs1.getInt(1)+1;
    }catch(Exception e)
    {
        
    }
    
}
    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        if(PName.getText().isEmpty() || Price.getText().isEmpty() || Category.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this,"Missing Information...");
        }else{
            try {
                CountProd();
		con = DriverManager.getConnection("jdbc:mysql://localhost/cafedb","root","");
                PreparedStatement Pst=con.prepareStatement("insert into producttb1(PNum,PName,Category,Price) values(?,?,?,?)");
                Pst.setInt(1,PNum);
                Pst.setString(2,PName.getText());
                Pst.setString(3,Category.getSelectedItem().toString());
                Pst.setInt(4,Integer.valueOf(Price.getText()));
                
                int row = Pst.executeUpdate();
          
                JOptionPane.showMessageDialog(this, "Item added");
                con.close();
                ShowProducts();
		}
		catch(SQLException e1)
		{
			JOptionPane.showMessageDialog(this, e1);
		}
        }

    }//GEN-LAST:event_addbtnActionPerformed
    int Key = 0;
    private void ProductListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductListMouseClicked
       DefaultTableModel model = ProductList.getModel();
       int MyIndex = ProductList.getSelectedRow();
       Key=Integer.valueOf(model.getValueAt(Myindex,0).toString());
       PName.setText(model.getValueAt(Myindex,1).toString());
//       Category.setText(model.getValueAt(Myindex,2).toString());
        Price.setText(model.getValueAt(Myindex,3).toString());
    }//GEN-LAST:event_ProductListMouseClicked

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
              if(PName.getText().isEmpty() || Price.getText().isEmpty() || Category.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this,"Missing Information...");
        }else{
            try {
              
		con = DriverManager.getConnection("jdbc:mysql://localhost/cafedb","root","");
//                PreparedStatement Pst =con.preparedStatement("insert into producttb1(PNum,PName,Category,Price)values(?,?,?,?)");
//                PreparedStatement Pst =con.preparedStatement("select *from producttb1");
                PreparedStatement Pst=con.prepareStatement("delete from producttb1 where PNum=?");
                Pst.setInt(1,Key);
                
                int row = Pst.executeUpdate();
          
                JOptionPane.showMessageDialog(this, "Item deleted");
                con.close();
                ShowProducts();
		}
		catch(SQLException e1)
		{
			JOptionPane.showMessageDialog(this, e1);
		}
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void filtercbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filtercbItemStateChanged
        Filterproducts();
    }//GEN-LAST:event_filtercbItemStateChanged
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Category;
    private javax.swing.JTextField PName;
    private javax.swing.JTextField Price;
    private javax.swing.JTable ProductList;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JComboBox<String> filtercb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
