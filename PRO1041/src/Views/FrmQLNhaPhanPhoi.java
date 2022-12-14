/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;


import DomainModel.NhaPhanPhoi;
import ServiceImpl.NhaPhanPhoiSV;
import ViewModel.QLNPP;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author lanan
 */
public class FrmQLNhaPhanPhoi extends javax.swing.JFrame {

    private final NhaPhanPhoiSV NPPSV;
    DefaultTableModel model;

    /**
     * Creates new form FrmQLNhaPhanPhoi
     */
    public FrmQLNhaPhanPhoi() {
        initComponents();
        NPPSV = new NhaPhanPhoiSV();
        model = new DefaultTableModel();
        model = (DefaultTableModel) tblNPP.getModel();
        model.setRowCount(0);
        loadtable();
    }

    void loadtable() {
        try {
            List<QLNPP> ql = NPPSV.findALL();
            if (ql == null) {
                JOptionPane.showMessageDialog(null, "lỗi");
                return;

            }
            for (QLNPP q : ql) {
                model.addRow(new Object[]{
                    q.getMaNPP(),
                    q.getTenNPP(),
                    q.getDiaChi(),
                    q.getSdt(),});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "lỗi");
            return;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTK = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblNPP = new javax.swing.JTable();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel62.setText("Quản lý nhà phân phối");

        jLabel63.setText("Mã NPP");

        jLabel64.setText("Tên NPP");

        jLabel65.setText("Địa chỉ");

        btnThem.setText("Thêm ");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Cập nhật");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTK.setText("Tìm kiếm");
        btnTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKActionPerformed(evt);
            }
        });

        tblNPP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã BPP", "Tên NPP", "Địa chỉ", "SĐT"
            }
        ));
        tblNPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNPPMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(tblNPP);

        jLabel1.setText("Số ĐT");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addGap(265, 265, 265)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel62)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                            .addComponent(txtSDT)))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel63)
                                            .addComponent(jLabel64))
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtMa)
                                            .addComponent(txtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(btnThem)
                                        .addGap(65, 65, 65)
                                        .addComponent(btnSua)))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(btnXoa)
                                        .addGap(68, 68, 68)
                                        .addComponent(btnTK))
                                    .addComponent(jLabel65))))
                        .addGap(73, 73, 73)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel62)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel65)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(76, 76, 76)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnTK))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 841, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblNPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNPPMouseClicked
        // TODO add your handling code here:
        int row = tblNPP.getSelectedRow();
        txtMa.setText(tblNPP.getValueAt(row, 0).toString());
        txtTen.setText(tblNPP.getValueAt(row, 1).toString());
        txtDiaChi.setText(tblNPP.getValueAt(row, 2).toString());
        txtSDT.setText(tblNPP.getValueAt(row, 3).toString());
    }//GEN-LAST:event_tblNPPMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String Ma = txtMa.getText();
        String Ten = txtTen.getText();
        String DiaChi = txtDiaChi.getText();
        String Sdt = txtSDT.getText();

        if (Ma.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "mã ko đc để trống");
            return;
        }
        if (Ten.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "tên ko đc để trống");
            return;
        }
        if (DiaChi.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "địa chỉ ko đc để trống");
            return;
        }
        if (Sdt.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sdt ko đc để trống");
            return;
        }
        try {
            NPPSV.insert(Ma, Ten, DiaChi, Sdt);
            model.setRowCount(0);
            loadtable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "thêm thất bại");
            return;
        }
        JOptionPane.showMessageDialog(null, "thêm thành công");
        return;
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int row = tblNPP.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "vui lòng chọn từ table");
            return;
        } else {
            String Ma = txtMa.getText();
            String Ten = txtTen.getText();
            String DiaChi = txtDiaChi.getText();
            String Sdt = txtSDT.getText();

            if (Ma.trim().isEmpty()
                    || Ten.trim().isEmpty()
                    || DiaChi.trim().isEmpty()
                    || Sdt.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "ko đc để trống");
                return;
            }
            try {
                NPPSV.update(Ma, Ten, DiaChi, Sdt);
                model.setRowCount(0);
                loadtable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "sửa thất bại");
                return;
            }
            JOptionPane.showMessageDialog(null, "sửa thành công");
            return;

        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int row = tblNPP.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "chọn 1 cái để xóa");
            return;
        } else {
            String Ma = txtMa.getText();
            try {
                NPPSV.delete(Ma);
                model.setRowCount(0);
                loadtable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "xóa thất bại");
                return;
            }
            JOptionPane.showMessageDialog(null, "xóa thành công");
            return;
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKActionPerformed
        // TODO add your handling code here:
        String ma = JOptionPane.showInputDialog(null, "vui lòng nhập mã khách hàng muốn tìm");
        try {
            List<NhaPhanPhoi> k = NPPSV.select1(ma);
            model.setRowCount(0);
            for (NhaPhanPhoi n : k) {
                model.addRow(new Object[]{
                    n.getMaNPP(),
                    n.getTenNPP(),
                    n.getDiaChi(),
                    n.getSdt(),});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "thất bại");
            return;
        }
        JOptionPane.showMessageDialog(null, "đã hiện khách hàng muốn tìm");
        return;
    }//GEN-LAST:event_btnTKActionPerformed

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
            java.util.logging.Logger.getLogger(FrmQLNhaPhanPhoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmQLNhaPhanPhoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmQLNhaPhanPhoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmQLNhaPhanPhoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmQLNhaPhanPhoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTK;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JTable tblNPP;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
