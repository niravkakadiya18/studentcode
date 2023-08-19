package oops;

public class Trainer {
	int id;
	String name;
	String subject;
	
	Trainer() //Constructor
	{
	}
		Trainer(int a)
		{
			System.out.println("ID initialized");
			id = a;
		}
		Trainer(int a,String b)
		{
			System.out.println("ID initialized");
			id = a;
			name = b;
		}
		Trainer(int a,String b,String c)
		{
			System.out.println("ID initialized");
			id = a;
			name = b;
			subject = c;
		}
	
	
	void teach()
	{
		System.out.println("Started teaching");
	}
	void takeAttendance()
	{
		System.out.println("Attendance taken");
	}
	void giveData(int a, String b, String c)
	{
		id = a;
		name = b;
		subject = c;
	}
}
