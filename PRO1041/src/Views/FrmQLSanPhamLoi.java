package Views;

import Services.IManageSanPhamLoiService;
import Services.ManageSanPhamLoiService;
import ViewModels.QLSanPhamLoi;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmQLSanPhamLoi extends javax.swing.JFrame {

    private IManageSanPhamLoiService sanPhamLoiService;
    //private ManageSanPhamService sanPhamService;

    public FrmQLSanPhamLoi() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sanPhamLoiService = new ManageSanPhamLoiService();
        //this.sanPhamService = new ManageSanPhamService();
        //this.loadTableSP();
        this.clearForm();
        this.loadTableSPL();
    }

    public void loadTableSPL() {
        DefaultTableModel dtm = (DefaultTableModel) this.tblSPL.getModel();
        dtm.setRowCount(0);
        for (QLSanPhamLoi sp : this.sanPhamLoiService.ALL()) {
            Object[] rowData = {
                sp.getId(),
                sp.getMaSPL(),
                sp.getIdSP(),
                sp.getTenSPL(),
                sp.getLyDoLoi()
            };
            dtm.addRow(rowData);
        }
    }

//    public void loadTableSP() {
//        DefaultTableModel dtm = (DefaultTableModel) this.tblSP.getModel();
//        dtm.setRowCount(0);
//        for (QLSanPham sp : this.sanPhamService.ALL()) {
//            Object[] rowData = {
//                sp.getMaSP(),
//                sp.getTenSP(),
//                sp.getSoLuong(),
//                sp.getMoTa()
//            };
//            dtm.addRow(rowData);
//        }
//    }

    public void clearForm() {

    }

    private QLSanPhamLoi getFormData() {
        String id = this.lblID.getText().trim();
        String maSP = this.lblMaSP.getText().trim();
        String maSPL = this.txtMaSPL.getText().trim();
        String ten = this.lblTenSP.getText().trim();
        String loi = this.txtLyDoLoi.getText().trim();

        QLSanPhamLoi s = new QLSanPhamLoi(id, maSP, maSPL, ten, loi);
        return s;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel22 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        jPanel23 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        txtLyDoLoi = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblSPL = new javax.swing.JTable();
        btnTimKiemSPL = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        txtMaSPL = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblTenSP = new javax.swing.JLabel();
        lblMaSP = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnTimKiemSP = new javax.swing.JButton();
        txtMaSP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? SP", "T??n SP", "S??? l?????ng", "M?? t???"
            }
        ));
        tblSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPMouseClicked(evt);
            }
        });
        jScrollPane16.setViewportView(tblSP);

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel72.setText("T??n SP");

        jLabel73.setText("L?? do l???i");

        jLabel74.setText("M?? SP");

        btnXoa.setText("X??a");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setText("C???p nh???t");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnThem.setText("Th??m");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        tblSPL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "M?? SPL", "Id SP", "T??n SP", "L?? do l???i"
            }
        ));
        tblSPL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPLMouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(tblSPL);

        btnTimKiemSPL.setText("T??m ki???m");
        btnTimKiemSPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemSPLActionPerformed(evt);
            }
        });

        jLabel76.setText("M?? SPL");

        jLabel1.setText("ID");

        lblTenSP.setText("--");

        lblMaSP.setText("--");

        lblID.setText("--");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel76)
                            .addComponent(jLabel74)
                            .addComponent(jLabel1))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaSPL, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel73)
                                    .addComponent(jLabel72))
                                .addGap(29, 29, 29))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(lblMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLyDoLoi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(129, 129, 129))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(0, 192, Short.MAX_VALUE)
                        .addComponent(btnThem)
                        .addGap(49, 49, 49)
                        .addComponent(btnCapNhat)
                        .addGap(77, 77, 77)
                        .addComponent(btnXoa)
                        .addGap(44, 44, 44)
                        .addComponent(btnTimKiemSPL, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))))
            .addComponent(jScrollPane17)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel72)
                            .addComponent(lblTenSP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel73)
                            .addComponent(txtLyDoLoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76)
                            .addComponent(txtMaSPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel74)
                            .addComponent(lblMaSP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnCapNhat)
                    .addComponent(btnThem)
                    .addComponent(btnTimKiemSPL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Qu???n l?? s???n ph???m l???i");

        jLabel26.setText("M?? SP");

        btnTimKiemSP.setText("T??m ki???m");
        btnTimKiemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(336, 336, 336))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTimKiemSP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel22)
                .addGap(4, 4, 4)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(btnTimKiemSP)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblSPLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPLMouseClicked
        int row = this.tblSPL.getSelectedRow();
        if (row == -1) {
            return;
        }
        String id = this.tblSPL.getValueAt(row, 0).toString();
        String maSPL = this.tblSPL.getValueAt(row, 1).toString();
        String maSP = this.tblSPL.getValueAt(row, 2).toString();
        String ten = this.tblSPL.getValueAt(row, 3).toString();
        String lyDoLoi = this.tblSPL.getValueAt(row, 4).toString();
        this.lblID.setText(id);
        this.txtMaSPL.setText(maSPL);
        this.lblMaSP.setText(maSP);
        this.lblTenSP.setText(ten);
        this.txtLyDoLoi.setText(lyDoLoi);
    }//GEN-LAST:event_tblSPLMouseClicked

    private void tblSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMouseClicked
        int row = this.tblSP.getSelectedRow();
        if (row == -1) {
            return;
        }
        String ma = this.tblSP.getValueAt(row, 0).toString();
        String ten = this.tblSP.getValueAt(row, 1).toString();

        this.lblMaSP.setText(ma);
        this.lblTenSP.setText(ten);
    }//GEN-LAST:event_tblSPMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        QLSanPhamLoi sp = this.getFormData();
        if (sp == null) {
            return;
        }
        this.sanPhamLoiService.insert(sp);
        this.loadTableSPL();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "th??m th??nh c??ng");
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        QLSanPhamLoi sp = this.getFormData();
        if (sp == null) {
            return;
        }
        String id = this.lblID.getText();
        this.sanPhamLoiService.update(id, sp);
        this.loadTableSPL();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "C???p nh???t th??nh c??ng");
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row = this.tblSPL.getSelectedRow();
        if (row == -1) {
            return;
        }
        int cofirm = JOptionPane.showConfirmDialog(this, "b???n mu???n x??a kh??ng");
        if (cofirm != JOptionPane.YES_OPTION) {
            return;
        }
        String id = this.tblSPL.getValueAt(row, 0).toString();
        this.sanPhamLoiService.delete(id);
        this.loadTableSPL();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "X??a th??nh c??ng");
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemSPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemSPLActionPerformed
        String maSPL = this.txtMaSPL.getText();
        List<QLSanPhamLoi> ds = this.sanPhamLoiService.ALL();
        int check = 0;
        if (maSPL.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Kh??ng ???????c ????? tr???ng m?? s???n ph???m l???i");
            return;
        } else {
            for (QLSanPhamLoi sp : ds) {
                if (sp.getMaSPL().equalsIgnoreCase(txtMaSPL.getText())) {
                    check++;
                    this.lblID.setText(sp.getId());
                    this.txtMaSPL.setText(sp.getMaSPL());
                    this.lblMaSP.setText(sp.getIdSP());
                    this.lblTenSP.setText(sp.getTenSPL());
                    this.txtLyDoLoi.setText(sp.getLyDoLoi());
                    JOptionPane.showMessageDialog(this, "T??m th???y s???n ph???m l???i");
                    this.tblSPL.getSelectedRow();
                    return;
                }
            }
        }
        if (check == 0) {
            this.clearForm();
            JOptionPane.showMessageDialog(this, "Kh??ng t??m th???y s???n ph???m l???i");

        }
    }//GEN-LAST:event_btnTimKiemSPLActionPerformed

    private void btnTimKiemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemSPActionPerformed
//        String maSP = this.txtMaSP.getText();
//        List<QLSanPham> ds = this.sanPhamService.ALL();
//        int check = 0;
//        if (maSP.trim().length() == 0) {
//            JOptionPane.showMessageDialog(this, "Kh??ng ???????c ????? tr???ng m?? s???n ph???m");
//            return;
//        } else {
//            for (QLSanPham sp : ds) {
//                if (sp.getMaSP().equalsIgnoreCase(txtMaSP.getText())) {
//                    check++;
//                    this.lblMaSP.setText(sp.getMaSP());
//                    this.lblTenSP.setText(sp.getTenSP());
//                    JOptionPane.showMessageDialog(this, "T??m th???y s???n ph???m");
//                    this.tblSPL.getSelectedRow();
//                    return;
//                }
//            }
//        }
//        if (check == 0) {
//            this.clearForm();
//            JOptionPane.showMessageDialog(this, "Kh??ng t??m th???y s???n ph???m");
//
//        }
    }//GEN-LAST:event_btnTimKiemSPActionPerformed

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
            java.util.logging.Logger.getLogger(FrmQLSanPhamLoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmQLSanPhamLoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmQLSanPhamLoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmQLSanPhamLoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmQLSanPhamLoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiemSP;
    private javax.swing.JButton btnTimKiemSPL;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMaSP;
    private javax.swing.JLabel lblTenSP;
    private javax.swing.JTable tblSP;
    private javax.swing.JTable tblSPL;
    private javax.swing.JTextField txtLyDoLoi;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtMaSPL;
    // End of variables declaration//GEN-END:variables
}
