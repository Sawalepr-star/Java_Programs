package Controlstatement;

public class Nestedif {
	

	public static void main(String[] args) {
		int a=10 ;
		int b=30 ;
		int c=80;
		int d=15;
		// TODO Auto-generated method stub
		
		if(a>b&&a>c&&a>d)
		{
			System.out.println("A is greather than b");
		}
		else
			if(b>c)
			{
				System.out.println("B is greather than C");
			}
			else
				if(c>d)
			{
				System.out.println("C is greather than D");
			}
			else 
				
				{
					System.out.println("D is greater than ");
				}
			}

	}

