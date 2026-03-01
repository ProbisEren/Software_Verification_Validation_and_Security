package week03.example03;

import static org.junit.Assert.*;

public class Test {
	
	

	@org.junit.Test
	public void test() {
		School okul = new School();
		Student s1 = new Student("eren",1,100);
		Student s2 = new Student("someone",2,(int)(Math.random()*100));
		Student s3 = new Student("ahmet",3,(int)(Math.random()*100));
		Student s4 = new Student("mehmet",4,(int)(Math.random()*100));
		Student s5 = new Student("musti",5,(int)(Math.random()*100));
		Student s6= new Student("kemal",6,30);
		
		okul.addStudent(s1);
		okul.addStudent(s2);
		okul.addStudent(s3);
		okul.addStudent(s4);
		okul.addStudent(s5);
		okul.addStudent(s6);
		okul.checkStatus();
		
		int counter =0;
		for (int i = 0;i<okul.Students.size();i++) {
			counter++;//bitmedi bitir
			
		}
		
	}

}
