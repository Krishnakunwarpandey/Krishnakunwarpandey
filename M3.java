package method;

public class M3 {
	public static void main(String[] args) {
		
		System.out.println("main start");
		int res=add(20,30);
		
		System.out.println(res);
		int res1=sub(50,40);
		System.out.println(res1);
		int res2=mul(5,7);
		System.out.println(res2);
		int res3=div(80,40);
		System.out.println(res3);
	}
	public static int add(int a , int b)
	{
		
		System.out.println("addition");
		 int c= a+b;
		 return c;
	}
	public  static int sub(int a , int b)
	{
		System.out.println("subtraction");
		int c= a-b;
		return c;
	}
	public static int mul(int a, int b)
	{
		System.out.println("multipication");
		
		int c = a*b;
		return c;
	}
	public static int div(int a, int b)
	{
		System.out.println("division");
		int c= a%b;
		return c;
	}

}
