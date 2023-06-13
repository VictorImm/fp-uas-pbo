package Views.treot.component;

import Views.treot.main.Main;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import Views.treot.model.ModelSubtest;
import Libraries.PesertaApi;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Subtest extends javax.swing.JPanel {
    PesertaApi api = new PesertaApi();
    JsonObject respon;
    ArrayList<String> dataID = new ArrayList<String>();
    
    public Color getColorGradient() {
        return colorGradient;
    }

    public void setColorGradient(Color colorGradient) {
        this.colorGradient = colorGradient;
    }

    private Color colorGradient;

    public Subtest() {
        initComponents();
        setOpaque(false);
        setBackground(new Color(112, 69, 246));
        colorGradient = new Color(255, 255, 255);
        try{
            respon = api.startAttempt("1").get("data").getAsJsonObject();
            ModelSubtest.setAttemptID(respon.get("attempt_id").getAsString());
            // JsonElement listSubtest = respon.get("subtests").getAsJsonArray();
            for(JsonElement dataSubtest : respon.get("subtests").getAsJsonArray()){
                dataID.add(dataSubtest.getAsJsonObject().get("id").getAsString());
            }
        }catch(Exception e) {
            System.out.println("eror" + e.getMessage());
        }
        // initSoalData();
    }


//    public void setData(ModelSubtest data) {
//        jLabel1.setText("<html>" + "fdjshfjdsfhdsjfhdskjfhsk jhgkjshd kjh" + "</html>");
//        button1.setText("<html>" + data.getJawaban1() + "</html>");
//        button3.setText("<html>" + data.getJawaban2() + "</html>");
//        button2.setText("<html>" + data.getJawaban3() + "</html>");
//        button4.setText("<html>" + data.getJawaban4() + "</html>");
//        button5.setText("<html>" + data.getJawaban5() + "</html>");
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new Views.Login.swing.Button();
        button2 = new Views.Login.swing.Button();
        button3 = new Views.Login.swing.Button();
        button4 = new Views.Login.swing.Button();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        button6 = new Views.Login.swing.Button();
        button7 = new Views.Login.swing.Button();
        button8 = new Views.Login.swing.Button();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        button1.setText("Penalaran Umum Durasi 30 Menit");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setText("Pengetahuan dan Pemahaman Umum Durasi 15 Menit");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setText("Kemampuan Memahami Bacaan dan Menulis Durasi 25 Menit");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setText("Pengetahuan Kuantitatif Durasi 20 Menit");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(76, 76, 76));
        jLabel5.setText("TPS");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(76, 76, 76));
        jLabel6.setText("TL");
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        button6.setText("Literasi Bahasa Indonesia Durasi 45 Menit");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button7.setText("Penalaran Matematika Durasi 30 Menit");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setText("Literasi Bahasa Inggris Durasi");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        ModelSubtest.setSubtestID(dataID.get(0));
        Main main = new Main();
        main.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        main.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        main.setVisible(true);
    }//GEN-LAST:event_button1ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
        ModelSubtest.setSubtestID(dataID.get(4));
        Main main = new Main();
        main.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        main.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        main.setVisible(true);
    }//GEN-LAST:event_button6ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        ModelSubtest.setSubtestID(dataID.get(1));
        Main main = new Main();
        main.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        main.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        main.setVisible(true);
    }//GEN-LAST:event_button3ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        ModelSubtest.setSubtestID(dataID.get(2));
        Main main = new Main();
        main.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        main.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        main.setVisible(true);
    }//GEN-LAST:event_button2ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        ModelSubtest.setSubtestID(dataID.get(3));
        Main main = new Main();
        main.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        main.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        main.setVisible(true);
    }//GEN-LAST:event_button4ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        // TODO add your handling code here:
        ModelSubtest.setSubtestID(dataID.get(5));
        Main main = new Main();
        main.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        main.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        main.setVisible(true);

    }//GEN-LAST:event_button8ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        // TODO add your handling code here:
        ModelSubtest.setSubtestID(dataID.get(6));
        Main main = new Main();
        main.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        main.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        main.setVisible(true);
    }//GEN-LAST:event_button7ActionPerformed

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gra = new GradientPaint(0, getHeight(), getBackground(), getWidth(), 0, colorGradient);
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Views.Login.swing.Button button1;
    private Views.Login.swing.Button button2;
    private Views.Login.swing.Button button3;
    private Views.Login.swing.Button button4;
    private Views.Login.swing.Button button6;
    private Views.Login.swing.Button button7;
    private Views.Login.swing.Button button8;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
