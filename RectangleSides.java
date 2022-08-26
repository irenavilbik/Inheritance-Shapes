public class RectangleSides {
    public double lenght;
    public double height;

    public RectangleSides(double lenght, double height) {
        this.lenght = lenght;
        this.height = height;
    }
    public double getArea(){
        return this.lenght*this.height;
    }
    public double getPerimeter(){
        return (this.lenght+this.height)*2;
    }

}
