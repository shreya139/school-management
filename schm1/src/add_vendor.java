
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author STUDENT
 */
public class add_vendor extends javax.swing.JFrame {

    /**
     * Creates new form add_vendor
     */
    public add_vendor() {
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

        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Vendor ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 50, 126, 32);

        t1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(60, 43, 78)));
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });
        getContentPane().add(t1);
        t1.setBounds(200, 50, 249, 32);

        t2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(60, 43, 78)));
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2);
        t2.setBounds(200, 100, 249, 32);

        jLabel4.setFont(new java.awt.Font("Britannic Bold", 0, 24));
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 100, 126, 32);

        t3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(60, 43, 78)));
        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t3KeyTyped(evt);
            }
        });
        getContentPane().add(t3);
        t3.setBounds(200, 150, 249, 32);

        jLabel7.setFont(new java.awt.Font("Britannic Bold", 0, 24));
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("Number");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 150, 126, 32);

        jLabel9.setFont(new java.awt.Font("Britannic Bold", 0, 24));
        jLabel9.setForeground(new java.awt.Color(51, 0, 51));
        jLabel9.setText("Address");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 200, 126, 32);

        t4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(60, 43, 78)));
        t4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t4KeyTyped(evt);
            }
        });
        getContentPane().add(t4);
        t4.setBounds(200, 200, 249, 32);

        jLabel10.setFont(new java.awt.Font("Britannic Bold", 0, 24));
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setText("Email ID");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 260, 126, 32);

        t5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(60, 43, 78)));
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        getContentPane().add(t5);
        t5.setBounds(200, 260, 249, 32);

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 0, 51));
        jButton6.setText("Add Vendor");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(100, 320, 105, 32);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 51));
        jButton1.setText("Back");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 320, 43, 33);

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 51));
        jButton3.setText("Exit");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        getContentPane().add(jButton3);
        jButton3.setBounds(340, 320, 97, 34);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pexels-photo-988872.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 610, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t4KeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_t4KeyTyped

    private void t4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new a1().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String id,cname,cnum,addr,email;//cname is name ,cnum is contact no. and addr is address
        id=t1.getText();
        cname=t2.getText();
        cnum=t3.getText();
        addr=t4.getText();
        email=t5.getText();

        if (id.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"vendor id not entered!!!");
        }
        else if (cname.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Vendor name  not entered!!!");
        }
        else if(cnum.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Contact Number not entered!!!");
        } else if(addr.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Address not entered!!!");
        }
        else if(email.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Email Id not entered!!!");
        }
        else if (cnum.length()!=10)
        {
            JOptionPane.showMessageDialog(this,"Incorrect Number!!!");
            t3.setText("");
        }

        else
        {
            try

            {
                Class.forName("java.sql.DriverManager");
                Connection conn = (Connection)
                DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/schm","root", "window");
                Statement stm = (Statement) conn.createStatement();
                String query="INSERT INTO vendor VALUES('"+id+"','"+cname+"','"+cnum+"','"+addr+"','"+email+"');";
                stm.executeUpdate(query);

            }catch(Exception e)
            {
                JOptionPane.showMessageDialog (this, e.getMessage());
            }
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
        // TODO add your handling code here:
        String con_len=t1.getText();//con_len:- Vendorid length
        if (con_len.length()==4)
        evt.consume();
    }//GEN-LAST:event_t1KeyTyped

    private void t3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyTyped
        // TODO add your handling code here:
        String con_len=t3.getText();//con_len:- contact length
        char character=evt.getKeyChar();
        if ((character<'0')||(character >'9'))
        evt.consume();
        if (con_len.length()==10)
        evt.consume();
    }//GEN-LAST:event_t3KeyTyped

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_t5ActionPerformed

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
            java.util.logging.Logger.getLogger(add_vendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_vendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_vendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_vendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_vendor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}
