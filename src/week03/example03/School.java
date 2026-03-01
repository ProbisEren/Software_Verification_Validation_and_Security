package week03.example03;
import java.util.ArrayList;

public class School {
	ArrayList<Student> Students = new ArrayList();
	ArrayList<Student> passedStudents = new ArrayList();
	
	public  void addStudent(Student s) {
		Students.add(s);
	}
	public void checkStatus() {
		for (Student s : Students) {
		    if(s.finalMark>50)
		    	passedStudents.add(s);
		}
		
	}
}
