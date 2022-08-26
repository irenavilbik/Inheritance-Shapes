public class ShapeCalculator {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.0);
        System.out.println("Circle's area " + s1.getArea());
        System.out.println("Circle's perimeter " + s1.getPerimeter());

        Shape s2 = new Triangle(2.0, 5.0, 10.0, 8.0);
        System.out.println("Triangle's area "+ s2.getArea());
        System.out.println("Triangle's perimeter " + s2.getPerimeter());

        Shape s3 = new Rectangle(6.0, 12.0);
        System.out.println("rectangle's area " + s3.getArea());
        System.out.println("Rectangle's area " + s3.getPerimeter());

    }

}