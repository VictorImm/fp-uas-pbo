package Views.treot.component;

import Views.treot.event.EventMenu;
import Views.treot.event.EventMenuSelected;
import Views.treot.event.EventShowPopupMenu;
import Views.treot.model.ModelMenu;
import Views.treot.model.ModelMenu1;
import Views.treot.swing.MenuAnimation;
import Views.treot.swing.MenuItem;
import Views.treot.swing.MenuItem1;
import Views.treot.swing.scrollbar.ScrollBarCustom;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import net.miginfocom.swing.MigLayout;

public class Menu extends javax.swing.JPanel {

    public boolean isShowMenu() {
        return showMenu;
    }

    public void addEvent(EventMenuSelected event) {
        this.event = event;
    }

    public void setEnableMenu(boolean enableMenu) {
        this.enableMenu = enableMenu;
    }

    public void setShowMenu(boolean showMenu) {
        this.showMenu = showMenu;
    }

    public void addEventShowPopup(EventShowPopupMenu eventShowPopup) {
        this.eventShowPopup = eventShowPopup;
    }

    private final MigLayout layout;
    private EventMenuSelected event;
    private EventShowPopupMenu eventShowPopup;
    private boolean enableMenu = true;
    private boolean showMenu = true;

    public Menu() {
        initComponents();
        setOpaque(false);
        sp.getViewport().setOpaque(false);
        sp.setVerticalScrollBar(new ScrollBarCustom());
        layout = new MigLayout("wrap, insets 0", "[]1[]1[]1[]1[]");
        panel.setLayout(layout);
    }
    
    public Menu(int ya) {
        initComponents();
        setOpaque(false);
        sp.getViewport().setOpaque(false);
        sp.setVerticalScrollBar(new ScrollBarCustom());
        layout = new MigLayout("wrap, fillx, insets 0", "[fill]", "[]0[]");
        panel.setLayout(layout);
    }
    
//    public void initMenuItem1() {
//        addMenu1(new ModelMenu1(new ImageIcon(getClass().getResource("/Views/Panitia/icon/1.png")), "Dashboard"));        
//        addMenu1(new ModelMenu1(new ImageIcon(getClass().getResource("/Views/Panitia/icon/1.png")), "Dashboard"));
//
////        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/Views/Panitia/icon/6.png")), "Akun", "Akun Panitia", "Akun Peserta"));
////        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/Views/Panitia/icon/2.png")), "Charts"));
////        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/Views/Panitia/icon/3.png")), "Report", "Income", "Expense", "Profit"));
////        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/Views/Panitia/icon/4.png")), "Message", "Sender", "Inbox", "User"));
////        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/Views/Panitia/icon/5.png")), "Staff", "Sender", "Inbox", "User"));
////        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/Views/Panitia/icon/6.png")), "Student", "Menu 001", "Menu 002", "Menu 003"));
////        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/Views/Panitia/icon/7.png")), "Library", "Menu 001", "Menu 002", "Menu 003"));
////        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/Views/Panitia/icon/8.png")), "Holiday", "Menu 001", "Menu 002", "Menu 003"));
////        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/Views/Panitia/icon/9.png")), "Calendar", "Menu 001", "Menu 002", "Menu 003"));
////        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/Views/Panitia/icon/10.png")), "Chat App", "Menu 001", "Menu 002", "Menu 003"));
////        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/Views/Panitia/icon/11.png")), "Contace", "Menu 001", "Menu 002", "Menu 003"));
////        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/Views/Panitia/icon/12.png")), "File Manager", "Menu 001", "Menu 002", "Menu 003"));
////        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/Views/Panitia/icon/13.png")), "Our Centres"));
////        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/Views/Panitia/icon/14.png")), "Gallery"));
//    }

//    private void addMenu1(ModelMenu1 menu) {
//        panel.add(new MenuItem1(menu, getEventMenu(), event, panel.getComponentCount()), "h 60!");
//    }

    public void initMenuItem(JsonObject data) {
        int i = 1;
        for(JsonElement result: data.get("questions").getAsJsonArray()){
            panel.add(new MenuItem(new ModelMenu(String.valueOf(i)), getEventMenu(), event, panel.getComponentCount()), "h 60!, w 60!, align right");
            i++;
        }
    }

//    private void addMenu(ModelMenu menu) {
//        panel.add(new MenuItem(menu, getEventMenu(), event, panel.getComponentCount()), "h 60!");
//    }

    private EventMenu getEventMenu() {
        return new EventMenu() {
            @Override
            public boolean menuPressed(Component com, boolean open) {
                if (enableMenu) {
                    if (isShowMenu()) {
                        if (open) {
                            new MenuAnimation(layout, com).openMenu();
                        } else {
                            new MenuAnimation(layout, com).closeMenu();
                        }
                        return true;
                    } else {
                        eventShowPopup.showPopup(com);
                    }
                }
                return false;
            }
        };
    }

    public void hideallMenu() {
        for (Component com : panel.getComponents()) {
            MenuItem item = (MenuItem) com;
            if (item.isOpen()) {
                new MenuAnimation(layout, com, 500).closeMenu();
                item.setOpen(false);
            }
        }
    }
    
    public void hideallMenu1() {
        for (Component com : panel.getComponents()) {
            MenuItem1 item = (MenuItem1) com;
            if (item.isOpen()) {
                new MenuAnimation(layout, com, 500).closeMenu();
                item.setOpen(false);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        profile1 = new Views.treot.component.Profile();

        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.setOpaque(false);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );

        sp.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
            .addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gra = new GradientPaint(0, 0, new Color(33, 105, 249), getWidth(), 0, new Color(93, 58, 196));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel;
    private Views.treot.component.Profile profile1;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
