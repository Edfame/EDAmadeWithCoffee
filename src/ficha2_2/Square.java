package ficha2_2;

public class Square extends Shape {

    private double side;

    @Override
    double getArea() {
        return side*side;
    }
}
