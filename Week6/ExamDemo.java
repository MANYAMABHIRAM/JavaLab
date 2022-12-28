import java.util.Scanner;

interface Students {
    public void getvalue();
}

interface Department {
    public void getattendense();
}

class Exam implements Students, Department {
    Scanner sc = new Scanner(System.in);
    int serialNumber, className, attendense;
    String studentName;
    boolean b = false;

    public void getvalue() {
        System.out.print("Enter student name:");
        studentName = sc.nextLine();
        System.out.print("Enter serial number");
        serialNumber = sc.nextInt();
        System.out.print("Enter class:");
        className = sc.nextInt();
    }

    public void getattendense() {
        System.out.print("Enter average attendense:");
        attendense = sc.nextInt();
    }

    void calattendense() {
        if (attendense > 85)
            b = true;
    }

    boolean eligible() {
        if (b)
            return b;
        else
            return false;
    }
}

public class ExamDemo {
    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.getvalue();
        exam.getattendense();
        exam.calattendense();
        boolean b = exam.eligible();
        if (b)
            System.out.println("Student is eligible");
        else
            System.out.println("Student is not eligible");
    }
}
