package polymorphism;

public class Test {
	void show(int a, String color)
	{
		System.out.println(a+" "+color);
	}
	void show(String color) {
	  System.out.println(color);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test s1= new Test();
		s1.show("red");
		s1.show(10,"red");
		//System.out.printl(.);

	}

}
