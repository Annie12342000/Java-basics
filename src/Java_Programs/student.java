class Student
{
	int id;
	String name;
	int age;
	String phno;
	static String schoolName;
	static String schoolAddress;
	 
	public void displayStudents()
	{
		System.out.println("Student ID:" + id);
		System.out.println("Student Name:" + name);
		System.out.println("Student Age:" + age);
		System.out.println("Student Contact Number:" + phno);
		System.out.println("SchoolName:" + schoolName);
		System.out.println("SchoolAddress:" + schoolAddress);
	}
     class StudentInfo
     {
     
	 public static void main(String[] args)
		{
		 Student.schoolName="Jspiders";
		 Student.schoolAddress="Marathahalli";
		Student s1 = new Student();
		s1.id = 1;
		s1.name = "Annie";
		s1.age = 22;
		s1.phno = "2097432089";
		s1.displayStudents();
		System.out.println();

		Student s2 = new Student();
		s2.id = 2;
		s2.name = "Manu";
		s2.age= 22;
		s2.phno = "4874984328";
		s2.displayStudents();

		
	
	}
}
}





	
	
	
	
	
	