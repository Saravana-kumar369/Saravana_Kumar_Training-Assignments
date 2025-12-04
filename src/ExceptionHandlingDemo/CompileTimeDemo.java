package ExceptionHandlingDemo;

import java.io.FileInputStream;

public class CompileTimeDemo {

	public static void main(String[] args) {
		try {
		String fileName = "C:\\study\\test.txt";
		FileInputStream fis = new FileInputStream(fileName);
//		FileOutputStream os = new FileOutputStream(fileName);
		char ch = (char)fis.read();
		while( ch != -1 )
		{
			System.out.print(ch);
			ch = (char)fis.read();
			
		}
		fis.close();
//		System.out.println(fis);
		}
		
		catch(Exception a)
		{
			System.out.println(a.getMessage());
		}
		
	
}

}
