import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Hotel Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Room Booking", new RoomBookingPanel());
        tabs.addTab("Order Processing", new OrderProcessingPanel());
        tabs.addTab("Feedback", new FeedbackPanel());
        tabs.addTab("Check-In/Out", new CheckInOutPanel());
        tabs.addTab("Employees", new EmployeePanel());
        tabs.addTab("Reservations", new ReservationPanel());
        tabs.addTab("Housekeeping", new HousekeepingPanel());
        tabs.addTab("Inventory", new InventoryPanel());
        tabs.addTab("Payments", new PaymentPanel());

        add(tabs);
        setVisible(true);
    }
}