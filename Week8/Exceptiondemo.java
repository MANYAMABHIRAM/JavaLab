import java.util.Scanner;
class ExceptionDemo
{
    public static void main(String[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array");
        int size = sc.nextInt();
        try {
            int[] array2 = new int[size];
            System.out.println("Size of the array:" + size);
        }
        catch (Exception x) {
            System.out.println(x);
        }
        finally {
            System.out.println("Try-Catch block is executed");
        }
    }
}