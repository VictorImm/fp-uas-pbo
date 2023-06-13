package Views.treot.component;

import Views.treot.model.ModelSoal;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Soal extends javax.swing.JPanel {

    public Color getColorGradient() {
        return colorGradient;
    }

    public void setColorGradient(Color colorGradient) {
        this.colorGradient = colorGradient;
    }

    private Color colorGradient;

    public Soal() {
        initComponents();
        setOpaque(false);
        setBackground(new Color(112, 69, 246));
        colorGradient = new Color(255, 255, 255);
        // initSoalData();
    }


    public void setData(ModelSoal data) {
        jLabel1.setText("<html>" + data.getSoal() + "</html>");
        button1.setText("<html>" + data.getJawaban1() + "</html>");
        button3.setText("<html>" + data.getJawaban2() + "</html>");
        button2.setText("<html>" + data.getJawaban3() + "</html>");
        button4.setText("<html>" + data.getJawaban4() + "</html>");
        button5.setText("<html>" + data.getJawaban5() + "</html>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new Views.Assets.swing.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        button1 = new Views.Login.swing.Button();
        button2 = new Views.Login.swing.Button();
        button3 = new Views.Login.swing.Button();
        button4 = new Views.Login.swing.Button();
        button5 = new Views.Login.swing.Button();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        jLabel1.setText("soal");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        button1.setText("jawaban1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setText("jawaban3");

        button3.setText("jawaban2");

        button4.setText("jawaban4");

        button5.setText("jawaban5");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
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
                        .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                        .addGap(23, 23, 23)
                        .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                    .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23)
                        .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(230, 230, 230))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        new Views.treot.main.Main().repaint();
        System.out.println("hoaks");
    }//GEN-LAST:event_button1ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button5ActionPerformed

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
    private Views.Login.swing.Button button5;
    private javax.swing.JLabel jLabel1;
    private Views.Assets.swing.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
