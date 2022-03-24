package Controlstatement;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		System.out.println("Enter the value of A");
		Scanner sc= new Scanner(System.in);
		year= sc.nextInt();
		switch(year)
		{
		case 2019:
			System.out.println("You are 2019 passout");
		break;
		case 2020:
			System.out.println(" you are 2020 passout");
			break;
		case 2021:
			System.out.println("You are fresher");
			break;
			default:
				
			{
				System.out.println("You are not eligible 2019");
			}
			
		
		
		}
		

	}

}
