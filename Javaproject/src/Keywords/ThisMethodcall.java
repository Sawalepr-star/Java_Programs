//THIS KEYWORKS CAN BE USED TO PASS AN AN ARGUMENT IN THE CONSTRUTOR CALL


package Keywords;

public class ThisMethodcall {
						
	void m1(ThisMethodcall tm)
	{
		System.out.println("i am in m1 method");
	}
	void m2()
	{
		m1(this);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisMethodcall tm=new ThisMethodcall();
		tm.m2();

	}

}
