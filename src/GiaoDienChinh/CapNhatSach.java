/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDienChinh;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import QuanLySanPham.QuanLySanPhamBUS;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class CapNhatSach extends javax.swing.JFrame {

    QuanLySanPhamBUS qlsp = new QuanLySanPhamBUS();
    private String choosenSp;
    
    /**
     * Creates new form CapNhatSach
     */
    public CapNhatSach() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bSize = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bCover = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bAuthor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bCate = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        bDiscount = new javax.swing.JTextField();
        bUrl = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bStock = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        bIssuer = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        bPages = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        bPrice = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        bSupplier = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        bTrans = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bDetail = new javax.swing.JTextArea();
        update = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Mã SP:");

        jLabel4.setText("Kích cỡ:");

        jLabel6.setText("Bìa:");

        jLabel2.setText("Tên:");

        bName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNamenone(evt);
            }
        });

        jLabel3.setText("Tác giả:");

        jLabel7.setText("Ngày PH:");

        jLabel5.setText("Thể loại");

        bCate.setMaximumRowCount(15);

        jLabel8.setText("Giảm giá: ");

        bDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bDiscountKeyReleased(evt);
            }
        });

        jLabel10.setText("Ảnh:");

        jLabel11.setText("Kho:");

        bStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bStockKeyReleased(evt);
            }
        });

        jLabel12.setText("Nhà XB:");

        jLabel13.setText("Số trang:");

        bPages.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bPagesKeyReleased(evt);
            }
        });

        jLabel14.setText("Giá:");

        bPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bPriceKeyReleased(evt);
            }
        });

        jLabel15.setText("Nhà PH:");

        jLabel16.setText("Dịch giả:");

        jLabel17.setText("Mô tả:");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bDetail.setColumns(20);
        bDetail.setRows(5);
        jScrollPane1.setViewportView(bDetail);

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        update.setText("Cập nhật");
        update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update.setOpaque(true);
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/remove.png"))); // NOI18N
        cancel.setText("Hủy");
        cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cancel.setOpaque(true);
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bDate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bCate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bPrice)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bStock, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bPages, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel14))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bSize, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bCover, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bName, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bIssuer, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(bSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(bCover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(bDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(bCate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(bDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(bStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(bIssuer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(bPages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(bPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(bSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(bTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNamenone(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNamenone
        // TODO add your handling code here:
    }//GEN-LAST:event_bNamenone

    private boolean onlyNumber(String s) {
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng chỉ nhập số!!");
                return false;
            }
        }
        return true;
    }
    
    public void setCategoryComboBox(String s){
        this.bCate.addItem(s);
    }
    
    public void setSelectedCategory(String s){
        this.bCate.setSelectedItem(s);
    }
    
    public void setAllData(String maSp, String size , String bia, String ten, String tacGia, String ngayPH,
            float giamGia, String url , int kho, String nhaXB , int pages , int price, String nhaPH , String dich , String chiTiet ){
        this.bID.setText(maSp);
        this.bSize.setText(size);
        this.bCover.setText(bia);
        this.bName.setText(ten);
        this.bAuthor.setText(tacGia);
        this.bDate.setText(ngayPH);
        this.bDiscount.setText(String.valueOf(giamGia));
        this.bUrl.setText(url);
        this.bStock.setText(String.valueOf(kho));
        this.bIssuer.setText(nhaXB);
        this.bPages.setText(String.valueOf(pages));
        this.bPrice.setText(String.valueOf(price));
        this.bSupplier.setText(nhaPH);
        this.bTrans.setText(dich);
        this.bDetail.setText(chiTiet);
    }
    
    public void setMaSp(String s){
        this.choosenSp = s;
    }
    
    private void bDiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bDiscountKeyReleased
        // TODO add your handling code here:
        if(!onlyNumber(bDiscount.getText())){
            bDiscount.setText("");
            bDiscount.requestFocus();
        }
    }//GEN-LAST:event_bDiscountKeyReleased

    private void bStockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bStockKeyReleased
        // TODO add your handling code here:
        if(!onlyNumber(bStock.getText())){
            bStock.setText("");
            bStock.requestFocus();
        }
    }//GEN-LAST:event_bStockKeyReleased

    private void bPagesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bPagesKeyReleased
        // TODO add your handling code here:
        if(!onlyNumber(bPages.getText())){
            bPages.setText("");
            bPages.requestFocus();
        }
    }//GEN-LAST:event_bPagesKeyReleased

    private void bPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bPriceKeyReleased
        // TODO add your handling code here:
        if(!onlyNumber(bPrice.getText())){
            bPrice.setText("");
            bPrice.requestFocus();
        }
    }//GEN-LAST:event_bPriceKeyReleased

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
        if(bID.getText().equals("") || bName.getText().equals("") || bSize.getText().equals("") || bDate.getText().equals("") ||
            bCover.getText().equals("") || bAuthor.getText().equals("") || bDiscount.getText().equals("") || bUrl.getText().equals("") ||
            bStock.getText().equals("") || bIssuer.getText().equals("") || bSupplier.getText().equals("") || bPages.getText().equals("") ||
            bPrice.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ thông tin!!");
        }
        else if(Integer.parseInt(bPrice.getText()) < 1000){
            JOptionPane.showMessageDialog(rootPane, "Giá ít nhất phải lớn hơn hoặc bằng 1000!!");
        }
        else if(Integer.parseInt(bStock.getText()) < 0){
            JOptionPane.showMessageDialog(rootPane, "Kho ít nhất là 0!!");
        }
        else if(Float.parseFloat(bDiscount.getText()) < 0){
            JOptionPane.showMessageDialog(rootPane, "Giảm giá ít nhất là 0!!");
        }
        else {
            String trans = bTrans.getText();
            String detail = bDetail.getText();
            String maSP = bID.getText();
            String ten = bName.getText();
            String kichCo = bSize.getText();
            String ngay = bDate.getText();
            int kho = Integer.parseInt(bStock.getText());
            String bia = bCover.getText();
            String tacGia = bAuthor.getText();
            Float giamGia = Float.parseFloat(bDiscount.getText());
            String url = bUrl.getText();
            String nhaXB = bIssuer.getText();
            String nhaPH = bSupplier.getText();
            int trang = Integer.parseInt(bPages.getText());
            int gia = Integer.parseInt(bPrice.getText());
            if(trans.equals(""))
            trans  = null;
            if(detail.equals(""))
            detail = "Sách không có mô tả!";
            
            List<Object> data = new LinkedList<>();
            data.add(maSP);
            data.add(ten);
            data.add(tacGia);
            data.add(kichCo);
            data.add((String) bCate.getSelectedItem());
            data.add(bia);
            data.add(ngay);
            data.add(detail);
            data.add(giamGia);
            data.add(url);
            data.add(kho);
            data.add(nhaXB);
            data.add(trang);
            data.add(gia);
            data.add(nhaPH);
            data.add(trans);
            data.add(this.choosenSp);
            List<String> column = qlsp.getColumns();
            List<String> conditionColumn = new LinkedList<>();
            conditionColumn.add("id");
            int check = qlsp.Update(data, column, conditionColumn);
            if(check == 1){
                JOptionPane.showMessageDialog(rootPane, "Sửa sản phẩm thành công!!");
                this.dispose();
            }
            else if(check == 2){
                JOptionPane.showMessageDialog(rootPane, "Trùng mã sản phẩm!!");
                bID.requestFocus();
                bID.setText("");
            }
            else JOptionPane.showMessageDialog(rootPane, "Lỗi hệ thống!!");
        }
    }//GEN-LAST:event_updateMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        // TODO add your handling code here:
        int reply = JOptionPane.showConfirmDialog(getRootPane(),
            "Bạn có chắc muốn thoát không?", "Xác nhận",
            JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_cancelMouseClicked

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
            java.util.logging.Logger.getLogger(CapNhatSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapNhatSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapNhatSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapNhatSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CapNhatSach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bAuthor;
    private javax.swing.JComboBox<String> bCate;
    private javax.swing.JTextField bCover;
    private javax.swing.JTextField bDate;
    private javax.swing.JTextArea bDetail;
    private javax.swing.JTextField bDiscount;
    private javax.swing.JTextField bID;
    private javax.swing.JTextField bIssuer;
    private javax.swing.JTextField bName;
    private javax.swing.JTextField bPages;
    private javax.swing.JTextField bPrice;
    private javax.swing.JTextField bSize;
    private javax.swing.JTextField bStock;
    private javax.swing.JTextField bSupplier;
    private javax.swing.JTextField bTrans;
    private javax.swing.JTextField bUrl;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel update;
    // End of variables declaration//GEN-END:variables
}
