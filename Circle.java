public class Circle extends Shape {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.round(22 * radius * radius) / 7;
    }

    @Override
    double getPerimeter() {
        return Math.round(Math.PI * 2 * radius);
    }
}