package Session3.assignment1;

//Author Rahib Amin
//Session 3 Assignment 1

public class University {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setName("Rahib");
		student1.setStudentID(99999);
		
		Student student2 = new Student();
		student2.setName("Adam");
		student2.setStudentID(22221);
		
		
		System.out.println("Student 1 Name is " + student1.getName());
		System.out.println("Student 1 ID is " + student1.getStudentID());
		System.out.println("Student 2 Name is " + student2.getName());
		System.out.println("Student 2 ID is " + student2.getStudentID());
	}

}
