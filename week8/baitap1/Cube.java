package week8.baitap1;

public class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {

        this.side = side;
    }

    @Override
    public double getArea(){

        return 6 * side * side;
    }

    @Override
    public double getVolume(){

        return side *side * side;
    }

    @Override
    public String toString() {

        return "Cube with side: " + side + ", area: " + getArea() + ", volume: " + getVolume();
    }


}
