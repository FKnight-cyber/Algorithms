package Exercise1.Entities;

public final class ImportedProduct extends Product {
    private Double customsFee;
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public final String priceTag() {
        return this.getName() + " $ " + this.getPrice() + " (Customs Fee: $ " + customsFee + ")";
    }

    public Double totalPrice() {
        return this.getPrice() + this.customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }
}
