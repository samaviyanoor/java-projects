import java.util.Scanner;

class Addition {
    void add(double a, double b) {
        System.out.println("addition: " + (a + b));
    }
}


class Subtraction extends Addition {
    void subtract(double a, double b) {
        System.out.println("subtraction: " + (a - b));
    }
}


class Multiplication extends Subtraction {
    void multiply(double a, double b) {
        System.out.println("multiplication: " + (a * b));
    }
}

class Division extends Multiplication {
    void divide(double a, double b) {
        if (b != 0) {
            System.out.println("division: " + (a / b));
        } else {
            System.out.println("error: cant divide by zero!!");
        }
    }
}

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
   
        Division calc = new Division();

        System.out.println("select operation: 1:add, 2:subtract, 3:multiply, 4:divide");
        int choice = sc.nextInt();

        System.out.print("enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("eenter second number: ");
        double num2 = sc.nextDouble();

  
        switch (choice) {
            case 1:
                calc.add(num1, num2);
                break;
            case 2:
                calc.subtract(num1, num2);
                break;
            case 3:
                calc.multiply(num1, num2);
                break;
            case 4:
                calc.divide(num1, num2);
                break;
            default:
                System.out.println("invalid!!");
        }
        
        sc.close();
    }
}