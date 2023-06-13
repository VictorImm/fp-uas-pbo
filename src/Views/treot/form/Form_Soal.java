package Views.treot.form;

import Views.treot.dialog.Message;
import Views.treot.main.Main;
// import Views.treot.model.ModelCard;
import Views.treot.model.ModelSoal;
// import Views.treot.model.ModelStudent;
// import Views.treot.swing.icon.GoogleMaterialDesignIcons;
// import Views.treot.swing.icon.IconFontSwing;
// import Views.treot.swing.noticeboard.ModelNoticeBoard;
// import Views.treot.swing.table.EventAction;
// import java.awt.Color;
// import javax.swing.Icon;
// import javax.swing.ImageIcon;
// import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import Views.treot.model.ModelDataSoal;

public class Form_Soal extends javax.swing.JPanel {

    public Form_Soal(String soal_id) {
        initComponents();
//        table1.fixTable(jScrollPane1);
        setOpaque(false);
        // initData();
        try{
            // JsonElement data = ModelDataSoal.getDataSoalJawaban().get("data").getAsJsonObject().get("questions").getAsJsonArray();
            for(JsonElement dataSoal: ModelDataSoal.getDataSoalJawaban().getAsJsonObject().get("questions").getAsJsonArray()){
                if(dataSoal.getAsJsonObject().get("id").getAsString().equals(soal_id)){
                    // setData(dataSoal.getAsJsonObject());
                    String question_text = dataSoal.getAsJsonObject().get("question_text").getAsString();
                    String option_text_1 = dataSoal.getAsJsonObject().get("option_text_1").getAsString();
                    String option_text_2 = dataSoal.getAsJsonObject().get("option_text_2").getAsString();
                    String option_text_3 = dataSoal.getAsJsonObject().get("option_text_3").getAsString();
                    String option_text_4 = dataSoal.getAsJsonObject().get("option_text_4").getAsString();
                    String option_text_5 = dataSoal.getAsJsonObject().get("option_text_5").getAsString();
                    System.out.println("option_text_1 " + option_text_1);
                    System.out.println("option_text_2 " + option_text_2);
                    System.out.println("option_text_3 " + option_text_3);
                    System.out.println("option_text_4 " + option_text_4);
                    System.out.println("option_text_5 " + option_text_5);
                    soal2.setData(new ModelSoal(soal_id, question_text, option_text_1, option_text_2, option_text_3, option_text_4, option_text_5));
                }
            }
        }catch(Exception e){
            // Message.showError(e.toString(), "Error");
            System.out.println("Error " + e);
        }
    }

    // private void initData() {
    //     initCardData();
    // }


    // private void initCardData() {
    //     Icon icon1 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.PEOPLE, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
    //     card1.setData(new ModelCard("New Student", 5100, 20, icon1));
    //     Icon icon2 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.MONETIZATION_ON, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
    //     card2.setData(new ModelCard("Income", 2000, 60, icon2));
    //     Icon icon3 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.SHOPPING_BASKET, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
    //     card3.setData(new ModelCard("Expense", 3000, 80, icon3));
    //     Icon icon4 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.BUSINESS_CENTER, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
    //     card4.setData(new ModelCard("Other Income", 550, 95, icon4));

    // }


    private boolean showMessage(String message) {
        Message obj = new Message(Main.getFrames()[0], true);
        obj.showMessage(message);
        return obj.isOk();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        soal2 = new Views.treot.component.Soal();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(soal2, javax.swing.GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(soal2, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Views.treot.component.Soal soal2;
    // End of variables declaration//GEN-END:variables
}
