package Polymorphism.shapes;

public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }


    @Override
    public Double calculatePerimeter() {
        return 2 * height + 2 * width;
    }

    @Override
    public Double calculateArea() {
        return width*height;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }
}
