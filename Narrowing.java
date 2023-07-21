package Basics;

public class Narrowing {
	public static void main(String[] args) {
		System.out.println("Main start");
		//float to long
		float f =67.77f;
		long l =(long)f;
		System.out.println(l);
        System.out.println("====");
       
     // double to int
        double d=100.88;
        int i = (int)d;
        System.out.println(i);
        System.out.println("======");
        //char to int
       int i2=73;
       char ch=(char)i2;
       System.out.println(ch);
	}

}
