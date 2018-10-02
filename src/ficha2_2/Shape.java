package ficha2_2;

public abstract class Shape implements Comparable<Shape>{
    abstract double getArea();

    @Override
    public int compareTo(Shape shape) {
        return (int)(this.getArea() - shape.getArea());
    }

    public String toString(){

        return "I am a " + this.getClass() + " my are is: " +this.getArea();
    }
}
