package Exercise2.Entities;

public class Juridica extends Pessoa {
    private int numberOfEmployees;

    public Juridica(String name, Double rendaAnual, int numberOfEmployees) {
        super(name, rendaAnual);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public final Double taxCosts() {
        Double tax = 0.16;

        if(this.numberOfEmployees > 10) {
            tax = 0.14;
        }

        return this.getRendaAnual()*tax;
    }

    @Override
    public final String toString() {
        return this.getName() + ": $" + this.taxCosts();
    }
}
