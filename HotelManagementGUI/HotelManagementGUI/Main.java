import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            if (Auth.showLogin()) {
                new MainFrame();
            } else {
                JOptionPane.showMessageDialog(null, "Login failed. Exiting...");
                System.exit(0);
            }
        });
    }
}