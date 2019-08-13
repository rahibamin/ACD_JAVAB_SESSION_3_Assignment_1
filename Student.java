package Session3.assignment1;

public class Student {

	String Name;
	static int studentID;
	
	
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public static int getStudentID() {
		return studentID;
	}


	public static void setStudentID(int studentID) {
		Student.studentID = studentID;
	}


	

}
