package Exercise1;

public class Rectangle {
    public double width;
    public double height;
    public double area() {
        return this.width * this.height;
    }
    public double perimeter() {
        return 2*this.width + 2*this.height;
    }
    public double diagonal() {
        return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
    }
}
