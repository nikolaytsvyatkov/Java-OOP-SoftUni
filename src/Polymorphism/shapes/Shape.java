package Polymorphism.shapes;

public abstract class Shape {
    private Double perimeter;
    private Double area;

    public abstract Double calculatePerimeter();
    public abstract Double calculateArea();
    public Double getPerimeter() {
        return this.perimeter;
    }
    public Double getArea() {
        return this.area;
    }
}
