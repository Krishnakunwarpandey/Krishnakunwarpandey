package Userinput;

import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {
	
	 Scanner sc=new Scanner(System.in);
	    int x=1;
		while(x>0) {
	System.out.println("enter a year to check leap or not");
	
	int a=sc.nextInt();
	
	if(a%4==0|| a%400==0 && a%100!=0)
	{
		System.out.println(a +" "+ "is leap year");
	}
	else {
		System.out.println(a+" "+ "is not leap year");
	}
	

	}
}

}