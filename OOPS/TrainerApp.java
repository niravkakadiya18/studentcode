package oops;

public class TrainerApp {

	public static void main(String[] args) {
		Trainer t1=new Trainer(122);
		//t1.id=1234;
		//t1.name="nirav";
		//t1.subject="java";
		System.out.println("ID = " + t1.id + ",Name = " + t1.name + ",Subject = " + t1.subject);
		t1.teach();
		t1.takeAttendance();
		System.out.println("===============================================");
		Trainer t2=new Trainer(123,"nirav");
		//t2.id=4321;
		//t2.name="ankit";
		//t2.subject="testing";
		System.out.println("ID = " + t2.id + ",Name = " + t2.name + ",Subject = " + t2.subject);
		
		t2.teach();
		t2.takeAttendance();
		System.out.println("===============================================");
		Trainer t3=new Trainer(124,"ankit","java");
		System.out.println("ID = " + t3.id + ",Name = " + t3.name + ",Subject = " + t3.subject);
		t3.teach();
		t3.takeAttendance();
	}

}
