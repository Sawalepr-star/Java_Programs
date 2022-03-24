package loopstatement;

import java.util.Scanner;

public class Ifelseoddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the any number\n");
		Scanner sc  = new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
			

	}

}
