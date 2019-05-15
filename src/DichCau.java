
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.Timer;

public class DichCau extends javax.swing.JFrame implements ActionListener{
    DictionaryApplication dic= new DictionaryApplication();
    DefaultTableModel model= new DefaultTableModel();
    ArrayList<Word> word= new ArrayList();
    DictionaryExportToFile dictionfile= new DictionaryExportToFile();
    private static final String VOICENAME="mbrola_us2";
    
    /**
     * HienThiTatCaCacTu() hàm khởi tạo
     */
    public DichCau(){
        word= dictionfile.docFile();
        initComponents();
        nutquaylai.addActionListener(this);
    }
    
    /**
     * Code tự sinh ra từ việc kéo thả
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nutquaylai = new javax.swing.JButton();
        nhapnhay = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dich1 = new javax.swing.JTextArea();
        loa = new javax.swing.JButton();
        nhandich1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dich2 = new javax.swing.JTextArea();
        loa1 = new javax.swing.JButton();
        nhandich2 = new javax.swing.JLabel();
        nutdich = new javax.swing.JButton();
        chuyenev = new javax.swing.JToggleButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dịch đoạn văn bản");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        nutquaylai.setFont(new java.awt.Font("Wide Latin", 1, 15)); // NOI18N
        nutquaylai.setForeground(new java.awt.Color(0, 255, 51));
        nutquaylai.setContentAreaFilled(false);

        nhapnhay.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nhapnhay.setForeground(new java.awt.Color(255, 255, 255));
        nhapnhay.setText("Chú ý kết nối mạng");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nutquaylai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nhapnhay)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nutquaylai, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(nhapnhay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try {
            BufferedImage image = ImageIO.read(new File("iconreturn.png"));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(32, 32, image.SCALE_SMOOTH));
            nutquaylai.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        dich1.setColumns(20);
        dich1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        dich1.setForeground(new java.awt.Color(0, 102, 0));
        dich1.setLineWrap(true);
        dich1.setRows(5);
        dich1.setWrapStyleWord(true);
        dich1.setBorder(null);
        dich1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dich1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(dich1);

        loa.setBorder(null);
        loa.setContentAreaFilled(false);
        loa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loaActionPerformed(evt);
            }
        });

        nhandich1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nhandich1.setForeground(new java.awt.Color(0, 153, 0));
        nhandich1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nhandich1.setText("Auto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(loa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nhandich1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loa, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhandich1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try {
            BufferedImage image = ImageIO.read(new File("iconloargb.png"));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(30, 15, image.SCALE_SMOOTH));
            loa.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        dich2.setColumns(20);
        dich2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        dich2.setForeground(new java.awt.Color(0, 51, 51));
        dich2.setLineWrap(true);
        dich2.setRows(5);
        dich2.setWrapStyleWord(true);
        jScrollPane3.setViewportView(dich2);

        loa1.setBorder(null);
        loa1.setContentAreaFilled(false);
        loa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loa1ActionPerformed(evt);
            }
        });

        nhandich2.setBackground(new java.awt.Color(255, 255, 255));
        nhandich2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nhandich2.setForeground(new java.awt.Color(0, 51, 51));
        nhandich2.setText("Vietnamese");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(nhandich2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loa1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loa1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhandich2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        try {
            BufferedImage image = ImageIO.read(new File("iconloargb.png"));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(30, 15, image.SCALE_SMOOTH));
            loa1.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }

        nutdich.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nutdich.setForeground(new java.awt.Color(255, 255, 255));
        nutdich.setContentAreaFilled(false);
        nutdich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutdichActionPerformed(evt);
            }
        });

        chuyenev.setContentAreaFilled(false);
        chuyenev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chuyenevActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nutdich, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(chuyenev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(chuyenev, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nutdich, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try {
            BufferedImage image = ImageIO.read(new File("icondich.png"));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(35, 35, image.SCALE_SMOOTH));
            nutdich.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            BufferedImage image = ImageIO.read(new File("swap.png"));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(35, 35, image.SCALE_SMOOTH));
            chuyenev.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }

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

    private void nutdichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutdichActionPerformed
        if(dich1.getText().length() != 0){
            if(chuyenev.isSelected()){
                String text= dich1.getText();
                // gọi GoogleTranslate
                GoogleTranslate gg= new GoogleTranslate();
                try {
                    String str= gg.translate("en", text).toString();
                    String stt= str.substring(0, 1).toUpperCase();
                    String sss= str.substring(1, str.length());
                    dich2.setText(""+(stt)+""+(sss)+"");

                } catch (Exception ex) {
                    Logger.getLogger(DichCau.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else {
                String text= dich1.getText();
                // gọi GoogleTranslate
                GoogleTranslate gg= new GoogleTranslate();
                try {
                    String str= gg.translate("vi", text).toString();
                    String stt= str.substring(0, 1).toUpperCase();
                    String sss= str.substring(1, str.length());
                    dich2.setText(""+(stt)+""+(sss)+"");

                } catch (Exception ex) {
                    Logger.getLogger(DichCau.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Nhập đoạn văn bản cần dịch !!!");
        }
    }//GEN-LAST:event_nutdichActionPerformed
/**
 * Bắt sự kiện cho nút loa1
 * Đọc từ khi click
 * @param evt 
 */
    private void loa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loa1ActionPerformed
        System.setProperty("mbrola.base", ".\\mbrola");
        VoiceManager voiceManager=VoiceManager.getInstance();
        Voice voice;
        voice= voiceManager.getVoice(VOICENAME);
        voice.allocate();
        try{
            voice.speak(dich2.getText());
        }
        catch(Exception e1){
            JOptionPane.showConfirmDialog(null, "Failed !");
        }
    }//GEN-LAST:event_loa1ActionPerformed
/**
 * Bắt sự kiện cho nút Loa
 * Đọc từ khi click
 * @param evt 
 */
    private void loaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loaActionPerformed
        System.setProperty("mbrola.base", ".\\mbrola");
        VoiceManager voiceManager=VoiceManager.getInstance();
        Voice voice;
        voice= voiceManager.getVoice(VOICENAME);
        voice.allocate();
        try{
            voice.speak(dich1.getText());
        }
        catch(Exception e1){
            JOptionPane.showConfirmDialog(null, "Failed !");
        }
    }//GEN-LAST:event_loaActionPerformed
/**
 * Nhập đoạn văn cần tra cứu
 * Hiển thị đoạn dịch vào TextArea bên cạnh
 * @param evt 
 */
    private void dich1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dich1KeyReleased
        if(dich1.getText().length() != 0){
            if(chuyenev.isSelected()){
                String text= dich1.getText();
                GoogleTranslate gg= new GoogleTranslate();
                try {
                    String str= gg.translate("en", text).toString();
                    String stt= str.substring(0, 1).toUpperCase();
                    String sss= str.substring(1, str.length());
                    dich2.setText(""+(stt)+""+(sss)+"");

                } catch (Exception ex) {
                    Logger.getLogger(DichCau.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else {
                String text= dich1.getText();
                GoogleTranslate gg= new GoogleTranslate();
                try {
                    String str= gg.translate("vi", text).toString();
                    String stt= str.substring(0, 1).toUpperCase();
                    String sss= str.substring(1, str.length());
                    dich2.setText(""+(stt)+""+(sss)+"");

                } catch (Exception ex) {
                    Logger.getLogger(DichCau.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        else {
        }
        if(dich2.getText().length()!= 0){
            nhapnhay.setText("");
        }
    }//GEN-LAST:event_dich1KeyReleased
/**
 * Chuyển ngôn ngữ dịch
 * @param evt 
 */
    private void chuyenevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chuyenevActionPerformed
        if(chuyenev.isSelected()){
            nhandich1.setText("Auto");
            nhandich2.setText("English");
        }
        else {
            nhandich2.setText("Vietnamese");
            nhandich1.setText("Auto");
        }
        dich2.setText("");
    }//GEN-LAST:event_chuyenevActionPerformed
/**
 * Main
 * @param args 
 */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DichCau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DichCau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DichCau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DichCau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DichCau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton chuyenev;
    private javax.swing.JTextArea dich1;
    private javax.swing.JTextArea dich2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton loa;
    private javax.swing.JButton loa1;
    private javax.swing.JLabel nhandich1;
    private javax.swing.JLabel nhandich2;
    private javax.swing.JLabel nhapnhay;
    private javax.swing.JButton nutdich;
    private javax.swing.JButton nutquaylai;
    // End of variables declaration//GEN-END:variables
/**
 * bắt sự kiện cho nút quay lại
 * @param e 
 */
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
