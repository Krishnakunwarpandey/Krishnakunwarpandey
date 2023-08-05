package Userinput;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		
		System.out.println("main start");
		Scanner sc= new Scanner(System.in);
		int b=1;
		
		while(b>0)
		{	
		
		System.out.println("enter a number to check even or odd");
		
		int a=sc.nextInt();
		
		if(a%2==0) {
			
			System.out.println(a+"is even number");
		}
		else {
			System.out.println(a+" is odd number");
		}
	
	}

}
}
