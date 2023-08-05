package method;

public class CallingMethods {
	
	public static void main(String[] args) {
		
		System.out.println("main start");
		java();
		System.out.println("main end");
	}
	public static void java()
	{
		python();
		System.out.println("java executing");
	}
	public static void python()
	{
		javaScript();
		System.out.println("python executing"); 
		
	}
	public static void javaScript()
	{
		sql();
	 System.out.println("javaScript executing"); 
	 
	}
   public static void sql()
   {
	   html();
	   System.out.println("sql executing");
   }
   public static void html()
   {
	   css();
	   System.out.println("html executing");
   }
   public static void css()
   {
	   System.out.println("css executing");
   }
}
