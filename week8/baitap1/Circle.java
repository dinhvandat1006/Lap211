package week8.baitap1;


 public class Circle extends TwoDimensionalShape {
    private double radius;

     public Circle(double radius) {
         this.radius = radius;
     }
     @Override
     public double getArea(){
         return Math.PI * radius *radius;
     }
      public double getCircumference() {
          return 2 * Math.PI * radius;
      }
     @Override
        public String toString() {
            return "Circle with radius: " + radius + ", area: " + getArea() + ", circumference: " + getCircumference();
        }

    }
