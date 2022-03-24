//ThIS KEYWORD CAN BE USED TO INVOKE CURRENT CLASS CONSTRUCTOR

package Keywords;

public class Thiscontructor {
							Thiscontructor()
							{	//this(10);
								System.out.println("No argument constructor");
							}
							Thiscontructor(int a)
							{	
								this();
								System.out.println(" constructor with argument");
							}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiscontructor tc=new Thiscontructor(10);
		
		

	}

}
