package oopsConcepts;

public class Employee {
	String name;
	int emp_id;
	Employee(String name, int emp_id)
	{
		this.name=name;
		this.emp_id= emp_id;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee s1= new Employee(" Deepak",101);
		Employee s2= new Employee("Mahesh", 102);
		System.out.println(s1.name+" "+s1.emp_id);
		System.out.println(s2.name+" "+s2.emp_id);

	}

}
