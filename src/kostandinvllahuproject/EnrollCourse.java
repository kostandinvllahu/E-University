/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kostandinvllahuproject;

import static kostandinvllahuproject.Menu.name;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class EnrollCourse extends javax.swing.JFrame {
public Connection cn;
    public Statement st;
   public boolean check = false;
    public EnrollCourse() {
       // data();
       // this.tbModel = new DefaultTableModel;
        initComponents();
        major();
         try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root",""); 
            st=cn.createStatement();   
            //JOptionPane.showMessageDialog(null, "Connection is stable.");
        }catch (Exception e){
            //JOptionPane.showMessageDialog(null, "Server failed to connect please contact the IT.");
            
        }

    }
    
     void eusername(String puser){
        ename.setText(puser);
        data();
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ename = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ename1 = new javax.swing.JLabel();
        btnFetch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtClsID = new javax.swing.JTextPane();
        btnEnroll = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxtStdName = new javax.swing.JTextPane();
        btnEnroll1 = new javax.swing.JButton();
        btnEnroll2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtxtClsName = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        btnEnroll3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        ename.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ename.setForeground(new java.awt.Color(255, 255, 255));
        ename.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID :");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENROLL CLASS");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MAJOR :");

        ename1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ename1.setForeground(new java.awt.Color(255, 255, 255));
        ename1.setText("#");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ename1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ename)
                        .addGap(349, 349, 349)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ename)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ename1))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        btnFetch.setText("Fetch");
        btnFetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFetchActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Class", "Day", "Duration", "Credit", "Professor", "Classrom", "Students"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
        }

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jtxtClsID);

        btnEnroll.setText("Enroll");
        btnEnroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnrollActionPerformed(evt);
            }
        });

        jLabel3.setText("Class ID:");

        jLabel4.setText("Name:");

        jScrollPane3.setViewportView(jtxtStdName);

        btnEnroll1.setText("Save");
        btnEnroll1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnroll1ActionPerformed(evt);
            }
        });

        btnEnroll2.setText("Cancel");
        btnEnroll2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnroll2ActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(jtxtClsName);

        jLabel6.setText("Class name: ");

        btnEnroll3.setText("Fetch");
        btnEnroll3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnroll3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnFetch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnEnroll, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnEnroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnEnroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(353, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEnroll3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 855, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFetch, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnroll, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(btnEnroll3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String user = name.getText().toString();
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(true);
        this.setVisible(false);
        menu.username(user);
        menu.show();
        this.hide();
         menu.show();
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    DefaultTableModel tbModel;
    private void major(){
        jtxtStdName.setVisible(false);
        ename1.setVisible(true);
        jLabel3.setVisible(false);
        jtxtClsID.setVisible(false);
        jLabel4.setVisible(false);
        jtxtStdName.setEditable(false);
        jLabel5.setVisible(true);
        jtxtClsName.setVisible(false);
        jLabel6.setVisible(false);
        
    }
    
    
     public void enroll() {
         String ID = jtxtClsID.getText().toString();
         String Username = jtxtStdName.getText().toString();
         String Class  = jtxtClsName.getText().toString();
         try{
       String sql = "INSERT INTO encrollcourse VALUES('"+ID+"','"+Class+"','"+Username+"')";
        PreparedStatement prp = cn.prepareStatement(sql);
        //prp.setString (1, ID);
       // prp.setString (2, Username);
       // prp.setString (3, Class);
        
          prp.execute(sql);
          JOptionPane.showMessageDialog(null, "YOU SUCCESFULLY ENROLLED IN THE CLASS");
          jtxtClsID.setText("");
          jtxtClsName.setText("");
         }catch(Exception e){
                System.out.println(e.getMessage());
            }
     }
    
    private void showdata(){
         jtxtStdName.setVisible(true);
        ename1.setVisible(true);
        jLabel3.setVisible(true);
        jtxtClsID.setVisible(true);
        jLabel4.setVisible(true);
        jtxtStdName.setEditable(false);
        jLabel5.setVisible(true);
        jtxtClsName.setVisible(true);
        jLabel6.setVisible(true);
        
         String temp = ename.getText().toString();
        try{
             String sql = "SELECT Username, Degree FROM Login WHERE ID='"+temp+"'";
              ResultSet rss = st.executeQuery(sql);
             if(rss.next()){
                  String Username = rss.getString("Username");
                 jtxtStdName.setText(Username);
                 String Degree = rss.getString("Degree");
                 ename1.setText(Degree);
                 
             }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void data(){
        
         String temp = ename.getText().toString();
        try{
             String sql = "SELECT Username, Degree FROM Login WHERE ID='"+temp+"'";
              ResultSet rss = st.executeQuery(sql);
             if(rss.next()){
                  String Username = rss.getString("Username");
                 jtxtStdName.setText(Username);
                 String Degree = rss.getString("Degree");
                 ename1.setText(Degree);
                 
             }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        String select = ename1.getText().toString();
        if(select.equals("CS")){
        try{
         String sql = "SELECT * FROM " + select +"";
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             String ID = rs.getString("ID");
             String Class = rs.getString("Class");
             String Day = rs.getString("Day");
             String Duration = rs.getString("Duration");
             String Credit = rs.getString("Credit");
             String Professor = rs.getString("Professor");
             String Classroom = rs.getString("Classroom");
             //String Students = rs.getString("Students");
             String tbData[] = {ID,Class,Day,Duration,Credit,Professor,Classroom};
             DefaultTableModel tbModel = (DefaultTableModel)jTable1.getModel();
             tbModel.addRow(tbData);
             //jtxtClasses.setText("");
             
         }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }else if(select.equals("BE")){
            try{
         String sql = "SELECT * FROM " + select +"";
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             String ID = rs.getString("ID");
             String Class = rs.getString("Class");
             String Day = rs.getString("Day");
             String Duration = rs.getString("Duration");
             String Credit = rs.getString("Credit");
             String Professor = rs.getString("Professor");
             String Classroom = rs.getString("Classroom");
             //String Students = rs.getString("Students");
             String tbData[] = {ID,Class,Day,Duration,Credit,Professor,Classroom};
             DefaultTableModel tbModel = (DefaultTableModel)jTable1.getModel();
             tbModel.addRow(tbData);
             //jtxtClasses.setText("");
             
         }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }else if(select.equals("PY")){
            try{
         String sql = "SELECT * FROM " + select +"";
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             String ID = rs.getString("ID");
             String Class = rs.getString("Class");
             String Day = rs.getString("Day");
             String Duration = rs.getString("Duration");
             String Credit = rs.getString("Credit");
             String Professor = rs.getString("Professor");
             String Classroom = rs.getString("Classroom");
           // String Students = rs.getString("Students");
             String tbData[] = {ID,Class,Day,Duration,Credit,Professor,Classroom};
             DefaultTableModel tbModel = (DefaultTableModel)jTable1.getModel();
             tbModel.addRow(tbData);
             //jtxtClasses.setText("");
             
         }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    
       
   
    
    private void btnFetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFetchActionPerformed
   data();     
    }//GEN-LAST:event_btnFetchActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
DefaultTableModel tbModel = (DefaultTableModel)jTable1.getModel();
int rowCount = tbModel.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
    tbModel.removeRow(i);
}
    }//GEN-LAST:event_btnClearActionPerformed

    public void clear(){
       
    }
    
    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void btnEnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnrollActionPerformed
     showdata();
    }//GEN-LAST:event_btnEnrollActionPerformed

    private void btnEnroll1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnroll1ActionPerformed
       enroll();
    }//GEN-LAST:event_btnEnroll1ActionPerformed

    private void btnEnroll2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnroll2ActionPerformed
    major();     
    }//GEN-LAST:event_btnEnroll2ActionPerformed

    private void btnEnroll3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnroll3ActionPerformed
      String select = ename1.getText();
      String ID = jtxtClsID.getText().toString();
        if(select.equals("CS")){
        try{
         String sql = "SELECT Class FROM " +select +" WHERE ID='"+ID+"'";
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
            
             String Class = rs.getString("Class");
             jtxtClsName.setText(Class);
             
          
             
         }
            }catch(Exception e){
                System.out.println(e.getMessage());
            //    JOptionPane.showMessageDialog(null, "You are already enrolled in this class " + ID);
            //    JOptionPane.showMessageDialog(null, "You are already enrolled in this class" + ID + );
            }
        }else if(select.equals("BE")){
            try{
          String sql = "SELECT Class FROM " +select +" WHERE ID='"+ID+"'";
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             String Class = rs.getString("Class");
             jtxtClsName.setText(Class);
            
             
         }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }else if(select.equals("PY")){
            try{
         String sql = "SELECT Class FROM " +select +" WHERE ID='"+ID+"'";
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             String Class = rs.getString("Class");
        
               jtxtClsName.setText(Class);
         
             
         }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnEnroll3ActionPerformed

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
            java.util.logging.Logger.getLogger(EnrollCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnrollCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnrollCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnrollCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnrollCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEnroll;
    private javax.swing.JButton btnEnroll1;
    private javax.swing.JButton btnEnroll2;
    private javax.swing.JButton btnEnroll3;
    private javax.swing.JButton btnFetch;
    private javax.swing.JLabel ename;
    private javax.swing.JLabel ename1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jtxtClsID;
    private javax.swing.JTextPane jtxtClsName;
    private javax.swing.JTextPane jtxtStdName;
    // End of variables declaration//GEN-END:variables
}
