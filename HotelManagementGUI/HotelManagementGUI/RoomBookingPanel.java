import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RoomBookingPanel extends JPanel {
    private DefaultListModel<String> bookings = new DefaultListModel<>();

    public RoomBookingPanel() {
        setLayout(new BorderLayout());
        JTextField nameField = new JTextField(15);
        JButton bookBtn = new JButton("Book Room");
        JList<String> list = new JList<>(bookings);

        bookBtn.addActionListener(e -> {
            String name = nameField.getText().trim();
            if (!name.isEmpty()) {
                bookings.addElement(name);
                nameField.setText("");
            }
        });

        JPanel top = new JPanel();
        top.add(new JLabel("Customer Name:"));
        top.add(nameField);
        top.add(bookBtn);

        add(top, BorderLayout.NORTH);
        add(new JScrollPane(list), BorderLayout.CENTER);
    }
}