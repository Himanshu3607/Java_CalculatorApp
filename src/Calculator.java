import java.util.*;

public class Calculator {

    double addition(double x, double y) {
        return x + y;
    }

    double subtraction(double x, double y) {
        return x - y;
    }

    double multiplication(double x, double y) {
        return x * y;
    }

    double division(double x, double y) {
        return x / y;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true) {

            System.out.println("\n===== CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch == 5) {
                System.out.println("Exiting...");
                break;
            }

            if (ch < 1 || ch > 5) {
                System.out.println("Invalid Choice!");
                continue;
            }

            System.out.print("Enter x: ");
            double x = sc.nextDouble();

            System.out.print("Enter y: ");
            double y = sc.nextDouble();

            switch (ch) {
                case 1:
                    System.out.println("Result = " + calc.addition(x, y));
                    break;

                case 2:
                    System.out.println("Result = " + calc.subtraction(x, y));
                    break;

                case 3:
                    System.out.println("Result = " + calc.multiplication(x, y));
                    break;

                case 4:
                    if (y == 0) {
                        System.out.println("Division by zero is not allowed.");
                    } else {
                        System.out.println("Result = " + calc.division(x, y));
                    }
                    break;
            }
        }
        sc.close();
    }
}