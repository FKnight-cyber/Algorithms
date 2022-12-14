package Exercise2;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(double percentage) {
        this.grossSalary *= (1 + percentage/100);
    }

    public String toString(){
        return "Employee: " + this.name + ", " + "$ " + this.netSalary();
    }
}
