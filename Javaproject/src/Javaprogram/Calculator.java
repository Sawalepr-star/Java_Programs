package Javaprogram;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operator;
		int a;int b;int c;
		Scanner sc= new Scanner(System.in);
		System.out.println(" Choose any operator: +, -,* or /");
		operator=sc.next().charAt(0);
		System.out.println("Enter the first number:");
			a=sc.nextInt();
		System.out.println("Enter the second number:");
			b=sc.nextInt();
			switch(operator)
			{
			case '+':
				c = a+b;
				System.out.println("Addition of the this two no is:");
				System.out.println(a+b);
				break;
				
			case '-':
				c = a-b;
				System.out.println("Subtraction of the this two no is:");
				System.out.println(a-b);
				break;
				
			case '*':
				c = a*b;
				System.out.println("Multiplication of the this two no is:");
				System.out.println(a+b);
				break;
				
			case '/':
				if(b==0) {
					System.out.println("Divisor Value Can not be Zero!");
					//System.exit(0);
				}else {
					
					c = a/b;
					System.out.println("Division of the this two no is:");
					System.out.println(a/b);
				}
				break;
				default:
					System.out.println("Invalid Input");
			}
			

	}

}