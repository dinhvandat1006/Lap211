package week8.baitap1;

public class Triangle extends TwoDimensionalShape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea(){
        return 0.5 * base * height;
    }


    @Override
    public String toString() {

        return "Triangle with base: " + base + ", height: " + height + ", area: " + getArea();
    }
}
