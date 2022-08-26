public class Rectangle extends Shape {
    double height;
    double lenght;

    public Rectangle(double height, double lenght) {
        this.height = height;
        this.lenght = lenght;
    }

    @Override
    double getArea() {
        return (height * lenght);
    }

    @Override
    double getPerimeter() {
        return (height + lenght)*2;
    }
}
