package loopstatement;

import java.util.Scanner;

public class Leapyearloop {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the year");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		if(((n%4==0)&&(n%100!=0))||(n%400==0))
		{
			System.out.println("This is leap year");
		}
		else
		{
			System.out.println("This is not leap year");
		}
			
		
}
}
