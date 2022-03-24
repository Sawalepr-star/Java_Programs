package Keywords;

public class Thismethod {
	void display()
	{
		System.out.println("hello");
	}
	void show ()
	{
		display();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thismethod tm=new Thismethod();
		tm.show();

	}

}
