package week1.bt4;

public class EquationSolver {
    public static void solveLinear(Equation eq) {
            double a = eq.getA();
            double b = eq.getB();

            if (a == 0) {
                System.out.println(b == 0 ? "Infinite solutions." : "No solution.");
            } else {
                double x = -b / a;
                System.out.println("Solution: x = " + x);
            }

            displayNumberInfo(a, b);
        }

        public static void solveQuadratic(Equation eq) {
            double a = eq.getA();
            double b = eq.getB();
            double c = eq.getC();

            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("No real solution.");
            } else if (delta == 0) {
                System.out.println("One solution: x = " + (-b / (2 * a)));
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Two solutions: x1 = " + x1 + ", x2 = " + x2);
            }

            displayNumberInfo(a, b, c);
        }

        private static void displayNumberInfo(double... nums) {
            System.out.print("Even: ");
            for (double num : nums)
                if ((int) num % 2 == 0) System.out.print((int) num + " ");
            System.out.print("\nOdd: ");
            for (double num : nums)
                if ((int) num % 2 != 0) System.out.print((int) num + " ");
            System.out.print("\nPerfect square: ");
            for (double num : nums)
                if (isPerfectSquare((int) num)) System.out.print((int) num + " ");
            System.out.println("\n-----------------------");
        }

        private static boolean isPerfectSquare(int n) {
            return n >= 0 && Math.sqrt(n) == Math.floor(Math.sqrt(n));
        }
    }

