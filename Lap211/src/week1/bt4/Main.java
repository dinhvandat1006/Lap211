//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("===== Equation Solver =====");
//            System.out.println("1. Solve linear (ax + b = 0)");
//            System.out.println("2. Solve quadratic (ax² + bx + c = 0)");
//            System.out.println("3. Exit");
//            System.out.print("Choose: ");
//            int choice = sc.nextInt();
//
//            switch (choice) {
//                case 1 -> {
//                    Equation eq = new Equation();
//                    System.out.print("Enter a: ");
//                    eq.setA(sc.nextDouble());
//                    System.out.print("Enter b: ");
//                    eq.setB(sc.nextDouble());
//                    EquationSolver.solveLinear(eq);
//                }
//                case 2 -> {
//                    Equation eq = new Equation();
//                    System.out.print("Enter a: ");
//                    eq.setA(sc.nextDouble());
//                    System.out.print("Enter b: ");
//                    eq.setB(sc.nextDouble());
//                    System.out.print("Enter c: ");
//                    eq.setC(sc.nextDouble());
//                    EquationSolver.solveQuadratic(eq);
//                }
//                case 3 -> {
//                    System.out.println("Goodbye!");
//                    return;
//                }
//                default -> System.out.println("Invalid. Try again.");
//            }
//        }
//    }
//}
