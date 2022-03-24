package polymorphism;
//method overriding
public class Test1 {
	// TODO Auto-generated method stub
			void show(int a)
			{
				System.out.println(a);
			}
}
class Test2
{
	void show(int a)
	{
		System.out.println(a);
	}

	

	public static void main(String[] args) {
		
		Test1 s1= new Test1();
		s1.show(10);
		Test2 s2= new Test2();
		s2.show(20);
		
	}
}

