import javax.swing.*;
import java.awt.*;

public class OrderProcessingPanel extends JPanel {
    public OrderProcessingPanel() {
        setLayout(new BorderLayout());
        JTextField roomField = new JTextField(5);
        JTextField orderField = new JTextField(15);
        JTextArea log = new JTextArea();
        log.setEditable(false);

        JButton submitBtn = new JButton("Submit Order");
        submitBtn.addActionListener(e -> {
            String room = roomField.getText().trim();
            String order = orderField.getText().trim();
            if (!room.isEmpty() && !order.isEmpty()) {
                log.append("Room " + room + ": " + order + "\n");
                roomField.setText("");
                orderField.setText("");
            }
        });

        JPanel top = new JPanel();
        top.add(new JLabel("Room #:"));
        top.add(roomField);
        top.add(new JLabel("Order:"));
        top.add(orderField);
        top.add(submitBtn);

        add(top, BorderLayout.NORTH);
        add(new JScrollPane(log), BorderLayout.CENTER);
    }
}