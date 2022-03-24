package polymorphism;
//here we create an ABTRACT class and inheriting by using EXTENDS KEYWORD

abstract class F {
				
				abstract void display() ;
				/*{
					System.out.println("1");
				}*/
				void show()
				{
					System.out.println("2");
				}
}
class S1 extends F{
	void display() 
	{
		
	}
	
	
	void show()
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	we never create an object of abstract class and interface class.
		S1 d1 = new S1();
		d1.show();
		

	}

}
