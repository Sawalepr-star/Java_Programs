//This keyword CAN BE USED TO PASS AS AN ARGUMENT IN THE CONSTRUCTION CALL

package Keywords;

public class Constructor_call {
								Constructor_call(Thisdemo td)
								{
									System.out.println("test class construction");
								}
}
class Thisdemo{
	void main()
	{
		 Constructor_call cc= new  Constructor_call (this);
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Thisdemo td= new Thisdemo();
			td.main();
	}

}
