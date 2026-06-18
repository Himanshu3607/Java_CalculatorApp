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
    double modulus(double x, double y){
        return x % y;
    }
    double power(double x, double y){
        return Math.pow(x, y);
    }
    double sqRoot(double x){
        if(x<0){
            System.out.println("Square root of negative number is not possible.");
            return 0;
        }
        return Math.sqrt(x);
    }
    double maximum(double x, double y){
        return Math.max(x, y);
    }
    double minimum(double x, double y){
        return Math.min(x, y);
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
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square Root");
            System.out.println("8. Maximum");
            System.out.println("9. Minimum");
            System.out.println("10. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch == 10) {
                System.out.println("Exiting...");
                break;
            }

            if (ch < 1 || ch > 10) {
                System.out.println("Invalid Choice!");
                continue;
            }

            System.out.print("Enter x: ");
            double x = sc.nextDouble();

            double y = 0;

            if(ch != 7){
                System.out.print("Enter y: ");
                y = sc.nextDouble();
            }

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
                case 5: 
                    System.out.println("Result = " + calc.modulus(x, y));
                    break;
                case 6: 
                    System.out.println("Result = "+ calc.power(x, y));
                    break;
                case 7:
                    System.out.println("Result = "+ calc.sqRoot(x));
                    break;
                case 8:
                    System.out.println("Result = "+ calc.maximum(x, y));
                    break;
                case 9:
                    System.out.println("Result = "+calc.minimum(x, y));
                    break;
            }
        }
        sc.close();
    }
}