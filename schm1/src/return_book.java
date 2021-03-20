
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author STUDENT
 */
public class return_book extends javax.swing.JFrame {

    /**
     * Creates new form return_book
     */
    public return_book() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jButton1.setText("Search");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 410, 140, 40);

        jButton2.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jButton2.setText("Reset Table");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(480, 410, 170, 40);

        c1.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        c1.setForeground(new java.awt.Color(51, 51, 51));
        c1.setText("Student");
        getContentPane().add(c1);
        c1.setBounds(250, 350, 120, 30);

        c2.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        c2.setForeground(new java.awt.Color(51, 51, 51));
        c2.setText("Teacher");
        getContentPane().add(c2);
        c2.setBounds(430, 350, 120, 30);

        jButton3.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jButton3.setText("Return");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(320, 410, 140, 40);

        l1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("Today's Date - ");
        getContentPane().add(l1);
        l1.setBounds(100, 270, 250, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp ID/ S.R.No.", "Book ID", "Name", "Issue Date", " Return Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 70, 620, 190);

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\intel\\Desktop\\New folder (2)\\pexels-photo-696644.jpeg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 850, 780);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!(c1.isSelected())&&!(c2.isSelected()))
        {
            JOptionPane.showMessageDialog(this,"Select the post!!");
        }

        else
        {
            DefaultTableModel model = (DefaultTableModel)
            jTable1.getModel();
            int rows=model.getRowCount();
            if (rows>0)
            {
                for (int i=0; i<rows; i++)
                model.removeRow(0);
            }
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
             String date=sdf.format(new java.util.Date());

            String id;
            String fstname= "";
            String lstname="";
            String name="";
            String idate;
            String rdate;
            String bookid;
            int penalty=0;
            int rd=0,td=0;
            if (c1.isSelected())
            {
                try
                {
                    Class.forName("java.sql.DriverManager");
                    java.sql.Connection con= (java.sql.Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/schm","root", "window");
                    java.sql.Statement stmt = (java.sql.Statement) con.createStatement();

                    String query="select * from sissue,student where  sissue.srno=student.srno;";
                    ResultSet rs= stmt.executeQuery(query);

                    int Found=0;
                    while(rs.next())

                    {

                        idate=rs.getString("sissue.return_date");
                        rdate=rs.getString("sissue.issue_date");
                        bookid=rs.getString("sissue.bookid");
                        fstname= rs.getString("student.fstname");
                        lstname =rs.getString("student.lstname");
                        id = rs.getString("student.srno");
                        name= fstname+" "+lstname;

                        model.addRow( new Object[]{id,bookid,name,idate,rdate});

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
            }
            else if(c2.isSelected())
            {
                try
                {
                    Class.forName("java.sql.DriverManager");
                    java.sql.Connection con= (java.sql.Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/schm","root", "window");
                    java.sql.Statement stmt = (java.sql.Statement) con.createStatement();

                    String query="select * from eissue,teacher where  eissue.employee=teacher.empid;";
                    ResultSet rs= stmt.executeQuery(query);

                    int Found=0;
                    while(rs.next())

                    {

                        idate=rs.getString("eissue.return_date");
                        rdate=rs.getString("eissue.issue_date");
                        bookid=rs.getString("eissue.bookid");
                        fstname= rs.getString("teacher.fstname");
                        lstname =rs.getString("teacher.lstname");
                        id = rs.getString("teacher.empid");
                        name= fstname+" "+lstname;

                        model.addRow( new Object[]{id,bookid,name,idate,rdate});

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
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)
        jTable1.getModel();
        int rows=model.getRowCount();
        if (rows>0)
        {
            for (int i=0; i<rows; i++)
            model.removeRow(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int k= jTable1.getSelectedRow();
        System.out.println(""+k);

        String id = jTable1.getModel().getValueAt(k,0).toString();
        String bookid=jTable1.getModel().getValueAt(k,1).toString();
        if(!(c1.isSelected()&&!(c2.isSelected())))
        {
            JOptionPane.showMessageDialog(this,"Select the post!!");
        }
        else if(c1.isSelected())
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                com.mysql.jdbc.Connection con= (com.mysql.jdbc.Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/schm",
                    "root", "window");
                com.mysql.jdbc.Statement stmt = (com.mysql.jdbc.Statement) con.createStatement();

                String query="Delete from sissue where srno='"+id+"';";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(this,"Marks updated book returned");

            }
            catch(Exception e)

            {

                javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());

            }
            try
            {
                Class.forName("java.sql.DriverManager");
                com.mysql.jdbc.Connection con= (com.mysql.jdbc.Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/schm",
                    "root", "window");
                com.mysql.jdbc.Statement stmt = (com.mysql.jdbc.Statement)
                con.createStatement();

                String query="Update books set availabilty='available' where book_id='"+bookid+"';";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(this,"book returned successfully!!");

            }
            catch(Exception e)

            {

                javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());

            }
        }
        else if (c2.isSelected())
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                com.mysql.jdbc.Connection con= (com.mysql.jdbc.Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/schm",
                    "root", "window");
                com.mysql.jdbc.Statement stmt = (com.mysql.jdbc.Statement) con.createStatement();

                String query="Delete from eissue where employee='"+id+"';";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(this,"book returned successfully!!");

            }
            catch(Exception e)

            {

                javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());

            }
            try
            {
                Class.forName("java.sql.DriverManager");
                com.mysql.jdbc.Connection con= (com.mysql.jdbc.Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/schm",
                    "root", "window");
                com.mysql.jdbc.Statement stmt = (com.mysql.jdbc.Statement)
                con.createStatement();

                String query="Update books set availabilty='available' where book_id='"+bookid+"';";
                stmt.executeUpdate(query);

            }
            catch(Exception e)

            {

                javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());

            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
        String date=sdf.format(new java.util.Date());
        l1.setText("Today's Date--> "+date);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new return_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel l1;
    // End of variables declaration//GEN-END:variables
}
