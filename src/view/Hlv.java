/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.*;
import Controler.ketnoi;
import java.awt.Checkbox;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import quan_li_phong_gym.Huan_Luyen_vien;
/**
 * 
 * @author Admin
 */
public class Hlv extends javax.swing.JFrame {
    ArrayList<Huan_Luyen_vien> listhlv = new  ArrayList<Huan_Luyen_vien>();
    int current =0;
    /**
     * Creates new form Hlv
     */
    public Hlv() {
        initComponents();
        setLocationRelativeTo(null);
    LoadDataToArray();
    LoadDataArrayListtoTable();
        //Display(current);
    }

    
    
   ketnoi kn =new ketnoi();
    Connection conn ;
    PreparedStatement pst;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void Display(int i){
    Huan_Luyen_vien hl= listhlv.get(i);
    txtTenhlv1.setText(hl.getTen());
    txtKinhnghiemhlv.setText(hl.getKinhnghiem());
    txtCccdhlv.setText(hl.getCccd());
    txtSdtlhv.setText(hl.getSdt());
        if (hl.getGioitinh().equals("Nam")||hl.getGioitinh().equals("nam")) {
            jcbGioitinhhlv.setSelectedItem("Nam");
        } else {            jcbGioitinhhlv.setSelectedItem("Nữ");

        }
        txtMahlv.setText(hl.getMahlv());
    }
    public void LoadDataToArray(){
        try {
                conn =kn.getConnection();
                Statement st =conn.createStatement();
            String sql = "select * from Huanluyenvien";
            ResultSet rs =st.executeQuery(sql);
            listhlv.clear();
            while (rs.next()) {       
                String ten =rs.getString(1);
                String kinhnghiem =rs.getString(2);
                String cccd =rs.getString(3);
                String sdt = rs.getString(4);
                String gioitinh =rs.getString(5);
                String mahlv =rs.getString(6);
                Huan_Luyen_vien h =new Huan_Luyen_vien(ten, kinhnghiem, cccd, sdt, gioitinh, mahlv);
                listhlv.add(h);
                
                
            }
           
        } catch (Exception e) {
        }
    }
    public void Connect(){
      String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=doannhom11;user=sa;password=123456;encrypt=false";
     
        try {
            conn = DriverManager.getConnection(connectionURL);
           
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }
    public void LoadDataArrayListtoTable(){
        DefaultTableModel model = (DefaultTableModel) tblhlv.getModel();
        model.setRowCount(0);
        for (Huan_Luyen_vien h : listhlv) {
            model.addRow(new Object[]{h.getTen(),h.getKinhnghiem(),h.getCccd(),h.getSdt(),h.getGioitinh(),h.getMahlv()});
        }
    }
    public boolean checkValidateForm(){
        if (txtTenhlv1.getText().isEmpty()||txtCccdhlv.getText().isEmpty()
                ||txtKinhnghiemhlv.getText().isEmpty()
                ||txtMahlv.getText().isEmpty()||txtSdtlhv.getText().isEmpty()) {
            return false;
        } else {
            return true ;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTenhlv1 = new javax.swing.JTextField();
        txtCccdhlv = new javax.swing.JTextField();
        txtSdtlhv = new javax.swing.JTextField();
        txtKinhnghiemhlv = new javax.swing.JTextField();
        txtMahlv = new javax.swing.JTextField();
        jcbGioitinhhlv = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhlv = new javax.swing.JTable();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        TxtTim = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        btnnhaplai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HUẤN LUYỆN VIÊN");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(399, 399, 399)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Tên");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Sdt");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Cccd");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Kinh nghiệm");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Giới tính");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Mã HLV");

        txtTenhlv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenhlv1ActionPerformed(evt);
            }
        });

        txtCccdhlv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCccdhlvActionPerformed(evt);
            }
        });

        jcbGioitinhhlv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "", "" }));
        jcbGioitinhhlv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbGioitinhhlvMouseClicked(evt);
            }
        });
        jcbGioitinhhlv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbGioitinhhlvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(txtKinhnghiemhlv, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCccdhlv, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbGioitinhhlv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMahlv, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSdtlhv, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTenhlv1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenhlv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtCccdhlv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSdtlhv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKinhnghiemhlv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbGioitinhhlv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMahlv, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        tblhlv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tên", "Kinh nghiệm", "Cccd", "Sdt", "Giới tính", "Mã hlv"
            }
        ));
        tblhlv.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblhlvAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tblhlv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblhlvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblhlv);

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        TxtTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTimActionPerformed(evt);
            }
        });
        TxtTim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtTimKeyReleased(evt);
            }
        });

        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnnhaplai.setText("Nhập lại");
        btnnhaplai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhaplaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnnhaplai)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTim)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 28, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSua)
                        .addComponent(btnXoa)
                        .addComponent(btnnhaplai)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        
            String tenhvl=txtTenhlv1.getText();
        String kn = txtKinhnghiemhlv.getText();
        String CCCD= txtCccdhlv.getText();
        String Gioitinh =(String)jcbGioitinhhlv.getSelectedItem();
        String sdt = txtSdtlhv.getText();
        String mahlv =txtMahlv.getText();
        try {
            if (!checkValidateForm()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin ");
            } else {
            
            pst=conn.prepareStatement("insert into dbo.Huanluyenvien values(?,?,?,?,?,?)");
            pst.setString(1, tenhvl);
            pst.setString(2, kn);
            pst.setString(3, CCCD);
            pst.setString(4, sdt);
            pst.setString(5, Gioitinh);
            pst.setString(6, mahlv);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Đã thêm Huấn luyện viên");
            txtTenhlv1.setText("");
            txtKinhnghiemhlv.setText("");
            txtCccdhlv.setText("");
     jcbGioitinhhlv.setSelectedItem(1);
            txtSdtlhv.setText("");
            txtMahlv.setText("");
            txtTenhlv1.requestFocus();
            

        }} catch (SQLException ex) {
            Logger.getLogger(Hlv.class.getName()).log(Level.SEVERE, null, ex);
        }
          LoadDataToArray();
           LoadDataArrayListtoTable();
        
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if (txtMahlv.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã hlv");
            txtMahlv.requestFocus();
        }else{
            try { 
                String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=doannhom11;user=sa;password=123456;encrypt=false";
            conn = DriverManager.getConnection(connectionURL);
           String sql = "delete from dbo.Huanluyenvien where Mahlv = ?";
            pst = conn.prepareStatement(sql);
           pst.setString(1, txtMahlv.getText());
           pst.executeUpdate();
           JOptionPane.showMessageDialog(this, "Đã xóa thành công ");
           txtTenhlv1.setText("");  
            txtKinhnghiemhlv.setText("");
            txtCccdhlv.setText("");
     jcbGioitinhhlv.setSelectedItem(1);
            txtSdtlhv.setText("");
            txtMahlv.setText("");
           //conn.close();
           
            } 
            catch (HeadlessException | SQLException e) {
                System.out.println(e);
            }
           LoadDataToArray();
           LoadDataArrayListtoTable();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void tblhlvAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblhlvAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblhlvAncestorAdded

    private void tblhlvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblhlvMouseClicked
        // TODO add your handling code here:
                DefaultTableModel model = (DefaultTableModel) tblhlv.getModel();

        current=tblhlv.getSelectedRow();
        Display(current);
    }//GEN-LAST:event_tblhlvMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
         if (txtMahlv.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã hlv");
            txtMahlv.requestFocus();
         }else{
                String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=doannhom11;user=sa;password=123456;encrypt=false";
        try { //Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(connectionURL);
            String sql1= "update Huanluyenvien set Ten=?,Kinhnghiem=?,Cccd=?,Sdt=?,Gioitinh=? Where Mahlv=?";
            pst =conn.prepareStatement(sql1);
              String tenhvl=txtTenhlv1.getText();
        String kn = txtKinhnghiemhlv.getText();
        String CCCD= txtCccdhlv.getText();
        String Gioitinh =jcbGioitinhhlv.getSelectedItem().toString();
        String sdt = txtSdtlhv.getText();
        String mahlv =txtMahlv.getText();
        pst.setString(1, tenhvl);
            pst.setString(2, kn);
            pst.setString(3, CCCD);
            pst.setString(4, sdt);
            pst.setString(5, Gioitinh);
            pst.setString(6, mahlv);
            txtTenhlv1.setText("");
            txtKinhnghiemhlv.setText("");
            txtCccdhlv.setText("");
     jcbGioitinhhlv.setSelectedItem(1);
            txtSdtlhv.setText("");
            txtMahlv.setText("");
            pst.executeUpdate();
            conn.close();
            JOptionPane.showMessageDialog(this, "Sửa thành công");
        } catch (SQLException ex) {
            Logger.getLogger(Hlv.class.getName()).log(Level.SEVERE, null, ex);
        } 
      LoadDataToArray();
    LoadDataArrayListtoTable();}
    }//GEN-LAST:event_btnSuaActionPerformed

    private void TxtTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTimActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_TxtTimActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        listhlv.clear();
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=doannhom11;user=sa;password=123456;encrypt=false";
     
    
        try {
            conn = DriverManager.getConnection(connectionURL);
            
            String sql ="select * from Huanluyenvien where Mahlv like N'%"+TxtTim.getText()+"%'";
           Statement st =conn.createStatement();
     ResultSet rs=st.executeQuery(sql);
           while (rs.next()){
                 String ten =rs.getString(1);
                String kinhnghiem =rs.getString(2);
                String cccd =rs.getString(3);
                String sdt = rs.getString(4);
                String gioitinh =rs.getString(5);
                String mahlv =rs.getString(6);
                Huan_Luyen_vien h =new Huan_Luyen_vien(ten, kinhnghiem, cccd, sdt, gioitinh, mahlv);
                listhlv.add(h);}
               
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        LoadDataArrayListtoTable();
    }//GEN-LAST:event_btnTimActionPerformed

    private void TxtTimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTimKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_TxtTimKeyReleased

    private void jcbGioitinhhlvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbGioitinhhlvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbGioitinhhlvActionPerformed

    private void jcbGioitinhhlvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbGioitinhhlvMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbGioitinhhlvMouseClicked

    private void txtCccdhlvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCccdhlvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCccdhlvActionPerformed

    private void txtTenhlv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenhlv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenhlv1ActionPerformed

    private void btnnhaplaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhaplaiActionPerformed
        // TODO add your handling code here:
         txtTenhlv1.setText("");
            txtKinhnghiemhlv.setText("");
            txtCccdhlv.setText("");
     jcbGioitinhhlv.setSelectedItem(1);
            txtSdtlhv.setText("");
            txtMahlv.setText("");
            TxtTim.setText("");
    }//GEN-LAST:event_btnnhaplaiActionPerformed

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
            java.util.logging.Logger.getLogger(Hlv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hlv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hlv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hlv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hlv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtTim;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnnhaplai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbGioitinhhlv;
    private javax.swing.JTable tblhlv;
    private javax.swing.JTextField txtCccdhlv;
    private javax.swing.JTextField txtKinhnghiemhlv;
    private javax.swing.JTextField txtMahlv;
    private javax.swing.JTextField txtSdtlhv;
    private javax.swing.JTextField txtTenhlv1;
    // End of variables declaration//GEN-END:variables
}