public class Rectangle extends Shape {
   RectangleSides rectangleSides;

    public Rectangle(double height, double lenght) {
        this.rectangleSides = new RectangleSides(lenght, height);

    }

    @Override
    double getArea() {
        return rectangleSides.getArea();
    }

    @Override
    double getPerimeter() {
        return rectangleSides.getPerimeter();
    }
}
