package loopstatement;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alphabet;
		System.out.println("Enter the any alphabets");
		Scanner sc= new Scanner(System.in);
		alphabet= sc.next().charAt(0);
		switch(alphabet)
		{
		case 'a':
			System.out.println("vowel");
			break;
		case 'e':
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':
			System.out.println("vowel");
			break;
		
		default:
		
			System.out.println("consonant");
	}

}
}