//Multiple interface
package Interface;

interface Cool {
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
interface  Cool2
{
	void watch1();
}

class Walchand1 implements Cool, Cool2

{
	public void watch1()
	{
	System.out.println(" An autonomus");
		
	}
	public void main() {
	}
	
	
	void print()
	{
		System.out.println("yes, this my college");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Walchand1 w= new Walchand1();
		
		w.show();
		w.print();
		Cool.display();
		w.watch1();
		
		System.out.println(total);

	}

}

