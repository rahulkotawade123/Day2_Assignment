package Day_2_Assignment;

import java.util.Scanner;

public class SumNaturalNum {

	//2.1 while loop// write program for the sum of n natural number e.g input n=5 output 1+2+3+4+5
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter A Number");
			int end = sc.nextInt();
			int Start = 1;
			int sum = 0;
			while(Start<=end) {
				sum = sum + Start;
				Start+=1;
			}
			System.out.println(sum);
		}

	}


