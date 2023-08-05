package Userinput;

import java.util.Scanner;
public class Cal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
       int x=1;
		
		while (x>0) {
		System.out.println("enter first num");
		
		int a=sc.nextInt();
		
		System.out.println("enter 2nd num");
		int b =sc.nextInt();
		
		System.out.println("+,-,*,%");
		char ch = sc.next().charAt(0);
		
		int i;
		switch(ch)
		{
		case'+':
		
	    System.out.println(i=a+b);	
		break;
			
		case '-':
			
			 System.out.println(i=a-b);	
			
			break;
			
		case '*':
			
			 System.out.println(i=a*b);	
			break;
			
		case '%':
			
			System.out.println(i=a%b);
		   
		
		
		
		
		}
		
		
		}
		
	}
	
}
