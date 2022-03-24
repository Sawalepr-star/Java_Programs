package Javaprogram;

import java.util.Scanner;

//import java.util.Scanner;

public class Prime {

	 public static void main(String args[]) {
		 int number,tempt=0;
		 System.out.println("Enter the any no:");
		 Scanner sc= new Scanner(System.in);
				 number=sc.nextInt();
				 if(number==1 && number==0) {
					 System.out.println("number is not prime");
				 }else
				 {
					 for(int i=2; i<number-1;i++)
					 {
						 if(number%i==0)
						 {
							 tempt=tempt+1;
						 }
					 }if(tempt>0)
					 {
						 System.out.println("Number is not prime");
					 }else
					 {
						 System.out.println("Number is  prime");
					 }
				 }
				 
	 }
	 }