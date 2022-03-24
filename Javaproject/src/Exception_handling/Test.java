package Exception_handling;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
		
		int a=100, b=0, c;
		c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("A is not divided by zero.");


}
}
