package polymorphism;

public class A {
				void show() 
				{
					System.out.println("1");
				}
}
class B extends A{
	
	void show()
	{
		super.show(); //call parent method
		System.out.println("2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B n1 = new B();
		n1.show();
		
		

	}

}
