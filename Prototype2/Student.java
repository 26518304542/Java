package Prototype2;

public class Student {

	String name;
	int studentRollNo;
	
	public Student(String name,int studentRollNo) {
		
		this.name = name;
		this.studentRollNo = studentRollNo;
	}
	
	public Student(Student student) {
		
		this.name = student.name;
		
		this.studentRollNo = student.studentRollNo;
		
	}
	
	public void display() {
		
		System.out.println(" Student name: " + name + ",Roll no: "+ studentRollNo);
	}
	
}
