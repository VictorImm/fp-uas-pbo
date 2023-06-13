/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views.TryOut;

import Libraries.PanitiaApi;
import Views.Login.swing.Button;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author User
 */
public class Main extends javax.swing.JFrame {

    // Ubah isi variabel ini king hubed
    private String[] jawaban = new String[100];
    private JsonArray questions;
    private int questionNumber = 0;
    private String judulSoal;
    private String textQuestion = "TextDisplay";

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

        // Get Soal
        try {
            PanitiaApi panitiaApi = new PanitiaApi();
            JsonObject response = panitiaApi.getQuestionsBySubtestId("25");
            judulSoal = response.get("data").getAsJsonObject().get("subtest").getAsJsonObject().get("title").getAsString();
            questions = response.get("data").getAsJsonObject().get("questions").getAsJsonArray();

            // Update soal
            updateQuestion();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        tryoutPanel.setLayout(
                new MigLayout(
                        "wrap",
                        "push[center]30[center]push",
                        "[center]40[]10[]10[]10[]"
                )
        );

        JTextPane question = new JTextPane();
        question.setEditable(false);
        question.setFont(new Font("sansserif", 1, 12));
        question.setForeground(new Color(7, 164, 121));
        question.setContentType("text/html");
        question.setText(textQuestion);

        Button[] buttons = new Button[5]; // Create an array of buttons

        // Create buttons and set common stylings
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new Button();
            buttons[i].setBackground(new Color(0, 0, 255));
            buttons[i].setFont(new Font("sansserif", 1, 12));
            buttons[i].setForeground(Color.WHITE);
        }

        // Set button text
        buttons[0].setText("OPSI A");
        buttons[1].setText("OPSI B");
        buttons[2].setText("OPSI C");
        buttons[3].setText("OPSI D");
        buttons[4].setText("OPSI E");

        // Event Listener
        for (int i = 0; i < buttons.length; i++) {
            final int index = i; // Create a final variable for the ActionListener

            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    // Change Selected Color
                    for (int j = 0; j < buttons.length; j++) {
                        buttons[j].setBackground(j == index ? new Color(7, 164, 121) : new Color(0, 0, 255));
                    }

                    // Set Jawaban
                    jawaban[questionNumber] = buttons[index].getText();
                }
            });
        }

        Button btnPrev = createNavigationButton("/Views/TryOut/Icon/back.png");
        Button btnNext = createNavigationButton("/Views/TryOut/Icon/next.png");
        Button btnFinish = new Button();
        btnFinish.setForeground(new Color(0, 0, 0, 255));
        btnFinish.setBackground(Color.GREEN);
        btnFinish.setText("Finish");

        btnPrev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Event Listener Button Prev
                if (questionNumber > 0) {
                    questionNumber--;
                    updateQuestion();
                    question.setText(textQuestion);
                }

                // Change finish button to next button
                if (questionNumber == questions.size() - 2) {
                    tryoutPanel.remove(btnFinish);
                    tryoutPanel.add(btnNext, "w 10%, h 10");
                }

                // Reset answer option color
                for (Button button : buttons) {
                    button.setBackground(new Color(0, 0, 255));
                }
            }
        });
        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Event Listener Button Next
                if (questionNumber < questions.size()) {
                    questionNumber++;
                    updateQuestion();
                    question.setText(textQuestion);

                }

                // Show finish button
                if (questionNumber == questions.size() - 1) {
                    tryoutPanel.remove(btnNext);
                    tryoutPanel.add(btnFinish, "w 10%, h 10");
                }

                // Reset answer option color
                for (Button button : buttons) {
                    button.setBackground(new Color(0, 0, 255));
                }
            }
        });

        // Render Component
        tryoutPanel.add(question, "span, w 90%, h 70%");
        int btnIndex = 0;
        for (Button button : buttons) {
            if (btnIndex == 4) {
                tryoutPanel.add(button, "w 40%, h 40, span");
            } else {
                tryoutPanel.add(button, "w 40%, h 40");
            }

            btnIndex++;
        }

        tryoutPanel.add(btnPrev, "w 10%, h 10");
        tryoutPanel.add(btnNext, "w 10%, h 10");
    }

    private Button createNavigationButton(String imagePath) {
        Button button = new Button();
        button.setForeground(new Color(0, 0, 0, 0));
        button.setSize(100, 100);
        button.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagePath)));
        return button;
    }

    private void updateQuestion() {
        this.textQuestion = "<html><body><div style='height: 300px; width: 1000px;'>";
        this.textQuestion += questions.get(questionNumber).getAsJsonObject().get("question_text").getAsString();
        this.textQuestion += "</div></body></html>";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tryoutPanel = new javax.swing.JPanel();

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
    private javax.swing.JPanel tryoutPanel;
    // End of variables declaration//GEN-END:variables
}
