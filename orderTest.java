public class OrderTest {
    public static void main(String[] args) {
        OrderCalculator calculator = new BasicOrderActions();
        OrderProcessor processor = new BasicOrderActions();
        InvoiceGenerator invoiceGenerator = new InvoiceActions();
        NotificationSender notifier = new EmailNotificationActions();

        performOrderActions(calculator, processor, invoiceGenerator, notifier);
    }

    private static void performOrderActions(OrderCalculator calculator, OrderProcessor processor,
                                            InvoiceGenerator invoiceGenerator, NotificationSender notifier) {
        double totalPrice = calculator.calculateTotal(10.0, 2);
        processor.placeOrder("John Doe", "123 Main St");
        invoiceGenerator.generateInvoice("order_123.pdf");
        notifier.sendEmailNotification("johndoe@example.com");
    }
}
