/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import conection.koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aria Pratama
 */
public class main extends javax.swing.JFrame {
koneksi kon = new koneksi();
int nim;
String nama;
String jenis;
String kelas;
    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        tampil();
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Tnim = new javax.swing.JTextField();
        Tnama = new javax.swing.JTextField();
        Tkelas = new javax.swing.JTextField();
        Binsert = new javax.swing.JButton();
        Bupdate = new javax.swing.JButton();
        Bdelet = new javax.swing.JButton();
        rperia = new javax.swing.JRadioButton();
        rperempuan = new javax.swing.JRadioButton();
        Breset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("PENDATAAN MAHASISWA");

        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel);

        jLabel2.setText("NIM");

        jLabel3.setText("NAMA");

        jLabel4.setText("JENIS KELAMIN");

        jLabel5.setText("KELAS");

        Tkelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TkelasActionPerformed(evt);
            }
        });

        Binsert.setText("INSERT");
        Binsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinsertActionPerformed(evt);
            }
        });

        Bupdate.setText("UPDATE");
        Bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BupdateActionPerformed(evt);
            }
        });

        Bdelet.setText("DELETE");
        Bdelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdeletActionPerformed(evt);
            }
        });

        buttonGroup1.add(rperia);
        rperia.setSelected(true);
        rperia.setText("laki-laki");

        buttonGroup1.add(rperempuan);
        rperempuan.setText("perempuan");

        Breset.setText("RESET");
        Breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(203, 203, 203))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tnama)
                                    .addComponent(Tkelas)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Tnim, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rperia)
                                                .addGap(18, 18, 18)
                                                .addComponent(rperempuan)))
                                        .addGap(0, 31, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Binsert)
                                .addGap(18, 18, 18)
                                .addComponent(Bupdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bdelet)
                                .addGap(18, 18, 18)
                                .addComponent(Breset)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(Tnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addComponent(Tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rperia)
                            .addComponent(rperempuan))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Tkelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Binsert)
                            .addComponent(Bupdate)
                            .addComponent(Bdelet)
                            .addComponent(Breset))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TkelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TkelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TkelasActionPerformed

    private void BinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinsertActionPerformed
    Connection Con = kon.getkoneksi();
    nim = Integer.valueOf(Tnim.getText());
    nama = Tnama.getText();
    kelas = Tkelas.getText();
    
    if(rperempuan.isSelected()){
        jenis = "perempuan";
    }else{
        jenis = "laki-laki";
    }
    try{
        Statement st = (Statement) Con.createStatement();
        st.executeUpdate("INSERT INTO mahasiswa"+"(nim,nama,jenis_kelamin,kelas)"+"VALUE('"+nim+"','"+nama+"','"+jenis+"','"+kelas+"')");
    }catch(SQLException x){
        JOptionPane.showMessageDialog(this, x, "error", JOptionPane.ERROR_MESSAGE);
    }
    tampil();
    }//GEN-LAST:event_BinsertActionPerformed

    private void BdeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdeletActionPerformed
        nim = Integer.valueOf(Tnim.getText());
        Connection con = kon.getkoneksi();
        try{
        Statement st = (Statement) con.createStatement();
        st.executeUpdate("DELETE from mahasiswa where nim = "+nim);
        tampil();
        }catch(SQLException x){
            JOptionPane.showMessageDialog(this, x,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BdeletActionPerformed

    private void TabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMouseClicked
        try{
            int row = Tabel.rowAtPoint(evt.getPoint());
            nim = Integer.valueOf(Tabel.getValueAt(row,0).toString());
            nama = Tabel.getValueAt(row, 1).toString();
            jenis = Tabel.getValueAt(row, 2).toString();
            kelas = Tabel.getValueAt(row, 3).toString();
            if(row>-1){
                Binsert.setEnabled(false);
                Tnim.setEditable(false);
            }
        }catch(NumberFormatException x){
        
        }
        
            if("perempuan".equals(jenis)){
                rperempuan.setSelected(true);
            }else{
                rperia.setSelected(true);
            }
            Tnim.setText(String.valueOf(nim));
            Tnama.setText(nama);
            Tkelas.setText(kelas);
    }//GEN-LAST:event_TabelMouseClicked

    private void BresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BresetActionPerformed
        Tnim.setText("");
        Tnama.setText("");
        Tkelas.setText("");
        Binsert.setEnabled(true);
    }//GEN-LAST:event_BresetActionPerformed

    private void BupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BupdateActionPerformed
        Connection con = kon.getkoneksi();
        nim = Integer.valueOf(Tnim.getText());
        nama = Tnama.getText();
        kelas = Tkelas.getText();
    
        if(rperempuan.isSelected()){
            jenis = "perempuan";
        }else{
        jenis = "laki-laki";
    }
        try{
            Statement st = (Statement) con.createStatement();
            st.executeUpdate("UPDATE mahasiswa SET nama ='"+nama+"', jenis_kelamin ='"+jenis+"', kelas ='"+kelas+"' where nim ='"+nim+"'");
            tampil();
        }catch(SQLException x){
            JOptionPane.showMessageDialog(this, x,"Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BupdateActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bdelet;
    private javax.swing.JButton Binsert;
    private javax.swing.JButton Breset;
    private javax.swing.JButton Bupdate;
    private javax.swing.JTable Tabel;
    private javax.swing.JTextField Tkelas;
    private javax.swing.JTextField Tnama;
    private javax.swing.JTextField Tnim;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rperempuan;
    private javax.swing.JRadioButton rperia;
    // End of variables declaration//GEN-END:variables

    private void tampil(){
        DefaultTableModel tm = new DefaultTableModel();
        Connection con = kon.getkoneksi();
        tm.addColumn("nim");
        tm.addColumn("nama");
        tm.addColumn("Jenis kelamin");
        tm.addColumn("kelas");
        Tabel.setModel(tm);
        try{
            Statement st = (Statement) con.createStatement();
            ResultSet res = st.executeQuery("select * from mahasiswa");
            while(res.next()){
                tm.addRow(new Object[]{res.getString("nim"),res.getString("nama"),res.getString("jenis_kelamin"),res.getString("kelas")});
            }
        }catch(SQLException x){
          JOptionPane.showMessageDialog(this, x, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
