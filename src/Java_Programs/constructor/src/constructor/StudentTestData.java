package constructor;
class Student
{
	int id;
	String name;
	String gender;
	int age;
	public Student(int id,String name,String gender,int age)
	{
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	public void display()
	{
		System.out.println("Student ID:" + this.id);
		System.out.println("Student name:" + this.name);
		System.out.println("Student gender:" + this.gender);
		System.out.println("Student age:" + this.age);
	}
}

public class StudentTestData {
public static void main(String[] args) {
	Student s1= new Student(1,"Annie","female",22);
			Student s2= new Student(2,"Manu","female",22);	
			s1.display();
	        s2.display();
	        
	        
	        
	        
	        
}
}
