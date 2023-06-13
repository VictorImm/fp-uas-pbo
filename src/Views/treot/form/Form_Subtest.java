package Views.treot.form;

import Views.treot.dialog.Message;
import Views.treot.main.Main;
import Views.treot.model.ModelCard;
import Views.treot.model.ModelSoal;
import Views.treot.model.ModelStudent;
import Views.treot.swing.icon.GoogleMaterialDesignIcons;
import Views.treot.swing.icon.IconFontSwing;
import Views.treot.swing.noticeboard.ModelNoticeBoard;
import Views.treot.swing.table.EventAction;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Form_Subtest extends javax.swing.JPanel {

    public Form_Subtest() {
        initComponents();
//        table1.fixTable(jScrollPane1);
        setOpaque(false);
        // initData();
//        subtest1.setData(new ModelSoal("1","dafdsfdsfsd 1", "Jawaban 1", "Jawaban 2", "Jawaban 3", "Jawaban 4", "Jawaban 5"));
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

        subtest1 = new Views.treot.component.Subtest();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtest1, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtest1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Views.treot.component.Subtest subtest1;
    // End of variables declaration//GEN-END:variables
}
