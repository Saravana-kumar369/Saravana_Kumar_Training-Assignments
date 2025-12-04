package ExceptionHandlingDemo;

public class ArrayIndexOutOfBoundDemo {
	public static void main(String[] args)
	{
		int a[] = {10,20,30,40};
		try {
			System.out.println("The value in index 5"+a[4]);
		}
		catch(Exception mes){
			System.out.println(mes.getMessage());
		}
		
	}
}
