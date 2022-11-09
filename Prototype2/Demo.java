package Prototype2;

public class Demo {

	public static void main(String[] args) {
		
		Student student1 = new Student("John",1);
		
		student1.display();
		
		Student student2 = new Student(student1);
		
		student2.display();
	}
	
}
