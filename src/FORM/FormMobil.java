/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FORM;
import rentalmobil.ClassDatabase;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author USER
 */
public class FormMobil extends javax.swing.JInternalFrame {

    /** Creates new form FormMobil */
    public FormMobil() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtstatus = new javax.swing.JComboBox();
        txtplatnomor = new javax.swing.JTextField();
        txthargarental = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        Txtjenismobil = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_mobil = new javax.swing.JTable();

        kGradientPanel1.setkEndColor(new java.awt.Color(153, 0, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Plat Nomor");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setText("Jenis Mobil");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setText("Harga Rental");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setText("Status Mobil");

        txtstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PILIH", "READY", "NOTREADY" }));
        txtstatus.setName(""); // NOI18N
        txtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstatusActionPerformed(evt);
            }
        });

        txtplatnomor.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtplatnomorCaretUpdate(evt);
            }
        });

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Back Home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        Txtjenismobil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Silahkan Pilih", "Daihatsu Xenia", "Suzuki Ertiga", "Toyota Fortuner", "Toyotoa Kijang innova", "Toyota Hiace" }));
        Txtjenismobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtjenismobilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtplatnomor)
                    .addComponent(txthargarental)
                    .addComponent(Txtjenismobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtplatnomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Txtjenismobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txthargarental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addComponent(jLabel11))
                            .addComponent(txtstatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(simpan)
                        .addGap(39, 39, 39)
                        .addComponent(edit)
                        .addGap(38, 38, 38)
                        .addComponent(jButton1)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(hapus)
                                .addGap(78, 78, 78))
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FORM DATA MOBIL");
        jLabel2.setInheritsPopupMenu(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/abaab.png"))); // NOI18N

        tbl_mobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(tbl_mobil);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(214, 214, 214))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        String platnomor=this.txtplatnomor.getText();
        String jenismobil=(String) this.Txtjenismobil.getSelectedItem();
        String hargarental=this.txthargarental.getText();
        String status=(String) this.txtstatus.getSelectedItem();

        if(txtplatnomor.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Id Mobil Tidak Boleh Kosong");
        }
                else{
                    if (txthargarental.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Harga Rental Tidak Boleh Kosong");
                    }
                        
                        else{
                            try {
                                Connection c=ClassDatabase.getkoneksi();
                                String sql = "Insert into mobil values (?,?,?,?)";
                                PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);
                                p.setString(1, platnomor);
                                p.setString(2, jenismobil);
                                p.setString(3, hargarental);
                                p.setString(4, status);
                                p.executeUpdate();
                                p.close();

                                JOptionPane.showMessageDialog(this, "Sukses Tambah Data");

                            }catch(SQLException e){
                                System.out.println(e);
                            }finally{
                            }}
                            try {

                                Connection c=ClassDatabase.getkoneksi();
                                Statement s= c.createStatement();
                                String sql="select * from mobil";
                                ResultSet r=s.executeQuery(sql);
                                tbl_mobil.setModel(DbUtils.resultSetToTableModel(r));
                            }catch (Exception e){
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }
    }//GEN-LAST:event_simpanActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new menuutama().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        String idmobil=this.txtplatnomor.getText();

        try {
            Connection c=ClassDatabase.getkoneksi();
            String sql = "Delete from mobil Where plat_nomor=?";
            PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);
            p.setString(1, idmobil);

            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(this, "Sukses Hapus Data");
        }catch(SQLException e){
            System.out.println(e);
        }finally{
        }
        try {

            Connection c=ClassDatabase.getkoneksi();
            Statement s= c.createStatement();
            String sql="select * from mobil";
            ResultSet r=s.executeQuery(sql);
            tbl_mobil.setModel(DbUtils.resultSetToTableModel(r));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtplatnomor.setText("");
        Txtjenismobil.setSelectedItem("");
        txthargarental.setText("");
        txtstatus.setSelectedItem("");
        txtplatnomor.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
      String platnomor=this.txtplatnomor.getText();
        String jenismobil=(String) this.Txtjenismobil.getSelectedItem();
        String hargarental=this.txthargarental.getText();
        String status=(String) this.txtstatus.getSelectedItem();

        if(txtplatnomor.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Id Mobil Tidak Boleh Kosong");
        }
                else{
                    if (txthargarental.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Harga Rental Tidak Boleh Kosong");
                    }
                    try {
            Connection c=ClassDatabase.getkoneksi();
            String sql ="UPDATE `rentalmobil`.`mobil` SET `jenismobil`=?,`hargarental`=?,`status`=? where `plat_nomor`=?";
            PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);
            p.setString(4, platnomor);
            p.setString(1, jenismobil);  
            p.setString(2, hargarental);
            p.setString(3, status);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(this, "Sukses Update Data");
        }catch(SQLException e){
            System.out.println(e);
        }finally{
            
            
      }}
       try {        
        
            Connection c=ClassDatabase.getkoneksi();
            Statement s= c.createStatement();
            String sql="select * from mobil";
            ResultSet r=s.executeQuery(sql);
            tbl_mobil.setModel(DbUtils.resultSetToTableModel(r));
}catch (Exception e){
JOptionPane.showMessageDialog(null, e);
}
    }//GEN-LAST:event_editActionPerformed

    private void txtplatnomorCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtplatnomorCaretUpdate
     try {
            Connection c=ClassDatabase.getkoneksi();
            Statement s= c.createStatement();
            String sql="Select * from mobil where plat_nomor='" + this.txtplatnomor.getText()+"'";
            ResultSet r=s.executeQuery(sql);
            while (r.next()){
                this.Txtjenismobil.setSelectedItem(r.getString("jenismobil"));
                this.txthargarental.setText(r.getString("hargarental"));
                this.txtstatus.setSelectedItem(r.getString("status"));

            }
            r.close();
            s.close();

        }catch(SQLException e) {
            System.out.println("Terjadi kesalahan" + e);
        }
    }//GEN-LAST:event_txtplatnomorCaretUpdate

    private void txtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstatusActionPerformed

    private void TxtjenismobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtjenismobilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtjenismobilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Txtjenismobil;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tbl_mobil;
    private javax.swing.JTextField txthargarental;
    private javax.swing.JTextField txtplatnomor;
    private javax.swing.JComboBox txtstatus;
    // End of variables declaration//GEN-END:variables

}