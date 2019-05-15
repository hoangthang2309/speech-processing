
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class HienThiTimKiem extends javax.swing.JFrame implements ActionListener{

    ArrayList<Word> arrayList= new ArrayList();
    ArrayList<TuVuaTra> tuVuaTra= new ArrayList();
    DefaultTableModel model= new DefaultTableModel();
    DictionaryExportToFile dicEx= new DictionaryExportToFile();
    DictionaryExportToFileTuDaTra docghi= new DictionaryExportToFileTuDaTra();
    private static final String VOICENAME="mbrola_us2";
    
    /**
     * HienThiTimKiem() khởi tạo
     */
    public HienThiTimKiem() {
        arrayList= dicEx.docFile();
        tuVuaTra= docghi.docFile();
        initComponents();
        quaylai.addActionListener(this);
        model = (DefaultTableModel) bang.getModel();
        addData();
        defaut();
    }
    
    /**
     * defaut() tạo hiển thị mặc định cho Label
     */
    public void defaut(){
        tutienganh.setText("Hello");
        phatam.setText("/hɛ.ˈloʊ̯/");
        tutiengviet.setText("Xin chào");
    }

    /**
     * addData() truyền dữ liệu vào bảng
     */
    public void addData(){
        model.setRowCount(0);
        // Sắp xếp
        Collections.sort(arrayList, new Comparator<Word>() {
            public int compare(Word word0, Word word1) {
                return (word0.getWord_target().compareTo(word1.getWord_target()));
            }
        });
        for(Word i: arrayList){
            Word w = (Word) i;
            model.addRow(new Object[]{
                w.getWord_target()
            });
        }
    }
    /**
     * Truyền dữ liệu vào bảng
     */
    public void addDataVE(){
        model.setRowCount(0);
        for(Word i: arrayList){
            Word w = (Word) i;
            model.addRow(new Object[]{
                w.getWord_explain()
            });
        }
    }
    
    /**
     * Code tự sinh từ việc kéo thả
     */
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
        setTitle("Tra cứu");

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
        nhaptimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhaptimkiemActionPerformed(evt);
            }
        });
        nhaptimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nhaptimkiemKeyReleased(evt);
            }
        });

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
                .addComponent(nhaptimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nuttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(nhaptimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chuyenev, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(nuttimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        bang.setAutoCreateRowSorter(true);
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(amthanh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quaylai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(phatam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tutienganh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tutiengviet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amthanh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quaylai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * setImageIcon cho toggle button chuyenev
     * @param evt 
     */
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

   

    /**
     * tìm kiếm từ và hiển thị vào model
     * @param evt 
     */
    private void nuttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuttimkiemActionPerformed
        if(arrayList.isEmpty()){
            if(chuyenev.isSelected()){
                String text= nhaptimkiem.getText();
                GoogleTranslate gg= new GoogleTranslate();
                try {
                    String str= gg.translate("en", text).toString();
                    phatam.setText("/"+(str.toLowerCase())+"/");
                    String stt= str.substring(0, 1).toUpperCase();
                    String sss= str.substring(1, str.length());
                    tutienganh.setText(""+(stt)+""+(sss)+"");
                } catch (Exception ex) {
                    Logger.getLogger(DichCau.class.getName()).log(Level.SEVERE, null, ex);
                }
                String str= nhaptimkiem.getText();
                String stt= str.substring(0, 1).toUpperCase();
                String sss= str.substring(1, str.length());
                tutiengviet.setText(""+(stt)+""+(sss)+"");
            }
            else {
                String s= nhaptimkiem.getText();
                String st= s.substring(0, 1).toUpperCase();
                String ss= s.substring(1, s.length());
                tutienganh.setText(""+(st)+""+(ss)+"");
                String text= nhaptimkiem.getText();
                GoogleTranslate gg= new GoogleTranslate();
                try {
                    String str= gg.translate("vi", text).toString();
                    String stt= str.substring(0, 1).toUpperCase();
                    String sss= str.substring(1, str.length());
                    tutiengviet.setText(""+(stt)+""+(sss)+"");
                    phatam.setText("/"+(tutienganh.getText().toLowerCase())+"/");
                } catch (Exception ex) {
                    Logger.getLogger(DichCau.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else{
            int dem =0;
            if(nhaptimkiem.getText().length()== 0){
                    JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập để tìm kiếm !!!");
                }
            else{
                if(chuyenev.isSelected()){
                model.setRowCount(0);
                for(Word i: arrayList){
                    Word w  = (Word) i;
                    if(w.getWord_explain().toUpperCase().matches(".*"+(nhaptimkiem.getText().toUpperCase())+".*")){
                        model.addRow(new Object[]{
                            w.getWord_explain()
                        });
                    }
                    else {
                        dem= 1;
                    }
                }
                if(dem == 1){
                    String text= nhaptimkiem.getText();
                    GoogleTranslate gg= new GoogleTranslate();
                    try {
                        String str= gg.translate("en", text).toString();
                        phatam.setText("/"+(str.toLowerCase())+"/");
                        String stt= str.substring(0, 1).toUpperCase();
                        String sss= str.substring(1, str.length());
                        tutienganh.setText(""+(stt)+""+(sss)+"");
                    } catch (Exception ex) {
                        Logger.getLogger(DichCau.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String str= nhaptimkiem.getText();
                    String stt= str.substring(0, 1).toUpperCase();
                    String sss= str.substring(1, str.length());
                    tutiengviet.setText(""+(stt)+""+(sss)+"");
                }
                dem= 0;
            }
            else {
                model.setRowCount(0);
                for(Word i: arrayList){
                    Word w  = (Word) i;
                    if(w.getWord_target().toUpperCase().matches(".*"+(nhaptimkiem.getText().toUpperCase())+".*")){
                        model.addRow(new Object[]{
                            w.getWord_target()
                        });
                    }
                    else{
                        dem =1;
                    }
                }
                if(dem == 1){
                    int n= JOptionPane.showConfirmDialog(rootPane, "Sử dụng dữ liệu để tra Google Translate ???", "Từ không có trong từ điển !!!", WIDTH);
                    if (n==JOptionPane.YES_OPTION)
                    {
                        String s= nhaptimkiem.getText();
                        String st= s.substring(0, 1).toUpperCase();
                        String ss= s.substring(1, s.length());
                        tutienganh.setText(""+(st)+""+(ss)+"");
                        String text= nhaptimkiem.getText();
                        GoogleTranslate gg= new GoogleTranslate();
                        try {
                            String str= gg.translate("vi", text).toString();
                            String stt= str.substring(0, 1).toUpperCase();
                            String sss= str.substring(1, str.length());
                            tutiengviet.setText(""+(stt)+""+(sss)+"");
                            phatam.setText("/"+(tutienganh.getText().toLowerCase())+"/");
                        } catch (Exception ex) {
                            Logger.getLogger(DichCau.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                dem= 0;
            }
        }
            
        }
    }//GEN-LAST:event_nuttimkiemActionPerformed
/**
 * bắt sự kiện click vào dòng trên bảng
 * @param evt 
 */
    private void bangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bangMouseClicked
        int row = bang.getSelectedRow();
        for(Word i: arrayList){
            Word w  = (Word) i;
            if(w.getWord_target().toUpperCase().matches(bang.getValueAt(row, 0).toString().toUpperCase())
                    || w.getWord_explain().toUpperCase().matches(bang.getValueAt(row, 0).toString().toUpperCase())
                    ){
                tutienganh.setText(w.getWord_target());
                phatam.setText(w.getSpelling());
                tutiengviet.setText(w.getWord_explain());
            }
        }
        TuVuaTra tt= new TuVuaTra();
        if(chuyenev.isSelected()){}
        else{
            if(tuVuaTra.isEmpty()){
                tt.setTumoi(tutienganh.getText());
                tt.setPhienam(phatam.getText());
                tt.setTiengviet(tutiengviet.getText());
                tuVuaTra.add(tt);
                docghi.ghiFile(tuVuaTra);
            }
            else {
                int dem= 0;
                for(TuVuaTra i: tuVuaTra){
                    TuVuaTra ttt = (TuVuaTra) i;
                    if(tutienganh.getText().toString().toUpperCase().matches(ttt.tumoi.toUpperCase())){
                        dem= 0;
                        break;
                    }
                    else{
                        dem= 10;
                        tt.setTumoi(tutienganh.getText());
                        tt.setPhienam(phatam.getText());
                        tt.setTiengviet(tutiengviet.getText());
                    }
                }
                if(dem== 10){
                    tuVuaTra.add(tt);
                    docghi.ghiFile(tuVuaTra);
                }
            }
        }
        try {
            BufferedImage image = ImageIO.read(new File("like1.png"));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(38, 38, image.SCALE_SMOOTH));
            //nutthich.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bangMouseClicked
/**
 * tự động thêm dữ liệu vào bảng khi nhập tìm kiếm
 * @param evt 
 */
    private void nhaptimkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nhaptimkiemKeyReleased
        if(chuyenev.isSelected()){
            model.setRowCount(0);
            for(Word i: arrayList){
                Word w  = (Word) i;
                if(w.getWord_explain().toUpperCase().matches(".*"+(nhaptimkiem.getText().toUpperCase())+".*")){
                    model.addRow(new Object[]{
                        w.getWord_explain()
                    });
                }
            }
        }
        else{
                model.setRowCount(0);
                for(Word i: arrayList){
                Word w  = (Word) i;
                if(w.getWord_target().toUpperCase().matches(".*"+(nhaptimkiem.getText().toUpperCase())+".*")){
                    model.addRow(new Object[]{
                        w.getWord_target()
                    });
                }
            }
        }
    }//GEN-LAST:event_nhaptimkiemKeyReleased
/**
 * bắt sự kiện cho bảng khi click enter
 * @param evt 
 */
    private void bangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bangKeyTyped
        int row = bang.getSelectedRow();
        for(Word i: arrayList){
            Word w  = (Word) i;
            if(w.getWord_target().toUpperCase().matches(bang.getValueAt(row, 0).toString().toUpperCase())
                    || w.getWord_explain().toUpperCase().matches(bang.getValueAt(row, 0).toString().toUpperCase())
                    ){
                tutienganh.setText(w.getWord_target());
                phatam.setText(w.getSpelling());
                tutiengviet.setText(w.getWord_explain());
                }
            }
    }//GEN-LAST:event_bangKeyTyped
/**
 * bắt sự kiện cho nút âm thanh
 * @param evt 
 */
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
/**
 * hiển thị vào bảng khi nhập tìm kiếm và bấm nút enter
 * @param evt 
 */
    private void nhaptimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhaptimkiemActionPerformed
        
        if(nhaptimkiem.getText().length()!= 0){
            for(Word i: arrayList){
                Word w  = (Word) i;
                if(w.getWord_target().toUpperCase().matches(bang.getValueAt(0, 0).toString().toUpperCase())
                        || w.getWord_explain().toUpperCase().matches(bang.getValueAt(0, 0).toString().toUpperCase())
                        ){
                    tutienganh.setText(w.getWord_target());
                    phatam.setText(w.getSpelling());
                    tutiengviet.setText(w.getWord_explain());
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập để tìm kiếm !!!");
        }
    }//GEN-LAST:event_nhaptimkiemActionPerformed
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
            java.util.logging.Logger.getLogger(HienThiTimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HienThiTimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HienThiTimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HienThiTimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HienThiTimKiem().setVisible(true);
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
