package pack2;
import pack1;
class PackageOne extends PackageTwo{
	public static void main(String args[])
	{
		pack1.Package p=new pack1.Package();
		pack1.PackageTwo p1=new pack1.PackageTwo();
		System.out.println("Private cannot be accessed outside the class");
		p1.fun();
		System.out.println("Public variable:"+p.d);
	}
}