import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Safe s = new Safe();

        System.out.println("1. Square\n2. Rectangle\n3. Triangle\n4. Circle");
        System.out.print("Choose shape: ");
        int shape = sc.nextInt();

        System.out.println("1. Area\n2. Perimeter");
        System.out.print("Choose calculation: ");
        int type = sc.nextInt();

        if (shape == 1) {
            System.out.print("Enter side: ");
            double side = sc.nextDouble();
            if (type == 1) s.squareArea(side);
            else s.squarePerimeter(side);
        }

        else if (shape == 2) {
            System.out.print("Enter length and breadth: ");
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            if (type == 1) s.rectangleArea(l, b);
            else s.rectanglePerimeter(l, b);
        }

        else if (shape == 3) {
            System.out.print("Enter three sides: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            if (type == 1) s.triangleArea(a, b, c);
            else s.trianglePerimeter(a, b, c);
        }

        else if (shape == 4) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            if (type == 1) s.circleArea(r);
            else s.circlePerimeter(r);
        }

        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}

class Safe {
    void squareArea(double s) {
        System.out.println("Area = " + (s * s));
    }

    void squarePerimeter(double s) {
        System.out.println("Perimeter = " + (4 * s));
    }

    void rectangleArea(double l, double b) {
        System.out.println("Area = " + (l * b));
    }

    void rectanglePerimeter(double l, double b) {
        System.out.println("Perimeter = " + (2 * (l + b)));
    }

    void triangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area = " + area);
    }

    void trianglePerimeter(double a, double b, double c) {
        System.out.println("Perimeter = " + (a + b + c));
    }

    void circleArea(double r) {
        System.out.println("Area = " + (3.14 * r * r));
    }

    void circlePerimeter(double r) {
        System.out.println("Perimeter = " + (2 * 3.14 * r));
    }
}
