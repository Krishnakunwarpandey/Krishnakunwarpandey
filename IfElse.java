package Basics;

public class IfElse {
	public static void main(String[] args) {
		System.out.println("main start");
		int a=100, b=200, c=300, d=400, e=500;
		if(a>b&&a>c && a>d && a>e)
		{
			System.out.println(a + " is largest number");
			
		}
		else if (b>c && b>d && b>e)
		{
			System.out.println(b+"is a largest number");
		}
		else if(c>d && c>e)
		{
			System.out.println(c+"is a largest number");
		}
		else if (d>e)
		{
			System.out.println(d+"is a largest number");
		}
		else
		{
			System.out.println(e + " is largest number");
		}
	}

}
