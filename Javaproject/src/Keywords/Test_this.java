package Keywords;

public class Test_this {
			int a;
			void setvalues(int a)
			{
				this.a=a;
				System.out.println(a);

			}
			void show()
			{
				System.out.println(a);
			}
}
class Test
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_this t=new Test_this();
		t.setvalues(10);
		t.show();
		
	}

	

}
