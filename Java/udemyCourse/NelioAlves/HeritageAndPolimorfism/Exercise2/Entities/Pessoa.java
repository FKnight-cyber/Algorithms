package Exercise2.Entities;

public abstract class Pessoa {
    private String name;
    private Double rendaAnual;

    public Pessoa(){}
    public Pessoa(String name, Double rendaAnual) {
        this.name = name;
        this.rendaAnual = rendaAnual;
    }

    public String getName() {
        return name;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public abstract Double taxCosts();
}
