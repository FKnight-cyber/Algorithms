package Exercise1.Entities;

public class Product {
    private String name;
    private Double price;

    public Product(){
    }

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String priceTag() {
        return this.getName() + " $ " + this.getPrice();
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
