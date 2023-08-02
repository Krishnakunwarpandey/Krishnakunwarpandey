package Userinput;

import java.util.Scanner;

public class S2 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter multi string values");
		String s=sc.nextLine();
		
		System.out.println(s);
				
		System.out.println("enter char data");
		char ch = sc.next().charAt(2);
		System.out.println(ch);
		System.out.println("enter another char data");
		char ch1 = sc.next().charAt(4);
		System.out.println(ch1);
		System.out.println("enter boolean ");
		boolean b = sc.nextBoolean();
		System.out.println(b);
		
		
				
	}

}
