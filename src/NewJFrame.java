
import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class NewJFrame extends javax.swing.JFrame {
    DefaultListModel model = new DefaultListModel();
    
    public NewJFrame() {
        initComponents();
        cb_arac.setModel(model);
        guncel_ekran.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        cb_arac = new javax.swing.JList<>();
        arac_ekle = new javax.swing.JButton();
        mesaj_yazısı = new javax.swing.JLabel();
        aracsilbuton = new javax.swing.JButton();
        aracGüncelleButon = new javax.swing.JButton();
        guncel_ekran = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cb_arac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_aracMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cb_arac);

        arac_ekle.setText("Arac Ekle");
        arac_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arac_ekleActionPerformed(evt);
            }
        });
        arac_ekle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                arac_ekleKeyPressed(evt);
            }
        });

        aracsilbuton.setText("Araç Sil");
        aracsilbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracsilbutonActionPerformed(evt);
            }
        });
        aracsilbuton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                aracsilbutonKeyPressed(evt);
            }
        });

        aracGüncelleButon.setText("Araç Güncelle");
        aracGüncelleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracGüncelleButonActionPerformed(evt);
            }
        });
        aracGüncelleButon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                aracGüncelleButonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guncel_ekran)
                    .addComponent(mesaj_yazısı, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(arac_ekle)
                        .addGap(65, 65, 65)
                        .addComponent(aracGüncelleButon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(aracsilbuton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arac_ekle)
                    .addComponent(aracsilbuton)
                    .addComponent(aracGüncelleButon))
                .addGap(18, 18, 18)
                .addComponent(guncel_ekran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(mesaj_yazısı, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arac_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arac_ekleActionPerformed
        // TODO add your handling code here:
        mesaj_yazısı.setText("");
        
        guncel_ekran.setVisible(true);
        //String cevapyazısı = JOptionPane.showInputDialog("Arac Kayıt Sistemi");
        String cevapyazısı = guncel_ekran.getText();
        if(cevapyazısı != null){
            if(cevapyazısı.trim().equals("")){
            mesaj_yazısı.setText("Lütfen bir araç giriniz.");
        }else{
                model.addElement(cevapyazısı);
                mesaj_yazısı.setText("Araç kayıt işlemi başarı ile gerçekleşti");
            }
            
        }else{
            mesaj_yazısı.setText("İşlem onaylanmadığı içn iptal edilmiştir.");
        }
   
    }//GEN-LAST:event_arac_ekleActionPerformed

    private void aracsilbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracsilbutonActionPerformed
        mesaj_yazısı.setText("");
        guncel_ekran.setVisible(true);
       
        int seciliındex =cb_arac.getSelectedIndex();
        if(seciliındex == -1){
            if(model.getSize() == 0){
                mesaj_yazısı.setText("araç listeniz boş.Lütfen araç ekledikten sonra tekrar deneyiniz.");
            }else{
                mesaj_yazısı.setText("silinmesini istediğiniz aracı seçmeniz gerekmektedir.");
            }
        }else{
            Object seciliObject = model.getElementAt(seciliındex);
            mesaj_yazısı.setText("Araç silme işlemi başarı ile gerçekleşti.Silinen araç : "+seciliObject);
            model.removeElement(seciliObject);
        }
    }//GEN-LAST:event_aracsilbutonActionPerformed

    private void aracGüncelleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracGüncelleButonActionPerformed
        guncel_ekran.setVisible(true);
        mesaj_yazısı.setText("");
        int secilielement = cb_arac.getSelectedIndex();
        //String yenileekran =JOptionPane.showInputDialog("Güncelleme ekrani");
        
        model.setElementAt(guncel_ekran.getText(), secilielement);
        mesaj_yazısı.setText("Arac Güncelleme işlemi başarı ile gerçekleşti.");
    }//GEN-LAST:event_aracGüncelleButonActionPerformed

    private void cb_aracMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_aracMouseClicked
        // TODO add your handling code here:
        int secili_element = cb_arac.getSelectedIndex();
        guncel_ekran.setText(model.getElementAt(secili_element).toString());
    }//GEN-LAST:event_cb_aracMouseClicked

    private void arac_ekleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arac_ekleKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                    mesaj_yazısı.setText("");
        guncel_ekran.setVisible(true);
        //String cevapyazısı = JOptionPane.showInputDialog("Arac Kayıt Sistemi");
        String cevapyazısı = guncel_ekran.getText();
        if(cevapyazısı != null){
            if(cevapyazısı.trim().equals("")){
            mesaj_yazısı.setText("Lütfen bir araç giriniz.");
        }else{
                model.addElement(cevapyazısı);
                mesaj_yazısı.setText("Araç kayıt işlemi başarı ile gerçekleşti");
            }
            
        }else{
            mesaj_yazısı.setText("İşlem onaylanmadığı içn iptal edilmiştir.");
        }
        }
    }//GEN-LAST:event_arac_ekleKeyPressed

    private void aracGüncelleButonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aracGüncelleButonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() ==KeyEvent.VK_ENTER){
                    guncel_ekran.setVisible(true);
        mesaj_yazısı.setText("");
        int secilielement = cb_arac.getSelectedIndex();
        //String yenileekran =JOptionPane.showInputDialog("Güncelleme ekrani");
        
        model.setElementAt(guncel_ekran.getText(), secilielement);
        mesaj_yazısı.setText("Arac Güncelleme işlemi başarı ile gerçekleşti.");
        }
    }//GEN-LAST:event_aracGüncelleButonKeyPressed

    private void aracsilbutonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aracsilbutonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                    mesaj_yazısı.setText("");
        guncel_ekran.setVisible(true);
        int seciliındex =cb_arac.getSelectedIndex();
        if(seciliındex == -1){
            if(model.getSize() == 0){
                mesaj_yazısı.setText("araç listeniz boş.Lütfen araç ekledikten sonra tekrar deneyiniz.");
            }else{
                mesaj_yazısı.setText("silinmesini istediğiniz aracı seçmeniz gerekmektedir.");
            }
        }else{
            Object seciliObject = model.getElementAt(seciliındex);
            mesaj_yazısı.setText("Araç silme işlemi başarı ile gerçekleşti.Silinen araç : "+seciliObject);
            model.removeElement(seciliObject);
        }
        }
    }//GEN-LAST:event_aracsilbutonKeyPressed

    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aracGüncelleButon;
    private javax.swing.JButton arac_ekle;
    private javax.swing.JButton aracsilbuton;
    private javax.swing.JList<String> cb_arac;
    private javax.swing.JTextField guncel_ekran;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesaj_yazısı;
    // End of variables declaration//GEN-END:variables
}
