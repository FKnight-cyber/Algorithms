package Exercise1.Entities;

import java.util.Date;

public final class UsedProduct extends Product {
    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public final String priceTag() {
        return this.getName() + " $ " + this.getPrice() + " (Manufacture Date: " + manufactureDate + ")";
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }
}
