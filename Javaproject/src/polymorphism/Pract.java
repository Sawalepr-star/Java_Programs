package polymorphism;
//for rule 1 if parent class does not  throws an exception 
public class Pract {
				void show() 
				{
					System.out.println("1");
				}
}
class Pract1 extends Demo{
	void show()throws ArithmeticException
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pract d = new Pract();
		d.show();
		Pract1 d1 = new Pract1();
		d1.show();
		

	}

}
