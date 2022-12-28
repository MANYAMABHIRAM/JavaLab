import java.util.Scanner;

abstract class Shape {
    int a, b;

    abstract void printArea();

    void Initialize(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Rectangle extends Shape {
    void printArea() {
        System.out.println("Area of rectangle:" + a * b);
    }
}

class Triangle extends Shape {
    void printArea() {
        System.out.println("Area of rectangle:" + a * b * 0.5);
    }
}

class Circle extends Shape {
    void printArea() {
        System.out.println("Area of rectangle:" + 3.14 * a * a);
    }
}

public class abstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1-Rectangle\n2-Triangle\n3-Circle\nEnter your choice:");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                Rectangle r = new Rectangle();
                System.out.print("Enter length and breadth:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                r.Initialize(a, b);
                r.printArea();
                break;
            case 2:
                Triangle t = new Triangle();
                System.out.print("Enter base and height:");
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();
                t.Initialize(a1, b1);
                t.printArea();
                break;
            case 3:
                Circle c = new Circle();
                System.out.print("Enter radius:");
                int a2 = sc.nextInt();
                c.Initialize(a2, 0);
                c.printArea();
                break;
            default:
                System.out.println("Thankyou!!");
                break;
        }
        sc.close();
    }
}
