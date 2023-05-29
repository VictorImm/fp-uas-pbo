package tryout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewJFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public NewJFrame() {
        initializeComponents();
        setupLayout();
        setupListeners();

        setTitle("Login Form");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initializeComponents() {
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");
    }

    private void setupLayout() {
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(loginButton);

        add(panel);
    }

    private void setupListeners() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Cek apakah username dan password valid
                if (isValidLogin(username, password)) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    // Lakukan tindakan setelah login sukses
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password!");
                }
            }
        });
    }

    private boolean isValidLogin(String username, String password) {
        // Lakukan pengecekan validasi login, misalnya dengan membandingkan dengan data yang tersimpan di database
        // Anda dapat mengganti ini dengan logika validasi sesuai kebutuhan Anda
        return username.equals("admin") && password.equals("admin123");
    }

    public static void main(String[] args) {
        new NewJFrame();
    }
}
