package Inheritance;

public class A {
				void showA()
				{
					System.out.println("A class method");
				}
}
class B extends A
{
	void showB()
	{
		System.out.println("B class Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A ob1 =new A();
		
		 B ob2 = new B();
		ob2.showA();
		ob2.showB();
	}

}
