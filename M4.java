package method;

public class M4 {
	public static void main(String[] args) {
		
		System.out.println("main start");
		String s1= movie1("pushpa");
		System.out.println(s1);
		String s2= movie2("RRR");
		System.out.println(s2);
		String s3 =movie3("kgf");
		System.out.println(s3);
		String s4 = movie4("kgf2");
	   System.out.println(s4);
				
	   System.out.println("main end");
	}
	public static String
	movie1(String a)
	{
		System.out.println("review of"+ a);
		return "must watch";
	}
	public static String movie2(String a)
	{
		System.out.println("review of "+a);
		return "Any time watchable";
	}
	public static String movie3(String a)
	{
		System.out.println("review of " +a);
		return "outstanding";
	}
	public static String movie4 (String a)
	{
		System.out.println("review of "+ a);
		return "super watch";
		
	}

}
