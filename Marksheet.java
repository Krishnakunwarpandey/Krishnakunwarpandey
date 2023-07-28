package Basics;

public class Marksheet {
	public static void main(String[] args) {
		int a=700;
		System.out.println("main start");
		if (a>81 && a<=100)
		{
			System.out.println("congratulation!  distiction");
		}
		else if (a>=35 && a<=80)
		{
			System.out.println("first deivsion");
		}
		else if(a>=0 && a<=34)
		{
			System.out.println("oops: fail");
		}
		
		System.out.println("oops ! you enterd a wrong marks");
		
		System.out.println("enter correct number");
		System.out.println("main end");
						
	}

}
