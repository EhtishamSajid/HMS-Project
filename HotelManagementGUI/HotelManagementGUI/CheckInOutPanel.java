import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CheckInOutPanel extends JPanel {
    private DefaultListModel<String> bookings = RoomBookingPanel.sharedModel;

    public CheckInOutPanel() {
        setLayout(new BorderLayout());
        JTextField nameField = new JTextField(10);
        JButton checkInBtn = new JButton("Check In");
        JButton checkOutBtn = new JButton("Check Out");
        JTextArea log = new JTextArea();
        log.setEditable(false);

        checkInBtn.addActionListener(e -> {
            String name = nameField.getText().trim();
            if (!name.isEmpty() && bookings.contains(name)) {
                log.append(name + " checked in\n");
            } else {
                log.append("No booking found for " + name + "\n");
            }
        });

        checkOutBtn.addActionListener(e -> {
            String name = nameField.getText().trim();
            if (!name.isEmpty() && bookings.removeElement(name)) {
                log.append(name + " checked out\n");
            } else {
                log.append("No booking to check out for " + name + "\n");
            }
        });

        JPanel top = new JPanel();
        top.add(new JLabel("Customer:"));
        top.add(nameField);
        top.add(checkInBtn);
        top.add(checkOutBtn);

        add(top, BorderLayout.NORTH);
        add(new JScrollPane(log), BorderLayout.CENTER);
    }
}