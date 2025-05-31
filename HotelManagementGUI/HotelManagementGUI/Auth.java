import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Auth {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin123";
    private static boolean isAuthenticated = false;

    public static boolean showLogin() {
        JFrame frame = new JFrame("Login");
        JTextField userField = new JTextField(15);
        JPasswordField passField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(e -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());
            if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
                isAuthenticated = true;
                frame.dispose();
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid credentials");
            }
        });

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Username:"));
        panel.add(userField);
        panel.add(new JLabel("Password:"));
        panel.add(passField);
        panel.add(loginButton);

        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        while (frame.isDisplayable()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {}
        }
        return isAuthenticated;
    }
}