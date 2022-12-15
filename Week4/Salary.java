import java.util.Scanner;
class employee
{
	Scanner sc=new Scanner(System.in);
	String name,desig;
	int id;	
	void reademp()
	{
		System.out.print("Enter the name:");
		name=sc.nextLine();
		System.out.print("Enter the designation:");
		desig=sc.nextLine();
		System.out.print("Enter the id:");
		id=sc.nextInt();
	}	
}
class Salary extends employee
{
	int bp,hra,da,pf,np;
	void readsalary()
	{
		System.out.print("Enter the basic pay:");
		bp=sc.nextInt();
		System.out.print("Enter the house rent allowance:");
		hra=sc.nextInt();
		System.out.print("Enter the dearness allowance:");
		da=sc.nextInt();
		System.out.print("Enter the provident fund:");
		pf=sc.nextInt();
		
	}
	void calculatesalary()
	{
		np=bp+hra+da-pf;
	}
	void displayemp()
	{
		System.out.println("Name:"+name+"  Designation:"+desig+"  Id:"+id+"  Net pay:"+np);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no.of employees:");
		int n=sc.nextInt();
		Salary ob[]=new Salary[n];
		for(int i=0;i<n;i++)
		{
			ob[i]=new Salary();
			ob[i].reademp();
			ob[i].readsalary();
			ob[i].calculatesalary();
		}
		for(int i=0;i<n;i++)
		{
			ob[i].displayemp();
		}
		sc.close();
	}
}