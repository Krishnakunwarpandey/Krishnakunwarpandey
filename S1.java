package Userinput;

import java.util.Scanner;

public class S1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter byte vale");
		
		byte b= sc.nextByte();
		
		System.out.println(b);
		
		System.out.println("enter short value");
		
		
		short b1 = sc.nextShort();
		System.out.println(b1);
		
		System.out.println("enter int value");
		
		int b2=sc.nextInt();
		System.out.println(b2);
		
		System.out.println("enter long value");
		
		long b3 = sc.nextLong();
		
		System.out.println(b3);
		
		System.out.println("enter float value");
		 
		float d4= sc.nextFloat();
		
		System.out.println(d4);
		
		System.out.println("enter double value");
		
	    double d5=sc.nextDouble();
	    
	    System.out.println(d5);
	    
		System.out.println("enter character value");
		
		char d6=sc.next().charAt(0);
		
		System.out.println(d6);
		
		System.out.println("enter String value");
		
		String d7=sc.next();
		
		System.out.println(d7);
				
		
		
		
		
		
	}

}
