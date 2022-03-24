package Keywords;

public class Superkeyword {
				int a =10;
}
class B extends Superkeyword
{
	int a=20;
	void main(int a)
	{
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			B b= new B();
			b.main(30);
	}

}
