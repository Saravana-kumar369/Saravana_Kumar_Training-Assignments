package OOBS;

class Display{
	void display(String str)
	{
		System.out.println("Input String: "+str);
	}
	void display(int num)
	{
		System.out.println("Input is Integer:"+num);
	}
	void display(int num, int num1)
	{
		System.out.println("Integers are: "+num+" "+num1);
	}
	void display(float n1, int n2)
	{
		System.out.println("Float: "+n1+" Integer: "+n2);
	}
}
public class MethodOverloading {
	public static void main(String[] args)
	{
		Display monitor = new Display();
		monitor.display("Saravana Kumar");
		monitor.display(100);
		monitor.display(44, 56);
		monitor.display(3.5f,50);
	}
}
