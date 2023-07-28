package Basics;

public class LogIn {
	public static void main(String[] args) {
		System.out.println("main start");
    	String eid = "admin";
	    int pwd = 1234;
	    if(eid== "admin") {
	    	System.out.println("id varified , Now enter pwd");
	    	if(pwd==1234) {
	    		System.out.println("login succesful");
	    	}
	    	else {
	    		System.out.println("pwd enterd wrong");
	    	}
	    }
	    else {
	    	System.out.println("login unsuccesful");
	    }
	   System.out.println("main end");
 
	}
}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
