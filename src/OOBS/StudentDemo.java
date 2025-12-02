package OOBS;

class StudentDetails{
	
	private int rollNo;
	private int mark;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		if(mark < 0 || mark > 100)
		{
			System.out.println("Invalid input for mark.");
			return;
		}
		this.mark = mark;
	}
	public void getDetails() {
		System.out.println("Student Name: "+this.getName());
		System.out.println("Student RollNo: "+this.getRollNo());
		System.out.println("Student Mark: "+this.getMark());

	}
	
}
public class StudentDemo {

	public static void main(String[] args) {
		
		StudentDetails student1 = new StudentDetails();
		student1.setRollNo(8644);
		student1.setName("Saravana kumar");
		student1.setMark(50);
		
		System.out.println("student 1 Detail:\n===========================");
		student1.getDetails();
		
		StudentDetails student2 = new StudentDetails();
		student2.setRollNo(8544);
		student2.setName("SK");
		student2.setMark(-40);
		
		System.out.println("student 2 Detail:\n===========================");
		student2.getDetails();
		
	}

}
