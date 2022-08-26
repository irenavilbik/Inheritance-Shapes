public class Triangle extends Shape {
    double a;
    double b;
    double c;
    double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    double getArea() {
        return 0.5*b*h;
    }

    @Override
    double getPerimeter() {
        return a+b+c;
    }
}
