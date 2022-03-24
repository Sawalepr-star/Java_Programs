package Interface;

interface College {
			public static final int total=100;
			abstract void main();
			default void show()
			{
				System.out.println("My college name");
			}
			static void display()
			{
				System.out.println("Walchand College of engineering");
			}
}
class Walchand implements College
{
	public void main() {
	}
	
	
	void print()
	{
		System.out.println("yes, this my college");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Walchand w= new Walchand();
		w.show();
		w.print();
		College.display();
		
		System.out.println(total);

	}
	
}

