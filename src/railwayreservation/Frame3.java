package railwayreservation;

import java.sql.*;
import javax.swing.JOptionPane;

public class Frame3 extends javax.swing.JFrame {

    static String ticketNo;

    public Frame3() {
        initComponents();
        lName.setText("");
        lTrainNo.setText("");
        lFare.setText("");
        lStart.setText("");
        lEnd.setText("");
        tfTicketNo.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel33 = new javax.swing.JPanel();
        bViewDetails = new javax.swing.JButton();
        labelTicketNo = new javax.swing.JLabel();
        tfTicketNo = new javax.swing.JTextField();
        panel3 = new javax.swing.JPanel();
        lName = new javax.swing.JLabel();
        lTrainNo = new javax.swing.JLabel();
        lFare = new javax.swing.JLabel();
        lStart = new javax.swing.JLabel();
        lEnd = new javax.swing.JLabel();
        labelStart = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelTrainNo = new javax.swing.JLabel();
        labelFare = new javax.swing.JLabel();
        labelEnd = new javax.swing.JLabel();
        bOk = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIEW TICKET");

        bViewDetails.setBackground(new java.awt.Color(99, 237, 88));
        bViewDetails.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        bViewDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railwayreservation/list.png"))); // NOI18N
        bViewDetails.setText("VIEW DETAILS");
        bViewDetails.setIconTextGap(-120);
        bViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bViewDetailsActionPerformed(evt);
            }
        });

        labelTicketNo.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelTicketNo.setText("ENTER TICKET NO.");

        tfTicketNo.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N

        lName.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N

        lTrainNo.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N

        lFare.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N

        lStart.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N

        lEnd.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N

        labelStart.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        labelStart.setText("START");

        labelName.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        labelName.setText("NAME");

        labelTrainNo.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        labelTrainNo.setText("TRAIN NO.");

        labelFare.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        labelFare.setText("FARE");

        labelEnd.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        labelEnd.setText("END");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelFare, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTrainNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lTrainNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lFare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelName)
                            .addComponent(lName))
                        .addGap(50, 50, 50)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTrainNo)
                            .addComponent(lTrainNo))
                        .addGap(64, 64, 64))
                    .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelFare)
                        .addComponent(lFare)))
                .addGap(56, 56, 56)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStart)
                    .addComponent(lStart))
                .addGap(42, 42, 42)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEnd)
                    .addComponent(lEnd))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        bOk.setBackground(new java.awt.Color(244, 66, 66));
        bOk.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        bOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railwayreservation/backarrow.png"))); // NOI18N
        bOk.setText("Back");
        bOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel33Layout = new javax.swing.GroupLayout(panel33);
        panel33.setLayout(panel33Layout);
        panel33Layout.setHorizontalGroup(
            panel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel33Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel33Layout.createSequentialGroup()
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addComponent(bOk))
                    .addGroup(panel33Layout.createSequentialGroup()
                        .addComponent(labelTicketNo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(tfTicketNo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(bViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel33Layout.setVerticalGroup(
            panel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTicketNo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTicketNo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel33Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(panel33Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bOk)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railwayreservation/bg.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bViewDetailsActionPerformed

        Statement st;
        Connection con = null;
        ResultSet rs = null;

        try {
            ticketNo = tfTicketNo.getText();
            int tno = Integer.parseInt(ticketNo);

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");
            st = con.createStatement();
            String sr = "select name,traino,fare,start,ending from book where ticketno =  " + tno;
            rs = st.executeQuery(sr);
            if (rs.next()) {
                lName.setText(rs.getString(1));
                lTrainNo.setText(rs.getString(2));
                lFare.setText(rs.getString(3));
                lStart.setText(rs.getString(4));
                lEnd.setText(rs.getString(5));

            } else {
                JOptionPane.showMessageDialog(null, "INVALID TICKET");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "INVALID TICKET");
            e.printStackTrace();

        }


    }//GEN-LAST:event_bViewDetailsActionPerformed

    private void bOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOkActionPerformed
        Frame1 f1 = new Frame1();
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_bOkActionPerformed

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
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bOk;
    private javax.swing.JButton bViewDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lEnd;
    private javax.swing.JLabel lFare;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lStart;
    private javax.swing.JLabel lTrainNo;
    private javax.swing.JLabel labelEnd;
    private javax.swing.JLabel labelFare;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelStart;
    private javax.swing.JLabel labelTicketNo;
    private javax.swing.JLabel labelTrainNo;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel33;
    private javax.swing.JTextField tfTicketNo;
    // End of variables declaration//GEN-END:variables
}
