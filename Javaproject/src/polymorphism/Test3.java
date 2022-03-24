package polymorphism;
//method overriding
public class Test3 {

				void show()
				{
					
					System.out.println("abc");
				}
}
class Test4 extends Test3
{
	void show()
	{
		System.out.println("cdf");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 t= new Test4();
		t.show();
		Test3 s= new Test3();
		s.show();
		
		
		

	}

}
