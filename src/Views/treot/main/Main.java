package Views.treot.main;

import Views.treot.component.Header;
import Views.treot.component.Menu;
import Views.treot.event.EventMenuSelected;
import Views.treot.event.EventShowPopupMenu;
import Views.treot.form.Form1;
import Views.treot.form.Form_Home;
import Views.treot.form.MainForm;
import Views.treot.swing.MenuItem;
import Views.treot.swing.PopupMenu;
import Views.treot.swing.icon.GoogleMaterialDesignIcons;
import Views.treot.swing.icon.IconFontSwing;
import Views.treot.model.ModelSubtest;
import Views.treot.model.ModelSubattempt;
import Views.treot.model.ModelDataSoal;
import Views.treot.form.Form_Soal;
import Libraries.PesertaApi;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class Main extends javax.swing.JFrame {

    private MigLayout layout;
    private Menu menu;
    private Header header;
    private MainForm main;
    private Animator animator;
    PesertaApi api = new PesertaApi();

    public Main() {
        initComponents();
        init();
    }

    private void init() {
        if(ModelSubtest.getSubtestID() != null){
            try{
                JsonObject dataSubattempt = api.startSubattempt(ModelSubtest.getSubtestID() , ModelSubtest.getAttemptID()).get("data").getAsJsonObject();
                ModelSubattempt.setSubAttemptID(dataSubattempt.get("subattempt_id").getAsString());
                ModelSubattempt.setAnswerToken(dataSubattempt.get("answer_token").getAsString());
                ModelSubattempt.setTimeRemaining(dataSubattempt.get("time_remaining").getAsString());
                JsonObject dataSoal = api.getSubattempt(ModelSubattempt.getSubAttemptID()).get("data").getAsJsonObject();
                ModelDataSoal.setDataSoalJawaban(dataSoal);                
                System.out.println("fdsf");
            }catch(Exception e){
                System.out.println("eror");
            }
        }
        layout = new MigLayout("fill", "0[]0[100%, fill]0", "0[fill, top]0");
        bg.setLayout(layout);
        if(ModelSubtest.getSubtestID() != null){
            menu = new Menu();
        }else{
            menu = new Menu(1);
        }
        
        header = new Header();
        main = new MainForm();
        menu.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int menuIndex, int subMenuIndex) {
                System.out.println("Menu Index : " + menuIndex + " SubMenu Index " + subMenuIndex);
                int index = 0;
                System.out.println(ModelDataSoal.getDataSoalJawaban());
                for(JsonElement data: ModelDataSoal.getDataSoalJawaban().get("questions").getAsJsonArray()){
                    if (menuIndex == index) {
                        System.out.println(data.getAsJsonObject().get("id").getAsString());
                        main.showForm(new Form_Soal(data.getAsJsonObject().get("id").getAsString()));
                    }
                    index++;
                }
            }
        });
        menu.addEventShowPopup(new EventShowPopupMenu() {
            @Override
            public void showPopup(Component com) {
                MenuItem item = (MenuItem) com;
                PopupMenu popup = new PopupMenu(Main.this, item.getIndex(), item.getEventSelected(), item.getMenu().getSubMenu());
                int x = Main.this.getX() + 52;
                int y = Main.this.getY() + com.getY() + 86;
                popup.setLocation(x, y);
                popup.setVisible(true);
            }
        });
        
        if(ModelSubtest.getSubtestID() != null){
            menu.initMenuItem(ModelDataSoal.getDataSoalJawaban());
        }
        bg.add(menu, "w 300!, spany 2");    // Span Y 2cell
        bg.add(header, "h 50!, wrap");
        bg.add(main, "w 100%, h 100%");
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double width;
                if (menu.isShowMenu()) {
                    width = 60 + (170 * (1f - fraction));
                } else {
                    width = 60 + (170 * fraction);
                }
                layout.setComponentConstraints(menu, "w " + width + "!, spany2");
                menu.revalidate();
            }

            @Override
            public void end() {
                menu.setShowMenu(!menu.isShowMenu());
                menu.setEnableMenu(true);
            }

        };
        animator = new Animator(500, target);
        animator.setResolution(0);
        animator.setDeceleration(0.5f);
        animator.setAcceleration(0.5f);
        header.addMenuEvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!animator.isRunning()) {
                    animator.start();
                }
                menu.setEnableMenu(false);
                if (menu.isShowMenu()) {
                    menu.hideallMenu();
                }
            }
        });
        //  Init google icon font
        IconFontSwing.register(GoogleMaterialDesignIcons.getIconFont());
        //  Start with this form
        if(ModelSubtest.getSubtestID() != null){
            System.out.println("dfsfds");
            main.showForm(new Form1());
        }else{
//            main.showForm(new Form1());
            main.showForm(new Views.treot.form.Form_Subtest());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(245, 245, 245));
        bg.setOpaque(true);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 783, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main main = new Main();
                main.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
                main.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
                main.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    // End of variables declaration//GEN-END:variables
}
