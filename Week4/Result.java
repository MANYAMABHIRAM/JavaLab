import java.util.Scanner;
class student
{	
	Scanner sc=new Scanner(System.in);
	String name,rno;
	void readStudent()
	{
		System.out.print("Enter Student name:");
		name=sc.nextLine();
		System.out.print("Enter Student rollno:");
		rno=sc.nextLine();
	}
}
class test extends student
{
	Scanner sc=new Scanner(System.in);
	int m[]=new int[6];
	void readMarks(){
		System.out.print("Enter marks of 6 subjects:");
		for(int i=0;i<6;i++){
		m[i]=sc.nextInt();
		}
	}
}
class Result extends test
{
	int sum=0;
	void display()
	{
		for(int i=0;i<6;i++){
			sum+=m[i];
		}
		System.out.println("Name:"+name+"\nRoll.no:"+rno);
		System.out.print("Marks are:");
		for(int i=0;i<6;i++)
		{
			System.out.print(m[i]+" ");
		}
		System.out.println("\nTotal marks are:"+sum);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no.of students:");
		int n=sc.nextInt();
		Result ob[]=new Result[n];
		for(int i=0;i<n;i++)
		{
			ob[i]=new Result();
			ob[i].readStudent();
			ob[i].readMarks();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println((i+1)+"-Student details");
			ob[i].display();
		}
		sc.close();
	}
}