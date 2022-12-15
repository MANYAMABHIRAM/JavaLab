import java.util.Scanner;
class employee
{
	Scanner sc=new Scanner(System.in);	
	String name,id,type;
	int salary;
	void read_emp()
	{
		System.out.print("Enter name of employee:");
		name=sc.nextLine();
		System.out.print("Enter Id of employee:");
		id=sc.nextLine();
		System.out.print("Enter salary of employee:");
		salary=sc.nextInt();
		System.out.print("Enter type of employee:");
		type=sc.nextLine();
	}
}
class temporary_employee extends employee
{
	void print_emp()
	{
		System.out.println("After increment salary of "+name+"with id"+id+" is "+(salary*0.035+salary));
	}
}
class permanent_employee extends employee
{
	void print_emp()
	{
		System.out.println("After increment salary of "+name+"with id"+id+" is "+(salary*0.05+salary));
	}
}
class Allemployee extends employee
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		temporary_employee ob1=new temporary_employee();
		permanent_employee ob2=new permanent_employee();
		System.out.print("Enter no.of permanent employees:");
		int n1=sc.nextInt();
		for(int i=0;i<n1;i++)
		{
			ob2.read_emp();
			ob2.print_emp();
		}
		System.out.println("Enter no.of temporary employees:");
		int n2=sc.nextInt();
		for(int i=0;i<n2;i++)
		{
			ob1.read_emp();
			ob1.print_emp();
		}
		sc.close();
	} 
}