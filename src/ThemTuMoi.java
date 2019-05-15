
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.image.BufferedImage;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ThemTuMoi extends javax.swing.JFrame implements ActionListener{
    
    ArrayList<Word> arrayList= new ArrayList();
    DictionaryExportToFile dicEx= new DictionaryExportToFile();
    
    public ThemTuMoi() {
        arrayList= dicEx.docFile();
        initComponents();
        nutquaylaithem.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nutquaylaithem = new javax.swing.JButton();
        nutthem = new javax.swing.JButton();
        nuthuy = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        nhaptienganh = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        nhapphienam = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        nhaptiengviet = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm từ mới");

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        nutquaylaithem.setFont(new java.awt.Font("Wide Latin", 1, 15)); // NOI18N
        nutquaylaithem.setForeground(new java.awt.Color(0, 255, 0));
        nutquaylaithem.setToolTipText("Quay lại");
        nutquaylaithem.setBorder(null);
        nutquaylaithem.setContentAreaFilled(false);

        nutthem.setFont(new java.awt.Font("Wide Latin", 1, 15)); // NOI18N
        nutthem.setForeground(new java.awt.Color(0, 255, 0));
        nutthem.setToolTipText("Thêm");
        nutthem.setBorder(null);
        nutthem.setContentAreaFilled(false);
        nutthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutthemActionPerformed(evt);
            }
        });

        nuthuy.setFont(new java.awt.Font("Wide Latin", 1, 15)); // NOI18N
        nuthuy.setForeground(new java.awt.Color(0, 255, 0));
        nuthuy.setToolTipText("Hủy");
        nuthuy.setBorder(null);
        nuthuy.setContentAreaFilled(false);
        nuthuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuthuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nutquaylaithem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284)
                .addComponent(nuthuy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nutthem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nuthuy, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(nutquaylaithem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nutthem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try {
            BufferedImage image = ImageIO.read(new File("iconreturn.png"));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(28, 28, image.SCALE_SMOOTH));
            nutquaylaithem.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            BufferedImage image = ImageIO.read(new File("iconthem.png"));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(26, 26, image.SCALE_SMOOTH));
            nutthem.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            BufferedImage image = ImageIO.read(new File("iconhuy.png"));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(28, 28, image.SCALE_SMOOTH));
            nuthuy.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        nhaptienganh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nhaptienganh.setForeground(new java.awt.Color(0, 51, 51));
        nhaptienganh.setText("Nhập từ tiếng Anh...");
        nhaptienganh.setToolTipText("Nhập từ tiếng Anh...");
        nhaptienganh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 51, 51)));
        nhaptienganh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nhaptienganhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nhaptienganh)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nhaptienganh, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        nhapphienam.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nhapphienam.setForeground(new java.awt.Color(0, 51, 51));
        nhapphienam.setText("Nhập phiên âm...");
        nhapphienam.setToolTipText("Nhập phiên âm...");
        nhapphienam.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 51, 51)));
        nhapphienam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nhapphienamMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nhapphienam)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nhapphienam, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        nhaptiengviet.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nhaptiengviet.setForeground(new java.awt.Color(0, 51, 51));
        nhaptiengviet.setText("Nhập nghĩa tiếng Việt...");
        nhaptiengviet.setToolTipText("Nhập nghĩa tiếng Việt...");
        nhaptiengviet.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 51, 51)));
        nhaptiengviet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nhaptiengvietMouseClicked(evt);
            }
        });
        nhaptiengviet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhaptiengvietActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nhaptiengviet)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nhaptiengviet, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nutthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutthemActionPerformed
        Word wor= new Word();
        if(arrayList.isEmpty()){
                wor.setWord_target(nhaptienganh.getText());
                wor.setSpelling(nhapphienam.getText());
                wor.setWord_explain(nhaptiengviet.getText());
                arrayList.add(wor);
                dicEx.ghiFile(arrayList);
                JOptionPane.showMessageDialog(rootPane, "Từ bạn vừa thêm là :\n"+(nhaptienganh.getText())+"\n"+(nhapphienam.getText())+"\n"+(nhaptiengviet.getText())+"\nVui lòng kiểm tra lại, nếu sai quay ra trang sửa !");
            }
        else {
            String dong= "";
            Word worr= new Word();
            for(Word i: arrayList){
                Word w  = (Word) i;
                if(nhaptienganh.getText().toUpperCase().matches(w.getWord_target().toUpperCase())){
                    int n= JOptionPane.showConfirmDialog(rootPane, "Từ bạn vừa nhập bị trùng, bạn có muốn thay thế không ???", "Chú ý !!!", WIDTH);
                    dong= "n";
                    if(n== JOptionPane.YES_OPTION){
                        w.word_target= nhaptienganh.getText();
                        w.spelling= nhapphienam.getText();
                        w.word_explain= nhaptiengviet.getText();
                        dicEx.ghiFile(arrayList);
                        JOptionPane.showMessageDialog(rootPane, "Từ bạn vừa thay thế là :\n"+(nhaptienganh.getText())+"\n"+(nhapphienam.getText())+"\n"+(nhaptiengviet.getText())+"\nVui lòng kiểm tra lại, nếu sai quay ra trang sửa !");
                    }
                    break;
                }
                else{
                        dong= "m";
                        worr.setWord_target(nhaptienganh.getText());
                        worr.setSpelling(nhapphienam.getText());
                        worr.setWord_explain(nhaptiengviet.getText());
                    }
            }
            if(dong== "m"){
                if(nhaptienganh.getText().length()== 0 || nhaptiengviet.getText().length()== 0 ||
                    nhapphienam.getText().length()== 0){
                JOptionPane.showMessageDialog(rootPane, "Nhập đầy đủ thông tin !!!");
                }
                else{
                    arrayList.add(worr);
                    dicEx.ghiFile(arrayList);
                    JOptionPane.showMessageDialog(rootPane, "Từ bạn vừa thêm là :\n"+(nhaptienganh.getText())+"\n"+(nhapphienam.getText())+"\n"+(nhaptiengviet.getText())+"\nVui lòng kiểm tra lại, nếu sai quay ra trang sửa !");
                }
            }
            else if(dong !="m"){}
        }
        
        nhaptienganh.setText("Nhập từ tiếng Anh...");
        nhapphienam.setText("Nhập phiên âm...");
        nhaptiengviet.setText("Nhập nghĩa tiếng Việt...");
    }//GEN-LAST:event_nutthemActionPerformed

    private void nhaptienganhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nhaptienganhMouseClicked
        nhaptienganh.setText("");
    }//GEN-LAST:event_nhaptienganhMouseClicked

    private void nhapphienamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nhapphienamMouseClicked
        nhapphienam.setText("");
    }//GEN-LAST:event_nhapphienamMouseClicked

    private void nhaptiengvietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nhaptiengvietMouseClicked
        nhaptiengviet.setText("");
    }//GEN-LAST:event_nhaptiengvietMouseClicked

    private void nuthuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuthuyActionPerformed
        nhaptienganh.setText("Nhập từ tiếng Anh...");
        nhapphienam.setText("Nhập phiên âm...");
        nhaptiengviet.setText("Nhập nghĩa tiếng Việt...");
    }//GEN-LAST:event_nuthuyActionPerformed

    private void nhaptiengvietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhaptiengvietActionPerformed
        
    }//GEN-LAST:event_nhaptiengvietActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThemTuMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemTuMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemTuMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemTuMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemTuMoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField nhapphienam;
    private javax.swing.JTextField nhaptienganh;
    private javax.swing.JTextField nhaptiengviet;
    private javax.swing.JButton nuthuy;
    private javax.swing.JButton nutquaylaithem;
    private javax.swing.JButton nutthem;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(nutquaylaithem)){
            dictionaryApplication();
        }
    }
    public void dictionaryApplication(){
        new DictionaryApplication().setVisible(true);
        this.dispose();
    }
}
