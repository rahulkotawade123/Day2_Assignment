package Day_2_Assignment;

import java.util.Scanner;

public class DigitInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dw = new Scanner(System.in);
		System.out.println("Enter single Digit Number:");
		String[] array = {"exit/quite","one","two","three","four","five","six","seven","eight","nine","ten"};
		int a = dw.nextInt();
		if(a<10) {
			System.out.println("Enter Number:"+array[a]);
		}else {
			System.out.println("Not Allow");

			}
		}
	}


