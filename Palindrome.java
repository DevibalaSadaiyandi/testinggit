package selenium;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int n, temp, rem, reverse=0;
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();//1221
		temp=n;
		while(temp>0){
			rem = temp%10;
			reverse = reverse*10+rem;
			temp=temp/10;
		}
		if(n==reverse)
			System.out.println("Entered no "+n+" is Palindrome");
		else
			System.out.println("Entered no "+n+" is not Palindrome");
	}

}
