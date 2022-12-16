import java.util.Scanner;
public class Room {
    void area(){
        System.out.println("Area:0");
    }
    void area(int a){
        System.out.println("Area:0");
    }
    void area(int a,int b){
        System.out.println("Area:"+a*b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of arguments to pass:");
        int ch=sc.nextInt();
        Room ob=new Room(); 
        switch(ch){
            case 0:ob.area();
                 break;
            case 1:System.out.print("Enter length:");
                    int a=sc.nextInt();
                    ob.area(a);
                    break;
            case 2:System.out.print("Enter length and breadth:");
                    int l=sc.nextInt();
                    int b=sc.nextInt();
                    ob.area(l,b);
        }
        sc.close();
    }
}