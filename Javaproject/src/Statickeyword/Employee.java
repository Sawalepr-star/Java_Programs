
// for static variable 
package Statickeyword;

public class Employee {
				
				int empid;
				String empname;
			 static String empcompny ="wipro";
			 Employee(int empid, String empname)
			 {
				 this.empid=empid;
				 this.empname=empname;
			 }
			 void display()
			 {
				 System.out.println(empid+" "+empname+" "+empcompny);
			 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee(101, "priyanka");
		e1.display();
		Employee e2= new Employee(102, "priya");
        e2.display();
	}

}
