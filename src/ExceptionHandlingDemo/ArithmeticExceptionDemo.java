package ExceptionHandlingDemo;

public class ArithmeticExceptionDemo {
	public static void main(String[] args)
	{
		int a = 10, b = 0, c = 0;
		try {
			c = a / b;
		}
		catch(Exception mes){
			System.out.println("Division by zero not possible. enter the correct input.");
		}
		System.out.println("The output :"+c);
	}
}
