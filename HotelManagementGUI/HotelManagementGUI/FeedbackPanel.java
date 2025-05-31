import javax.swing.*;
import java.awt.*;

public class FeedbackPanel extends JPanel {
    public FeedbackPanel() {
        setLayout(new BorderLayout());
        JTextField nameField = new JTextField(10);
        JTextField feedbackField = new JTextField(20);
        JTextArea log = new JTextArea();
        log.setEditable(false);

        JButton submitBtn = new JButton("Submit Feedback");
        submitBtn.addActionListener(e -> {
            String name = nameField.getText().trim();
            String feedback = feedbackField.getText().trim();
            if (!name.isEmpty() && !feedback.isEmpty()) {
                log.append(name + ": " + feedback + "\n");
                nameField.setText("");
                feedbackField.setText("");
            }
        });

        JPanel top = new JPanel();
        top.add(new JLabel("Name:"));
        top.add(nameField);
        top.add(new JLabel("Feedback:"));
        top.add(feedbackField);
        top.add(submitBtn);

        add(top, BorderLayout.NORTH);
        add(new JScrollPane(log), BorderLayout.CENTER);
    }
}