
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
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
import java.util.Collection;
import java.util.Collections;

public class TuDaTra extends javax.swing.JFrame implements ActionListener{

    ArrayList<TuVuaTra> tuVuaTra= new ArrayList();
    DefaultTableModel model= new DefaultTableModel();
    DictionaryExportToFile dicEx= new DictionaryExportToFile();
    DictionaryExportToFileTuDaTra docghi= new DictionaryExportToFileTuDaTra();
    private static final String VOICENAME="mbrola_us2";
    
    public TuDaTra() {
        tuVuaTra= docghi.docFile();
        initComponents();
        quaylai.addActionListener(this);
        model = (DefaultTableModel) bang.getModel();
        addData();
        autoDel();
        defaut();
    }
    
    public void defaut(){
        tutienganh.setText("Hello");
        phatam.setText("/hɛ.ˈloʊ̯/");
        tutiengviet.setText("Xin chào");
    }
        
    public void addDataVE(){
        model.setRowCount(0);
        for(TuVuaTra i: tuVuaTra){
            TuVuaTra tt = (TuVuaTra) i;
            model.addRow(new Object[]{
                tt.getTiengviet()
            });
        }
    }
    
    public void addData(){
        model.setRowCount(0);
        for(TuVuaTra i: tuVuaTra){
            TuVuaTra tt = (TuVuaTra) i;
            model.addRow(new Object[]{
                tt.getTumoi()
            });
        }
    }
    
    public void autoDel(){
        int row= model.getRowCount();
        if(row> 300){
            tuVuaTra.removeAll(tuVuaTra);
            docghi.ghiFile(tuVuaTra);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        chuyenev = new javax.swing.JToggleButton();
        nhaptimkiem = new javax.swing.JTextField();
        nuttimkiem = new javax.swing.JButton();
        quaylai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bang = new javax.swing.JTable();
        amthanh = new javax.swing.JButton();
        tutienganh = new javax.swing.JLabel();
        phatam = new javax.swing.JLabel();
        tutiengviet = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        chuyenev.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        chuyenev.setBorder(null);
        chuyenev.setContentAreaFilled(false);
        chuyenev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chuyenevActionPerformed(evt);
            }
        });

        nhaptimkiem.setBackground(new java.awt.Color(51, 51, 255));
        nhaptimkiem.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nhaptimkiem.setForeground(new java.awt.Color(255, 255, 255));
        nhaptimkiem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        nuttimkiem.setContentAreaFilled(false);
        nuttimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuttimkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chuyenev, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nhaptimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nuttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(chuyenev, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(nhaptimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(nuttimkiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        try {
            BufferedImage image = ImageIO.read(new File("EV.png"));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(42, 42, image.SCALE_SMOOTH));
            chuyenev.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            BufferedImage image = ImageIO.read(new File("icontimkiem.png"));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(45, 45, image.SCALE_SMOOTH));
            nuttimkiem.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }

        quaylai.setBorder(null);
        quaylai.setContentAreaFilled(false);
        quaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quaylaiActionPerformed(evt);
            }
        });

        bang.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bang.setForeground(new java.awt.Color(0, 51, 51));
        bang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bang.setGridColor(new java.awt.Color(255, 255, 255));
        bang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bangMouseClicked(evt);
            }
        });
        bang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bangKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(bang);
        if (bang.getColumnModel().getColumnCount() > 0) {
            bang.getColumnModel().getColumn(0).setResizable(false);
        }

        amthanh.setBorder(null);
        amthanh.setContentAreaFilled(false);
        amthanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amthanhActionPerformed(evt);
            }
        });

        tutienganh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tutienganh.setForeground(new java.awt.Color(0, 153, 0));
        tutienganh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        phatam.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        phatam.setForeground(new java.awt.Color(0, 51, 255));
        phatam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tutiengviet.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        tutiengviet.setForeground(new java.awt.Color(0, 102, 204));
        tutiengviet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(amthanh, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(quaylai, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tutiengviet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tutienganh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phatam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tutienganh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phatam, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tutiengviet, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quaylai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amthanh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        try {
            BufferedImage image = ImageIO.read(new File("iconreturn.png"));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(38, 38, image.SCALE_SMOOTH));
            quaylai.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            BufferedImage image = ImageIO.read(new File("iconloa.png"));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(38, 38, image.SCALE_SMOOTH));
            amthanh.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chuyenevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chuyenevActionPerformed
        if(chuyenev.isSelected()){
            try {
                BufferedImage image = ImageIO.read(new File("VE.png"));
                ImageIcon icon = new ImageIcon(image.getScaledInstance(42, 42, image.SCALE_SMOOTH));
                chuyenev.setIcon(icon);
                addDataVE();
            } catch (IOException ex) {
                Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            try {
                BufferedImage image = ImageIO.read(new File("EV.png"));
                ImageIcon icon = new ImageIcon(image.getScaledInstance(42, 42, image.SCALE_SMOOTH));
                chuyenev.setIcon(icon);
                addData();
            } catch (IOException ex) {
                Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_chuyenevActionPerformed

    private void quaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quaylaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quaylaiActionPerformed

    private void nuttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuttimkiemActionPerformed
        if(tuVuaTra.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Danh sách trống !!!");
        }
        else{
                if(nhaptimkiem.getText().length()== 0){
                        JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập để tìm kiếm !!!");
                    }
                else{
                    if(chuyenev.isSelected()){
                    model.setRowCount(0);
                    for(TuVuaTra i: tuVuaTra){
                            TuVuaTra tt = (TuVuaTra) i;
                            if(tt.getTiengviet().toUpperCase().matches(".*"+(nhaptimkiem.getText().toUpperCase())+".*")){
                                model.addRow(new Object[]{
                                tt.getTiengviet()
                            });
                        }
                    }
                }
                else {
                    model.setRowCount(0);
                    for(TuVuaTra i: tuVuaTra){
                        TuVuaTra tt = (TuVuaTra) i;
                        if(tt.getTumoi().toUpperCase().matches(".*"+(nhaptimkiem.getText().toUpperCase())+".*")){
                            model.addRow(new Object[]{
                                tt.getTumoi()
                            });
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_nuttimkiemActionPerformed

    private void bangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bangMouseClicked
        int row = bang.getSelectedRow();
        for(TuVuaTra i: tuVuaTra){
                TuVuaTra tt = (TuVuaTra) i;
                if(tt.getTumoi().toUpperCase().matches(".*"+(bang.getValueAt(row, 0).toString().toUpperCase())+".*") ||
                    tt.getTiengviet().toUpperCase().matches(".*"+(bang.getValueAt(row, 0).toString().toUpperCase())+".*")
                        ){
                    tutienganh.setText(tt.getTumoi());
                    phatam.setText(tt.getPhienam());
                    tutiengviet.setText(tt.getTiengviet());
                }
        }
    }//GEN-LAST:event_bangMouseClicked

    private void bangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bangKeyTyped
        int row = bang.getSelectedRow();
        for(TuVuaTra i: tuVuaTra){
                TuVuaTra tt = (TuVuaTra) i;
                if(tt.getTumoi().toUpperCase().matches(".*"+(bang.getValueAt(row, 0).toString().toUpperCase())+".*") ||
                    tt.getTiengviet().toUpperCase().matches(".*"+(bang.getValueAt(row, 0).toString().toUpperCase())+".*")
                        ){
                    tutienganh.setText(tt.getTumoi());
                    phatam.setText(tt.getPhienam());
                    tutiengviet.setText(tt.getTiengviet());
                }
        }
    }//GEN-LAST:event_bangKeyTyped

    private void amthanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amthanhActionPerformed
        System.setProperty("mbrola.base", ".\\mbrola");
        VoiceManager voiceManager=VoiceManager.getInstance();
        Voice voice;
        voice= voiceManager.getVoice(VOICENAME);
        voice.allocate();
        try{				
            voice.speak(tutienganh.getText());			
        }
        catch(Exception e1){
            JOptionPane.showConfirmDialog(null, "Failed !");
        }
    }//GEN-LAST:event_amthanhActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TuDaTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TuDaTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TuDaTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TuDaTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TuDaTra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton amthanh;
    private javax.swing.JTable bang;
    private javax.swing.JToggleButton chuyenev;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nhaptimkiem;
    private javax.swing.JButton nuttimkiem;
    private javax.swing.JLabel phatam;
    private javax.swing.JButton quaylai;
    private javax.swing.JLabel tutienganh;
    private javax.swing.JLabel tutiengviet;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(quaylai)){
            dictionaryApplication();
        }
    }
    public void dictionaryApplication(){
        new DictionaryApplication().setVisible(true);
        this.dispose();
    }
}
