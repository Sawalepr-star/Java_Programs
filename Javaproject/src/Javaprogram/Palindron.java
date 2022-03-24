package Javaprogram;

import java.util.Scanner;

public class Palindron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int number,tempt=0,rem,rev=0;
		 System.out.println("Enter the any no:");
		 Scanner sc= new Scanner(System.in);
				 number=sc.nextInt();
				 number=tempt;
				 while(tempt!=0)
				 {
					 rem=tempt%10;
					 rev=rev*10+rem;
					 tempt=tempt/10;
				 }
					 if(number==rev)
					 {
						 System.out.println("Palindron");
					 }
					 else {
						 System.out.println(" not Palindron:");
					 }
	}

}
