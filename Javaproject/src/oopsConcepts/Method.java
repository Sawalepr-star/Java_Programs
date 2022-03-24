package oopsConcepts;

public class Method {
	String color;
	int age;
	 void initObj(String c, int d)
	 {
		 color=c;
		 age=d;
		 System.out.println(color+" "+age);
	 }

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Method dog= new Method();
		dog.initObj("Black",10);
		

	}

}
