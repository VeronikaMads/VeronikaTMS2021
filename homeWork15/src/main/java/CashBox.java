public class CashBox {
    private static int cashBoxCounter = 0;
    private final int id;
    private Integer queueSize = 0;
    private final Object lock = new Object();

    public CashBox() {
        id = cashBoxCounter++;
    }

    public void serveCustomer(Customer customer) {
        increaseQueSize();

        synchronized (this) {
            System.out.printf("CashBox #%s serves Customer %s\n", id, customer.getCustomerName());
            for (String good : customer.getShoppingList()) {
                System.out.printf("Customer %s buys %s\n", customer.getCustomerName(), good);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("interrupted");
                }
            }
            synchronized (lock) {
                queueSize--;
                System.out.println("Customer " + customer.getCustomerName() + " is served. CashBox #" + id + " has "
                        + queueSize + " Customers left in the queue");
            }
        }
    }

    private void increaseQueSize() {
        synchronized (lock) {
            //1) считывает значение из памяти
            //2) увеличивает значение на 1
            //3) записывает значение в память
            queueSize++;
            System.out.println("CashBox #" + id + " Queue increased to size " + queueSize);
        }
    }

    public int getId() {
        return id;
    }

    public int getQueueSize() {
        return queueSize;
    }
}
