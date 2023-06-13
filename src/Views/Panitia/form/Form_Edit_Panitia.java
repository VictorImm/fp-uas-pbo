package Views.Panitia.form;

import Views.Panitia.dialog.Message;
import Views.Panitia.main.Main;
import Views.Panitia.model.ModelCard1;
// import Views.Panitia.model.ModelEditUser;
//import Views.Panitia.swing.icon.GoogleMaterialDesignIcons;
//import Views.Panitia.swing.icon.IconFontSwing;
// import Views.Panitia.swing.table.EventActionUser;
import java.awt.Color;
//import javax.swing.Icon;
// import javax.swing.ImageIcon;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Form_Edit_Panitia extends javax.swing.JPanel {

    String id;
    public Form_Edit_Panitia(String id) {
        initComponents();
        this.id = id;
        // table1.fixTable(jScrollPane1);
        setOpaque(false);
        initData();
    }

    private void initData() {
        initCardData();
        // initTableData();
    }

    // private void initTableData() {
    //     EventActionUser eventActionUser = new EventActionUser() {
    //         @Override
    //         public void delete(ModelUser user) {
    //             if (showMessage("Delete user : " + user.getName())) {
    //                 System.out.println("User click OK");
    //             } else {
    //                 System.out.println("User click Cancel");
    //             }
    //         }

    //         @Override
    //         public void update(ModelUser user) {
    //             if (showMessage("Update user : " + user.getName())) {
    //                 System.out.println("User click OK");
    //             } else {
    //                 System.out.println("User click Cancel");
    //             }
    //         }
    //     };
    //     try{
    //         JsonObject respon = new Libraries.PanitiaApi().getUserCommitte("0", "0").getAsJsonObject();
    //         int no = 1;
    //         for(JsonElement data : respon.get("data").getAsJsonObject().get("users").getAsJsonArray()){
    //             String status = data.getAsJsonObject().get("status").getAsInt() == 1 ? "aktif" : "tidak aktif";
    //             // table1.addRow(new ModelUser(no, data.getAsJsonObject().get("name").getAsString(), data.getAsJsonObject().get("email").getAsString(), status).toRowTable(eventActionUser));
    //             no++;
    //         }
    //     }catch(Exception e){
    //         System.out.println("Error : " + e.getMessage());
    //     }
    // }

    private void initCardData() {
        card11.setData(new ModelCard1("Edit Akun Panitia", "Disabled"));
    }


    private boolean showMessage(String message) {
        Message obj = new Message(Main.getFrames()[0], true);
        obj.showMessage(message);
        return obj.isOk();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        try{
            JsonObject respon = new Libraries.PanitiaApi().getUser("1").getAsJsonObject().get("data").getAsJsonObject().get("account").getAsJsonObject();
            // int no = 1;
            // for(JsonElement data : respon.get("data").getAsJsonObject().get("users").getAsJsonArray()){
            //     String status = data.getAsJsonObject().get("status").getAsInt() == 1 ? "aktif" : "tidak aktif";
            //     // table1.addRow(new ModelUser(no, data.getAsJsonObject().get("name").getAsString(), data.getAsJsonObject().get("email").getAsString(), status).toRowTable(eventActionUser));
            //     no++;
            // }
        
        
            jLabel1 = new javax.swing.JLabel();
            jPanel2 = new javax.swing.JPanel();
            jLabel5 = new javax.swing.JLabel();
            panelBorder1 = new Views.Assets.swing.PanelBorder();
            jLabel6 = new javax.swing.JLabel();
            textNama = new Views.Login.swing.MyTextField();
            jLabel8 = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();
            textNama1 = new Views.Login.swing.MyTextField();
            jLabel10 = new javax.swing.JLabel();
            textNama3 = new Views.Login.swing.MyTextField();
            jLabel11 = new javax.swing.JLabel();
            jLabel12 = new javax.swing.JLabel();
            textNama4 = new Views.Login.swing.MyTextField();
            myPasswordField1 = new Views.Login.swing.MyPasswordField();
            simpan = new Views.Login.swing.Button();
            card11 = new Views.Panitia.component.Card1();

            simpan.setBackground(new Color(7, 164, 121));
            jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(4, 72, 210));
            jLabel1.setText("Akun / Akun Panitia");

            jPanel2.setBackground(new java.awt.Color(255, 255, 255));

            jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(76, 76, 76));
            jLabel5.setText("Edit Akun Panitia");
            jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

            jLabel6.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(76, 76, 76));
            jLabel6.setText("Nama");
            jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

            textNama.setText(respon.get("name").getAsString());
            textNama.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    textNamaActionPerformed(evt);
                }
            });

            jLabel8.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(76, 76, 76));
            jLabel8.setText("Form Panitia");
            jLabel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

            jLabel9.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
            jLabel9.setForeground(new java.awt.Color(76, 76, 76));
            jLabel9.setText("Email");
            jLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

            textNama1.setText("Masukkan Email");
            textNama1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    textNama1ActionPerformed(evt);
                }
            });

            jLabel10.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
            jLabel10.setForeground(new java.awt.Color(76, 76, 76));
            jLabel10.setText("Password");
            jLabel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

            textNama3.setText("Masukkan Nomor Telepon");
            textNama3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    textNama3ActionPerformed(evt);
                }
            });

            jLabel11.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
            jLabel11.setForeground(new java.awt.Color(76, 76, 76));
            jLabel11.setText("Phone");
            jLabel11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

            jLabel12.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
            jLabel12.setForeground(new java.awt.Color(76, 76, 76));
            jLabel12.setText("School");
            jLabel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

            textNama4.setText("Masukkan Sekolah");
            textNama4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    textNama4ActionPerformed(evt);
                }
            });

            myPasswordField1.setText("Masukkan Password");

            simpan.setText("Simpan");

        }catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }
        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel6)
                        .addGap(194, 194, 194)
                        .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNama4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNama1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNama3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(30, 30, 30)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(textNama1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(myPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textNama3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(textNama4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(card11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNamaActionPerformed

    private void textNama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNama1ActionPerformed

    private void textNama3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNama3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNama3ActionPerformed

    private void textNama4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNama4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNama4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Views.Panitia.component.Card1 card11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private Views.Login.swing.MyPasswordField myPasswordField1;
    private Views.Assets.swing.PanelBorder panelBorder1;
    private Views.Login.swing.Button simpan;
    private Views.Login.swing.MyTextField textNama;
    private Views.Login.swing.MyTextField textNama1;
    private Views.Login.swing.MyTextField textNama3;
    private Views.Login.swing.MyTextField textNama4;
    // End of variables declaration//GEN-END:variables
}
