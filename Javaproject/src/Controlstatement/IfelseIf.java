package Controlstatement;

public class IfelseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String city= "Delhi";
		if(city=="Pune")
		{
			System.out.println("Yes, This is right city");
		}
		else {
			if(city=="Mumbai")
			{
				System.out.println("Yes, This is right city");
			}
			else {
				if(city=="Banglore")
				{
					System.out.println("yes This is Right city");
				}
				else 
				{
					System.out.println("No ");
					System.out.print(city);
					System.out.println("  is right city.");
				}
				
			}
		}
	}

}
