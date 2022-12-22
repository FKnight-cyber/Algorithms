package Exercise2.Entities;

public class Fisica extends Pessoa {
    private Double healthCosts;

    public Fisica(String name, Double rendaAnual, Double healthCosts) {
        super(name, rendaAnual);
        this.healthCosts = healthCosts;
    }

    @Override
    public final Double taxCosts() {
        Double tax = 0.0;

        if(this.getRendaAnual() < 20000) {
            tax = 0.15;
        }else{
            tax = 0.25;
        }

        if(healthCosts > 0) {
            return this.getRendaAnual()*tax - healthCosts/2;
        }

        return this.getRendaAnual()*tax;
    }

    @Override
    public final String toString() {
        return this.getName() + ": $" + this.taxCosts();
    }
}
