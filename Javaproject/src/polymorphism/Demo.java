package polymorphism;
//for rule 2 if parent class throws an exception 
public class Demo {
				void show()throws RuntimeException
				{
					System.out.println("1");
				}
}
class Demo1 extends Demo{
	void show()throws RuntimeException//throws ArithmeticException
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.show();
		Demo1 d1 = new Demo1();
		d1.show();
		

	}

}
