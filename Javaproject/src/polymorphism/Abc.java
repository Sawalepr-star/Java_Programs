package polymorphism;
//here we create an interface class and inheriting by using implements keywords
interface R1
{
	void display1();
}
abstract class Abc {
				
				abstract void display() ;
				/*{
					System.out.println("1");
				}*/
				void show()
				{
					System.out.println("2");
				}
}
class Abc1 implements R1{
	public void display1()// public modifier is necessary.
	{
		
	}
	void show()
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	we never create an object of abstract class and interface class.
		Abc1 d1 = new Abc1();
		d1.show();
		

	}

}
