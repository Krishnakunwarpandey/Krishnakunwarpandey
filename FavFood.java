package Userinput;

import java.util.Scanner;
public class FavFood {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("main start");
		
		 System.out.println("enter the name of food");
		 
		 String s = sc.nextLine();
		 
		 
		System.out.println("type of the food");
		
		String s1=sc.next();
		
		
		System.out.println("taste??");
		
		String s2=sc.next();
		
		
       
		 System.out.println("ingredients?");
		 
		 String s3 = sc.next();
      
      
		 
        System.out.println("how much should eat at on time");
        
        int a =sc.nextInt();
        
        System.out.println("which weather is perfect to eat");
        
        String s4 = sc.next();
        
        
        
        
        
       
      System.out.println(s +"  "+ s1+ "  " + s2+ "  " + s3  + "  "+ a +"  " +s4  );
		
		
		System.out.println("main end");
		
		
	}

}
