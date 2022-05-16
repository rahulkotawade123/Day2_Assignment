package Day_2_Assignment;

import java.util.Scanner;

public class ReverseNumberWhile {

	// write program to reverse the integer number e.g input n=231 output 132
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number = sc.nextInt();
		int reverse=0;
		while (number !=0) {
			int lastDigit = number % 10;
			reverse = reverse*10+lastDigit;//formula
			number = number/10;			
		}
	System.out.println("revers num: "+reverse);	
	}

}


