# School and Library Management

This School and Library Database Management application assists in handling databases usually used in schools including Teacher or Student profiles. The application also includes a library management system to record the issues and returns of book linked with Student and Teacher IDS. The project is written 
in Java, created on NetBeans IDE version 5.6 and includes usage of JavaFX, Swing, etc. MySQL has been used for effective database management.

------------------------------------------------------------------------------------------------------------------------

## Team Members

1. Shreya Arora
2. Prakhar Bansal
3. Mohd. Musab

------------------------------------------------------------------------------------------------------------------------

## Sample Code Block

[Parts of code to create the 'Add Book' form in Library Management System](schm1/src/add_book.java)

#importing SQL and Java Libraries
```
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
```
---

#Sample Form Coponents
```
t1 = new javax.swing.JTextField();
jLabel1 = new javax.swing.JLabel();
jLabel5 = new javax.swing.JLabel();
c1 = new javax.swing.JComboBox<String>();
jButton1 = new javax.swing.JButton();
```
---

#Formatting Form Components
```
 jLabel1.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
 jLabel1.setForeground(new java.awt.Color(0, 0, 102));
 jLabel1.setText("Book ID");
 getContentPane().add(jLabel1);
 jLabel1.setBounds(40, 24, 150, 50);
 
 t3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18));
 getContentPane().add(t3);
 t3.setBounds(210, 70, 137, 40);
 
 c1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14));
 c1.setForeground(new java.awt.Color(0, 51, 51));
 c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Volume Number", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
 getContentPane().add(c1);
 c1.setBounds(210, 172, 137, 50);
 ```
 ---
 #Functional Code
 ```
     private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
        // TODO add your handling code here:
        String con_len=t1.getText();//con_len:-length of book id
        if (con_len.length()==4)
            evt.consume();
}//GEN-LAST:event_t1KeyTyped

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_t1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String id,title,author,cost,publ,d;//d is volume_no.and publ is publisher
        id=t1.getText();
        title=t2.getText();
        author=t3.getText();
        publ=t4.getText();
        cost=t5.getText();
        d=(String) c1.getSelectedItem();

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this,"member id not entered!!!");
        } else if (title.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Title not entered!!!");
        } else if(author.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Author not entered!!!");
        } else if(cost.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Cost not entered!!!");
        } else if(publ.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Publisher not entered!!!");
        } else if(d.equalsIgnoreCase("Volume Number")) {
            JOptionPane.showMessageDialog(this,"Volume Number not entered!!!");
        }

        else {
            try

            {
                Class.forName("java.sql.DriverManager");
                Connection conn = (Connection)
                        DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/schm","root", "window");
                Statement stm = (Statement) conn.createStatement();
                String query="INSERT INTO books VALUES('"+id+"','"+title+"','"+author+"','"+d+"','"+publ+"','"+cost+"','available');";
                stm.executeUpdate(query);

            }catch(Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            c1.setSelectedItem("Volume Number");

        }
}//GEN-LAST:event_jButton6ActionPerformed
```
        
        
