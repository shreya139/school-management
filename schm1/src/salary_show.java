
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRAKHAR
 */
public class salary_show extends javax.swing.JFrame {

    /**
     * Creates new form salary_show
     */
    public salary_show() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp Id", "Name", "Designation ", "Monthly Salary", "Total Days", "Leave", "Half Day", "Final Amount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 310, 750, 190);

        jButton1.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(420, 540, 120, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setText("Or");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(470, 600, 19, 22);

        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t1.setText("Enter Emp ID &  Press Enter");
        t1.setEnabled(false);
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1);
        t1.setBounds(390, 640, 180, 30);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 0, 0);

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school-background-wallpaper.jpg"))); // NOI18N
        jLabel3.setText(" ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1033, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
        // TODO add your handling code here:
        t1.setEnabled(true);
        t1.setText("");
        t1.requestFocus();
        
    }//GEN-LAST:event_t1MouseClicked

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
         String empid=t1.getText();
        String fstname="";
        String lstname="";
        String post="";
        String salary="";
        String tdays="";
        String leave="";
        String hfd="";
        String givensalary="";
        String name="";
        
          
         DefaultTableModel model = (DefaultTableModel)
jTable1.getModel();
        
         try
        {
            Class.forName("java.sql.DriverManager");
            java.sql.Connection con= (java.sql.Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/schm","root", "window");
            java.sql.Statement stmt = (java.sql.Statement) con.createStatement();

            String query="select * from salary, teacher where salary.empid=teacher.empid and teacher.empid='"+empid+"';";
     ResultSet rs= stmt.executeQuery(query);

int Found=0;
         while(rs.next()) 
                    
             {
            
               
               fstname= rs.getString("fstname");
               lstname =rs.getString("lstname");
               empid = rs.getString("empid");
               name= fstname+" "+lstname;
               salary= rs.getString("teacher.salary");
               tdays= rs.getString("total");
               hfd= rs.getString("halfday");
               leave= rs.getString("absent");
              givensalary= rs.getString("salary.salary");
               post = rs.getString("post");
               
               
               

          model.addRow( new Object[]{empid,name,post,salary,tdays,leave,hfd,givensalary});
         



 Found++; 
             }
              
         if(Found==0)
         {
         
         javax.swing.JOptionPane.showMessageDialog(this, "no results found");
         }     
     
     
     
     
        }
        catch(Exception e)

        {

            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());

        }
         
         
        
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String empid="";
        String fstname="";
        String lstname="";
        String post="";
        String salary="";
        String tdays="";
        String leave="";
        String hfd="";
        String givensalary="";
        String name="";
        
          
         DefaultTableModel model = (DefaultTableModel)
jTable1.getModel();
        
         try
        {
            Class.forName("java.sql.DriverManager");
            java.sql.Connection con= (java.sql.Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/schm","root", "window");
            java.sql.Statement stmt = (java.sql.Statement) con.createStatement();

            String query="select * from salary, teacher where salary.empid=teacher.empid;";
     ResultSet rs= stmt.executeQuery(query);

int Found=0;
         while(rs.next()) 
                    
             {
            
               
               fstname= rs.getString("fstname");
               lstname =rs.getString("lstname");
               empid = rs.getString("empid");
               name= fstname+" "+lstname;
               salary= rs.getString("teacher.salary");
               tdays= rs.getString("total");
               hfd= rs.getString("halfday");
               leave= rs.getString("absent");
              givensalary= rs.getString("salary.salary");
               post = rs.getString("post");
               
               
               

          model.addRow( new Object[]{empid,name,post,salary,tdays,leave,hfd,givensalary});
         



 Found++; 
             }
              
         if(Found==0)
         {
         
         javax.swing.JOptionPane.showMessageDialog(this, "no results found");
         }     
     
     
     
     
        }
        catch(Exception e)

        {

            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());

        }
         
         
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(salary_show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salary_show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salary_show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salary_show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salary_show().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
