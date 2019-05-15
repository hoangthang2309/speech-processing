import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ChinhSuaTu extends javax.swing.JFrame implements ActionListener{
    ArrayList<Word> arrayList= new ArrayList();
    DefaultTableModel model= new DefaultTableModel();
    DictionaryExportToFile dicEx= new DictionaryExportToFile();
    
    public ChinhSuaTu() {
        arrayList= dicEx.docFile();
        initComponents();
        nutluu.addActionListener(this);
        nutquaylai.addActionListener(this);
        model = (DefaultTableModel) bang.getModel();
        addData();
        pan1.setVisible(false);
    }
    
    public void addData(){
        for(Word i: arrayList){
            Word w = (Word) i;
            model.addRow(new Object[]{
                w.getWord_target(),
                w.getSpelling(),
                w.getWord_explain()
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nhaptusua = new javax.swing.JTextField();
        nuttim = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bang = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        nutxoa = new javax.swing.JButton();
        nutsua = new javax.swing.JButton();
        nutluu = new javax.swing.JButton();
        nutquaylai = new javax.swing.JButton();
        pan1 = new javax.swing.JPanel();
        nhaptienganh = new javax.swing.JTextField();
        nhapphienam = new javax.swing.JTextField();
        nhaptiengviet = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        nhaptusua.setBackground(new java.awt.Color(51, 51, 255));
        nhaptusua.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nhaptusua.setForeground(new java.awt.Color(255, 255, 255));
        nhaptusua.setText("Nhập từ cần tìm để chỉnh sửa...");
        nhaptusua.setToolTipText("Nhập từ cần tìm để chỉnh sửa...");
        nhaptusua.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        nhaptusua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nhaptusuaMouseClicked(evt);
            }
        });

        nuttim.setBorder(null);
        nuttim.setContentAreaFilled(false);
        nuttim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuttimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nhaptusua, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nuttim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nuttim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(nhaptusua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try {
            BufferedImage image = ImageIO.read(new File("icontimkiem.png"));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(40, 40, image.SCALE_SMOOTH));
            nuttim.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }

        bang.setBorder(new javax.swing.border.MatteBorder(null));
        bang.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bang.setForeground(new java.awt.Color(0, 51, 51));
        bang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bang.setToolTipText("Danh sách từ mới đã thêm");
        jScrollPane1.setViewportView(bang);
        if (bang.getColumnModel().getColumnCount() > 0) {
            bang.getColumnModel().getColumn(0).setResizable(false);
            bang.getColumnModel().getColumn(1).setResizable(false);
            bang.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        nutxoa.setToolTipText("Xóa từ mới");
        nutxoa.setBorder(null);
        nutxoa.setContentAreaFilled(false);
        nutxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutxoaActionPerformed(evt);
            }
        });

        nutsua.setToolTipText("Sửa từ mới");
        nutsua.setBorder(null);
        nutsua.setContentAreaFilled(false);
        nutsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutsuaActionPerformed(evt);
            }
        });

        nutluu.setToolTipText("Lưu từ mới");
        nutluu.setBorder(null);
        nutluu.setContentAreaFilled(false);
        nutluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutluuActionPerformed(evt);
            }
        });

        nutquaylai.setToolTipText("Quay lại");
        nutquaylai.setBorder(null);
        nutquaylai.setContentAreaFilled(false);
        nutquaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutquaylaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nutxoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nutsua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nutluu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nutquaylai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nutxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nutsua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nutluu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nutquaylai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        try {
            BufferedImage image = ImageIO.read(new File("iconxoa.png"));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(38, 38, image.SCALE_SMOOTH));
            nutxoa.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            BufferedImage image = ImageIO.read(new File("iconedit.png"));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(38, 38, image.SCALE_SMOOTH));
            nutsua.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            BufferedImage image = ImageIO.read(new File("iconluu.png"));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(38, 38, image.SCALE_SMOOTH));
            nutluu.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            BufferedImage image = ImageIO.read(new File("iconreturn.png"));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(38, 38, image.SCALE_SMOOTH));
            nutquaylai.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }

        pan1.setBackground(new java.awt.Color(255, 255, 255));

        nhaptienganh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nhaptienganh.setForeground(new java.awt.Color(0, 51, 51));
        nhaptienganh.setToolTipText("Nhập từ tiếng Anh...");
        nhaptienganh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 51, 51)));
        nhaptienganh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nhaptienganhMouseClicked(evt);
            }
        });

        nhapphienam.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nhapphienam.setForeground(new java.awt.Color(0, 51, 51));
        nhapphienam.setToolTipText("Nhập phiên âm...");
        nhapphienam.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 51, 51)));

        nhaptiengviet.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nhaptiengviet.setForeground(new java.awt.Color(0, 51, 51));
        nhaptiengviet.setToolTipText("Nhập nghĩa tiếng Việt...");
        nhaptiengviet.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 51, 51)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("English :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Spell :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Vietnamese:");

        javax.swing.GroupLayout pan1Layout = new javax.swing.GroupLayout(pan1);
        pan1.setLayout(pan1Layout);
        pan1Layout.setHorizontalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nhapphienam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(nhaptienganh, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nhaptiengviet))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        pan1Layout.setVerticalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nhaptienganh)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nhapphienam)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan1Layout.createSequentialGroup()
                        .addComponent(nhaptiengviet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nutluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutluuActionPerformed
        int r = bang.getSelectedRow();
        if(nhaptienganh.getText().length()== 0 || nhapphienam.getText().length()== 0 ||
            nhaptiengviet.getText().length()== 0){
                JOptionPane.showMessageDialog(rootPane, "Nhập đầy đủ !!!");
            }
        else{
            int dem= 0;
            Word wor= new Word();
            if(nhaptienganh.getText().toUpperCase().matches(bang.getValueAt(r, 0).toString().toUpperCase())){
                wor.setWord_target(nhaptienganh.getText());
                wor.setSpelling(nhapphienam.getText());
                wor.setWord_explain(nhaptiengviet.getText());
                arrayList.add(wor);
                model.removeRow(r);
                arrayList.remove(r);
                dicEx.ghiFile(arrayList);
                model.setRowCount(0);
                addData();
                pan1.setVisible(false);
            }
            else {
                for(Word i: arrayList){
                    Word w  = (Word) i;
                    if(w.getWord_target().toUpperCase().matches(".*"+(nhaptienganh.getText().toUpperCase())+".*")){
                        int n= JOptionPane.showConfirmDialog(rootPane, "Từ bạn vừa nhập bị trùng, bạn có muốn thay thế không ???", "Chú ý !!!", WIDTH);
                        dem= 10;
                        if(n== JOptionPane.YES_OPTION){
                            w.word_target= nhaptienganh.getText();
                            w.spelling= nhapphienam.getText();
                            w.word_explain= nhaptiengviet.getText();
                            dicEx.ghiFile(arrayList);
                            model.setRowCount(0);
                            addData();
                            break;
                        }
                    }
                    else {
                        dem= 1;
                        wor.setWord_target(nhaptienganh.getText());
                        wor.setSpelling(nhapphienam.getText());
                        wor.setWord_explain(nhaptiengviet.getText());
                    }
                }
                if(dem == 1){
                    arrayList.add(wor);
                    model.removeRow(r);
                    arrayList.remove(r);
                    dicEx.ghiFile(arrayList);
                    model.setRowCount(0);
                    addData();
                    pan1.setVisible(false);
                }
                dem= 0;
            }
            
        }
    }//GEN-LAST:event_nutluuActionPerformed

    private void nhaptusuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nhaptusuaMouseClicked
        nhaptusua.setText(""); 
    }//GEN-LAST:event_nhaptusuaMouseClicked

    private void nutxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutxoaActionPerformed
        int r = bang.getSelectedRow();
        if(r>= 0){
            model.removeRow(r);
            arrayList.remove(r);
            dicEx.ghiFile(arrayList);
            pan1.setVisible(false);
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Chọn 1 hàng để xóa !!!");
        }
    }//GEN-LAST:event_nutxoaActionPerformed

    private void nutsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsuaActionPerformed
        
        int r = bang.getSelectedRow();
        if(arrayList.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Danh sách trống !!!");
        }
        else {
            if(r >= 0){
            pan1.setVisible(true);
            nhaptienganh.setText(model.getValueAt(r, 0).toString());
            nhapphienam.setText(model.getValueAt(r, 1).toString());
            nhaptiengviet.setText(model.getValueAt(r, 2).toString());
            }
            else JOptionPane.showMessageDialog(rootPane, "Chọn thông tin để sửa !!!");
        }
    }//GEN-LAST:event_nutsuaActionPerformed

    private void nutquaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutquaylaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nutquaylaiActionPerformed

    private void nhaptienganhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nhaptienganhMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nhaptienganhMouseClicked

    private void nuttimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuttimActionPerformed
        if(arrayList.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Danh sách trống !!!");
        }
        else{
            if(nhaptusua.getText().length()== 0){
                    JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập để tìm kiếm !!!");
                }
            else{
                model.setRowCount(0);
                for(Word i: arrayList){
                    Word w  = (Word) i;
                    if(w.getWord_explain().toUpperCase().matches(".*"+(nhaptusua.getText().toUpperCase())+".*")
                            || w.getWord_target().toUpperCase().matches(".*"+(nhaptusua.getText().toUpperCase())+".*")
                            ){
                        model.addRow(new Object[]{
                            w.getWord_target(),
                            w.getSpelling(),
                            w.getWord_explain()
                        });
                    }
                }
            }
        }
    }//GEN-LAST:event_nuttimActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChinhSuaTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChinhSuaTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChinhSuaTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChinhSuaTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChinhSuaTu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nhapphienam;
    private javax.swing.JTextField nhaptienganh;
    private javax.swing.JTextField nhaptiengviet;
    private javax.swing.JTextField nhaptusua;
    private javax.swing.JButton nutluu;
    private javax.swing.JButton nutquaylai;
    private javax.swing.JButton nutsua;
    private javax.swing.JButton nuttim;
    private javax.swing.JButton nutxoa;
    private javax.swing.JPanel pan1;
    // End of variables declaration//GEN-END:variables

     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(nutquaylai)){
            dictionaryApplication();
        }
    }
    public void dictionaryApplication(){
        new DictionaryApplication().setVisible(true);
        this.dispose();
    }
}
