package Exercise1.Entities;

import Exercise1.Enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private String moment;
    private OrderStatus status;
    private List<OrderItem> orders = new ArrayList<>();
    private Client client;

    public Order(OrderStatus status, Client client) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.moment = dtf.format(now);
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem order) {
        this.orders.add(order);
    }

    public void removeItem(OrderItem order) {
        this.orders.remove(order);
    }

    public double total() {
        double sum = 0;
        for(OrderItem order : orders) {
            sum += order.subTotal();
        }
        return sum;
    }

    public String ordersInfo() {
        String result = "";
        for (OrderItem o : orders) {
            result += o.toString() + "\n";
        }
        return result;
    }

    public String toString() {
        return "ORDER SUMMARY:\n" +
                "Order moment: " + moment + "\n" +
                "Order status: " + status + "\n" +
                "Client: " + client.getName() + " " + "(" + client.getBirthDate() + ")" + " - "
                + client.getEmail() + "\n" +
                "Order items:\n" + ordersInfo() + "\n" +
                "Total price: $" + total();
    }
}
