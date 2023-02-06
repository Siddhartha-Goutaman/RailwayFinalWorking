package railwayreservation;

import java.sql.*;
import java.util.Random;
import javax.swing.*;

public class Frame2 extends javax.swing.JFrame {

    public Frame2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new javax.swing.JPanel();
        lPhone = new javax.swing.JLabel();
        tfPhone = new javax.swing.JTextField();
        lStart = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        lAge = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        tfEnd = new javax.swing.JTextField();
        tfStart = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        lEnd = new javax.swing.JLabel();
        tfCity = new javax.swing.JTextField();
        lState = new javax.swing.JLabel();
        tfState = new javax.swing.JTextField();
        lCity = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lRoute = new javax.swing.JLabel();
        cbRoute = new javax.swing.JComboBox<>();
        bBook2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BOOK TICKET");

        lPhone.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lPhone.setText("PHONE NO.");

        tfPhone.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N

        lStart.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lStart.setText("START");

        tfAge.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N

        lAge.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lAge.setText("AGE");

        lName.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lName.setText("NAME");

        tfEnd.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N

        tfStart.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N

        tfName.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N

        lEnd.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lEnd.setText("END");

        tfCity.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N

        lState.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lState.setText("STATE");

        tfState.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N

        lCity.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lCity.setText("CITY");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(lState, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfState, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(lCity, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfCity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lAge, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lStart, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEnd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfStart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lName))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAge)
                    .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPhone)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lStart)
                    .addComponent(tfStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEnd))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lCity)
                    .addComponent(tfCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lState)
                    .addComponent(tfState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(204, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railwayreservation/bg.jpg"))); // NOI18N

        lRoute.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lRoute.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lRoute.setText("ROUTE");

        cbRoute.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        cbRoute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trivandrum - Kasargod", "Kasargod - Trivandrum" }));

        bBook2.setBackground(new java.awt.Color(99, 237, 88));
        bBook2.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        bBook2.setText("BOOK TICKET");
        bBook2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBook2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(244, 66, 66));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railwayreservation/backarrow.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lRoute, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(bBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lRoute, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbRoute, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(bBook2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBook2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBook2ActionPerformed
        Random random = new Random();
        String name, age, phno, start, end, city, state;

        Statement st;
        Connection con = null;
        PreparedStatement pat = null;

        int ticketno;
        name = tfName.getText();
        age = tfAge.getText();
        phno = tfPhone.getText();
        start = tfStart.getText();
        end = tfEnd.getText();
        city = tfCity.getText();
        state = tfState.getText();
        int tno = 0;
        int far, starti = 0, desti = 0;
        int a1 = 0, a2 = 0;
        String route=cbRoute.getSelectedItem().toString();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");
            st = con.createStatement();
            String sr = "insert into book values(?,?,?,?,?,?,?,?,?,?,?)";
            pat = con.prepareStatement(sr);
            pat.setString(1, name);
            pat.setString(2, age);
            pat.setString(3, phno);
            pat.setString(4, start);
            pat.setString(5, end);
            pat.setString(6, city);
            pat.setString(7, state);
            ticketno = random.nextInt(9999);
            pat.setInt(8, ticketno);
            pat.setString(10, route);
            if (route.equals("Kasargod - Trivandrum")) {
                tno = 1;
                pat.setString(11, "T001");
            } else {
                tno = 2;
                pat.setString(11, "T002");
            }
            if (tno == 1) {
                String si = "select sno from traindet where train1 ='" + start + "'";
                String di = "select sno from traindet where train1 ='" + end + "'";
                String x1 = "select avseat from reservation where trainno = 'T001'";
                ResultSet rSet = st.executeQuery(x1);
                if(rSet.next())
                a1 = rSet.getInt(1);
                Statement st2=con.createStatement();
                ResultSet res = st2.executeQuery(si);
               
                if(res.next()) 
                    starti = Integer.parseInt(res.getString(1));
                
                Statement st3=con.createStatement();
                ResultSet rest = st3.executeQuery(di);
                if(rest.next())
                desti = Integer.parseInt(rest.getString(1));
                a1--;
                
            }
            if (tno == 2) {
                String si = "select sno from traindet where train2 ='" + start + "'";
                String di = "select sno from traindet where train2 ='" + end + "'";
                String x2 = "select avseat from reservation where trainno = 'T002'";
                ResultSet rSet = st.executeQuery(x2);
                if(rSet.next())
                a2 = rSet.getInt(1);

                ResultSet res = st.executeQuery(si);
                res.next();
                starti = res.getInt(1);
                ResultSet rest = st.executeQuery(di);
                rest.next();
                desti = rest.getInt(1);
                a2--;
            }
            far = (desti - starti) * 50;
            if(far < 0) JOptionPane.showMessageDialog(null, "Cannot go from "+start+" to "+end+" via this route.");
            else if(a1==-1 && tno==1) JOptionPane.showMessageDialog(null,"No seats left in train T001");
            else if(a2==-1 && tno==2) JOptionPane.showMessageDialog(null,"No seats left in train T002");
            else {
            pat.setInt(9, far);
            pat.executeUpdate();
            if (tno == 1) {
                JOptionPane.showMessageDialog(null, "Ticket booked successfully\nYour Ticket Number: " + ticketno + "\nTrain Number: T001\nFare: "+far);
                String upAv = "update reservation set avseat = '" + a1 + "' where trainno = 'T001'";
                Statement st2 = con.createStatement();
                st2.executeUpdate(upAv);
                this.setVisible(false);
                Frame1 f1 = new Frame1();
                f1.setVisible(true);
            }
            if (tno == 2) {
                JOptionPane.showMessageDialog(null, "Ticket booked successfully\nYour Ticket Number: " + ticketno + "\nTrain Number: T002\nFare: "+far);
                String upAv = "update reservation set avseat = '" + a2 + "' where trainno = 'T002'";
                Statement st2=con.createStatement();
                st2.executeUpdate(upAv);
                this.setVisible(false);
                Frame1 f1 = new Frame1();
                f1.setVisible(true);
            }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bBook2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Frame1 f1 = new Frame1();
        this.setVisible(false);
        f1.setVisible(true);
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
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBook2;
    private javax.swing.JComboBox<String> cbRoute;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lAge;
    private javax.swing.JLabel lCity;
    private javax.swing.JLabel lEnd;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lPhone;
    private javax.swing.JLabel lRoute;
    private javax.swing.JLabel lStart;
    private javax.swing.JLabel lState;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfCity;
    private javax.swing.JTextField tfEnd;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfStart;
    private javax.swing.JTextField tfState;
    // End of variables declaration//GEN-END:variables
}
