
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRAKHAR
 */
public class student extends javax.swing.JFrame {
     public static String sno;

    /**
     * Creates new form student
     */
    public student() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        m = new javax.swing.JRadioButton();
        f = new javax.swing.JRadioButton();
        t4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        d1 = new javax.swing.JComboBox<String>();
        d2 = new javax.swing.JComboBox<String>();
        d3 = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        c2 = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox<String>();
        jLabel7 = new javax.swing.JLabel();
        c4 = new javax.swing.JComboBox<String>();
        jLabel10 = new javax.swing.JLabel();
        c3 = new javax.swing.JComboBox<String>();
        jLabel11 = new javax.swing.JLabel();
        t11 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        t12 = new javax.swing.JTextField();
        t15 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        t14 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t13 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        t19 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        t16 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        t17 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        t18 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("First Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 80, 75, 17);
        getContentPane().add(t1);
        t1.setBounds(190, 70, 205, 29);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Last name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 80, 71, 17);
        getContentPane().add(t2);
        t2.setBounds(530, 70, 205, 29);

        buttonGroup1.add(m);
        m.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        m.setText("Male");
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });
        getContentPane().add(m);
        m.setBounds(790, 70, 59, 25);

        buttonGroup1.add(f);
        f.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        f.setText("Female");
        getContentPane().add(f);
        f.setBounds(870, 70, 77, 25);
        getContentPane().add(t4);
        t4.setBounds(190, 140, 205, 29);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Sr. No.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 150, 46, 17);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Aadhar");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(430, 150, 49, 17);

        t5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t5KeyTyped(evt);
            }
        });
        getContentPane().add(t5);
        t5.setBounds(530, 140, 205, 29);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("DOB");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(100, 210, 31, 17);

        d1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        getContentPane().add(d1);
        d1.setBounds(190, 210, 37, 20);

        d2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", " February", " March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        getContentPane().add(d2);
        d2.setBounds(250, 210, 77, 20);

        d3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018" }));
        getContentPane().add(d3);
        d3.setBounds(340, 210, 49, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Blood Group");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(430, 210, 89, 17);

        c2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "B+", "O+", "AB+", "A-", "B-", "O-", "AB-", " " }));
        getContentPane().add(c2);
        c2.setBounds(530, 210, 46, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Class");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(690, 210, 38, 17);

        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII" }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        getContentPane().add(c1);
        c1.setBounds(730, 210, 43, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Section");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(830, 210, 53, 17);

        c4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E" }));
        getContentPane().add(c4);
        c4.setBounds(930, 210, 45, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("House");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 300, 45, 17);

        c3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RED", "BLUE", "GREEN", "YELLOW" }));
        getContentPane().add(c3);
        c3.setBounds(130, 300, 65, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Father's Name");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(250, 300, 100, 17);
        getContentPane().add(t11);
        t11.setBounds(370, 290, 205, 29);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Mother's Name");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(660, 290, 105, 17);
        getContentPane().add(t12);
        t12.setBounds(780, 280, 205, 29);
        getContentPane().add(t15);
        t15.setBounds(790, 350, 205, 29);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("Mother");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(730, 360, 51, 17);
        getContentPane().add(t14);
        t14.setBounds(480, 350, 205, 29);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Father");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(430, 360, 50, 17);

        t13.setColumns(20);
        t13.setRows(5);
        jScrollPane1.setViewportView(t13);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 350, 166, 73);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Address");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(70, 360, 58, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Contacts:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 460, 66, 17);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("Mode of Transport");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(70, 530, 140, 14);

        t19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t19ActionPerformed(evt);
            }
        });
        getContentPane().add(t19);
        t19.setBounds(240, 530, 205, 29);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("Father");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(140, 460, 46, 17);

        t16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t16KeyTyped(evt);
            }
        });
        getContentPane().add(t16);
        t16.setBounds(190, 450, 205, 29);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("Mother");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(430, 450, 51, 17);

        t17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t17KeyTyped(evt);
            }
        });
        getContentPane().add(t17);
        t17.setBounds(490, 440, 205, 29);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(660, 520, 176, 34);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText("Email");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(740, 440, 37, 17);
        getContentPane().add(t18);
        t18.setBounds(790, 440, 205, 29);

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setText("Occupation :");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(320, 360, 90, 17);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnuD4O.jpeg"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(0, 0, 1030, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t19ActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      String id="1";
      String fstname = t1.getText();
      String lstname = t2.getText();
      String gender="";
      String srno = t4.getText();
      String aadhar = t5.getText();
      String clas ;
      String sec ;
      String dob;
      String bg;
      String house;
      String fname = t11.getText();
      String mname = t12.getText();
      String address= t13.getText();
      String occupationf = t14.getText();
      String occupationm = t15.getText();
      String mobf = t16.getText();
      String mobm = t17.getText();
      String email = t18.getText();
      String mod = t19.getText();
      String day;
      String month;
      String year;
      String month1;
      String subject;
      
      int mon=0;
      int clas1=0;
    
      if(m.isSelected()==true)
     {
     gender ="M";
     }
     else if(f.isSelected()==true)
     {
     gender ="F";
     
     }
     else
     {
     JOptionPane.showMessageDialog(this,"choose the gender of student");
     }
  
     clas1 = c1.getSelectedIndex()+1;
     clas=""+clas1;
     day= (String) d1.getSelectedItem();
     
     mon= d2.getSelectedIndex()+1;
    month1 = ""+mon; 
    
    int i=month1.length();
    if(i<=1)
    {
    month =""+"0"+month1;
    
    
    }
    else {
    month=""+month1;
    }
    year = (String) d3.getSelectedItem();
     dob= ""+year+month+day;
     
     bg= (String) c2.getSelectedItem();
    house =(String) c3.getSelectedItem();
     
     
     
    sec= (String) c4.getSelectedItem();
       try
        {
            Class.forName("java.sql.DriverManager");
            Connection con= (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/schm",
 "root", "window");
                    Statement stmt = (Statement) con.createStatement();
                    
                    String query="insert into STUDENT values(1,'"+fstname+"','"+lstname+"','"+gender+"','"+srno+"','"+aadhar+"','"+clas+"','"+sec+"','"+dob+"','"+bg+"','"+house+"','"+fname+"','"+mname+"','"+address+"','"+occupationf+"','"+occupationm+"','"+mobf+"','"+mobm+"','"+email+"','"+mod+"');";
                    stmt.executeUpdate(query);
                    
                    
      
                    
        }
        catch(Exception e)
            
        {
            
            JOptionPane.showMessageDialog(this, e.getMessage());
            
            
        }
       
       
       
       sno= srno;
//        {
            try
        {
            Class.forName("java.sql.DriverManager");
            Connection con= (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/schm",
 "root", "window");
                    Statement stmt = (Statement) con.createStatement();
                    
                    String query="insert into fee values('"+srno+"',null,null,null,null,null,null,null,null,null,0);";
                    stmt.executeUpdate(query);
                    
        }
        catch(Exception e)
            
        {
            
             javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
            
              try
        {
            Class.forName("java.sql.DriverManager");
            Connection con= (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/schm",
 "root", "window");
                    Statement stmt = (Statement) con.createStatement();
                    
                    String query="insert into marks values('"+srno+"','Not Entered','Not Entered','Not Entered','Not Entered','Not Entered');";
                    stmt.executeUpdate(query);
                    
        }
        catch(Exception e)
            
        {
            
             javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
        if(c1.getSelectedIndex()>=10)
         {
         
         new subject_add().setVisible(true);
         this.dispose();
     
      
         }
      
       
        
        
         t1.setText("");
         t2.setText("");
         
         t4.setText("");
         t5.setText("");
         buttonGroup1.clearSelection();
        
          t1.setText("");
         t2.setText("");
         t11.setText("");
         t4.setText("");
         t5.setText("");
         t12.setText("");
         t13.setText("");
         t14.setText("");
         t15.setText("");
         t17.setText("");
         t18.setText("");
         t19.setText("");
         
         
         d1.setSelectedIndex(0);
         d2.setSelectedIndex(0);
         d3.setSelectedIndex(0);
         c4.setSelectedIndex(0);
         c3.setSelectedIndex(0);
         c1.setSelectedIndex(0);
         
      
      
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_c1ActionPerformed

    private void t5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t5KeyTyped
        // TODO add your handling code here:
        String con_len=t5.getText();//con_len:- contact length
        char character=evt.getKeyChar();
        if ((character<'0')||(character >'9'))
        evt.consume();
       if (con_len.length()==12)
           evt.consume();
    }//GEN-LAST:event_t5KeyTyped

    private void t16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t16KeyTyped
        // TODO add your handling code here:
        String con_len=t16.getText();//con_len:- contact length
        char character=evt.getKeyChar();
        if ((character<'0')||(character >'9'))
        evt.consume();
       if (con_len.length()==10)
           evt.consume();
    }//GEN-LAST:event_t16KeyTyped

    private void t17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t17KeyTyped
        // TODO add your handling code here:
        String con_len=t17.getText();//con_len:- contact length
        char character=evt.getKeyChar();
        if ((character<'0')||(character >'9'))
        evt.consume();
       if (con_len.length()==10)
           evt.consume();
    }//GEN-LAST:event_t17KeyTyped

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
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.JComboBox<String> c3;
    private javax.swing.JComboBox<String> c4;
    private javax.swing.JComboBox<String> d1;
    private javax.swing.JComboBox<String> d2;
    private javax.swing.JComboBox<String> d3;
    private javax.swing.JRadioButton f;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton m;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextArea t13;
    private javax.swing.JTextField t14;
    private javax.swing.JTextField t15;
    private javax.swing.JTextField t16;
    private javax.swing.JTextField t17;
    private javax.swing.JTextField t18;
    private javax.swing.JTextField t19;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}
