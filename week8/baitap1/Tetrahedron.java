package week8.baitap1;

public class Tetrahedron extends ThreeDimensionalShape {


   private double side;

    public Tetrahedron(double side) {

        this.side = side;
    }

    @Override
    public double getArea(){

        return Math.sqrt(3) * side * side;
    }

    @Override
    public double getVolume(){

        return (Math.sqrt(2) / 12) * side * side * side;
    }
    @Override
    public String toString() {
        return "Tetrahedron with side: " + side + ", area: " + getArea() + ", volume: " + getVolume();
    }




}
