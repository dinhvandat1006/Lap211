package week8.baitap1;

public class Sphere extends ThreeDimensionalShape {
    public double radius;

    public Sphere(double radius) {

        this.radius = radius;
    }
    @Override
    public double getArea() {

        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume(){

        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public String toString() {
        return "Sphere with radius: " + radius + ", area: " + getArea()+ ", volume: "+ getVolume();

    }
}
