package method;

public class M2 {
	public static void main(String[] args) {
		
		System.out.println("main start");
		add(10,20);
		sub(30,40);
		mul(50,60);
	    div(70,80);
		System.out.println("main end");
	}
	public static void add(int a, int b)
	{
		
		System.out.println(a+b);
	}
	public static void sub(int a , int b)
	{
		System.out.println(a-b);
	}
	public static void mul(int a , int b)
	{
		System.out.println(a*b);
	}
	public static void div(int a , int b)
	{
	 System.out.println(a%b);	
	}

}
