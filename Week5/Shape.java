import java.util.Scanner;
abstract class Figure{
    int l,b;
    abstract double area(int l,int b);
}
class Rectangle extends Figure{
    double area(int l,int b){
        return l*b;
    }
}
class Triangle extends Figure{
    double  area(int l,int b){
        return l*b*0.5;
    }
}
public class Shape {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectangle ob1=new Rectangle();
        System.out.print("Enter length and breadth of rectanle: ");
        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Area: "+ob1.area(l,b));
        System.out.print("Enter length and breadth of triangle: ");
        int l1=sc.nextInt();
        int b1=sc.nextInt();
        System.out.println("Area: "+ob1.area(l1,b1));
        sc.close();
    }
}
