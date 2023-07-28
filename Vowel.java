package Basics;

public class Vowel {
public static void main(String[] args) {
	System.out.println("Main start");
	char ch='B';
	switch(ch)
	{
	case'a':
	case 'e':
	case 'o':
	case 'u':
	case 'A':
	case 'O':
	case 'U':
	{
	
		System.out.println(ch+ " is a vowel");
	}break;
	

	default:{
		System.out.println(ch +  " is a consonant");
	}
	System.out.println("Main end");
}
}
}
