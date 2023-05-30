package tryout;

import javax.swing.*;
import java.awt.*;

public class AdminLTEFrame extends JFrame {
    public AdminLTEFrame() {
        setTitle("AdminLTE Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        // Membuat panel utama dengan layout border
        JPanel mainPanel = new JPanel(new BorderLayout());
        setContentPane(mainPanel);

        // Membuat header panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Color.gray);
        headerPanel.setPreferredSize(new Dimension(getWidth(), 50));

        // Membuat sidebar panel
        JPanel sidebarPanel = new JPanel();
        sidebarPanel.setBackground(Color.black);
        sidebarPanel.setPreferredSize(new Dimension(200, getHeight()));

        // Membuat content panel
        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(Color.white);

        // Membuat tombol-tombol
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Menambahkan tombol-tombol ke content panel
        contentPanel.add(button1);
        contentPanel.add(button2);
        contentPanel.add(button3);

        // Menambahkan komponen ke panel utama
        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(sidebarPanel, BorderLayout.WEST);
        mainPanel.add(contentPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AdminLTEFrame::new);
    }
}
