package OOBS;

abstract class MobilePhone{
	String name;
	abstract void calling();
	void browsing() {
		System.out.println("MobilePhone Browsing");
	}
}

class Iphone extends MobilePhone
{
	String name;

	@Override
	void calling() {
		System.out.println("Iphone Calling");
	}
	
	void browsing() {
		System.out.println("Iphone Browsing");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		MobilePhone mp = new Iphone();
		Iphone mp1 = new Iphone();
		mp.calling();
		mp.browsing();
		System.out.println("------------------");
		mp1.calling();
		mp1.browsing();
		System.out.println(mp1.equals(mp));
	}

}
