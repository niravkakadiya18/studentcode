package oops;

public class StudentApp {

	public static void main(String[] args) {
		 Student s1 = new Student();
	        s1.name = "ankit";
	        s1.age = 20;
	        s1.div = "Computer Science";
	        s1.gpa = 3.5;
	        
	        System.out.println("Name: " + s1.name);
	        System.out.println("Age: " + s1.age);
	        System.out.println("Div: " + s1.div);
	        System.out.println("GPA: " + s1.gpa);
	        
	        s1.study();
	        s1.attendClass();
	}

}
