/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views.TryOut;

import Views.Login.swing.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author User
 */
public class Main extends javax.swing.JFrame {

    // Ubah isi variabel ini king hubed
    List<String> jawaban;
    int questionNumber = 1;
    String textQuestionOption = "CHANGE TEXT HERE";

    /**
     * Creates new form main
     */
    public Main() {
        this.setUndecorated(true);
        this.setTitle("TryOut");
        initComponents();
        initTryout();
    }

    private void initTryout() {
        // FIXME: Center JPanel
        tryoutPanel.setLayout(
                new MigLayout(
                        "wrap",
                        "push[center]30[center]push",
                        "[center]40[]10[]10[]10[]"
                )
        );

        JTextArea question = new JTextArea(textQuestionOption, 1, 2);
        Button btnA = new Button();
        Button btnB = new Button();
        Button btnC = new Button();
        Button btnD = new Button();
        Button btnE = new Button();
        Button btnPrev = new Button();
        Button btnNext = new Button();
        
        Button btnFinish = new Button();

        // Stylings
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setEditable(false);
        question.setFont(new Font("sansserif", 1, 12));
        question.setForeground(new Color(7, 164, 121));

        btnA.setText("A");

        btnB.setText("B");

        btnC.setText("C");

        btnD.setText("D");

        btnE.setText("E");

        btnPrev.setForeground(new Color(0, 0, 0, 0));
        btnPrev.setSize(100, 100);
        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/TryOut/Icon/back.png")));

        btnNext.setForeground(new Color(0, 0, 0, 0));
        btnNext.setSize(100, 100);
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/TryOut/Icon/next.png")));
        
        btnFinish.setForeground(new Color(0, 0, 0, 255));
        btnFinish.setText("Finish");

        // Event Listener
        btnA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Change Selected Color
                btnA.setBackground(new Color(7, 164, 121));
                btnB.setBackground(new Color(255, 255, 255));
                btnC.setBackground(new Color(255, 255, 255));
                btnD.setBackground(new Color(255, 255, 255));
                btnE.setBackground(new Color(255, 255, 255));

                // TODO: add value selected listener di sini king hubed
            }
        });
        btnB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Change Selected Color
                btnA.setBackground(new Color(255, 255, 255));
                btnB.setBackground(new Color(7, 164, 121));
                btnC.setBackground(new Color(255, 255, 255));
                btnD.setBackground(new Color(255, 255, 255));
                btnE.setBackground(new Color(255, 255, 255));

                // TODO: add value selected listener di sini king hubed
            }
        });
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Change Selected Color
                btnA.setBackground(new Color(255, 255, 255));
                btnB.setBackground(new Color(255, 255, 255));
                btnC.setBackground(new Color(7, 164, 121));
                btnD.setBackground(new Color(255, 255, 255));
                btnE.setBackground(new Color(255, 255, 255));

                // TODO: add value selected listener di sini king hubed
            }
        });
        btnD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Change Selected Color
                btnA.setBackground(new Color(255, 255, 255));
                btnB.setBackground(new Color(255, 255, 255));
                btnC.setBackground(new Color(255, 255, 255));
                btnD.setBackground(new Color(7, 164, 121));
                btnE.setBackground(new Color(255, 255, 255));

                // TODO: add value selected listener di sini king hubed
            }
        });
        btnE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Change Selected Color
                btnA.setBackground(new Color(255, 255, 255));
                btnB.setBackground(new Color(255, 255, 255));
                btnC.setBackground(new Color(255, 255, 255));
                btnD.setBackground(new Color(255, 255, 255));
                btnE.setBackground(new Color(7, 164, 121));

                // TODO: add value selected listener di sini king hubed
            }
        });
        btnPrev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Event Listener Button Prev
            }
        });
        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Event Listener Button Next
            }
        });
        
        // TODO: submit file
        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Event Listener Button Finish
            }
        });

        // Render Component
        tryoutPanel.add(question, "span, w 90%, h 70%");
        tryoutPanel.add(btnA, "w 40%, h 20");
        tryoutPanel.add(btnB, "w 40%, h 20");
        tryoutPanel.add(btnC, "w 40%, h 20");
        tryoutPanel.add(btnD, "w 40%, h 20");
        tryoutPanel.add(btnE, "w 40%, h 20, span");
        tryoutPanel.add(btnPrev, "w 10%, h 10");
        
        // TODO: len(soal) == max ? show_btnFinish : show_btnNext
//        tryoutPanel.add(btnNext, "w 10%, h 10");
         tryoutPanel.add(btnFinish, "w 20%, h 10");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        tryoutPanel = new javax.swing.JPanel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout tryoutPanelLayout = new javax.swing.GroupLayout(tryoutPanel);
        tryoutPanel.setLayout(tryoutPanelLayout);
        tryoutPanelLayout.setHorizontalGroup(
            tryoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );
        tryoutPanelLayout.setVerticalGroup(
            tryoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tryoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tryoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main frame = new Main();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setVisible(true);
                frame.setLayout(new FlowLayout(FlowLayout.CENTER));
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel tryoutPanel;
    // End of variables declaration//GEN-END:variables
}
