package Exercise1.Entities;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(Integer quantity, Product product) {
        this.product = product;
        this.quantity = quantity;
        this.price = quantity * product.getPrice();
    }

    public double subTotal() {
        return price;
    }

    public String toString() {
        return product.getName() + ", $" + product.getPrice() + ", Quantity: " + quantity + ", " + subTotal();
    }
}
