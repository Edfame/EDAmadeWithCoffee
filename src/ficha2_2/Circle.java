package ficha2_2;

public class Circle extends Shape {

    private double raio;

    public double getArea(){
        return Math.PI *(this.raio*this.raio);
    }
}
