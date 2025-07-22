package week8.baitap1;



    public class Main {
        public static void main(String[] args) {
            Shape[] shapes = new Shape[3];
            shapes[0] = new Circle(5);
            shapes[1] = new Sphere(7);
            shapes[2] = new Triangle(3, 4);


            for (Shape shape : shapes) {
                System.out.println(shape.toString());
                if (shape instanceof TwoDimensionalShape)
                    System.out.println("This is TwoDimensionalShape");

                if (shape instanceof ThreeDimensionalShape)
                    System.out.println("This is ThreeDimensionalShape");
            }
        }
    }



