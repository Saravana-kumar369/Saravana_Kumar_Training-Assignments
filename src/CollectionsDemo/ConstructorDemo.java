package CollectionsDemo;

class Ans{
	String ans;
	Ans(){
		ans = "yes";
	}
	Ans(String str)
	{
		ans = str;
	}
	String getDetails() {
		return ans;
	}
}
public class ConstructorDemo{
	public static void main(String[] args) {
		
		Ans ans = new Ans();
		System.out.println(ans.getDetails());
		
		Ans ans1 = new Ans("NO");
		System.out.println(ans1.getDetails());

	}
	

}
